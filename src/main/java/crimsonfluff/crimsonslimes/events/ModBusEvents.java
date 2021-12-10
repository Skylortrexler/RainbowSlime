package crimsonfluff.crimsonslimes.events;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import crimsonfluff.crimsonslimes.entities.CrimsonSlimeEntity;
import crimsonfluff.crimsonslimes.init.entitiesInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CrimsonSlimes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBusEvents {
    @SubscribeEvent
    public static void onEntityAttributeCreationEvent(EntityAttributeCreationEvent event) {
        event.put(entitiesInit.CRIMSON_SLIME.get(), CrimsonSlimeEntity.createAttributes().build());
    }
}
