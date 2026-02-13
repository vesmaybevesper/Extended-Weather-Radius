package dev.vesper.weatherradiusextended;

//? fabric {
import dev.vesper.weatherradiusextended.fabric.FabricPlatformImpl;
//?}
//? neoforge {
/*import dev.vesper.weatherradiusextended.neoforge.NeoforgePlatformImpl;
*///?}

public interface Platform {

    //? fabric {
    Platform INSTANCE = new FabricPlatformImpl();
    //?}
    //? neoforge {
    /*Platform INSTANCE = new NeoforgePlatformImpl();
    *///?}


    boolean isModLoaded(String modid);
    String loader();

}
