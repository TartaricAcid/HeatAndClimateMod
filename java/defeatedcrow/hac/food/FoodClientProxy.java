package defeatedcrow.hac.food;

import defeatedcrow.hac.core.ClimateCore;
import defeatedcrow.hac.core.client.JsonRegisterHelper;
import defeatedcrow.hac.food.block.TilePotteryPot;
import defeatedcrow.hac.food.block.TileSilkwormBox;
import defeatedcrow.hac.food.block.TileSteelPot;
import defeatedcrow.hac.food.block.TileTeaPot;
import defeatedcrow.hac.food.client.AppleTartRenderer;
import defeatedcrow.hac.food.client.BeefStickRenderer;
import defeatedcrow.hac.food.client.CakeButterRenderer;
import defeatedcrow.hac.food.client.CakeChocolateRenderer;
import defeatedcrow.hac.food.client.CakeCocotteRenderer;
import defeatedcrow.hac.food.client.ChocolatePieRenderer;
import defeatedcrow.hac.food.client.ClubSandwichRRenderer;
import defeatedcrow.hac.food.client.ClubSandwichSRenderer;
import defeatedcrow.hac.food.client.CrostataTartRenderer;
import defeatedcrow.hac.food.client.CupSilverRenderer;
import defeatedcrow.hac.food.client.CupWhiteRenderer;
import defeatedcrow.hac.food.client.CustardPieRenderer;
import defeatedcrow.hac.food.client.EmptyPlateRenderer;
import defeatedcrow.hac.food.client.FishStickRenderer;
import defeatedcrow.hac.food.client.FruitPieRenderer;
import defeatedcrow.hac.food.client.JellyBerryRenderer;
import defeatedcrow.hac.food.client.JellyCoffeeRenderer;
import defeatedcrow.hac.food.client.JellyCreamRenderer;
import defeatedcrow.hac.food.client.JellyKuzuRenderer;
import defeatedcrow.hac.food.client.JellyLemonRenderer;
import defeatedcrow.hac.food.client.LemonTartRenderer;
import defeatedcrow.hac.food.client.MeatPieRenderer;
import defeatedcrow.hac.food.client.MooncakeRenderer;
import defeatedcrow.hac.food.client.MuttonStickRenderer;
import defeatedcrow.hac.food.client.PizzaTomatoRenderer;
import defeatedcrow.hac.food.client.PlateBeefRenderer;
import defeatedcrow.hac.food.client.PlateChickenRenderer;
import defeatedcrow.hac.food.client.PlateFishRenderer;
import defeatedcrow.hac.food.client.PlatePorkRenderer;
import defeatedcrow.hac.food.client.PlatePotatoRenderer;
import defeatedcrow.hac.food.client.PlateTomatoRenderer;
import defeatedcrow.hac.food.client.PorkStickRenderer;
import defeatedcrow.hac.food.client.PotatoQuicheRenderer;
import defeatedcrow.hac.food.client.RiceBowlRenderer;
import defeatedcrow.hac.food.client.RiceMushroomRenderer;
import defeatedcrow.hac.food.client.RoundBreadCreamRenderer;
import defeatedcrow.hac.food.client.RoundBreadRenderer;
import defeatedcrow.hac.food.client.SaladGreenRenderer;
import defeatedcrow.hac.food.client.SaladLotusrootRenderer;
import defeatedcrow.hac.food.client.SaladPotatoRenderer;
import defeatedcrow.hac.food.client.SandwichAppleRenderer;
import defeatedcrow.hac.food.client.SandwichEggRenderer;
import defeatedcrow.hac.food.client.SandwichSaladRenderer;
import defeatedcrow.hac.food.client.SpinachQuicheRenderer;
import defeatedcrow.hac.food.client.SquareBreadRenderer;
import defeatedcrow.hac.food.client.SquidStickRenderer;
import defeatedcrow.hac.food.client.StewBorschtRenderer;
import defeatedcrow.hac.food.client.StewCongeeRenderer;
import defeatedcrow.hac.food.client.StewEggRenderer;
import defeatedcrow.hac.food.client.StewLotusrootRenderer;
import defeatedcrow.hac.food.client.StewMushroomRenderer;
import defeatedcrow.hac.food.client.StewPumpkinRenderer;
import defeatedcrow.hac.food.client.StewPurpleRenderer;
import defeatedcrow.hac.food.client.StewSeaweedRenderer;
import defeatedcrow.hac.food.client.StewSquidRenderer;
import defeatedcrow.hac.food.client.StewTomatoRenderer;
import defeatedcrow.hac.food.client.StewVegiRenderer;
import defeatedcrow.hac.food.client.SugarPieRenderer;
import defeatedcrow.hac.food.client.TESRPotteryPot;
import defeatedcrow.hac.food.client.TESRSteelPot;
import defeatedcrow.hac.food.client.TESRTeaPot;
import defeatedcrow.hac.food.client.ToastRenderer;
import defeatedcrow.hac.food.client.TumblerRenderer;
import defeatedcrow.hac.food.client.YakitoriStickRenderer;
import defeatedcrow.hac.food.entity.AppleTartEntity;
import defeatedcrow.hac.food.entity.BeefPlateEntity;
import defeatedcrow.hac.food.entity.BeefStickEntity;
import defeatedcrow.hac.food.entity.CakeBerryEntity;
import defeatedcrow.hac.food.entity.CakeButterEntity;
import defeatedcrow.hac.food.entity.CakeChocolateEntity;
import defeatedcrow.hac.food.entity.CakeCocotteEntity;
import defeatedcrow.hac.food.entity.CakeCoffeeEntity;
import defeatedcrow.hac.food.entity.CakeCreamEntity;
import defeatedcrow.hac.food.entity.CakeKuzuEntity;
import defeatedcrow.hac.food.entity.CakeLemonEntity;
import defeatedcrow.hac.food.entity.ChickenPlateEntity;
import defeatedcrow.hac.food.entity.ChocolatePieEntity;
import defeatedcrow.hac.food.entity.ClubSandwichREntity;
import defeatedcrow.hac.food.entity.ClubSandwichSEntity;
import defeatedcrow.hac.food.entity.CrostataTartEntity;
import defeatedcrow.hac.food.entity.CustardPieEntity;
import defeatedcrow.hac.food.entity.EggSandwichEntity;
import defeatedcrow.hac.food.entity.EmptyPlateEntity;
import defeatedcrow.hac.food.entity.EntityRiceBowl;
import defeatedcrow.hac.food.entity.EntityRiceMushroom;
import defeatedcrow.hac.food.entity.EntitySandwich;
import defeatedcrow.hac.food.entity.EntityTeaCupSilver;
import defeatedcrow.hac.food.entity.EntityTeaCupWhite;
import defeatedcrow.hac.food.entity.EntityTumbler;
import defeatedcrow.hac.food.entity.FishPlateEntity;
import defeatedcrow.hac.food.entity.FishStickEntity;
import defeatedcrow.hac.food.entity.FruitPieEntity;
import defeatedcrow.hac.food.entity.LemonSandwichEntity;
import defeatedcrow.hac.food.entity.LemonTartEntity;
import defeatedcrow.hac.food.entity.MeatPieEntity;
import defeatedcrow.hac.food.entity.MooncakeEntity;
import defeatedcrow.hac.food.entity.MuttonStickEntity;
import defeatedcrow.hac.food.entity.PizzaTomatoEntity;
import defeatedcrow.hac.food.entity.PorkPlateEntity;
import defeatedcrow.hac.food.entity.PorkStickEntity;
import defeatedcrow.hac.food.entity.PotatoPlateEntity;
import defeatedcrow.hac.food.entity.PotatoQuicheEntity;
import defeatedcrow.hac.food.entity.RoundBreadCreamEntity;
import defeatedcrow.hac.food.entity.RoundBreadEntity;
import defeatedcrow.hac.food.entity.SaladGreenEntity;
import defeatedcrow.hac.food.entity.SaladLotusrootEntity;
import defeatedcrow.hac.food.entity.SaladPotatoEntity;
import defeatedcrow.hac.food.entity.SaladSandwichEntity;
import defeatedcrow.hac.food.entity.SoupPlateEntity;
import defeatedcrow.hac.food.entity.SpinachQuicheEntity;
import defeatedcrow.hac.food.entity.SquareBreadEntity;
import defeatedcrow.hac.food.entity.SquidStickEntity;
import defeatedcrow.hac.food.entity.StewBorschtEntity;
import defeatedcrow.hac.food.entity.StewCongeeEntity;
import defeatedcrow.hac.food.entity.StewEggEntity;
import defeatedcrow.hac.food.entity.StewLotusrootEntity;
import defeatedcrow.hac.food.entity.StewMushroomEntity;
import defeatedcrow.hac.food.entity.StewPumpukinEntity;
import defeatedcrow.hac.food.entity.StewPurpleEntity;
import defeatedcrow.hac.food.entity.StewSeaweedEntity;
import defeatedcrow.hac.food.entity.StewSquidEntity;
import defeatedcrow.hac.food.entity.StewTomatoEntity;
import defeatedcrow.hac.food.entity.StewVegiEntity;
import defeatedcrow.hac.food.entity.SugarPieEntity;
import defeatedcrow.hac.food.entity.ToastBreadEntity;
import defeatedcrow.hac.food.entity.YakitoriStickEntity;
import defeatedcrow.hac.main.ClimateMain;
import defeatedcrow.hac.main.client.ClientMainProxy;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FoodClientProxy {

	public static void loadConst() {

	}

	public static void loadEntity() {
		ClientMainProxy.registRender(RoundBreadEntity.class, RoundBreadRenderer.class);
		ClientMainProxy.registRender(SquareBreadEntity.class, SquareBreadRenderer.class);
		ClientMainProxy.registRender(FishStickEntity.class, FishStickRenderer.class);
		ClientMainProxy.registRender(YakitoriStickEntity.class, YakitoriStickRenderer.class);
		ClientMainProxy.registRender(PorkStickEntity.class, PorkStickRenderer.class);
		ClientMainProxy.registRender(BeefStickEntity.class, BeefStickRenderer.class);
		ClientMainProxy.registRender(EntityTeaCupSilver.class, CupSilverRenderer.class);
		ClientMainProxy.registRender(EntityTeaCupWhite.class, CupWhiteRenderer.class);
		ClientMainProxy.registRender(AppleTartEntity.class, AppleTartRenderer.class);
		ClientMainProxy.registRender(LemonTartEntity.class, LemonTartRenderer.class);
		ClientMainProxy.registRender(SpinachQuicheEntity.class, SpinachQuicheRenderer.class);
		ClientMainProxy.registRender(PotatoQuicheEntity.class, PotatoQuicheRenderer.class);
		ClientMainProxy.registRender(SugarPieEntity.class, SugarPieRenderer.class);
		ClientMainProxy.registRender(MeatPieEntity.class, MeatPieRenderer.class);
		ClientMainProxy.registRender(ToastBreadEntity.class, ToastRenderer.class);
		ClientMainProxy.registRender(EntitySandwich.class, SandwichAppleRenderer.class);
		ClientMainProxy.registRender(EggSandwichEntity.class, SandwichEggRenderer.class);
		ClientMainProxy.registRender(LemonSandwichEntity.class, SandwichAppleRenderer.class);
		ClientMainProxy.registRender(SaladSandwichEntity.class, SandwichSaladRenderer.class);
		ClientMainProxy.registRender(EntityRiceBowl.class, RiceBowlRenderer.class);
		ClientMainProxy.registRender(EmptyPlateEntity.class, EmptyPlateRenderer.class);
		ClientMainProxy.registRender(BeefPlateEntity.class, PlateBeefRenderer.class);
		ClientMainProxy.registRender(PorkPlateEntity.class, PlatePorkRenderer.class);
		ClientMainProxy.registRender(ChickenPlateEntity.class, PlateChickenRenderer.class);
		ClientMainProxy.registRender(FishPlateEntity.class, PlateFishRenderer.class);
		ClientMainProxy.registRender(PotatoPlateEntity.class, PlatePotatoRenderer.class);
		ClientMainProxy.registRender(SoupPlateEntity.class, PlateTomatoRenderer.class);
		ClientMainProxy.registRender(ChocolatePieEntity.class, ChocolatePieRenderer.class);
		ClientMainProxy.registRender(FruitPieEntity.class, FruitPieRenderer.class);
		ClientMainProxy.registRender(EntityTumbler.class, TumblerRenderer.class);
		ClientMainProxy.registRender(EntityRiceMushroom.class, RiceMushroomRenderer.class);
		ClientMainProxy.registRender(ClubSandwichSEntity.class, ClubSandwichSRenderer.class);
		ClientMainProxy.registRender(ClubSandwichREntity.class, ClubSandwichRRenderer.class);
		ClientMainProxy.registRender(StewVegiEntity.class, StewVegiRenderer.class);
		ClientMainProxy.registRender(StewEggEntity.class, StewEggRenderer.class);
		ClientMainProxy.registRender(StewCongeeEntity.class, StewCongeeRenderer.class);
		ClientMainProxy.registRender(StewTomatoEntity.class, StewTomatoRenderer.class);
		ClientMainProxy.registRender(StewPumpukinEntity.class, StewPumpkinRenderer.class);
		ClientMainProxy.registRender(StewBorschtEntity.class, StewBorschtRenderer.class);
		ClientMainProxy.registRender(StewMushroomEntity.class, StewMushroomRenderer.class);
		ClientMainProxy.registRender(StewPurpleEntity.class, StewPurpleRenderer.class);
		ClientMainProxy.registRender(MuttonStickEntity.class, MuttonStickRenderer.class);
		ClientMainProxy.registRender(SquidStickEntity.class, SquidStickRenderer.class);
		ClientMainProxy.registRender(MooncakeEntity.class, MooncakeRenderer.class);
		ClientMainProxy.registRender(StewLotusrootEntity.class, StewLotusrootRenderer.class);
		ClientMainProxy.registRender(StewSquidEntity.class, StewSquidRenderer.class);
		ClientMainProxy.registRender(PizzaTomatoEntity.class, PizzaTomatoRenderer.class);
		ClientMainProxy.registRender(SaladGreenEntity.class, SaladGreenRenderer.class);
		ClientMainProxy.registRender(SaladPotatoEntity.class, SaladPotatoRenderer.class);
		ClientMainProxy.registRender(SaladLotusrootEntity.class, SaladLotusrootRenderer.class);
		ClientMainProxy.registRender(CakeButterEntity.class, CakeButterRenderer.class);
		ClientMainProxy.registRender(CakeChocolateEntity.class, CakeChocolateRenderer.class);
		ClientMainProxy.registRender(CakeCoffeeEntity.class, JellyCoffeeRenderer.class);
		ClientMainProxy.registRender(CakeLemonEntity.class, JellyLemonRenderer.class);
		ClientMainProxy.registRender(CakeCreamEntity.class, JellyCreamRenderer.class);
		ClientMainProxy.registRender(CustardPieEntity.class, CustardPieRenderer.class);
		ClientMainProxy.registRender(RoundBreadCreamEntity.class, RoundBreadCreamRenderer.class);
		ClientMainProxy.registRender(StewSeaweedEntity.class, StewSeaweedRenderer.class);
		ClientMainProxy.registRender(CrostataTartEntity.class, CrostataTartRenderer.class);
		ClientMainProxy.registRender(CakeBerryEntity.class, JellyBerryRenderer.class);
		ClientMainProxy.registRender(CakeKuzuEntity.class, JellyKuzuRenderer.class);
		ClientMainProxy.registRender(CakeCocotteEntity.class, CakeCocotteRenderer.class);
	}

	public static void loadTE() {
		ClientRegistry.registerTileEntity(TilePotteryPot.class, "dcs_te_pottery_pot", new TESRPotteryPot());
		ClientRegistry.registerTileEntity(TileSteelPot.class, "dcs_te_steel_pot", new TESRSteelPot());
		ClientRegistry.registerTileEntity(TileTeaPot.class, "dcs_te_tea_pot", new TESRTeaPot());
		GameRegistry.registerTileEntity(TileSilkwormBox.class, "dcs_te_silkworm_box");
	}

	public static void regJson(JsonRegisterHelper instance) {
		// item

		instance.regSimpleItem(FoodInit.teaLeaves, ClimateCore.PACKAGE_ID, "dcs_food_leaves", "food", 2);
		instance.regSimpleItem(FoodInit.dropOil, ClimateCore.PACKAGE_ID, "dcs_food_drop_oil", "food", 0);
		instance.regSimpleItem(FoodInit.dropCream, ClimateCore.PACKAGE_ID, "dcs_food_drop_cream", "food", 0);
		instance.regSimpleItem(FoodInit.bread, ClimateCore.PACKAGE_ID, "dcs_round_bread", "food", 8);
		instance.regSimpleItem(FoodInit.sticks, ClimateCore.PACKAGE_ID, "dcs_stick_foods", "food", 11);
		instance.regSimpleItem(FoodInit.crops, ClimateCore.PACKAGE_ID, "dcs_crops", "food", 12);
		instance.regSimpleItem(FoodInit.seeds, ClimateCore.PACKAGE_ID, "dcs_seeds", "food", 9);
		instance.regSimpleItem(FoodInit.petals, ClimateCore.PACKAGE_ID, "dcs_petals", "food", 1);
		instance.regSimpleItem(FoodInit.cupSilver, ClimateCore.PACKAGE_ID, "dcs_food_teacup", "food", 2);
		instance.regSimpleItem(FoodInit.dairy, ClimateCore.PACKAGE_ID, "dcs_food_dairy", "food", 4);
		instance.regSimpleItem(FoodInit.meat, ClimateCore.PACKAGE_ID, "dcs_food_meat", "food", 5);
		instance.regSimpleItem(FoodInit.pastry, ClimateCore.PACKAGE_ID, "dcs_food_pastry", "food", 0);
		instance.regSimpleItem(FoodInit.pastryRound, ClimateCore.PACKAGE_ID, "dcs_food_tart", "food", 9);
		instance.regSimpleItem(FoodInit.pastrySquare, ClimateCore.PACKAGE_ID, "dcs_food_pie", "food", 11);
		instance.regSimpleItem(FoodInit.sandwich, ClimateCore.PACKAGE_ID, "dcs_food_sandwich", "food", 3);
		instance.regSimpleItem(FoodInit.clubsandwich, ClimateCore.PACKAGE_ID, "dcs_food_clubsand", "food", 1);
		instance.regSimpleItem(FoodInit.ricebowl, ClimateCore.PACKAGE_ID, "dcs_food_rice_bowl", "food", 1);
		instance.regSimpleItem(FoodInit.steakplate, ClimateCore.PACKAGE_ID, "dcs_food_empty_plate", "food", 0);
		instance.regSimpleItem(FoodInit.plateMeal, ClimateCore.PACKAGE_ID, "dcs_food_plate_meat", "food", 7);
		instance.regSimpleItem(FoodInit.plateSoup, ClimateCore.PACKAGE_ID, "dcs_food_plate_potato", "food", 3);
		instance.regSimpleItem(FoodInit.bowlSoup, ClimateCore.PACKAGE_ID, "dcs_food_bowl_stew", "food", 10);
		instance.regSimpleItem(FoodInit.salad, ClimateCore.PACKAGE_ID, "dcs_food_salad", "food", 2);
		instance.regSimpleItem(FoodInit.cake, ClimateCore.PACKAGE_ID, "dcs_food_cake", "food", 9);

		instance.regSimpleItem(FoodInit.paperPack, ClimateCore.PACKAGE_ID, "dcs_food_pack", "food", 13);

		// block

		instance.regSimpleBlock(FoodInit.leavesLemon, ClimateCore.PACKAGE_ID, "dcs_leaves_lemon", "crop", 3);
		instance.regSimpleBlock(FoodInit.leavesOlive, ClimateCore.PACKAGE_ID, "dcs_leaves_olive", "crop", 3);
		instance.regSimpleBlock(FoodInit.leavesTea, ClimateCore.PACKAGE_ID, "dcs_leaves_tea", "crop", 3);
		instance.regSimpleBlock(FoodInit.leavesMorus, ClimateCore.PACKAGE_ID, "dcs_leaves_morus", "crop", 3);
		instance.regSimpleBlock(FoodInit.dish, ClimateCore.PACKAGE_ID, "dcs_build_dish", "build", 1);

		instance.regTEBlock(FoodInit.potteryPot, ClimateCore.PACKAGE_ID, "dcs_device_pottery_pot", "machine", 0);
		instance.regTEBlock(FoodInit.steelPot, ClimateCore.PACKAGE_ID, "dcs_device_steel_pot", "machine", 0);
		instance.regTEBlock(FoodInit.teaPot, ClimateCore.PACKAGE_ID, "dcs_device_tea_pot", "machine", 0);
		instance.regSimpleBlock(FoodInit.silkwormBox, ClimateCore.PACKAGE_ID, "dcs_device_silkworm_box", "device", 0);

		// fluid

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.oilBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel_Oil = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_oil", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel_Oil;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.oilBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel_Oil = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_oil", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel_Oil;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.greenTeaBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_greentea", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.greenTeaBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_greentea", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.blackTeaBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_blacktea", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.blackTeaBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_blacktea", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.coffeeBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_coffee", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.coffeeBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_coffee", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.creamBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_cream", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.creamBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_cream", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.tomatoBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_vegetable", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.tomatoBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_vegetable", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.blackLiquorBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_black_liquor", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.blackLiquorBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_black_liquor", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.hotSpringBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_hotspring", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.hotSpringBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_hotspring", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.stockBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_stock", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.stockBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_stock", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.lemonBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_lemonade", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.lemonBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_lemonade", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.mazaiBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_mazai", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.mazaiBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_mazai", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(FoodInit.soyMilkBlock), new ItemMeshDefinition() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_soy_milk", "fluid");

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return fluidModel;
			}
		});
		ModelLoader.setCustomStateMapper(FoodInit.soyMilkBlock, new StateMapperBase() {
			final ModelResourceLocation fluidModel = new ModelResourceLocation(ClimateMain.MOD_ID + ":" +
					ClimateCore.PACKAGE_BASE + "_fluidblock_soy_milk", "fluid");

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return fluidModel;
			}
		});

		ModelLoader.setCustomStateMapper(FoodInit.cropLotus, (new StateMap.Builder()).ignore(
				BlockFluidBase.LEVEL).build());
		ModelBakery.registerItemVariants(Item.getItemFromBlock(FoodInit.cropLotus),
				new ModelResourceLocation("dcs_climate:dcs_crop_lotus"));
		for (int i = 0; i < 16; i++) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FoodInit.cropLotus), i,
					new ModelResourceLocation("dcs_climate:crop/dcs_crop_lotus", "inventory"));
		}

		ModelLoader.setCustomStateMapper(FoodInit.cropSeaweed, (new StateMap.Builder()).ignore(
				BlockFluidBase.LEVEL).build());
		ModelBakery.registerItemVariants(Item.getItemFromBlock(FoodInit.cropSeaweed),
				new ModelResourceLocation("dcs_climate:dcs_crop_seaweed"));
	}

}
