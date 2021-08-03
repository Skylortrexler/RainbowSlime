package crimsonfluff.crimsonslimes.events;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import crimsonfluff.crimsonslimes.entities.CrimsonSlimeRenderer;
import crimsonfluff.crimsonslimes.init.entitiesInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CrimsonSlimes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModBusEventsClient {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(entitiesInit.SLIME_WHITE.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/white.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_ORANGE.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/orange.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_MAGENTA.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/magenta.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_LIGHT_BLUE.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/light_blue.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_YELLOW.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/yellow.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_LIME.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/lime.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_PINK.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/pink.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_GRAY.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/gray.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_LIGHT_GRAY.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/light_gray.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_CYAN.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/cyan.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_BLUE.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/blue.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_BROWN.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/brown.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_GREEN.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/green.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_RED.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/red.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_BLACK.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/black.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_PURPLE.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/purple.png")));
        event.registerEntityRenderer(entitiesInit.SLIME_MISSING.get(), p_174153_ -> new CrimsonSlimeRenderer(p_174153_, new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/missing.png")));
    }
}
