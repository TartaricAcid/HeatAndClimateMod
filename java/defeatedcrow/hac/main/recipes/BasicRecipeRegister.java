package defeatedcrow.hac.main.recipes;

import defeatedcrow.hac.core.DCRecipe;
import defeatedcrow.hac.main.MainInit;
import defeatedcrow.hac.main.config.ModuleConfig;
import defeatedcrow.hac.main.util.MainUtil;
import defeatedcrow.hac.main.util.RecipeResourcesMain;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BasicRecipeRegister {

	public static void load() {
		LoadingToolRecipe.add(RecipeResourcesMain.MAIN);
		LoadingYagenRecipe.add(RecipeResourcesMain.MAIN);
		LoadingOreRecipe.add(RecipeResourcesMain.MAIN);
		LoadingBuildingRecipe.add(RecipeResourcesMain.MAIN);
		LoadingBuildingRecipe.advanced(RecipeResourcesMain.MAIN);
		LoadingEquipRecipe.add(RecipeResourcesMain.MAIN);
		loadAnotherRecipes(RecipeResourcesMain.MAIN);
		if (ModuleConfig.build_advanced) {
			LoadingContRecipe.add(RecipeResourcesMain.MAIN);
		}
	}

	static void loadAnotherRecipes(RecipeResourcesMain res) {
		// 火打ち石のアナザー
		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(Items.FLINT_AND_STEEL, 1, 0), new Object[] {
				new ItemStack(MainInit.ores, 1, 4),
				"gemChalcedony"
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(Items.FLINT_AND_STEEL, 1, 0), new Object[] {
				new ItemStack(MainInit.ores, 1, 4),
				new ItemStack(Items.FLINT)
		});

		// 矢
		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Items.ARROW, 8, 0), new Object[] {
				"X",
				"Y",
				"Z",
				'X',
				"gemChalcedony",
				'Y',
				"stickWood",
				'Z',
				"feather"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Items.ARROW, 4, 0), new Object[] {
				"X",
				"Y",
				"Z",
				'X',
				"gemChalcedony",
				'Y',
				"stickWood",
				'Z',
				"paper"
		});

		// ブレイズロッド救済用
		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Items.BLAZE_ROD, 1, 0), new Object[] {
				"XXX",
				"YYY",
				"ZZZ",
				'X',
				"dustCrystal",
				'Y',
				"dustBlaze",
				'Z',
				"dustSulfur"
		});

		// 変換
		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(Items.DYE, 1, 15), new Object[] {
				new ItemStack(MainInit.miscDust, 1, 5)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.oreIngot, 1, 5), new Object[] {
				new ItemStack(MainInit.oreIngot, 1, 7)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Blocks.GLASS, 8, 0), new Object[] {
				"XXX",
				"XYX",
				"XXX",
				'X',
				new ItemStack(Blocks.STAINED_GLASS, 1, 32767),
				'Y',
				new ItemStack(MainInit.repairPutty, 1, 2)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Blocks.HARDENED_CLAY, 8, 0), new Object[] {
				"XXX",
				"XYX",
				"XXX",
				'X',
				new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 32767),
				'Y',
				new ItemStack(MainInit.repairPutty, 1, 2)
		});

		for (int i = 0; i < 16; i++) {
			DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Blocks.STAINED_HARDENED_CLAY, 8, i),
					new Object[] {
							"XXX",
							"XYX",
							"XXX",
							'X',
							new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0),
							'Y',
							MainUtil.DYES[i]
					});
		}

		// 土
		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(Blocks.DIRT, 1, 0), new Object[] {
				new ItemStack(Blocks.SAND, 1, 32767),
				new ItemStack(Items.DYE, 1, 15),
				"dustAsh",
				"dustPresscake",
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(Blocks.DIRT, 1, 0), new Object[] {
				new ItemStack(Blocks.SAND, 1, 32767),
				new ItemStack(Items.DYE, 1, 15),
				"dustAsh",
				"dustPlant",
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(Blocks.MYCELIUM, 1, 0), new Object[] {
				new ItemStack(Blocks.DIRT, 1, 0),
				"dustBlan",
		});

		// ウール
		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Blocks.WOOL, 1, 0), new Object[] {
				"XXX",
				"XXX",
				"XXX",
				'X',
				"dustChrysotile"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Blocks.WOOL, 1, 0), new Object[] {
				"XXX",
				"XXX",
				"XXX",
				'X',
				"cropCotton"
		});

		// アルミ関連
		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Items.BUCKET, 1, 0), new Object[] {
				"X X",
				" X ",
				'X',
				"ingotAluminum"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Blocks.PISTON, 1, 0), new Object[] {
				"XXX",
				"YZY",
				"YWY",
				'X',
				"plankWood",
				'Y',
				"cobblestone",
				'Z',
				"ingotAluminum",
				'W',
				"dustRedstone"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Blocks.HOPPER, 1, 0), new Object[] {
				"X X",
				"XYX",
				" X ",
				'X',
				"ingotAluminum",
				'Y',
				new ItemStack(Blocks.CHEST, 1, 0)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(Blocks.TRIPWIRE_HOOK, 1, 0), new Object[] {
				"X",
				"Y",
				"Z",
				'X',
				"ingotAluminum",
				'Y',
				"stickWood",
				'Z',
				"plankWood"
		});

		// なんでバニラにねぇのこれ
		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(Items.PRISMARINE_SHARD, 9, 0), new Object[] {
				new ItemStack(Blocks.PRISMARINE, 1, 0)
		});

		// マテリアル変換
		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.clothes, 1, 0), new Object[] {
				new ItemStack(MainInit.materials, 1, 0)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.clothes, 1, 1), new Object[] {
				new ItemStack(MainInit.materials, 1, 1)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.clothes, 1, 2), new Object[] {
				new ItemStack(MainInit.materials, 1, 2)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.clothes, 1, 3), new Object[] {
				new ItemStack(MainInit.materials, 1, 3)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.clothes, 1, 4), new Object[] {
				new ItemStack(MainInit.materials, 1, 8)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.clothes, 1, 5), new Object[] {
				new ItemStack(MainInit.materials, 1, 9)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.gears, 1, 0), new Object[] {
				new ItemStack(MainInit.materials, 1, 4)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.gears, 1, 1), new Object[] {
				new ItemStack(MainInit.materials, 1, 5)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.gears, 1, 2), new Object[] {
				new ItemStack(MainInit.materials, 1, 6)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.gears, 1, 3), new Object[] {
				new ItemStack(MainInit.materials, 1, 7)
		});
	}
}
