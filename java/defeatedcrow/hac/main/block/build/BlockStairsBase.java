package defeatedcrow.hac.main.block.build;

import defeatedcrow.hac.api.placeable.ISidedTexture;
import defeatedcrow.hac.core.base.ISidedRenderingBlock;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockStairsBase extends BlockStairs implements ISidedTexture, ISidedRenderingBlock {

	public final String TEX;
	public final boolean isGlass;

	public BlockStairsBase(IBlockState state, String name, boolean glass) {
		super(state);
		TEX = "dcs_climate:blocks/" + name;
		isGlass = glass;
		this.setHardness(0.5F);
		this.setResistance(10.0F);
	}

	/** T, B, N, S, W, E */
	@Override
	public String getTexture(int meta, int side, boolean face) {
		return TEX;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	@Override
	public int getLightOpacity(IBlockState state, IBlockAccess world, BlockPos pos) {
		return 0;
	}

	/* 以下Glass用設定 */
	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		BlockPos check = pos.offset(side);
		IBlockState state2 = world.getBlockState(check);

		if (isGlass) {
			if (state.getBlock() == this) {
				if (state2.getBlock() == this && state.getValue(FACING) == state2.getValue(FACING))
					return false;

				if (state2.getBlock() instanceof BlockBreakable)
					return true;

				if (state2.getBlock() instanceof ISidedRenderingBlock)
					return ((ISidedRenderingBlock) state2.getBlock()).isRendered(side, state2);

				if (!state2.isSideSolid(world, check, side.getOpposite()))
					return true;
			}
		}

		return super.shouldSideBeRendered(state, world, pos, side);
	}

	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		boolean b = world.getBlockState(pos.up()).getMaterial() == Material.AIR;
		if (isGlass)
			if (!b && world.getBlockState(pos.offset(face)).getMaterial() == Material.WATER)
				return true;
			else
				return false;

		return super.doesSideBlockRendering(state, world, pos, face);
	}

	@Override
	public boolean isRendered(EnumFacing face, IBlockState state) {
		return !isGlass;
	}

}
