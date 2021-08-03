package crimsonfluff.crimsonslimes.init;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class blocksInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CrimsonSlimes.MOD_ID);

    public static final RegistryObject<Block> SLIME_WHITE_BLOCK = BLOCKS.register("slime_white_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.SNOW).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_ORANGE_BLOCK = BLOCKS.register("slime_orange_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_ORANGE).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_MAGENTA_BLOCK = BLOCKS.register("slime_magenta_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_MAGENTA).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_LIGHT_BLUE_BLOCK = BLOCKS.register("slime_light_blue_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_LIGHT_BLUE).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_YELLOW_BLOCK = BLOCKS.register("slime_yellow_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_YELLOW).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_LIME_BLOCK = BLOCKS.register("slime_lime_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_PINK_BLOCK = BLOCKS.register("slime_pink_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_PINK).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_GRAY_BLOCK = BLOCKS.register("slime_gray_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_LIGHT_GRAY_BLOCK = BLOCKS.register("slime_light_gray_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_LIGHT_GRAY).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_CYAN_BLOCK = BLOCKS.register("slime_cyan_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_CYAN).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_BLUE_BLOCK = BLOCKS.register("slime_blue_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_BLUE).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_BROWN_BLOCK = BLOCKS.register("slime_brown_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_BROWN).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_GREEN_BLOCK = BLOCKS.register("slime_green_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GREEN).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_RED_BLOCK = BLOCKS.register("slime_red_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_RED).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_BLACK_BLOCK = BLOCKS.register("slime_black_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_BLACK).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_PURPLE_BLOCK = BLOCKS.register("slime_purple_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_PURPLE).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SLIME_MISSING_BLOCK = BLOCKS.register("slime_missing_block",
        ()-> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_PINK).sound(SoundType.SLIME_BLOCK).noOcclusion()));
}
