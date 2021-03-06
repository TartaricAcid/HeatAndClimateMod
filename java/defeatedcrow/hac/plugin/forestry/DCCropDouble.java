package defeatedcrow.hac.plugin.forestry;

import defeatedcrow.hac.api.blockstate.DCState;
import defeatedcrow.hac.api.cultivate.GrowingStage;
import defeatedcrow.hac.core.base.ClimateDoubleCropBase;
import forestry.api.farming.ICrop;
import forestry.core.network.packets.PacketFXSignal;
import forestry.core.network.packets.PacketFXSignal.SoundFXType;
import forestry.core.network.packets.PacketFXSignal.VisualFXType;
import forestry.core.utils.NetworkUtil;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DCCropDouble implements ICrop {

	protected final World world;
	protected final BlockPos pos;
	protected final IBlockState state;

	public DCCropDouble(World w, BlockPos p, IBlockState s) {
		world = w;
		pos = p;
		state = s;
	}

	@Override
	public BlockPos getPosition() {
		return pos;
	}

	protected boolean isCrop(World world, BlockPos pos) {
		IBlockState target = world.getBlockState(pos);
		if (target.getBlock() instanceof ClimateDoubleCropBase)
			return ((ClimateDoubleCropBase) target.getBlock()).getCurrentStage(target) == GrowingStage.GROWN;
		return false;
	}

	@Override
	public NonNullList<ItemStack> harvest() {
		IBlockState target = world.getBlockState(pos);
		NonNullList<ItemStack> ret = NonNullList.create();
		if (isCrop(world, pos)) {
			Block cropB = state.getBlock();
			if (cropB instanceof ClimateDoubleCropBase) {
				ClimateDoubleCropBase crop = (ClimateDoubleCropBase) cropB;
				ret.addAll(crop.getCropItems(target, 0));

				PacketFXSignal packet = new PacketFXSignal(VisualFXType.BLOCK_BREAK, SoundFXType.BLOCK_BREAK, pos,
						target);
				NetworkUtil.sendNetworkPacket(packet, pos, world);
				IBlockState next = target.withProperty(DCState.STAGE8, 4);
				world.setBlockState(pos, next, 2);
			}
		}
		return ret;
	}

	@Override
	public String toString() {
		return String.format("HeatAndClimate [ position: [ %s ]; block: %s]", new Object[] {
				pos.toString(), state
		});
	}

}
