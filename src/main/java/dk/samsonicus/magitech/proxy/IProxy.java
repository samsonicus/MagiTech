package dk.samsonicus.magitech.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by 5k on 13-09-2016.
 */
public interface IProxy {
    void onPreInit(FMLPreInitializationEvent event);
    void onInit (FMLInitializationEvent event);
    void onPostInit (FMLPostInitializationEvent event);
}
