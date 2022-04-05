package minecraft.skylorbeck.website.rainbowslime;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@me.shedaniel.autoconfig.annotation.Config(name = RainbowSlime.MOD_ID)
public class SlimeConfig implements ConfigData {
    @ConfigEntry.Gui.RequiresRestart
    @ConfigEntry.BoundedDiscrete(min = 0,max =100)
    int spawnChance = 100;
}
