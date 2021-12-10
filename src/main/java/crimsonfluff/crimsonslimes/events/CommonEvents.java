package crimsonfluff.crimsonslimes.events;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import crimsonfluff.crimsonslimes.entities.CrimsonSlimeEntity;
import crimsonfluff.crimsonslimes.init.entitiesInit;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = CrimsonSlimes.MOD_ID)
public class CommonEvents {
    @SubscribeEvent
    public static void onSpawn(EntityJoinWorldEvent event) {
        if (event.getEntity() instanceof CrimsonSlimeEntity) return;

        if (event.getEntity() instanceof Slime) {
            event.setCanceled(true);

            CrimsonSlimeEntity slime = entitiesInit.CRIMSON_SLIME.get().create(event.getWorld());
            if (slime != null) {
                slime.load(event.getEntity().getPersistentData());
                slime.setColour(event.getWorld().random.nextInt(17));
                slime.setSize(((Slime) event.getEntity()).getSize());
                slime.copyPosition(event.getEntity());

                event.getWorld().addFreshEntity(slime);
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        List<MobSpawnSettings.SpawnerData> spawns = event.getSpawns().getSpawner(MobCategory.CREATURE);

        if (spawns.removeIf(e -> e.type == EntityType.SLIME))
            spawns.add(new MobSpawnSettings.SpawnerData(entitiesInit.CRIMSON_SLIME.get(), 10, 4, 6));
    }
}
