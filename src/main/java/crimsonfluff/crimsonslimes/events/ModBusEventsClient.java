package crimsonfluff.crimsonslimes.events;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import crimsonfluff.crimsonslimes.entities.CrimsonSlimeRenderer;
import crimsonfluff.crimsonslimes.init.blocksInit;
import crimsonfluff.crimsonslimes.init.entitiesInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CrimsonSlimes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModBusEventsClient {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(entitiesInit.CRIMSON_SLIME.get(), CrimsonSlimeRenderer::new);

        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_WHITE_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_ORANGE_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_MAGENTA_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_LIGHT_BLUE_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_YELLOW_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_LIME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_PINK_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_GRAY_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_LIGHT_GRAY_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_CYAN_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_PURPLE_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_BLUE_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_BROWN_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_GREEN_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_RED_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_BLACK_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(blocksInit.SLIME_MISSING_BLOCK.get(), RenderType.translucent());
    }
}
