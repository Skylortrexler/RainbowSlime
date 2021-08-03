package crimsonfluff.crimsonslimes.init;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import crimsonfluff.crimsonslimes.entities.CrimsonSlimeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class entitiesInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, CrimsonSlimes.MOD_ID);

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_WHITE = ENTITIES.register("slime_white",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 0), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_white").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_ORANGE = ENTITIES.register("slime_orange",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 1), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_orange").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_MAGENTA = ENTITIES.register("slime_magenta",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 2), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_magenta").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_LIGHT_BLUE = ENTITIES.register("slime_light_blue",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 3), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_light_blue").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_YELLOW = ENTITIES.register("slime_yellow",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 4), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_yellow").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_LIME = ENTITIES.register("slime_lime",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 5), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_lime").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_PINK = ENTITIES.register("slime_pink",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 6), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_pink").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_GRAY = ENTITIES.register("slime_gray",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 7), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_gray").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_LIGHT_GRAY = ENTITIES.register("slime_light_gray",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 8), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_light_gray").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_CYAN = ENTITIES.register("slime_cyan",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 9), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_cyan").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_BLUE = ENTITIES.register("slime_blue",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 10), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_blue").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_BROWN = ENTITIES.register("slime_brown",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 11), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_brown").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_GREEN = ENTITIES.register("slime_green",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 12), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_green").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_RED = ENTITIES.register("slime_red",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 13), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_red").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_BLACK = ENTITIES.register("slime_black",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 14), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_black").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_PURPLE = ENTITIES.register("slime_purple",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 15), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_purple").toString()));

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> SLIME_MISSING = ENTITIES.register("slime_missing",
        () -> EntityType.Builder.of((EntityType<CrimsonSlimeEntity> p_i48552_1_, Level p_i48552_2_) -> new CrimsonSlimeEntity(p_i48552_1_, p_i48552_2_, 16), MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "slime_missing").toString()));
}
