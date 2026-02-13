package dev.vesper.weatherradiusextended.fabric;

//? fabric {
import dev.vesper.weatherradiusextended.WeatherRadiusExtended;
import net.fabricmc.api.ClientModInitializer;

public class FabricClientEntrypoint implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        WeatherRadiusExtended.LOG.info("Initializing {} Client", WeatherRadiusExtended.MOD_ID);
    }

}
//?}