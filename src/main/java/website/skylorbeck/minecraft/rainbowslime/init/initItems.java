package website.skylorbeck.minecraft.rainbowslime.init;

import website.skylorbeck.minecraft.rainbowslime.RainbowSlime;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class initItems {
    public static final Item SLIME_BALL_MISSING = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_CLEAR = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_WHITE = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_ORANGE = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_MAGENTA = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_LIGHT_BLUE = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_YELLOW = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_LIME = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_PINK = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_GRAY = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_LIGHT_GRAY = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_CYAN = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_PURPLE = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_BLUE = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_BROWN = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_GREEN = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_RED = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));
    public static final Item SLIME_BALL_BLACK = new Item(new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_missing"), SLIME_BALL_MISSING);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_clear"), SLIME_BALL_CLEAR);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_white"), SLIME_BALL_WHITE);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_orange"), SLIME_BALL_ORANGE);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_magenta"), SLIME_BALL_MAGENTA);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_light_blue"), SLIME_BALL_LIGHT_BLUE);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_yellow"), SLIME_BALL_YELLOW);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_lime"), SLIME_BALL_LIME);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_pink"), SLIME_BALL_PINK);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_gray"), SLIME_BALL_GRAY);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_light_gray"), SLIME_BALL_LIGHT_GRAY);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_cyan"), SLIME_BALL_CYAN);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_purple"), SLIME_BALL_PURPLE);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_blue"), SLIME_BALL_BLUE);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_brown"), SLIME_BALL_BROWN);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_green"), SLIME_BALL_GREEN);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_red"), SLIME_BALL_RED);
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_ball_black"), SLIME_BALL_BLACK);

        // Spawn_Eggs
//        Registry.register(Registry.ITEM, new Identifier(CrimsonSlimes.MOD_ID, "slime_spawn_egg"), new SpawnEggItem(initEntities.SLIME, 0xFFFFFF, MapColor.WHITE.color, new Item.Settings().group(CrimsonSlimes.CREATIVE_TAB)));

        // Block Items
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_missing_block"), new BlockItem(initBlocks.SLIME_MISSING_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_clear_block"), new BlockItem(initBlocks.SLIME_CLEAR_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_white_block"), new BlockItem(initBlocks.SLIME_WHITE_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_orange_block"), new BlockItem(initBlocks.SLIME_ORANGE_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_magenta_block"), new BlockItem(initBlocks.SLIME_MAGENTA_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_light_blue_block"), new BlockItem(initBlocks.SLIME_LIGHT_BLUE_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_yellow_block"), new BlockItem(initBlocks.SLIME_YELLOW_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_lime_block"), new BlockItem(initBlocks.SLIME_LIME_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_pink_block"), new BlockItem(initBlocks.SLIME_PINK_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_gray_block"), new BlockItem(initBlocks.SLIME_GRAY_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_light_gray_block"), new BlockItem(initBlocks.SLIME_LIGHT_GRAY_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_cyan_block"), new BlockItem(initBlocks.SLIME_CYAN_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_purple_block"), new BlockItem(initBlocks.SLIME_PURPLE_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_blue_block"), new BlockItem(initBlocks.SLIME_BLUE_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_brown_block"), new BlockItem(initBlocks.SLIME_BROWN_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_green_block"), new BlockItem(initBlocks.SLIME_GREEN_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_red_block"), new BlockItem(initBlocks.SLIME_RED_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(RainbowSlime.MOD_ID, "slime_black_block"), new BlockItem(initBlocks.SLIME_BLACK_BLOCK, new FabricItemSettings().group(RainbowSlime.CREATIVE_TAB)));
    }
}
