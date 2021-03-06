package defeatedcrow.hac.food.item;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import defeatedcrow.hac.core.ClimateCore;
import defeatedcrow.hac.core.base.FoodEntityBase;
import defeatedcrow.hac.core.base.FoodItemBase;
import defeatedcrow.hac.food.entity.BeefStickEntity;
import defeatedcrow.hac.food.entity.FishStickEntity;
import defeatedcrow.hac.food.entity.MuttonStickEntity;
import defeatedcrow.hac.food.entity.PorkStickEntity;
import defeatedcrow.hac.food.entity.SquidStickEntity;
import defeatedcrow.hac.food.entity.YakitoriStickEntity;
import defeatedcrow.hac.main.util.EnumFixedName;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StickFoodsItem extends FoodItemBase {

	public StickFoodsItem(boolean isWolfFood) {
		super(isWolfFood);
	}

	@Override
	public int getMaxMeta() {
		return 11;
	}

	@Override
	public String getTexPath(int meta, boolean f) {
		int i = MathHelper.clamp(0, meta, 1);
		String s = "items/food/stick_" + this.getNameSuffix()[i];
		if (f) {
			s = "textures/" + s;
		}
		return ClimateCore.PACKAGE_ID + ":" + s;
	}

	@Override
	public String[] getNameSuffix() {
		String[] s = {
				"fish_raw",
				"fish_cooked",
				"yakitori_raw",
				"yakitori_cooked",
				"pork_raw",
				"pork_cooked",
				"beef_raw",
				"beef_cooked",
				"mutton_raw",
				"mutton_cooked",
				"squid_raw",
				"squid_cooked"
		};
		return s;
	}

	@Override
	public Entity getPlacementEntity(World world, EntityPlayer player, double x, double y, double z, ItemStack item) {
		int i = item.getMetadata();
		FoodEntityBase ret = null;
		switch (i) {
		case 0:
		case 1:
			ret = new FishStickEntity(world, x, y, z, player);
			break;
		case 2:
		case 3:
			ret = new YakitoriStickEntity(world, x, y, z, player);
			break;
		case 4:
		case 5:
			ret = new PorkStickEntity(world, x, y, z, player);
			break;
		case 6:
		case 7:
			ret = new BeefStickEntity(world, x, y, z, player);
			break;
		case 8:
		case 9:
			ret = new MuttonStickEntity(world, x, y, z, player);
			break;
		case 10:
		case 11:
			ret = new SquidStickEntity(world, x, y, z, player);
			break;
		default:
			ret = new FishStickEntity(world, x, y, z, player);
		}

		if (ret != null && (i & 1) == 0) {
			ret.setRAW(true);
		}
		ret.setIndividual(world.rand.nextInt(32));
		return ret;
	}

	@Override
	public int getFoodAmo(int meta) {
		switch (meta) {
		case 1:
			return 8;
		case 3:
			return 10;
		case 5:
			return 10;
		case 7:
			return 11;
		case 9:
			return 11;
		case 11:
			return 9;
		default:
			return 1;
		}
	}

	@Override
	public float getSaturation(int meta) {
		return (meta & 1) == 0 ? 0F : 0.6F;
	}

	@Override
	public ItemStack getFoodContainerItem(ItemStack item) {
		ItemStack ret = new ItemStack(Items.STICK);
		return ret;
	}

	@Override
	public List<PotionEffect> getPotionEffect(int meta) {
		List<PotionEffect> ret = new ArrayList<PotionEffect>();
		if ((meta & 1) == 0) {
			ret.add(new PotionEffect(MobEffects.HUNGER, 300, 0));
		}
		return ret;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation2(ItemStack stack, @Nullable World world, List<String> tooltip) {
		tooltip.add(EnumFixedName.PLACEABLE_ENTITY.getLocalizedName());
	}

}
