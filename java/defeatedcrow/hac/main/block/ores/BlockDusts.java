package defeatedcrow.hac.main.block.ores;

import defeatedcrow.hac.api.climate.DCHumidity;
import defeatedcrow.hac.api.climate.IClimate;
import defeatedcrow.hac.api.placeable.IRapidCollectables;
import defeatedcrow.hac.core.ClimateCore;
import defeatedcrow.hac.core.base.DCSimpleBlock;
import defeatedcrow.hac.core.base.ITexturePath;
import defeatedcrow.hac.core.util.DCUtil;
import defeatedcrow.hac.main.MainInit;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDusts extends DCSimpleBlock implements ITexturePath, IRapidCollectables {

	public BlockDusts(Material m, String s, int max) {
		super(m, s, max, true);
		this.setTickRandomly(true);
		this.setHardness(1.5F);
		this.setResistance(15.0F);
	}

	@Override
	public boolean onClimateChange(World world, BlockPos pos, IBlockState state, IClimate clm) {
		if (clm != null && clm.getHumidity() == DCHumidity.UNDERWATER)
			return false;
		return super.onClimateChange(world, pos, state, clm);
	}

	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		super.onBlockAdded(world, pos, state);
		world.scheduleUpdate(pos, this, this.tickRate(world));
	}

	private static String[] names = {
			"copper",
			"zinc",
			"nickel",
			"silver",
			"brass",
			"steel",
			"nickelsilver",
			"magnet",
			"tin",
			"bronze",
			"sus",
			"gold",
			"titanium",
			"aluminium",
			"bismuth",
			"bscco"
	};

	public static ItemStack[] containedItem() {
		ItemStack[] ret = new ItemStack[16];
		ret[0] = new ItemStack(MainInit.oreDust, 9, 0);
		ret[1] = new ItemStack(MainInit.oreDust, 9, 1);
		ret[2] = new ItemStack(MainInit.oreDust, 9, 2);
		ret[3] = new ItemStack(MainInit.oreDust, 9, 3);
		ret[4] = ItemStack.EMPTY;
		ret[5] = ItemStack.EMPTY;
		ret[6] = ItemStack.EMPTY;
		ret[7] = ItemStack.EMPTY;
		ret[8] = new ItemStack(MainInit.oreDust, 9, 8);
		ret[9] = ItemStack.EMPTY;
		ret[10] = ItemStack.EMPTY;
		ret[11] = new ItemStack(MainInit.oreDust, 9, 4);
		ret[12] = ItemStack.EMPTY;
		ret[13] = new ItemStack(MainInit.oreDust, 9, 11);
		ret[14] = new ItemStack(MainInit.oreDust, 9, 12);
		ret[15] = ItemStack.EMPTY;

		return ret;
	}

	@Override
	public String[] getNameSuffix() {
		return names;
	}

	@Override
	public String getTexPath(int meta, boolean f) {
		if (meta >= names.length) {
			meta = names.length - 1;
		}
		String s = "blocks/ores/dustblock_" + names[meta];
		if (f) {
			s = "textures/" + s;
		}
		return ClimateCore.PACKAGE_ID + ":" + s;
	}

	/* IRapidCollectables */

	@Override
	public boolean isCollectable(ItemStack item) {
		return !DCUtil.isEmpty(item) && item.getItem() instanceof ItemSpade;
	}

	@Override
	public int getCollectArea(ItemStack item) {
		return 1;
	}

	@Override
	public boolean doCollect(World world, BlockPos pos, IBlockState state, EntityPlayer player, ItemStack tool) {
		NonNullList<ItemStack> list = NonNullList.create();
		this.getDrops(list, world, pos, state, 0);
		for (ItemStack item : list) {
			double x = player.posX;
			double y = player.posY + 0.25D;
			double z = player.posZ;
			EntityItem drop = new EntityItem(world, x, y, z, item);
			world.spawnEntity(drop);
		}
		world.setBlockToAir(pos);
		return true;
	}
}
