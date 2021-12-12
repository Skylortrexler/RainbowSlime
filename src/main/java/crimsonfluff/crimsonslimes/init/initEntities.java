package crimsonfluff.crimsonslimes.init;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import crimsonfluff.crimsonslimes.entity.CrimsonSlimeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;

public class initEntities {
    public static final EntityType<CrimsonSlimeEntity> SLIME = Registry.register(Registry.ENTITY_TYPE, new Identifier(CrimsonSlimes.MOD_ID, "slime"),
        FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CrimsonSlimeEntity::new).dimensions(EntityDimensions.fixed(2.4f, 2.4f)).build());
//    public static final EntityType<CrimsonSlimeEntity> SLIME = Registry.register(Registry.ENTITY_TYPE, new Identifier(CrimsonSlimes.MOD_ID, "slime"),
//        FabricEntityTypeBuilder.createMob().spawnGroup(SpawnGroup.MONSTER)
//                .spawnRestriction(SpawnRestriction.Location.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                        (animal, world, reason, pos, random) -> SlimeEntity::canSpawn)
//                .entityFactory(CrimsonSlimeEntity::new).dimensions(EntityDimensions.fixed(2.4f, 2.4f)).build());
}
