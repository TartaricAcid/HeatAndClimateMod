package defeatedcrow.hac.main.util;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import defeatedcrow.hac.api.damage.DamageAPI;
import defeatedcrow.hac.main.MainInit;

public class DCArmorMaterial {

	private DCArmorMaterial() {
	}

	public static ItemArmor.ArmorMaterial DC_LINEN;
	public static ItemArmor.ArmorMaterial DC_CLOTH;
	public static ItemArmor.ArmorMaterial DC_BRASS;
	public static ItemArmor.ArmorMaterial DC_STEEL;
	public static ItemArmor.ArmorMaterial DC_SAPPHIRE;
	public static ItemArmor.ArmorMaterial DC_CHALCEDONY;

	public static final ItemArmor.ArmorMaterial[] VAR = {
			DC_BRASS,
			DC_STEEL,
			DC_CHALCEDONY,
			DC_SAPPHIRE,
			DC_LINEN,
			DC_CLOTH };

	public static DCMaterial getMaterial(ItemArmor.ArmorMaterial mat) {
		if (mat == DC_LINEN) {
			return DCMaterial.LINEN;
		}
		if (mat == DC_CLOTH) {
			return DCMaterial.CLOTH;
		}
		if (mat == DC_BRASS) {
			return DCMaterial.BRASS;
		}
		if (mat == DC_STEEL) {
			return DCMaterial.STEEL;
		}
		if (mat == DC_CHALCEDONY) {
			return DCMaterial.CHALCEDONY;
		}
		if (mat == DC_SAPPHIRE) {
			return DCMaterial.SAPPHIRE;
		}
		return null;
	}

	public static void load() {
		DCArmorMaterial.DC_LINEN = EnumHelper.addArmorMaterial("dcs_" + DCMaterial.LINEN.name, "dcs_"
				+ DCMaterial.LINEN.name, DCMaterial.LINEN.armorDur, DCMaterial.LINEN.reduceDam,
				DCMaterial.LINEN.enchant, DCMaterial.LINEN.sound, DCMaterial.LINEN.toughness);
		DCArmorMaterial.DC_LINEN.customCraftingMaterial = MainInit.repairPutty;

		DCArmorMaterial.DC_CLOTH = EnumHelper.addArmorMaterial("dcs_" + DCMaterial.CLOTH.name, "dcs_"
				+ DCMaterial.CLOTH.name, DCMaterial.CLOTH.armorDur, DCMaterial.CLOTH.reduceDam,
				DCMaterial.CLOTH.enchant, DCMaterial.CLOTH.sound, DCMaterial.CLOTH.toughness);
		DCArmorMaterial.DC_CLOTH.customCraftingMaterial = MainInit.repairPutty;

		DCArmorMaterial.DC_BRASS = EnumHelper.addArmorMaterial("dcs_" + DCMaterial.BRASS.name, "dcs_"
				+ DCMaterial.BRASS.name, DCMaterial.BRASS.armorDur, DCMaterial.BRASS.reduceDam,
				DCMaterial.BRASS.enchant, DCMaterial.BRASS.sound, DCMaterial.BRASS.toughness);
		DCArmorMaterial.DC_BRASS.customCraftingMaterial = MainInit.repairPutty;

		DCArmorMaterial.DC_STEEL = EnumHelper.addArmorMaterial("dcs_" + DCMaterial.STEEL.name, "dcs_"
				+ DCMaterial.STEEL.name, DCMaterial.STEEL.armorDur, DCMaterial.STEEL.reduceDam,
				DCMaterial.STEEL.enchant, DCMaterial.STEEL.sound, DCMaterial.STEEL.toughness);
		DCArmorMaterial.DC_STEEL.customCraftingMaterial = MainInit.repairPutty;

		DCArmorMaterial.DC_CHALCEDONY = EnumHelper.addArmorMaterial("dcs_" + DCMaterial.CHALCEDONY.name, "dcs_"
				+ DCMaterial.CHALCEDONY.name, DCMaterial.CHALCEDONY.armorDur, DCMaterial.CHALCEDONY.reduceDam,
				DCMaterial.CHALCEDONY.enchant, DCMaterial.CHALCEDONY.sound, DCMaterial.CHALCEDONY.toughness);
		DCArmorMaterial.DC_CHALCEDONY.customCraftingMaterial = MainInit.repairPutty;

		DCArmorMaterial.DC_SAPPHIRE = EnumHelper.addArmorMaterial("dcs_" + DCMaterial.SAPPHIRE.name, "dcs_"
				+ DCMaterial.SAPPHIRE.name, DCMaterial.SAPPHIRE.armorDur, DCMaterial.SAPPHIRE.reduceDam,
				DCMaterial.SAPPHIRE.enchant, DCMaterial.SAPPHIRE.sound, DCMaterial.SAPPHIRE.toughness);
		DCArmorMaterial.DC_SAPPHIRE.customCraftingMaterial = MainInit.repairPutty;

		// 耐性登録
		DamageAPI.armorRegister.RegisterMaterial(DCArmorMaterial.DC_LINEN, 2.0F);
		DamageAPI.armorRegister.RegisterMaterial(DCArmorMaterial.DC_CLOTH, 3.0F);
		DamageAPI.armorRegister.RegisterMaterial(DCArmorMaterial.DC_CHALCEDONY, 1.0F);
		DamageAPI.armorRegister.RegisterMaterial(DCArmorMaterial.DC_SAPPHIRE, 0.5F);
	}

}
