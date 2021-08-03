package crimsonfluff.crimsonslimes.events;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import crimsonfluff.crimsonslimes.entities.CrimsonSlimeEntity;
import crimsonfluff.crimsonslimes.init.entitiesInit;
import crimsonfluff.crimsonslimes.items.CrimsonSpawnEggItem;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CrimsonSlimes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBusEvents {
    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
        CrimsonSpawnEggItem.init();
    }

    @SubscribeEvent
    public static void onEntityAttributeCreationEvent(EntityAttributeCreationEvent event) {
        event.put(entitiesInit.SLIME_WHITE.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_ORANGE.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_MAGENTA.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_LIGHT_BLUE.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_YELLOW.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_LIME.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_PINK.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_GRAY.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_LIGHT_GRAY.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_CYAN.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_BLUE.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_BROWN.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_GREEN.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_RED.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_BLACK.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_PURPLE.get(), CrimsonSlimeEntity.createAttributes().build());
        event.put(entitiesInit.SLIME_MISSING.get(), CrimsonSlimeEntity.createAttributes().build());
    }
}
