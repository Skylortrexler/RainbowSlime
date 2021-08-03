package crimsonfluff.crimsonslimes.events;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import crimsonfluff.crimsonslimes.entities.CrimsonSlimeEntity;
import crimsonfluff.crimsonslimes.init.entitiesInit;
import net.minecraft.world.entity.monster.Slime;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CrimsonSlimes.MOD_ID)
public class CommonEvents {
//    @SubscribeEvent
//    public static void onSpawn(LivingSpawnEvent.CheckSpawn event) {
//        // not from SpawnEgg or /Summon
//        if (event.getEntityLiving() instanceof CrimsonSlimeEntity) return;
//
//        if (event.getEntity() instanceof Slime) {
//            CrimsonSlimes.LOGGER.info("SIZE: " + ((Slime)event.getEntity()).getPersistentData().get("Size"));
//        }
//    }

//    @SubscribeEvent
//    public static void onSpawn(EntityEvent.EntityConstructing event) {
//        if (event.getEntity() instanceof CrimsonSlimeEntity) return;
//
//        if (event.getEntity() instanceof Slime) {
//            CrimsonSlimes.LOGGER.info("CONSTRUCTING SIZE: " + ((Slime)event.getEntity()).getPersistentData().get("Size"));
//        }
//    }

    @SubscribeEvent
    public static void onSpawn(EntityJoinWorldEvent event) {
        if (event.getEntity() instanceof CrimsonSlimeEntity) return;

        if (event.getEntity() instanceof Slime) {
// can only get getSize() from here
            //CrimsonSlimes.LOGGER.info("JOINWORLD SIZE: " + ((Slime)event.getEntity()).getSize());

            event.setCanceled(true);

            CrimsonSlimeEntity slime;
            switch (event.getWorld().random.nextInt(17)) {
                default -> slime = entitiesInit.SLIME_WHITE.get().create(event.getWorld());
                case 1 -> slime = entitiesInit.SLIME_ORANGE.get().create(event.getWorld());
                case 2 -> slime = entitiesInit.SLIME_MAGENTA.get().create(event.getWorld());
                case 3 -> slime = entitiesInit.SLIME_LIGHT_BLUE.get().create(event.getWorld());
                case 4 -> slime = entitiesInit.SLIME_YELLOW.get().create(event.getWorld());
                case 5 -> slime = entitiesInit.SLIME_LIME.get().create(event.getWorld());
                case 6 -> slime = entitiesInit.SLIME_PINK.get().create(event.getWorld());
                case 7 -> slime = entitiesInit.SLIME_GRAY.get().create(event.getWorld());
                case 8 -> slime = entitiesInit.SLIME_LIGHT_GRAY.get().create(event.getWorld());
                case 9 -> slime = entitiesInit.SLIME_CYAN.get().create(event.getWorld());
                case 10 -> slime = entitiesInit.SLIME_BLUE.get().create(event.getWorld());
                case 11 -> slime = entitiesInit.SLIME_BROWN.get().create(event.getWorld());
                case 12 -> slime = entitiesInit.SLIME_GREEN.get().create(event.getWorld());
                case 13 -> slime = entitiesInit.SLIME_RED.get().create(event.getWorld());
                case 14 -> slime = entitiesInit.SLIME_BLACK.get().create(event.getWorld());
                case 15 -> slime = entitiesInit.SLIME_PURPLE.get().create(event.getWorld());
                case 16 -> slime = entitiesInit.SLIME_MISSING.get().create(event.getWorld());
            }

            slime.copyPosition(event.getEntity());
            slime.setSize(((Slime)event.getEntity()).getSize());

            event.getWorld().addFreshEntity(slime);
        }
    }
}
