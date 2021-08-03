package crimsonfluff.crimsonslimes.init;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import crimsonfluff.crimsonslimes.items.CrimsonSpawnEggItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class itemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CrimsonSlimes.MOD_ID);

// Slime Spawn Eggs
    public static final RegistryObject<Item> SLIME_WHITE_SPAWN_EGG = ITEMS.register("slime_white_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_WHITE, 0xFFFFFF, MaterialColor.SNOW.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_ORANGE_SPAWN_EGG = ITEMS.register("slime_orange_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_ORANGE, 14804727, MaterialColor.COLOR_ORANGE.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_MAGENTA_SPAWN_EGG = ITEMS.register("slime_magenta_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_MAGENTA, 14804727, MaterialColor.COLOR_MAGENTA.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_LIGHT_BLUE_SPAWN_EGG = ITEMS.register("slime_light_blue_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_LIGHT_BLUE, 14804727, MaterialColor.COLOR_LIGHT_BLUE.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_YELLOW_SPAWN_EGG = ITEMS.register("slime_yellow_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_YELLOW, 14804727, MaterialColor.COLOR_YELLOW.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_LIME_SPAWN_EGG = ITEMS.register("slime_lime_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_LIME, 14804727, MaterialColor.COLOR_LIGHT_GREEN.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_PINK_SPAWN_EGG = ITEMS.register("slime_pink_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_PINK, 14804727, MaterialColor.COLOR_PINK.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_GRAY_SPAWN_EGG = ITEMS.register("slime_gray_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_GRAY, 14804727, MaterialColor.COLOR_GRAY.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_LIGHT_GRAY_SPAWN_EGG = ITEMS.register("slime_light_gray_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_LIGHT_GRAY, 14804727, MaterialColor.COLOR_LIGHT_GRAY.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_CYAN_SPAWN_EGG = ITEMS.register("slime_cyan_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_CYAN, 14804727, MaterialColor.COLOR_CYAN.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BLUE_SPAWN_EGG = ITEMS.register("slime_blue_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_BLUE, 14804727, MaterialColor.COLOR_LIGHT_BLUE.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BROWN_SPAWN_EGG = ITEMS.register("slime_brown_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_BROWN, 14804727, MaterialColor.COLOR_BROWN.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_GREEN_SPAWN_EGG = ITEMS.register("slime_green_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_GREEN, 14804727, MaterialColor.COLOR_GREEN.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_RED_SPAWN_EGG = ITEMS.register("slime_red_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_RED, 14804727, MaterialColor.COLOR_RED.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BLACK_SPAWN_EGG = ITEMS.register("slime_black_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_BLACK, 14804727, MaterialColor.COLOR_BLACK.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_PURPLE_SPAWN_EGG = ITEMS.register("slime_purple_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_PURPLE, 14804727, MaterialColor.COLOR_PURPLE.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_MISSING_SPAWN_EGG = ITEMS.register("slime_missing_spawn_egg",
        ()-> new CrimsonSpawnEggItem(entitiesInit.SLIME_MISSING, 14804727, MaterialColor.COLOR_PINK.col, new Item.Properties().tab(CrimsonSlimes.TAB)));

    
// Slime Blocks
    public static final RegistryObject<Item> SLIME_WHITE_BLOCK = ITEMS.register("slime_white_block",
        ()-> new BlockItem(blocksInit.SLIME_WHITE_BLOCK.get(), new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_ORANGE_BLOCK = ITEMS.register("slime_orange_block",
        ()-> new BlockItem(blocksInit.SLIME_ORANGE_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_MAGENTA_BLOCK = ITEMS.register("slime_magenta_block",
        ()-> new BlockItem(blocksInit.SLIME_MAGENTA_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_LIGHT_BLUE_BLOCK = ITEMS.register("slime_light_blue_block",
        ()-> new BlockItem(blocksInit.SLIME_LIGHT_BLUE_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_YELLOW_BLOCK = ITEMS.register("slime_yellow_block",
        ()-> new BlockItem(blocksInit.SLIME_YELLOW_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_LIME_BLOCK = ITEMS.register("slime_lime_block",
        ()-> new BlockItem(blocksInit.SLIME_LIME_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_PINK_BLOCK = ITEMS.register("slime_pink_block",
        ()-> new BlockItem(blocksInit.SLIME_PINK_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_GRAY_BLOCK = ITEMS.register("slime_gray_block",
        ()-> new BlockItem(blocksInit.SLIME_GRAY_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_LIGHT_GRAY_BLOCK = ITEMS.register("slime_light_gray_block",
        ()-> new BlockItem(blocksInit.SLIME_LIGHT_GRAY_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_CYAN_BLOCK = ITEMS.register("slime_cyan_block",
        ()-> new BlockItem(blocksInit.SLIME_CYAN_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BLUE_BLOCK = ITEMS.register("slime_blue_block",
        ()-> new BlockItem(blocksInit.SLIME_BLUE_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BROWN_BLOCK = ITEMS.register("slime_brown_block",
        ()-> new BlockItem(blocksInit.SLIME_BROWN_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_GREEN_BLOCK = ITEMS.register("slime_green_block",
        ()-> new BlockItem(blocksInit.SLIME_GREEN_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_RED_BLOCK = ITEMS.register("slime_red_block",
        ()-> new BlockItem(blocksInit.SLIME_RED_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BLACK_BLOCK = ITEMS.register("slime_black_block",
        ()-> new BlockItem(blocksInit.SLIME_BLACK_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_PURPLE_BLOCK = ITEMS.register("slime_purple_block",
        ()-> new BlockItem(blocksInit.SLIME_PURPLE_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_MISSING_BLOCK = ITEMS.register("slime_missing_block",
        ()-> new BlockItem(blocksInit.SLIME_MISSING_BLOCK.get(),  new Item.Properties().tab(CrimsonSlimes.TAB)));
    
    
// Slime Balls
    public static final RegistryObject<Item> SLIME_BALL_WHITE = ITEMS.register("slime_ball_white",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_ORANGE = ITEMS.register("slime_ball_orange",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_MAGENTA = ITEMS.register("slime_ball_magenta",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_LIGHT_BLUE = ITEMS.register("slime_ball_light_blue",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_YELLOW = ITEMS.register("slime_ball_yellow",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_LIME = ITEMS.register("slime_ball_lime",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_PINK = ITEMS.register("slime_ball_pink",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_GRAY = ITEMS.register("slime_ball_gray",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_LIGHT_GRAY = ITEMS.register("slime_ball_light_gray",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_CYAN = ITEMS.register("slime_ball_cyan",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_BLUE = ITEMS.register("slime_ball_blue",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_BROWN = ITEMS.register("slime_ball_brown",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_GREEN = ITEMS.register("slime_ball_green",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_RED = ITEMS.register("slime_ball_red",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_BLACK = ITEMS.register("slime_ball_black",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_PURPLE = ITEMS.register("slime_ball_purple",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

    public static final RegistryObject<Item> SLIME_BALL_MISSING = ITEMS.register("slime_ball_missing",
        ()-> new Item(new Item.Properties().tab(CrimsonSlimes.TAB)));

}
