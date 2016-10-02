package dk.samsonicus.magitech.proxy;

import dk.samsonicus.magitech.handler.ConfigurationHandler;
import dk.samsonicus.magitech.init.ModBlocks;
import dk.samsonicus.magitech.init.ModItems;
import dk.samsonicus.magitech.init.Recipes;
import dk.samsonicus.magitech.utility.LogHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by 5k on 13-09-2016.
 */
public abstract class CommonProxy implements IProxy{
    @Override
    public void onPreInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        LogHelper.info("PreInit complete");
    }

    @Override
    public void onInit(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
        Recipes.registerRecipes();

    }

    @Override
    public void onPostInit(FMLPostInitializationEvent event) {

    }
}
