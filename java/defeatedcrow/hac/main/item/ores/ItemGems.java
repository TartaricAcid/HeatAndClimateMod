package defeatedcrow.hac.main.item.ores;

import defeatedcrow.hac.core.ClimateCore;
import defeatedcrow.hac.core.base.DCItem;
import defeatedcrow.hac.magic.MagicInit;
import defeatedcrow.hac.magic.proj.EntityProjWhiteSpit;
import defeatedcrow.hac.main.config.ModuleConfig;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemGems extends DCItem {

	private final int maxMeta;

	private static String[] names = {
			"chal_blue",
			"chal_red",
			"chal_white",
			"gypsum",
			"sapphire",
			"malachite",
			"celestite",
			"clam",
			"salt",
			"niter",
			"sulfur",
			"schorl",
			"serpentine",
			"olivine",
			"almandine"
	};

	public ItemGems(int max) {
		super();
		maxMeta = max;
	}

	@Override
	public int getMaxMeta() {
		return maxMeta;
	}

	@Override
	public String[] getNameSuffix() {
		return names;
	}

	@Override
	public String getTexPath(int meta, boolean f) {
		String s = "items/ores/gem_" + names[meta];
		if (f) {
			s = "textures/" + s;
		}
		return ClimateCore.PACKAGE_ID + ":" + s;
	}

	/* gemぶっぱ */

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		return EnumActionResult.FAIL;
	}

	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World world, EntityLivingBase living, int timeLeft) {
		if (living != null && living instanceof EntityPlayer && playerHasCharm((EntityPlayer) living)) {
			EntityPlayer player = (EntityPlayer) living;
			boolean flag = player.capabilities.isCreativeMode;

			int i = this.getMaxItemUseDuration(stack) - timeLeft;
			flag = i > 15;

			if (stack != null && flag) {
				if (!world.isRemote) {
					EntityProjWhiteSpit entityarrow = new EntityProjWhiteSpit(world, living);
					entityarrow.setAim(player, player.rotationPitch, player.rotationYaw, 0.0F, 2.0F, 1.0F);
					world.spawnEntityInWorld(entityarrow);
				}

				world.playSound((EntityPlayer) null, player.posX, player.posY, player.posZ,
						SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.NEUTRAL, 1.0F,
						1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + 0.5F);

				if (!flag) {
					--stack.stackSize;

					if (stack.stackSize == 0) {
						player.inventory.deleteStack(stack);
					}
				}

				player.addStat(StatList.getObjectUseStats(this));

			}
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
		player.setActiveHand(hand);
		if (ModuleConfig.magic && stack != null && stack.getItem() == this && stack.getItemDamage() == 2)
			return playerHasCharm(player) ? new ActionResult(EnumActionResult.SUCCESS, stack)
					: new ActionResult(EnumActionResult.PASS, stack);
		return new ActionResult(EnumActionResult.PASS, stack);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 72000;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		if (stack != null && stack.getItem() == this && stack.getItemDamage() == 2)
			return EnumAction.BOW;
		return EnumAction.NONE;
	}

	private boolean playerHasCharm(EntityPlayer player) {
		if (player != null) {
			boolean hasCharm = false;
			for (int i = 9; i < 18; i++) {
				ItemStack check = player.inventory.getStackInSlot(i);
				if (check != null && check.getItem() != null && check.getItem() == MagicInit.pendant) {
					int m = check.getMetadata();
					if (m == 14) {
						hasCharm = true;
					}
				}
			}
			if (hasCharm)
				return true;
		}
		return false;
	}

}
