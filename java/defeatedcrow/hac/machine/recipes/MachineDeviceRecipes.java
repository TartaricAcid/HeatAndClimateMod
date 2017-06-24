package defeatedcrow.hac.machine.recipes;

import java.util.List;

import defeatedcrow.hac.api.climate.DCHeatTier;
import defeatedcrow.hac.api.recipe.IReactorRecipe;
import defeatedcrow.hac.api.recipe.RecipeAPI;
import defeatedcrow.hac.core.climate.recipe.ReactorRecipe;
import defeatedcrow.hac.food.FoodInit;
import defeatedcrow.hac.machine.MachineInit;
import defeatedcrow.hac.machine.block.TileSpinningMachine;
import defeatedcrow.hac.main.MainInit;
import defeatedcrow.hac.main.config.ModuleConfig;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.UniversalBucket;
import net.minecraftforge.oredict.OreDictionary;

public class MachineDeviceRecipes {

	public static void load() {
		loadMachineRecipe();
		loadClimateRecipe();
		if (ModuleConfig.machine_advanced) {
			loadReactorRecipe();
		}
	}

	static void loadClimateRecipe() {}

	static void loadMachineRecipe() {
		// mill
		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 2, 0), new ItemStack(MainInit.gems, 1, 5),
				0.1F, "oreCopper");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 2, 1), new ItemStack(MainInit.oreDust, 1, 5),
				0.25F, "oreZinc");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 2, 5), new ItemStack(MainInit.oreDust, 1, 5),
				0.25F, "oreIron");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 2, 7), new ItemStack(MainInit.oreDust, 1, 9),
				0.25F, "oreMagnetite");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 2, 2), new ItemStack(MainInit.oreDust, 1, 5),
				0.25F, "oreNickel");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 2, 4), new ItemStack(MainInit.oreDust, 1, 3),
				0.25F, "oreGold");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 2, 3), new ItemStack(MainInit.oreDust, 1, 0),
				0.25F, "oreSilver");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.gems, 2, 3), new ItemStack(MainInit.gems, 1, 6), 0.05F,
				"oreGypsum");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.gems, 2, 0), new ItemStack(MainInit.gems, 1, 4), 0.05F,
				"oreChalcedonyB");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.gems, 2, 2), new ItemStack(Items.QUARTZ), 0.25F,
				"oreChalcedonyW");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.gems, 1, 4), new ItemStack(MainInit.gems, 1, 4), 0.2F,
				"oreSapphire");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.miscDust, 1, 2), new ItemStack(MainInit.gems, 1, 7),
				0.05F, "oreLime");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.gems, 2, 8), new ItemStack(MainInit.gems, 1, 8), 0.5F,
				"oreSalt");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.gems, 1, 9), new ItemStack(MainInit.gems, 1, 9), 0.5F,
				"oreNiter");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.gems, 1, 10), new ItemStack(MainInit.gems, 1, 10),
				0.5F, "oreSulfur");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 2, 8), new ItemStack(MainInit.oreDust, 1, 8),
				0.25F, "oreTin");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.gems, 1, 11), new ItemStack(MainInit.gems, 1, 11),
				0.2F, "oreSchorl");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.gems, 4, 12), new ItemStack(MainInit.gems, 1, 13),
				0.05F, "oreSerpentine");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.gems, 1, 14), new ItemStack(MainInit.gems, 1, 14),
				0.2F, "oreGarnet");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 10), new ItemStack(MainInit.gems, 1, 15),
				0.2F, "oreTitanium");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 2, 11),
				new ItemStack(MainInit.oreDust, 1, 11), 0.5F, "oreAluminium");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 12), new ItemStack(MainInit.oreDust, 1, 1),
				0.75F, "oreBismuth");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.QUARTZ, 1, 0), new ItemStack(Items.QUARTZ, 1, 0), 0.2F,
				"oreQuartz");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.EMERALD, 1, 0), new ItemStack(Items.EMERALD, 1, 0), 0.2F,
				"oreEmerald");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.DIAMOND, 1, 0), new ItemStack(Items.DIAMOND, 1, 0), 0.2F,
				"oreDiamond");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.DYE, 3, 4), new ItemStack(MainInit.oreDust, 1, 0), 1.0F,
				"oreLapis");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.REDSTONE, 4, 0), new ItemStack(MainInit.oreDust, 1, 9),
				0.5F, "oreRedstone");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.COAL, 2, 0), new ItemStack(MainInit.miscDust, 1, 0), 0.5F,
				"oreCoal");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Blocks.SAND, 4, 0), new ItemStack(MainInit.oreDust, 1, 11),
				0.5F, new ItemStack(Blocks.RED_SANDSTONE, 1, 32767));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Blocks.SAND, 1, 0), new ItemStack(MainInit.oreDust, 1, 11),
				0.25F, new ItemStack(Blocks.SAND, 1, 1));

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.miscDust, 1, 0), new ItemStack(Items.COAL, 1, 0));

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.miscDust, 1, 1), "gemQuartz");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.miscDust, 1, 1), "gemChalcedony");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.miscDust, 4, 3), "logWood");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.miscDust, 1, 6), "gemNiter");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.miscDust, 1, 7), "gemSulfur");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.miscDust, 1, 8), "gemGarnet");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.foodMaterials, 2, 0), "gemSalt");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.foodMaterials, 2, 1), "cropWheat");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 10), "gemRutile");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 11), "gemBauxite");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 12), "gemBismuth");

		// ingot粉砕
		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 0), "ingotCopper");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 1), "ingotZinc");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 2), "ingotNickel");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 3), "ingotSilver");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 4), "ingotGold");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 5), "ingotIron");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 8), "ingotTin");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 11), "ingotAluminium");

		RecipeAPI.registerMills.addRecipe(new ItemStack(MainInit.oreDust, 1, 12), "ingotBismuth");

		// 以下バニラ
		RecipeAPI.registerMills.addRecipe(new ItemStack(Blocks.GRAVEL, 1, 0), null, 0F, "cobblestone");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Blocks.SAND, 1, 0), new ItemStack(Items.FLINT, 1, 0), 1.0F,
				new ItemStack(Blocks.GRAVEL, 1, 0));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.BLAZE_POWDER, 3, 0),
				new ItemStack(Items.BLAZE_POWDER, 1, 0), 0.5F, "stickBlaze");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.DYE, 5, 15), new ItemStack(Items.DYE, 2, 15), 0.5F,
				"bone");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.SUGAR, 2, 0), new ItemStack(Items.SUGAR, 1, 0), 0.5F,
				"sugarcane");

		RecipeAPI.registerMills.addRecipe(new ItemStack(Blocks.SAND, 4, 0), null, 0.0F,
				new ItemStack(Blocks.SANDSTONE, 1, 32767));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.GLOWSTONE_DUST, 4, 0), new ItemStack(Blocks.GLOWSTONE));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.BLAZE_POWDER, 1, 0), new ItemStack(Blocks.MAGMA));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Blocks.ICE, 1, 0), null, 0.0F,
				new ItemStack(Blocks.PACKED_ICE));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.NETHERBRICK, 4, 0), null, 0F,
				new ItemStack(Blocks.NETHER_BRICK, 1, 0));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.NETHERBRICK, 6, 0), null, 0F,
				new ItemStack(Blocks.NETHER_BRICK_STAIRS, 1, 0));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.NETHERBRICK, 4, 0), null, 0F,
				new ItemStack(Blocks.NETHER_BRICK_FENCE, 1, 0));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Blocks.END_STONE, 4, 0), null, 0F,
				new ItemStack(Blocks.END_BRICKS, 1, 0));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.STRING, 4, 0), null, 0F,
				new ItemStack(Blocks.WOOL, 1, 32767));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.CLAY_BALL, 4, 0), null, 0F,
				new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 32767));

		RecipeAPI.registerMills.addRecipe(new ItemStack(Items.CLAY_BALL, 4, 0), null, 0F,
				new ItemStack(Blocks.HARDENED_CLAY, 1, 0));

		// plugin
		List<ItemStack> dust_o = OreDictionary.getOres("dustOsmium");
		if (!dust_o.isEmpty()) {
			ItemStack ret = new ItemStack(dust_o.get(0).getItem(), 2, dust_o.get(0).getItemDamage());
			RecipeAPI.registerMills.addRecipe(ret, "oreOsmium");
		}

		List<ItemStack> dust_l = OreDictionary.getOres("dustLead");
		if (!dust_l.isEmpty()) {
			ItemStack ret = new ItemStack(dust_l.get(0).getItem(), 2, dust_l.get(0).getItemDamage());
			RecipeAPI.registerMills.addRecipe(ret, "oreLead");
		}

		// spinning machine
		TileSpinningMachine.registerRecipe("blockTallGrass", 4, new ItemStack(MainInit.materials, 1, 0));
		TileSpinningMachine.registerRecipe("string", 4, new ItemStack(MainInit.materials, 1, 1));
		TileSpinningMachine.registerRecipe("cropCotton", 4, new ItemStack(MainInit.materials, 1, 1));
		TileSpinningMachine.registerRecipe("cropFluff", 4, new ItemStack(MainInit.materials, 1, 1));
	}

	static void loadReactorRecipe() {
		// Ni-Al 水蒸気改質系
		IReactorRecipe r1 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 1), null,
				new FluidStack(MachineInit.fuelOil, 200), null, DCHeatTier.KILN, 0,
				new ItemStack(MachineInit.catalyst, 1, 0), new FluidStack(FoodInit.oil, 200),
				new FluidStack(FluidRegistry.WATER, 200), new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r1, DCHeatTier.KILN);

		IReactorRecipe r2 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 0), null,
				new FluidStack(MachineInit.fuelOil, 200), null, DCHeatTier.KILN, 0,
				new ItemStack(MachineInit.catalyst, 1, 0), new FluidStack(FoodInit.blackLiquor, 200),
				new FluidStack(FluidRegistry.WATER, 200), new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r2, DCHeatTier.KILN);

		IReactorRecipe r3 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 0),
				new ItemStack(MainInit.miscDust, 1, 7), new FluidStack(MachineInit.fuelOil, 400), null, DCHeatTier.OVEN,
				0.25F, new ItemStack(MachineInit.catalyst, 1, 0), new FluidStack(FluidRegistry.WATER, 200), null,
				new Object[] {
						"gemCoal"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r3, DCHeatTier.OVEN);

		IReactorRecipe r4 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 7), null,
				new FluidStack(MachineInit.fuelOil, 100), null, DCHeatTier.OVEN, 0,
				new ItemStack(MachineInit.catalyst, 1, 0), new FluidStack(FluidRegistry.WATER, 200), null,
				new Object[] {
						new ItemStack(MachineInit.reagent, 1, 0)
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r4, DCHeatTier.OVEN);

		// Pt 炭化水素ガス
		IReactorRecipe r5 = new ReactorRecipe(null, null, new FluidStack(MachineInit.fuelGas, 200), null,
				DCHeatTier.SMELTING, 0, new ItemStack(MachineInit.catalyst, 1, 3),
				new FluidStack(MachineInit.fuelOil, 200), new FluidStack(FluidRegistry.WATER, 200), new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r5, DCHeatTier.SMELTING);

		IReactorRecipe r6 = new ReactorRecipe(null, null, new FluidStack(MachineInit.fuelGas, 400), null,
				DCHeatTier.SMELTING, 0, new ItemStack(MachineInit.catalyst, 1, 3),
				new FluidStack(MachineInit.fuelOil, 200), new FluidStack(MachineInit.hydrogen, 200), new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r6, DCHeatTier.SMELTING);

		// Ni 水素ガス
		IReactorRecipe r7 = new ReactorRecipe(null, null, new FluidStack(MachineInit.hydrogen, 400), null,
				DCHeatTier.SMELTING, 0, new ItemStack(MachineInit.catalyst, 1, 0),
				new FluidStack(MachineInit.fuelGas, 200), new FluidStack(FluidRegistry.WATER, 200), new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r7, DCHeatTier.SMELTING);

		// Fe ハーバーボッシュ
		IReactorRecipe r8 = new ReactorRecipe(null, null, new FluidStack(MachineInit.ammonia, 600), null,
				DCHeatTier.KILN, 0, new ItemStack(Blocks.IRON_ORE, 1, 0), new FluidStack(MachineInit.hydrogen, 1000),
				null, new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r8, DCHeatTier.KILN);

		IReactorRecipe r19 = new ReactorRecipe(null, null, new FluidStack(MachineInit.ammonia, 600), null,
				DCHeatTier.KILN, 0, new ItemStack(MainInit.ores, 1, 5), new FluidStack(MachineInit.hydrogen, 1000),
				null, new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r19, DCHeatTier.KILN);

		// Pt オストワルト
		IReactorRecipe r12 = new ReactorRecipe(null, null, new FluidStack(MachineInit.nitricAcid, 1000), null,
				DCHeatTier.KILN, 0, new ItemStack(MachineInit.catalyst, 1, 3),
				new FluidStack(MachineInit.ammonia, 1000), new FluidStack(FluidRegistry.WATER, 1000), new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r12, DCHeatTier.KILN);

		// Bi ソハイオ
		IReactorRecipe r9 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 2), null, null, null,
				DCHeatTier.KILN, 0, new ItemStack(MachineInit.catalyst, 1, 2), new FluidStack(MachineInit.fuelGas, 200),
				new FluidStack(MachineInit.ammonia, 200), new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r9, DCHeatTier.KILN);

		// 触媒なし
		// 硝安
		IReactorRecipe r10 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 4), null, null, null,
				DCHeatTier.NORMAL, 0, null, new FluidStack(MachineInit.nitricAcid, 200),
				new FluidStack(MachineInit.ammonia, 200), new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r10, DCHeatTier.NORMAL);

		// 硝酸2
		IReactorRecipe r11 = new ReactorRecipe(null, null, new FluidStack(MachineInit.nitricAcid, 200), null,
				DCHeatTier.KILN, 0, null, new FluidStack(MachineInit.sulfuricAcid, 200),
				new FluidStack(FluidRegistry.WATER, 200), new Object[] {
						"dustNiter"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r11, DCHeatTier.KILN);

		IReactorRecipe r21 = new ReactorRecipe(null, null, new FluidStack(MachineInit.nitricAcid, 200), null,
				DCHeatTier.KILN, 0, null, new FluidStack(MachineInit.sulfuricAcid, 200),
				new FluidStack(FluidRegistry.WATER, 200), new Object[] {
						"dustSaltpeter"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r21, DCHeatTier.KILN);

		// 硫酸
		IReactorRecipe r13 = new ReactorRecipe(null, null, new FluidStack(MachineInit.sulfuricAcid, 200), null,
				DCHeatTier.KILN, 0, null, new FluidStack(FluidRegistry.WATER, 200), null, new Object[] {
						"dustNiter",
						"dustSulfur"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r13, DCHeatTier.KILN);

		IReactorRecipe r20 = new ReactorRecipe(null, null, new FluidStack(MachineInit.sulfuricAcid, 200), null,
				DCHeatTier.KILN, 0, null, new FluidStack(FluidRegistry.WATER, 200), null, new Object[] {
						"dustSaltpeter",
						"dustSulfur"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r20, DCHeatTier.KILN);

		// 硫酸2
		IReactorRecipe r14 = new ReactorRecipe(null, null, new FluidStack(MachineInit.sulfuricAcid, 500), null,
				DCHeatTier.KILN, 0, new ItemStack(MachineInit.catalyst, 1, 3), new FluidStack(FluidRegistry.WATER, 500),
				null, new Object[] {
						"dustSulfur"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r14, DCHeatTier.KILN);

		// アルカリ1
		IReactorRecipe r15 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 3), null, null, null,
				DCHeatTier.KILN, 0, null, new FluidStack(FluidRegistry.WATER, 500), null, new Object[] {
						"dustSalt"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r15, DCHeatTier.KILN);

		// アルカリ2
		IReactorRecipe r16 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 3), null, null, null,
				DCHeatTier.KILN, 0, null, new FluidStack(FluidRegistry.WATER, 500), null, new Object[] {
						"dustLime"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r16, DCHeatTier.KILN);

		// ニトロ
		IReactorRecipe r17 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 5), null, null, null,
				DCHeatTier.OVEN, 0, null, new FluidStack(MachineInit.nitricAcid, 200),
				new FluidStack(MachineInit.sulfuricAcid, 200), new Object[] {
						"cropCotton"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r17, DCHeatTier.OVEN);

		IReactorRecipe r18 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 6), null, null, null,
				DCHeatTier.OVEN, 0, null, new FluidStack(MachineInit.nitricAcid, 200),
				new FluidStack(MachineInit.sulfuricAcid, 200), new Object[] {
						new ItemStack(MachineInit.reagent, 1, 1)
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r18, DCHeatTier.OVEN);

		// カーバイド
		IReactorRecipe r25 = new ReactorRecipe(new ItemStack(MachineInit.reagent, 1, 9), null, null, null,
				DCHeatTier.UHT, 0, null, null, null, new Object[] {
						"gemCoal",
						"dustLime"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r25, DCHeatTier.UHT);

		IReactorRecipe r26 = new ReactorRecipe(null, null, new FluidStack(MachineInit.fuelGas, 300), null,
				DCHeatTier.NORMAL, 0, null, new FluidStack(FluidRegistry.WATER, 100), null, new Object[] {
						"gemCarbide"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r26, DCHeatTier.NORMAL);

		// バニラ要素
		IReactorRecipe r22 = new ReactorRecipe(null, null, new FluidStack(FluidRegistry.LAVA, 200), null,
				DCHeatTier.UHT, 0, null, null, null, new Object[] {
						"dustSulfur",
						"cobblestone"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r22, DCHeatTier.UHT);

		IReactorRecipe r23 = new ReactorRecipe(null, null, new FluidStack(FluidRegistry.LAVA, 250), null,
				DCHeatTier.UHT, 0, null, null, null, new Object[] {
						"dustBlaze",
						"cobblestone"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r23, DCHeatTier.UHT);

		IReactorRecipe r24 = new ReactorRecipe(null, null, new FluidStack(FluidRegistry.LAVA, 1000), null,
				DCHeatTier.UHT, 0, null, null, null, new Object[] {
						"stickBlaze",
						"cobblestone"
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r24, DCHeatTier.UHT);

		IReactorRecipe r27 = new ReactorRecipe(new ItemStack(Blocks.ICE), null, null, null, DCHeatTier.FROSTBITE, 0,
				null, new FluidStack(FluidRegistry.WATER, 1000), null, new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r27, DCHeatTier.FROSTBITE);

		IReactorRecipe r28 = new ReactorRecipe(new ItemStack(Blocks.OBSIDIAN), null, null, null, DCHeatTier.FROSTBITE,
				0, null, new FluidStack(FluidRegistry.LAVA, 1000), null, new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r28, DCHeatTier.FROSTBITE);

		ItemStack nb = UniversalBucket.getFilledBucket(ForgeModContainer.getInstance().universalBucket,
				MachineInit.nitrogen);
		IReactorRecipe r30 = new ReactorRecipe(nb, null, null, null, DCHeatTier.ABSOLUTE, 0, null, null, null,
				new Object[] {
						new ItemStack(Items.BUCKET)
				});
		RecipeAPI.registerReactorRecipes.addRecipe(r30, DCHeatTier.ABSOLUTE);

		IReactorRecipe r29 = new ReactorRecipe(new ItemStack(Blocks.STONE), null, null, null, DCHeatTier.NORMAL, 0,
				null, new FluidStack(FluidRegistry.WATER, 100), new FluidStack(FluidRegistry.LAVA, 100),
				new Object[] {});
		RecipeAPI.registerReactorRecipes.addRecipe(r29, DCHeatTier.NORMAL);
	}

}