package defeatedcrow.hac.main.event;

import defeatedcrow.hac.food.FoodInit;
import defeatedcrow.hac.magic.MagicInit;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnDeathEventDC {

	@SubscribeEvent
	public void onDeath(LivingDeathEvent event) {
		EntityLivingBase living = event.getEntityLiving();
		DamageSource source = event.getSource();
		if (living == null)
			return;

		if (living instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) living;
			boolean hasCharm = false;
			for (int i = 9; i < 18; i++) {
				ItemStack check = player.inventory.getStackInSlot(i);
				if (check != null && check.getItem() != null && check.getItem() == MagicInit.pendant) {
					int m = check.getMetadata();
					if (m == 7) {
						hasCharm = true;
					}
				}
			}

			if (hasCharm) {
				int dim = player.worldObj.provider.getDimension();
				boolean over = false;
				BlockPos pos = player.getBedLocation(dim);
				if (pos != null) {
					player.setPositionAndUpdate(pos.getX() + 0.5D, pos.getY() + 1.25D, pos.getZ() + 0.5D);
					player.fallDistance = 0.0F;
					player.setHealth(10.0F);
					player.worldObj.playSound(player, pos, Blocks.GLASS.getSoundType().getBreakSound(),
							SoundCategory.PLAYERS, 1.0F, 0.75F);
					event.setCanceled(true);
				}

			}
		}
	}

	@SubscribeEvent
	public void onDrop(LivingHurtEvent event) {
		EntityLivingBase living = event.getEntityLiving();
		DamageSource source = event.getSource();
		float dam = event.getAmount();
		if (living == null)
			return;

		/* Projectileでの一撃必殺 */
		if (living instanceof EntityAnimal && !living.worldObj.isRemote && living.worldObj.rand.nextBoolean()) {
			if (source.isProjectile() && source.getEntity() != null && source.getEntity() instanceof EntityPlayer) {
				if (living.getHealth() >= living.getMaxHealth() && dam > living.getMaxHealth()) {
					ItemStack vis = new ItemStack(FoodInit.meat, 1, 0);
					EntityItem drop = new EntityItem(living.worldObj, living.posX, living.posY, living.posZ, vis);
					living.worldObj.spawnEntityInWorld(drop);
				}
			}
		}
	}
}
