package dev.vesper.weatherradiusextended.fabric;

//? fabric {
import dev.vesper.weatherradiusextended.WeatherRadiusExtended;
import net.fabricmc.api.ModInitializer;

public class FabricEntrypoint implements ModInitializer {

    @Override
    public void onInitialize() {
        WeatherRadiusExtended.init();
    }

}
//?}