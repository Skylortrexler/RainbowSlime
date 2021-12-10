package crimsonfluff.crimsonslimes.init;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import crimsonfluff.crimsonslimes.entities.CrimsonSlimeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class entitiesInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, CrimsonSlimes.MOD_ID);

    public static final RegistryObject<EntityType<CrimsonSlimeEntity>> CRIMSON_SLIME = ENTITIES.register("crimson_slime",
        () -> EntityType.Builder.of(CrimsonSlimeEntity::new, MobCategory.MONSTER)
            .sized(0.9F, 1.3F).build(new ResourceLocation(CrimsonSlimes.MOD_ID, "crimson_slime").toString()));
}
