package crimsonfluff.crimsonslimes;

import crimsonfluff.crimsonslimes.entity.CrimsonSlimeEntity;
import crimsonfluff.crimsonslimes.init.initAttributes;
import crimsonfluff.crimsonslimes.init.initBlocks;
import crimsonfluff.crimsonslimes.init.initEntities;
import crimsonfluff.crimsonslimes.init.initItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.SpawnSettings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

//  /summon crimsonslimes:slime ~ ~ ~ {Size:3}
//  /summon crimsonslimes:slime ~ ~ ~ {Colour:5}

public class CrimsonSlimes implements ModInitializer {
    public static final String MOD_ID = "crimsonslimes";
    public static final Logger LOGGER = LogManager.getLogger(CrimsonSlimes.class);
    public static final ItemGroup CREATIVE_TAB = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "tab"), () -> new ItemStack(initBlocks.SLIME_MISSING_BLOCK));

    @Override
    public void onInitialize() {
        initItems.register();
        initBlocks.register();
        initAttributes.register();

//        Identifier slimeID = Registry.ENTITY_TYPE.getId(EntityType.SLIME);
//        BuiltinRegistries.BIOME.forEach(biome -> {
//            List<SpawnSettings.SpawnEntry> spawns = biome.getSpawnSettings().getSpawnEntries(SpawnGroup.MONSTER).getEntries();
//
//            if (spawns.stream().anyMatch(tag -> tag.type == EntityType.SLIME)) {
//                BiomeModifications.create(slimeID).add(ModificationPhase.REMOVALS, BiomeSelectors.categories(biome.getCategory()), context -> {
//                    context.getSpawnSettings().removeSpawnsOfEntityType(EntityType.SLIME);
//                });
//
//                BiomeModifications.addSpawn(BiomeSelectors.categories(biome.getCategory()), SpawnGroup.MONSTER, initEntities.SLIME, 10, 4, 6);
////                LOGGER.info("Biome: " + biome);
//            }
//        });

        // Vanilla Slime from SpawnEgg/Spawner/Summon
        ServerEntityEvents.ENTITY_LOAD.register((entity, serverWorld) -> {
            if (entity.getType() == EntityType.SLIME) {
                entity.remove(Entity.RemovalReason.DISCARDED);

                CrimsonSlimeEntity mimic = initEntities.SLIME.create(serverWorld);
                if (mimic != null) {
                    mimic.copyPositionAndRotation(entity);

                    NbtCompound nbtCompound = entity.writeNbt(new NbtCompound());
                    nbtCompound.remove("Dimension");
                    nbtCompound.remove("UUID");
                    mimic.readNbt(nbtCompound);

                    serverWorld.spawnEntity(mimic);
                }
            }
        });
    }
}
