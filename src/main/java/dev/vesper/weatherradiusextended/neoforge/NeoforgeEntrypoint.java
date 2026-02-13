package dev.vesper.weatherradiusextended.neoforge;

//? neoforge {
/*import dev.vesper.weatherradiusextended.WeatherRadiusExtended;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(WeatherRadiusExtended.MOD_ID)
@EventBusSubscriber // sample_content
public class NeoforgeEntrypoint {

    public NeoforgeEntrypoint() {
        WeatherRadiusExtended.init();
    }

    @EventBusSubscriber(modid = WeatherRadiusExtended.MOD_ID, value = Dist.CLIENT)
    public static class ClientEvents {
        @SubscribeEvent
        public static void onClientSetup(final FMLClientSetupEvent event) {
            WeatherRadiusExtended.LOG.info("Initializing {} Client", WeatherRadiusExtended.MOD_ID);
        }
    }

}
*///?}