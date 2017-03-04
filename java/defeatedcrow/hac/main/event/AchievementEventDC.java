package defeatedcrow.hac.main.event;

import java.util.Map;

import defeatedcrow.hac.api.damage.DamageAPI;
import defeatedcrow.hac.api.damage.DamageSourceClimate;
import defeatedcrow.hac.core.util.DCUtil;
import defeatedcrow.hac.magic.MagicInit;
import defeatedcrow.hac.main.MainInit;
import defeatedcrow.hac.main.achievement.AchievementClimate;
import defeatedcrow.hac.main.achievement.AcvHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

// 実績トリガー
public class AchievementEventDC {

	@SubscribeEvent
	public void onEvent(LivingEvent.LivingUpdateEvent event) {
		EntityLivingBase living = event.getEntityLiving();
		if (living != null && living instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) living;
			if (!living.worldObj.isRemote) {
				if (!player.hasAchievement(AchievementClimate.CLIMATE_ARMOR)) {
					Iterable<ItemStack> items = living.getArmorInventoryList();
					float prev = 0F;
					if (items != null) {
						for (ItemStack item : items) {
							if (item != null && item.getItem() instanceof ItemArmor) {
								ArmorMaterial mat = ((ItemArmor) item.getItem()).getArmorMaterial();
								prev += DamageAPI.armorRegister.getPreventAmount(mat);
							}
						}
					}
					if (prev >= 4.0F) {
						AcvHelper.addClimateAcievement(player, AchievementClimate.CLIMATE_ARMOR);
					}
				}

				if (!player.hasAchievement(AchievementClimate.MAGIC_CHARM)) {
					Map<Integer, ItemStack> charms = DCUtil.getPlayerCharm(player, null);
					if (!charms.isEmpty()) {
						AcvHelper.addMagicAcievement(player, AchievementClimate.MAGIC_CHARM);
					}
				}
			}

			if (player.inventory.hasItemStack(new ItemStack(MagicInit.pendant, 1, 10))
					&& player.isPotionActive(MobEffects.SPEED)) {
				player.stepHeight = 1.0F;
			} else {
				player.stepHeight = 0.6F;
			}
		}
	}

	@SubscribeEvent
	public void onHurt(LivingHurtEvent event) {
		EntityLivingBase living = event.getEntityLiving();
		DamageSource source = event.getSource();
		float dam = event.getAmount();

		if (living instanceof EntityPlayer && !living.worldObj.isRemote) {
			EntityPlayer player = (EntityPlayer) living;
			if (!player.hasAchievement(AchievementClimate.CLIMATE_DAMAGE)) {
				if (dam > 0.5F && source instanceof DamageSourceClimate) {
					AcvHelper.addClimateAcievement(player, AchievementClimate.CLIMATE_DAMAGE);
				}
			}
		}
	}

	@SubscribeEvent
	public void onPick(EntityItemPickupEvent event) {
		EntityPlayer player = event.getEntityPlayer();
		EntityItem drop = event.getItem();
		if (player != null && drop != null && drop.getEntityItem() != null && !player.worldObj.isRemote) {
			if (DCUtil.isSameItem(drop.getEntityItem(), new ItemStack(MainInit.cropCont, 1, 9))
					&& !player.hasAchievement(AchievementClimate.CLIMATE_SMELT)) {
				AcvHelper.addClimateAcievement(player, AchievementClimate.CLIMATE_SMELT);
			} else if (drop.getEntityItem().getItem() == MainInit.gems) {
				int m = drop.getEntityItem().getItemDamage();
				if (m == 0 || m == 1 || m == 2 || m == 3 || m == 4 || m == 11 || m == 12 || m == 14) {
					AcvHelper.addMagicAcievement(player, AchievementClimate.MAGIC_GEM);
				} else if (m == 5 || m == 6 || m == 7 || m == 13) {
					AcvHelper.addMagicAcievement(player, AchievementClimate.MAGIC_GEM_RARE);
				}
			} else if (drop.getEntityItem().getItem() == Item.getItemFromBlock(MainInit.metalBlock)) {
				int m = drop.getEntityItem().getItemDamage();
				if (m == 4 || m == 9) {
					AcvHelper.addMagicAcievement(player, AchievementClimate.METAL_TIER1);
				} else if (m == 3 || m == 5 || m == 6) {
					AcvHelper.addMagicAcievement(player, AchievementClimate.METAL_TIER2);
				} else if (m == 7 || m == 10) {
					AcvHelper.addMagicAcievement(player, AchievementClimate.METAL_TIER3);
				}
			} else if (drop.getEntityItem().getItem() == Item.getItemFromBlock(MagicInit.elestial)) {
				AcvHelper.addMagicAcievement(player, AchievementClimate.MAGIC_ELESTIAL);
			}
		}
	}
}
