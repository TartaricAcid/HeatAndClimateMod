package defeatedcrow.hac.main.client;

import defeatedcrow.hac.api.blockstate.DCState;
import defeatedcrow.hac.api.placeable.ISidedTexture;
import defeatedcrow.hac.core.ClimateCore;
import defeatedcrow.hac.core.base.ITexturePath;
import defeatedcrow.hac.core.client.JsonRegisterHelper;
import defeatedcrow.hac.main.MainInit;
import defeatedcrow.hac.main.config.ModuleConfig;
import defeatedcrow.hac.plugin.DCIntegrationCore;
import net.minecraft.block.BlockDoor;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class JsonRegister {

	protected static final JsonRegisterHelper MAIN_INSTANCE = new JsonRegisterHelper("E:\\modding\\1.12.1\\hac_main_2\\src\\main\\resources");

	public static void load() {
		regItems();
		regBlocks();
		regTools();
	}

	static void regItems() {
		MAIN_INSTANCE.regSimpleItem(MainInit.iconItem, ClimateCore.PACKAGE_ID, "dcs_icons", "misc", 2);
		MAIN_INSTANCE.regSimpleItem(MainInit.oreIngot, ClimateCore.PACKAGE_ID, "dcs_ore_ingot", "ores", 15);
		MAIN_INSTANCE.regSimpleItem(MainInit.oreDust, ClimateCore.PACKAGE_ID, "dcs_ore_dust", "ores", 13);
		MAIN_INSTANCE.regSimpleItem(MainInit.gems, ClimateCore.PACKAGE_ID, "dcs_ore_gem", "ores", 21);
		MAIN_INSTANCE.regSimpleItem(MainInit.miscDust, ClimateCore.PACKAGE_ID, "dcs_misc_dust", "ores", 12);
		MAIN_INSTANCE.regSimpleItem(MainInit.foodDust, ClimateCore.PACKAGE_ID, "dcs_food_dust", "food", 5);
		MAIN_INSTANCE.regSimpleItem(MainInit.stoneYagen, ClimateCore.PACKAGE_ID, "dcs_stone_yagen", "tool", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.brassYagen, ClimateCore.PACKAGE_ID, "dcs_brass_yagen", "tool", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.materials, ClimateCore.PACKAGE_ID, "dcs_material", "tool", 9);
		MAIN_INSTANCE.regSimpleItem(MainInit.gears, ClimateCore.PACKAGE_ID, "dcs_gear", "tool", 3);
		MAIN_INSTANCE.regSimpleItem(MainInit.clothes, ClimateCore.PACKAGE_ID, "dcs_cloth", "tool", 9);
		MAIN_INSTANCE.regSimpleItem(MainInit.silkworm, ClimateCore.PACKAGE_ID, "dcs_silkworm", "tool", 3);
		MAIN_INSTANCE.regSimpleItem(MainInit.crowDrill, ClimateCore.PACKAGE_ID, "dcs_crow_drill", "tool", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.wrench, ClimateCore.PACKAGE_ID, "dcs_wrench", "tool", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.bakedApple, ClimateCore.PACKAGE_ID, "dcs_baked_apple", "food", 6);
		MAIN_INSTANCE.regSimpleItem(MainInit.repairPutty, ClimateCore.PACKAGE_ID, "dcs_repair_putty", "tool", 2);
		MAIN_INSTANCE.regSimpleItem(MainInit.foodMaterials, ClimateCore.PACKAGE_ID, "dcs_food_materials", "food", 3);
		MAIN_INSTANCE.regSimpleItem(MainInit.flowerPot, ClimateCore.PACKAGE_ID, "dcs_flowerpot_white", "build", 1);
		MAIN_INSTANCE.regSimpleItem(MainInit.scope, ClimateCore.PACKAGE_ID, "dcs_thermal_scope", "tool", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.entityScope, ClimateCore.PACKAGE_ID, "dcs_entity_scope", "tool", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.itemDoorMarble, ClimateCore.PACKAGE_ID, "dcs_door_marble", "build", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.itemDoorSteel, ClimateCore.PACKAGE_ID, "dcs_door_steel", "build", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.cushionGray, ClimateCore.PACKAGE_ID, "dcs_big_cushion", "build", 1);

		if (DCIntegrationCore.loadedForestry) {
			MAIN_INSTANCE.regSimpleItem(MainInit.circuit, ClimateCore.PACKAGE_ID, "dcs_plugin_circuit", "device", 0);
		}
		if (DCIntegrationCore.loadedMekanism) {
			MAIN_INSTANCE.regSimpleItem(MainInit.metalMaterials, ClimateCore.PACKAGE_ID, "dcs_plugin_metal_material",
					"device", 7);
		}

	}

	static void regBlocks() {
		regCube((ITexturePath) MainInit.dustBlock, ClimateCore.PACKAGE_ID, "dcs_ore_dustblock", "ores", 15);
		regCube((ITexturePath) MainInit.dustBlock_2, ClimateCore.PACKAGE_ID, "dcs_ore2_dustblock", "ores", 1);
		regCube((ITexturePath) MainInit.metalBlock, ClimateCore.PACKAGE_ID, "dcs_ore_metalblock", "ores", 15);
		regCube((ITexturePath) MainInit.gemBlock, ClimateCore.PACKAGE_ID, "dcs_ore_gemblock", "ores", 15);
		regCube((ITexturePath) MainInit.selenite, ClimateCore.PACKAGE_ID, "dcs_build_selenite", "build", 3);
		regCube((ITexturePath) MainInit.bricks, ClimateCore.PACKAGE_ID, "dcs_build_bricks", "build", 2);
		regCube((ITexturePath) MainInit.builds, ClimateCore.PACKAGE_ID, "dcs_build_build", "build", 10);
		regCube((ITexturePath) MainInit.syntheticBlock, ClimateCore.PACKAGE_ID, "dcs_build_synthetic_glass", "build",
				15);
		regCube((ITexturePath) MainInit.linoleum, ClimateCore.PACKAGE_ID, "dcs_build_linoleum", "build", 15);
		regCube((ITexturePath) MainInit.clayBricks, ClimateCore.PACKAGE_ID, "dcs_build_claybrick", "build", 15);

		MAIN_INSTANCE.regSimpleBlock(MainInit.ores, ClimateCore.PACKAGE_ID, "dcs_ore_stone", "ores", 15);
		MAIN_INSTANCE.regSimpleBlock(MainInit.ores_2, ClimateCore.PACKAGE_ID, "dcs_ore2_stone", "ores", 12);
		MAIN_INSTANCE.regSimpleBlock(MainInit.dustBlock, ClimateCore.PACKAGE_ID, "dcs_ore_dustblock", "ores", 15);
		MAIN_INSTANCE.regSimpleBlock(MainInit.dustBlock_2, ClimateCore.PACKAGE_ID, "dcs_ore2_dustblock", "ores", 1);
		MAIN_INSTANCE.regSimpleBlock(MainInit.metalBlock, ClimateCore.PACKAGE_ID, "dcs_ore_metalblock", "ores", 15);
		MAIN_INSTANCE.regSimpleBlock(MainInit.gemBlock, ClimateCore.PACKAGE_ID, "dcs_ore_gemblock", "ores", 15);
		MAIN_INSTANCE.regSimpleBlock(MainInit.selenite, ClimateCore.PACKAGE_ID, "dcs_build_selenite", "build", 3);
		MAIN_INSTANCE.regSimpleBlock(MainInit.chalLamp, ClimateCore.PACKAGE_ID, "dcs_build_challamp", "build", 15);
		MAIN_INSTANCE.regSimpleBlock(MainInit.bricks, ClimateCore.PACKAGE_ID, "dcs_build_bricks", "build", 2);
		MAIN_INSTANCE.regSimpleBlock(MainInit.builds, ClimateCore.PACKAGE_ID, "dcs_build_build", "build", 10);
		MAIN_INSTANCE.regSimpleBlock(MainInit.linoleum, ClimateCore.PACKAGE_ID, "dcs_build_linoleum", "build", 15);
		MAIN_INSTANCE.regSimpleBlock(MainInit.wallLamp, ClimateCore.PACKAGE_ID, "dcs_build_walllamp", "build", 3);
		MAIN_INSTANCE.regSimpleBlock(MainInit.awning, ClimateCore.PACKAGE_ID, "dcs_build_awning", "build", 3);
		MAIN_INSTANCE.regSimpleBlock(MainInit.plate, ClimateCore.PACKAGE_ID, "dcs_build_plate", "build", 1);
		MAIN_INSTANCE.regSimpleBlock(MainInit.lampCarbide, ClimateCore.PACKAGE_ID, "dcs_lamp_carbide_lantern", "build",
				0);
		MAIN_INSTANCE.regSimpleBlock(MainInit.lampGas, ClimateCore.PACKAGE_ID, "dcs_lamp_carbide_glass", "build", 0);
		MAIN_INSTANCE.regSimpleBlock(MainInit.markingPanel, ClimateCore.PACKAGE_ID, "dcs_build_markingpanel", "build",
				0);
		MAIN_INSTANCE.regSimpleBlock(MainInit.lightOrb, ClimateCore.PACKAGE_ID, "dcs_build_lightorb", "build", 0);
		MAIN_INSTANCE.regSimpleBlock(MainInit.sinkMetal, ClimateCore.PACKAGE_ID, "dcs_device_sink_half", "device", 0);
		MAIN_INSTANCE.regSimpleBlock(MainInit.sinkChest, ClimateCore.PACKAGE_ID, "dcs_device_sink_full", "device", 0);
		MAIN_INSTANCE.regSimpleBlock(MainInit.syntheticBlock, ClimateCore.PACKAGE_ID, "dcs_build_synthetic_glass",
				"build", 15);
		MAIN_INSTANCE.regSimpleBlock(MainInit.clayBricks, ClimateCore.PACKAGE_ID, "dcs_build_claybrick", "build", 15);
		MAIN_INSTANCE.regSimpleBlock(MainInit.achievementShield, ClimateCore.PACKAGE_ID, "dcs_build_shield", "build",
				2);

		MAIN_INSTANCE.regSimpleItem(Item.getItemFromBlock(MainInit.desiccant), ClimateCore.PACKAGE_ID, "dcs_desiccant",
				"build", 3);
		MAIN_INSTANCE.regSimpleItem(Item.getItemFromBlock(MainInit.freezepack), ClimateCore.PACKAGE_ID, "dcs_coolant",
				"build", 3);
		MAIN_INSTANCE.regSimpleBlock(MainInit.hedgeSpring, ClimateCore.PACKAGE_ID, "dcs_hedge_spring", "crop", 0);
		MAIN_INSTANCE.regSimpleBlock(MainInit.hedgeSummer, ClimateCore.PACKAGE_ID, "dcs_hedge_summer", "crop", 0);
		MAIN_INSTANCE.regSimpleBlock(MainInit.hedgeAutumn, ClimateCore.PACKAGE_ID, "dcs_hedge_autumn", "crop", 0);
		MAIN_INSTANCE.regSimpleBlock(MainInit.hedgeWinter, ClimateCore.PACKAGE_ID, "dcs_hedge_winter", "crop", 0);

		MAIN_INSTANCE.regTEBlock(MainInit.chamber, ClimateCore.PACKAGE_ID, "dcs_device_chamber", "machine", 0);
		MAIN_INSTANCE.regTEBlock(MainInit.shitirin, ClimateCore.PACKAGE_ID, "dcs_device_shitirin", "machine", 0);
		MAIN_INSTANCE.regTEBlock(MainInit.fuelStove, ClimateCore.PACKAGE_ID, "dcs_device_fuelstove", "machine", 0);
		MAIN_INSTANCE.regTEBlock(MainInit.chestMetal, ClimateCore.PACKAGE_ID, "dcs_device_chest_metal", "device", 0);
		MAIN_INSTANCE.regTEBlock(MainInit.chestMagnet, ClimateCore.PACKAGE_ID, "dcs_device_chest_magnet", "device", 0);
		MAIN_INSTANCE.regTEBlock(MainInit.chestVillage, ClimateCore.PACKAGE_ID, "dcs_device_chest_village", "device",
				0);
		MAIN_INSTANCE.regTETorqueBlock(MainInit.bellow, ClimateCore.PACKAGE_ID, "dcs_device_bellow", "device", 0);
		MAIN_INSTANCE.regTEBlock(MainInit.thermometer, ClimateCore.PACKAGE_ID, "dcs_device_thermometer", "device", 0);
		MAIN_INSTANCE.regTEBlock(MainInit.windvane, ClimateCore.PACKAGE_ID, "dcs_device_windvane", "device", 0);
		MAIN_INSTANCE.regTEBlock(MainInit.stevenson_screen, ClimateCore.PACKAGE_ID, "dcs_device_stevenson_screen",
				"machine", 0);

		// door
		ModelLoader.setCustomStateMapper(MainInit.doorMarble, (new StateMap.Builder()).ignore(
				BlockDoor.POWERED).build());
		ModelLoader.setCustomStateMapper(MainInit.doorSteel, (new StateMap.Builder()).ignore(
				BlockDoor.POWERED).build());

		ModelLoader.setCustomStateMapper(MainInit.realtimeClock, (new StateMap.Builder()).ignore(
				DCState.FACING).build());
		MAIN_INSTANCE.regSimpleItem(Item.getItemFromBlock(MainInit.realtimeClock), ClimateCore.PACKAGE_ID,
				"dcs_device_realtimeclock", "device", 0);

		ModelLoader.setCustomStateMapper(MainInit.realtimeClock_L, (new StateMap.Builder()).ignore(
				DCState.FACING).build());
		MAIN_INSTANCE.regSimpleItem(Item.getItemFromBlock(MainInit.realtimeClock_L), ClimateCore.PACKAGE_ID,
				"dcs_device_realtimeclock_l", "device", 0);

		ModelLoader.setCustomStateMapper(MainInit.mcClock_L, (new StateMap.Builder()).ignore(DCState.FACING).build());
		MAIN_INSTANCE.regSimpleItem(Item.getItemFromBlock(MainInit.mcClock_L), ClimateCore.PACKAGE_ID,
				"dcs_device_mcclock_l", "device", 0);
	}

	static void regTools() {

		if (ModuleConfig.tool) {
			String[] name = {
					"brass",
					"steel",
					"silver",
					"nickelsilver",
					"chalcedony",
					"sapphire",
					"titanium",
					"garnet"
			};
			for (int j = 0; j < name.length; j++) {
				MAIN_INSTANCE.regSimpleItem(MainInit.dcAxe[j], ClimateCore.PACKAGE_ID, "dcs_axe_" + name[j], "equip",
						0);
				MAIN_INSTANCE.regSimpleItem(MainInit.dcPickaxe[j], ClimateCore.PACKAGE_ID, "dcs_pickaxe_" + name[j],
						"equip", 0);
				MAIN_INSTANCE.regSimpleItem(MainInit.dcSpade[j], ClimateCore.PACKAGE_ID, "dcs_spade_" + name[j],
						"equip", 0);
				MAIN_INSTANCE.regSimpleItem(MainInit.dcSword[j], ClimateCore.PACKAGE_ID, "dcs_sword_" + name[j],
						"equip", 0);
			}
			String[] type = {
					"met",
					"plate",
					"leggins",
					"boots"
			};
			for (int i = 0; i < 4; i++) {
				MAIN_INSTANCE.regSimpleItem(MainInit.brassArmor[i], ClimateCore.PACKAGE_ID, "dcs_" + type[i] + "_brass",
						"equip", 0);
				MAIN_INSTANCE.regSimpleItem(MainInit.steelArmor[i], ClimateCore.PACKAGE_ID, "dcs_" + type[i] + "_steel",
						"equip", 0);
				MAIN_INSTANCE.regSimpleItem(MainInit.chalcArmor[i], ClimateCore.PACKAGE_ID, "dcs_" + type[i] +
						"_chalcedony", "equip", 0);
				MAIN_INSTANCE.regSimpleItem(MainInit.sapphireArmor[i], ClimateCore.PACKAGE_ID, "dcs_" + type[i] +
						"_sapphire", "equip", 0);
				MAIN_INSTANCE.regSimpleItem(MainInit.titaniumArmor[i], ClimateCore.PACKAGE_ID, "dcs_" + type[i] +
						"_titanium", "equip", 0);
			}

			String[] name2 = {
					"brass",
					"steel",
					"chalcedony",
					"garnet"
			};
			for (int j = 0; j < name2.length; j++) {
				MAIN_INSTANCE.regSimpleItem(MainInit.dcScythe[j], ClimateCore.PACKAGE_ID, "dcs_scythe_" + name[j],
						"equip", 0);
			}

			MAIN_INSTANCE.regSimpleItem(MainInit.earthSpade, ClimateCore.PACKAGE_ID, "dcs_spade_earth", "equip", 0);
			MAIN_INSTANCE.regSimpleItem(MainInit.earthRake, ClimateCore.PACKAGE_ID, "dcs_rake_earth", "equip", 0);

		}

		MAIN_INSTANCE.regSimpleItem(MainInit.crossbow, ClimateCore.PACKAGE_ID, "dcs_crossbow_iron", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.gun, ClimateCore.PACKAGE_ID, "dcs_musket_steel", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.cartridge, ClimateCore.PACKAGE_ID, "dcs_cartridge", "equip", 7);

		MAIN_INSTANCE.regSimpleItem(MainInit.linenUnder, ClimateCore.PACKAGE_ID, "dcs_leggins_linen", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.linenCoat, ClimateCore.PACKAGE_ID, "dcs_plate_linen", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.clothUnder, ClimateCore.PACKAGE_ID, "dcs_leggins_cloth", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.workerSuit, ClimateCore.PACKAGE_ID, "dcs_leggins_worker", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.blackSuit, ClimateCore.PACKAGE_ID, "dcs_leggins_black", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.trackSuit, ClimateCore.PACKAGE_ID, "dcs_leggins_tracksuit", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.combatDress, ClimateCore.PACKAGE_ID, "dcs_leggins_combatdress", "equip",
				0);
		MAIN_INSTANCE.regSimpleItem(MainInit.hoodie, ClimateCore.PACKAGE_ID, "dcs_plate_hoodie", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.leatherHat, ClimateCore.PACKAGE_ID, "dcs_hat_leather", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.cottonHat, ClimateCore.PACKAGE_ID, "dcs_hat_cotton", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.woolWear, ClimateCore.PACKAGE_ID, "dcs_wear_wool", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.furWear, ClimateCore.PACKAGE_ID, "dcs_wear_fue", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.woolBoots, ClimateCore.PACKAGE_ID, "dcs_boots_wool", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.peaCoat, ClimateCore.PACKAGE_ID, "dcs_plate_peacoat", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.hoodieB, ClimateCore.PACKAGE_ID, "dcs_plate_hoodie_black", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.blackCoat, ClimateCore.PACKAGE_ID, "dcs_plate_silk", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.clothCoat, ClimateCore.PACKAGE_ID, "dcs_plate_cloth", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.magicUnder, ClimateCore.PACKAGE_ID, "dcs_leggins_magic", "equip", 0);
		MAIN_INSTANCE.regSimpleItem(MainInit.magicCoat, ClimateCore.PACKAGE_ID, "dcs_plate_magic", "equip", 0);
	}

	static void regCube(ITexturePath block, String domein, String name, String dir, int meta) {
		if (MAIN_INSTANCE.active) {
			for (int i = 0; i <= meta; i++) {
				MAIN_INSTANCE.checkAndBuildJsonCube(block, domein, name, dir, i, true);
			}
		}
	}

	static void regSidedCube(ISidedTexture block, String domein, String name, String dir, int meta) {
		if (MAIN_INSTANCE.active) {
			for (int i = 0; i <= meta; i++) {
				MAIN_INSTANCE.checkAndBuildSidedCube(block, domein, name, dir, i, true);
			}
		}
	}

	static void regCross(ISidedTexture block, String domein, String name, String dir, int meta) {
		if (MAIN_INSTANCE.active) {
			for (int i = 0; i <= meta; i++) {
				MAIN_INSTANCE.checkAndBuildJsonCross(block, domein, name, dir, i, true);
			}
		}
	}

}
