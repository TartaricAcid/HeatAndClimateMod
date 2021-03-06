package defeatedcrow.hac.food.recipes;

import defeatedcrow.hac.api.climate.DCHeatTier;
import defeatedcrow.hac.api.climate.DCHumidity;
import defeatedcrow.hac.api.recipe.RecipeAPI;
import defeatedcrow.hac.core.climate.recipe.ClimateSmelting;
import defeatedcrow.hac.food.FoodInit;
import defeatedcrow.hac.main.MainInit;
import net.minecraft.item.ItemStack;

public class FoodClimateRecipe {

	public static void load() {
		loadClimateRecipes();
		loadSmeltingRecipe();
	}

	static void loadClimateRecipes() {

		ClimateSmelting toast = new ClimateSmelting(new ItemStack(FoodInit.bread, 1, 5), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.bread, 1, 4));
		toast.requiredHeat().add(DCHeatTier.SMELTING);
		toast.requiredHum().add(DCHumidity.NORMAL);
		toast.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(toast, DCHeatTier.KILN);

		ClimateSmelting square = new ClimateSmelting(new ItemStack(FoodInit.bread, 1, 3), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.bread, 1, 2));
		square.requiredHeat().add(DCHeatTier.SMELTING);
		square.requiredHum().add(DCHumidity.NORMAL);
		square.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(square, DCHeatTier.KILN);

		ClimateSmelting round = new ClimateSmelting(new ItemStack(FoodInit.bread, 1, 1), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.bread, 1, 0));
		round.requiredHeat().add(DCHeatTier.SMELTING);
		round.requiredHum().add(DCHumidity.NORMAL);
		round.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(round, DCHeatTier.KILN);

		ClimateSmelting fish = new ClimateSmelting(new ItemStack(FoodInit.sticks, 1, 1), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.sticks, 1, 0));
		fish.requiredHeat().add(DCHeatTier.SMELTING);
		fish.requiredHum().add(DCHumidity.NORMAL);
		fish.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(fish, DCHeatTier.KILN);

		ClimateSmelting tori = new ClimateSmelting(new ItemStack(FoodInit.sticks, 1, 3), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.sticks, 1, 2));
		tori.requiredHeat().add(DCHeatTier.SMELTING);
		tori.requiredHum().add(DCHumidity.NORMAL);
		tori.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(tori, DCHeatTier.KILN);

		ClimateSmelting pork = new ClimateSmelting(new ItemStack(FoodInit.sticks, 1, 5), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.sticks, 1, 4));
		pork.requiredHeat().add(DCHeatTier.SMELTING);
		pork.requiredHum().add(DCHumidity.NORMAL);
		pork.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(pork, DCHeatTier.KILN);

		ClimateSmelting beef = new ClimateSmelting(new ItemStack(FoodInit.sticks, 1, 7), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.sticks, 1, 6));
		beef.requiredHeat().add(DCHeatTier.SMELTING);
		beef.requiredHum().add(DCHumidity.NORMAL);
		beef.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(beef, DCHeatTier.KILN);

		ClimateSmelting mutton = new ClimateSmelting(new ItemStack(FoodInit.sticks, 1, 9), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.sticks, 1, 8));
		mutton.requiredHeat().add(DCHeatTier.SMELTING);
		mutton.requiredHum().add(DCHumidity.NORMAL);
		mutton.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(mutton, DCHeatTier.KILN);

		ClimateSmelting ika = new ClimateSmelting(new ItemStack(FoodInit.sticks, 1, 11), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.sticks, 1, 10));
		ika.requiredHeat().add(DCHeatTier.SMELTING);
		ika.requiredHum().add(DCHumidity.NORMAL);
		ika.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(ika, DCHeatTier.KILN);

		ClimateSmelting a_tart = new ClimateSmelting(new ItemStack(FoodInit.pastryRound, 1, 1), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastryRound, 1, 0));
		a_tart.requiredHeat().add(DCHeatTier.SMELTING);
		a_tart.requiredHum().add(DCHumidity.NORMAL);
		a_tart.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(a_tart, DCHeatTier.KILN);

		ClimateSmelting l_tart = new ClimateSmelting(new ItemStack(FoodInit.pastryRound, 1, 3), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastryRound, 1, 2));
		l_tart.requiredHeat().add(DCHeatTier.SMELTING);
		l_tart.requiredHum().add(DCHumidity.NORMAL);
		l_tart.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(l_tart, DCHeatTier.KILN);

		ClimateSmelting s_tart = new ClimateSmelting(new ItemStack(FoodInit.pastryRound, 1, 5), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastryRound, 1, 4));
		s_tart.requiredHeat().add(DCHeatTier.SMELTING);
		s_tart.requiredHum().add(DCHumidity.NORMAL);
		s_tart.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(s_tart, DCHeatTier.KILN);

		ClimateSmelting p_tart = new ClimateSmelting(new ItemStack(FoodInit.pastryRound, 1, 7), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastryRound, 1, 6));
		p_tart.requiredHeat().add(DCHeatTier.SMELTING);
		p_tart.requiredHum().add(DCHumidity.NORMAL);
		p_tart.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(p_tart, DCHeatTier.KILN);

		ClimateSmelting c_tart = new ClimateSmelting(new ItemStack(FoodInit.pastryRound, 1, 9), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastryRound, 1, 8));
		c_tart.requiredHeat().add(DCHeatTier.SMELTING);
		c_tart.requiredHum().add(DCHumidity.NORMAL);
		c_tart.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(c_tart, DCHeatTier.KILN);

		ClimateSmelting s_pie = new ClimateSmelting(new ItemStack(FoodInit.pastrySquare, 1, 1), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastrySquare, 1, 0));
		s_pie.requiredHeat().add(DCHeatTier.SMELTING);
		s_pie.requiredHum().add(DCHumidity.NORMAL);
		s_pie.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(s_pie, DCHeatTier.KILN);

		ClimateSmelting m_pie = new ClimateSmelting(new ItemStack(FoodInit.pastrySquare, 1, 3), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastrySquare, 1, 2));
		m_pie.requiredHeat().add(DCHeatTier.SMELTING);
		m_pie.requiredHum().add(DCHumidity.NORMAL);
		m_pie.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(m_pie, DCHeatTier.KILN);

		ClimateSmelting c_pie = new ClimateSmelting(new ItemStack(FoodInit.pastrySquare, 1, 5), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastrySquare, 1, 4));
		c_pie.requiredHeat().add(DCHeatTier.SMELTING);
		c_pie.requiredHum().add(DCHumidity.NORMAL);
		c_pie.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(c_pie, DCHeatTier.KILN);

		ClimateSmelting f_pie = new ClimateSmelting(new ItemStack(FoodInit.pastrySquare, 1, 7), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastrySquare, 1, 6));
		f_pie.requiredHeat().add(DCHeatTier.SMELTING);
		f_pie.requiredHum().add(DCHumidity.NORMAL);
		f_pie.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(f_pie, DCHeatTier.KILN);

		ClimateSmelting g_pie = new ClimateSmelting(new ItemStack(FoodInit.pastrySquare, 1, 9), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastrySquare, 1, 8));
		g_pie.requiredHeat().add(DCHeatTier.SMELTING);
		g_pie.requiredHum().add(DCHumidity.NORMAL);
		g_pie.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(g_pie, DCHeatTier.KILN);

		ClimateSmelting cu_pie = new ClimateSmelting(new ItemStack(FoodInit.pastrySquare, 1, 11), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.pastrySquare, 1, 10));
		cu_pie.requiredHeat().add(DCHeatTier.SMELTING);
		cu_pie.requiredHum().add(DCHumidity.NORMAL);
		cu_pie.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(cu_pie, DCHeatTier.KILN);

		ClimateSmelting b_plate = new ClimateSmelting(new ItemStack(FoodInit.plateMeal, 1, 1), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.plateMeal, 1, 0));
		b_plate.requiredHeat().add(DCHeatTier.SMELTING);
		b_plate.requiredHum().add(DCHumidity.NORMAL);
		b_plate.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(b_plate, DCHeatTier.KILN);

		ClimateSmelting po_plate = new ClimateSmelting(new ItemStack(FoodInit.plateMeal, 1, 3), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.plateMeal, 1, 2));
		po_plate.requiredHeat().add(DCHeatTier.SMELTING);
		po_plate.requiredHum().add(DCHumidity.NORMAL);
		po_plate.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(po_plate, DCHeatTier.KILN);

		ClimateSmelting c_plate = new ClimateSmelting(new ItemStack(FoodInit.plateMeal, 1, 5), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.plateMeal, 1, 4));
		c_plate.requiredHeat().add(DCHeatTier.SMELTING);
		c_plate.requiredHum().add(DCHumidity.NORMAL);
		c_plate.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(c_plate, DCHeatTier.KILN);

		ClimateSmelting f_plate = new ClimateSmelting(new ItemStack(FoodInit.plateMeal, 1, 7), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.plateMeal, 1, 6));
		f_plate.requiredHeat().add(DCHeatTier.SMELTING);
		f_plate.requiredHum().add(DCHumidity.NORMAL);
		f_plate.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(f_plate, DCHeatTier.KILN);

		ClimateSmelting p_plate = new ClimateSmelting(new ItemStack(FoodInit.plateSoup, 1, 1), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.plateSoup, 1, 0));
		p_plate.requiredHeat().add(DCHeatTier.SMELTING);
		p_plate.requiredHum().add(DCHumidity.NORMAL);
		p_plate.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(p_plate, DCHeatTier.KILN);

		ClimateSmelting t_plate = new ClimateSmelting(new ItemStack(FoodInit.plateSoup, 1, 3), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.plateSoup, 1, 2));
		t_plate.requiredHeat().add(DCHeatTier.SMELTING);
		t_plate.requiredHum().add(DCHumidity.NORMAL);
		t_plate.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(t_plate, DCHeatTier.KILN);

		ClimateSmelting cake = new ClimateSmelting(new ItemStack(FoodInit.cake, 1, 1), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.cake, 1, 0));
		cake.requiredHeat().add(DCHeatTier.SMELTING);
		cake.requiredHum().add(DCHumidity.NORMAL);
		cake.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(cake, DCHeatTier.KILN);

		ClimateSmelting cocotte = new ClimateSmelting(new ItemStack(FoodInit.cake, 1, 9), null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0F, false, new ItemStack(FoodInit.cake, 1, 8));
		cocotte.requiredHeat().add(DCHeatTier.SMELTING);
		cocotte.requiredHum().add(DCHumidity.NORMAL);
		cocotte.requiredHum().add(DCHumidity.WET);
		RecipeAPI.registerSmelting.addRecipe(cocotte, DCHeatTier.KILN);

	}

	private static void loadSmeltingRecipe() {
		RecipeAPI.registerSmelting.addRecipe(new ItemStack(MainInit.bakedApple, 1, 5), DCHeatTier.BOIL,
				DCHumidity.UNDERWATER, null, false, new ItemStack(FoodInit.crops, 1, 10));

		RecipeAPI.registerSmelting.addRecipe(new ItemStack(MainInit.bakedApple, 1, 6), DCHeatTier.BOIL,
				DCHumidity.UNDERWATER, null, false, new ItemStack(FoodInit.crops, 1, 12));
	}

}
