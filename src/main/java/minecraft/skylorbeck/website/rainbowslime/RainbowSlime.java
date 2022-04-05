package minecraft.skylorbeck.website.rainbowslime;

import minecraft.skylorbeck.website.rainbowslime.entity.RainbowSlimeEntity;
import minecraft.skylorbeck.website.rainbowslime.init.initAttributes;
import minecraft.skylorbeck.website.rainbowslime.init.initBlocks;
import minecraft.skylorbeck.website.rainbowslime.init.initEntities;
import minecraft.skylorbeck.website.rainbowslime.init.initItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

//  /summon crimsonslimes:slime ~ ~ ~ {Size:3}
//  /summon crimsonslimes:slime ~ ~ ~ {Colour:5}

public class RainbowSlime implements ModInitializer {
    public static final String MOD_ID = "rainbowslime";
    public static final ItemGroup CREATIVE_TAB = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "tab"), () -> new ItemStack(initBlocks.SLIME_LIGHT_BLUE_BLOCK));

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
                //todo add config setting here for chance at regular slime
                entity.remove(Entity.RemovalReason.DISCARDED);

                RainbowSlimeEntity mimic = initEntities.SLIME.create(serverWorld);
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
