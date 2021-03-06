package defeatedcrow.hac.food.capability;

import defeatedcrow.hac.core.util.DCUtil;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.oredict.OreDictionary;

public enum DrinkMilk {
	NONE(0, 1.0F),
	MILK(1, 1.5F),
	CREAM(2, 2.0F),
	SOY(3, 2.0F);

	public final float effect;
	public final int id;

	private DrinkMilk(int i, float param) {
		effect = param;
		id = i;
	}

	public static DrinkMilk getFromId(int i) {
		if (i == 0) {
			return NONE;
		} else if (i == 1) {
			return MILK;
		} else if (i == 2) {
			return CREAM;
		} else if (i == 3) {
			return SOY;
		}
		return NONE;
	}

	public static String getTagKey() {
		return "dcs.drink.milk";
	}

	public static DrinkMilk isMilkItem(ItemStack item) {
		if (DCUtil.isEmpty(item)) {
			return NONE;
		} else {
			if (item.hasCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null)) {
				IFluidHandler cont = item.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null);
				FluidStack f = cont.getTankProperties()[0].getContents();
				if (f != null && f.getFluid() != null) {
					String name = FluidRegistry.getFluidName(f.getFluid());
					if (name.contains("soy")) {
						return SOY;
					} else if (name.contains("cream")) {
						return CREAM;
					} else if (name.contains("milk")) {
						return MILK;
					}
				}
			}
			int[] ids = OreDictionary.getOreIDs(item);
			for (int i : ids) {
				String name = OreDictionary.getOreName(i);
				if (name.contains("soy") || name.contains("Soy")) {
					return SOY;
				} else if (name.contains("cream") || name.contains("Cream")) {
					return CREAM;
				} else if (name.contains("milk") || name.contains("Milk")) {
					return MILK;
				}
			}
			return NONE;
		}
	}
}
