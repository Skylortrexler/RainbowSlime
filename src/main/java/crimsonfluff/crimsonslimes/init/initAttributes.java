package crimsonfluff.crimsonslimes.init;

import crimsonfluff.crimsonslimes.entity.CrimsonSlimeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class initAttributes {
    public static void register() {
        FabricDefaultAttributeRegistry.register(initEntities.SLIME, CrimsonSlimeEntity.createSlimeAttributes());
    }
}
