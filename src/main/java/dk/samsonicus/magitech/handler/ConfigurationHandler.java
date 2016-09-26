package dk.samsonicus.magitech.handler;

import dk.samsonicus.magitech.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by 5k on 14-09-2016.
 */
public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean testConfig = false;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.getModID().equalsIgnoreCase(Reference.MOD_ID)){
            loadConfiguration();
        }
    }
    public static void loadConfiguration(){
        testConfig = configuration.getBoolean("testConfig", Configuration.CATEGORY_GENERAL, true, "This is a test config");
        if (configuration.hasChanged()){
            configuration.save();
        }

    }
}
