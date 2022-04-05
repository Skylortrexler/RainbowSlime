package minecraft.skylorbeck.website.rainbowslime.init;

import minecraft.skylorbeck.website.rainbowslime.entity.RainbowSlimeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class initAttributes {
    public static void register() {
        FabricDefaultAttributeRegistry.register(initEntities.SLIME, RainbowSlimeEntity.createSlimeAttributes());
    }
}
