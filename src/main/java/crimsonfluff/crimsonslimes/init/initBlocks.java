package crimsonfluff.crimsonslimes.init;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class initBlocks {
    public static final Block SLIME_MISSING_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_WHITE_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_ORANGE_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_MAGENTA_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_LIGHT_BLUE_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_YELLOW_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_LIME_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_PINK_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_GRAY_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_LIGHT_GRAY_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_CYAN_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_PURPLE_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_BLUE_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_BROWN_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_GREEN_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_RED_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());
    public static final Block SLIME_BLACK_BLOCK = new SlimeBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque());

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_missing_block"), SLIME_MISSING_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_white_block"), SLIME_WHITE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_orange_block"), SLIME_ORANGE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_magenta_block"), SLIME_MAGENTA_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_light_blue_block"), SLIME_LIGHT_BLUE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_yellow_block"), SLIME_YELLOW_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_lime_block"), SLIME_LIME_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_pink_block"), SLIME_PINK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_gray_block"), SLIME_GRAY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_light_gray_block"), SLIME_LIGHT_GRAY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_cyan_block"), SLIME_CYAN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_purple_block"), SLIME_PURPLE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_blue_block"), SLIME_BLUE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_brown_block"), SLIME_BROWN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_green_block"), SLIME_GREEN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_red_block"), SLIME_RED_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CrimsonSlimes.MOD_ID, "slime_black_block"), SLIME_BLACK_BLOCK);
    }
}
