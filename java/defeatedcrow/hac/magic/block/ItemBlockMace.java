package defeatedcrow.hac.magic.block;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Multimap;

import defeatedcrow.hac.core.ClimateCore;
import defeatedcrow.hac.core.base.DCItemBlock;
import defeatedcrow.hac.core.util.DCUtil;
import defeatedcrow.hac.main.MainInit;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class ItemBlockMace extends DCItemBlock {

	public ItemBlockMace(Block block) {
		super(block);
		this.setMaxStackSize(1);
	}

	public float getDamageVsEntity() {
		return 3.0F;
	}

	@Override
	public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
		Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

		if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
			multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
					new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", this.getDamageVsEntity(), 0));
			multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(),
					new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.0D, 0));
		}

		return multimap;
	}

	@Override
	public EnumActionResult onItemUse2(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing,
			float hitX, float hitY, float hitZ) {
		if (player != null
				&& !player.isSneaking()) {
			ItemStack stack = player.getHeldItem(hand);
			if (this.isActive(stack)) {
				int amo = this.getNBTDamage(stack);
				this.onItemRightClick2(world, player, hand);
				return EnumActionResult.SUCCESS;
			}
		}
		return super.onItemUse2(player, world, pos, hand, facing, hitX, hitY, hitZ);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick2(World world, EntityPlayer player, EnumHand hand) {
		if (player != null
				&& !player.isSneaking()) {
			ItemStack stack = player.getHeldItem(hand);
			if (this.isActive(stack)) {
				int amo = this.getNBTDamage(stack);
				this.doUsingEffect(stack, player, world);

				int e1 = EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, stack);

				amo -= MathHelper.ceil(10F
						/ (e1
								+ 1));
				if (amo < 0) {
					amo = 0;
				}
				if (amo < 0) {
					amo = 0;
				}

				NBTTagCompound tag = stack.getTagCompound();
				if (tag == null) {
					tag = new NBTTagCompound();
				}
				tag.setInteger("dcs.mace.energy", amo);
				stack.setTagCompound(tag);
				player.inventory.markDirty();
			}
			return new ActionResult(EnumActionResult.SUCCESS, stack);
		}
		return super.onItemRightClick2(world, player, hand);
	}

	protected abstract void doUsingEffect(ItemStack stack, EntityPlayer player, World world);

	protected int magicSuitCount(EntityPlayer player) {
		if (player != null) {
			int i = 0;
			for (ItemStack armor : player.getArmorInventoryList()) {
				if (!DCUtil.isEmpty(armor)) {
					if (armor.getItem() == MainInit.magicCoat) {
						i++;
					}
					if (armor.getItem() == MainInit.magicUnder) {
						i++;
					}
				}
			}
			return i;
		}
		return 0;
	}

	/* item damage */

	@Override
	public boolean showDurabilityBar(ItemStack stack) {
		return true;
	}

	@Override
	public double getDurabilityForDisplay(ItemStack stack) {
		int i = this.getNBTDamage(stack);
		return (640.0D
				- i)
				/ 640.0D;
	}

	public int getNBTDamage(ItemStack stack) {
		if (stack != null) {
			NBTTagCompound tag = stack.getTagCompound();
			if (tag == null) {
				tag = new NBTTagCompound();
			}

			if (tag.hasKey("dcs.mace.energy")) {
				int d = tag.getInteger("dcs.mace.energy");
				return d;
			}
		}
		return 0;
	}

	public boolean isActive(ItemStack item) {
		return getNBTDamage(item) > 0;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation2(ItemStack stack, @Nullable World world, List<String> tooltip) {
		int d = this.getNBTDamage(stack);
		tooltip.add("Energy: "
				+ d + "/ 640");
		if (ClimateCore.proxy.isShiftKeyDown()) {
			tooltip.add(TextFormatting.YELLOW.toString()
					+ "For energy charge, please place in the appropriate environment.");
		} else {
			tooltip.add(TextFormatting.RESET.toString()
					+ I18n.translateToLocal("dcs.tip.shift"));
		}
	}
}
