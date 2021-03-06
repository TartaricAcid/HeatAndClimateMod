package defeatedcrow.hac.main;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

public class MainInit {
	private MainInit() {}

	// block
	// ores
	public static Block ores;
	public static Block ores_2;
	public static Block dustBlock;
	public static Block dustBlock_2;
	public static Block gemBlock;
	public static Block metalBlock;

	// cont
	public static Block logCont;
	public static Block cropCont;
	public static Block dropCont;
	public static Block miscCont;
	public static Block cardboard;
	public static Block cropBasket;
	public static Block dustBags;

	// building
	public static Block bricks;
	public static Block selenite;
	public static Block stairsGlass;
	public static Block stairsGypsum;
	public static Block stairsMarble;
	public static Block stairsSerpentine;
	public static Block stairsBedrock;
	public static Block stairsDirtbrick;
	public static Block halfSlab;
	public static Block halfSlab2;
	public static Block builds;
	public static Block plate;
	public static Block syntheticBlock;
	public static Block linoleum;

	public static Block fenceGypsum;
	public static Block fenceMarble;
	public static Block fenceSerpentine;
	public static Block fenceBedrock;

	public static Block fenceAluminium;
	public static Block fenceNet;
	public static Block fenceGlass;
	public static Block fenceLadder;

	public static Block awning;
	public static Block lampCarbide;
	public static Block lampGas;
	public static Block achievementShield;

	public static Block fenceLadderSteel;
	public static Block fenceSteel;
	public static Block fenceNetSteel;
	public static Block pillarSteel;

	public static Block markingPanel;
	public static Block lightOrb;

	/* building advanced */

	public static Block asphalt;
	public static Block fireproofs;
	public static Block fireproofhalfs;
	public static Block fireproofStairs;

	public static Block hedgeSpring;
	public static Block hedgeSummer;
	public static Block hedgeAutumn;
	public static Block hedgeWinter;

	public static Block desiccant;
	public static Block freezepack;
	public static Block hotPack;
	public static Block waterPack;

	public static Item flowerPot;

	public static Block clayBricks;

	// furniture
	public static Block chalLamp;
	public static Block wallLamp;
	public static Block chandelierGypsum;
	public static Block chandelierChal;

	public static Block tableMarble;
	public static Block tableGypsum;
	public static Block tableWood;
	public static Block tableDark;
	public static Block squaretableWood;
	public static Block squaretableMarble;
	public static Block squaretableChecker;
	public static Block squaretableBlack;
	public static Block stoolBlack;
	public static Block stoolRed;
	public static Block sofaBlack;
	public static Block sofaRed;
	public static Block chairWood;
	public static Block chairMarble;
	public static Block chairChecker;
	public static Block chairBlack;

	public static Block carpetRed;
	public static Block carpetWhite;
	public static Block carpetGray;

	public static Block curtainWhite;

	public static Block sinkMetal;
	public static Block sinkChest;

	public static Block chestMarble;
	public static Block chestWood;
	public static Block chestChecker;
	public static Block chestBlack;
	public static Block chestMetal;
	public static Block chestMagnet;
	public static Block chestVillage;

	public static Block wallshelfMarble;
	public static Block wallshelfWood;
	public static Block wallshelfChecker;
	public static Block wallshelfBlack;

	public static Block doorMarble;
	public static Block doorSteel;
	public static Item itemDoorMarble;
	public static Item itemDoorSteel;

	public static Block realtimeClock;
	public static Block realtimeClock_L;
	public static Block mcClock_L;

	public static Item cushionGray;

	// device
	public static Block chamber;
	public static Block shitirin;
	public static Block fuelStove;
	public static Block stevenson_screen;
	public static Block bellow;
	public static Block thermometer;
	public static Block windvane;

	// item
	// ores
	public static Item oreDust;
	public static Item oreIngot;
	public static Item gems;
	public static Item miscDust;
	@Deprecated
	public static Item materials;
	public static Item foodDust;
	public static Item silkworm;
	public static Item gears;
	public static Item clothes;

	// tool
	public static Item stoneYagen;
	public static Item brassYagen;
	public static Item crowDrill;

	public static Item repairPutty;
	public static Item wrench;
	public static Item scope;
	public static Item entityScope;

	public static Item[] dcAxe = new Item[8];
	public static Item[] dcPickaxe = new Item[8];
	public static Item[] dcSpade = new Item[8];
	public static Item[] dcSword = new Item[8];
	public static Item[] dcScythe = new Item[4];

	public static Item earthSpade;
	public static Item earthRake;

	// armor
	public static Item[] brassArmor = new Item[4];
	public static Item[] steelArmor = new Item[4];
	public static Item[] chalcArmor = new Item[4];
	public static Item[] sapphireArmor = new Item[4];

	public static Item linenUnder;
	public static Item linenCoat;
	public static Item clothUnder;
	public static Item clothCoat;
	public static Item magicUnder;
	public static Item magicCoat;
	public static Item blackCoat;

	public static Item workerSuit;
	public static Item blackSuit;

	public static Item leatherHat;
	public static Item cottonHat;

	public static Item woolWear;
	public static Item furWear;
	public static Item woolBoots;
	public static Item peaCoat;

	/* weapon advanced */

	public static Item[] titaniumArmor = new Item[4];

	public static Item combatDress;
	public static Item trackSuit;
	public static Item hoodie;
	public static Item hoodieB;

	public static Item crossbow;
	public static Item gun;
	public static Item ignis;
	public static Item cartridge;

	public static Item gemShield;
	public static Item riotShield;

	// food
	public static Item bakedApple;
	public static Item foodMaterials;

	// potion
	public static Potion gravity;
	public static PotionType gravityType;

	public static Potion bird;
	public static PotionType birdType;

	public static Potion ocean;
	public static PotionType oceanType;

	public static Potion heavyboots;
	public static PotionType heavybootsType;

	public static Enchantment venom;
	public static Enchantment corrosion;
	public static Enchantment robber;

	public static VillagerProfession trader;
	public static VillagerProfession agri;
	public static VillagerProfession engineer;

	// plugin
	public static Item circuit;
	public static Item metalMaterials;

	public static Fluid milk;

	public static Item iconItem;

}
