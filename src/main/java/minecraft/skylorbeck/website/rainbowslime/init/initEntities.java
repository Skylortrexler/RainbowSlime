package minecraft.skylorbeck.website.rainbowslime.init;

import minecraft.skylorbeck.website.rainbowslime.RainbowSlime;
import minecraft.skylorbeck.website.rainbowslime.entity.RainbowSlimeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class initEntities {
    public static final EntityType<RainbowSlimeEntity> SLIME = Registry.register(Registry.ENTITY_TYPE, new Identifier(RainbowSlime.MOD_ID, "slime"),
        FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RainbowSlimeEntity::new).dimensions(EntityDimensions.changing(2.04f, 2.04f)).build());

    //    public static final EntityType<CrimsonSlimeEntity> SLIME = Registry.register(Registry.ENTITY_TYPE, new Identifier(CrimsonSlimes.MOD_ID, "slime"),
//        FabricEntityTypeBuilder.createMob().spawnGroup(SpawnGroup.MONSTER)
//                .spawnRestriction(SpawnRestriction.Location.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//                        (animal, world, reason, pos, random) -> SlimeEntity::canSpawn)
//                .entityFactory(CrimsonSlimeEntity::new).dimensions(EntityDimensions.fixed(2.4f, 2.4f)).build());
}
