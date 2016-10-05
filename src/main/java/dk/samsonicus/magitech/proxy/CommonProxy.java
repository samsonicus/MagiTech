package dk.samsonicus.magitech.proxy;

import dk.samsonicus.magitech.client.handler.KeyInputEventHandler;
import dk.samsonicus.magitech.handler.ConfigurationHandler;
import dk.samsonicus.magitech.init.ModBlocks;
import dk.samsonicus.magitech.init.ModItems;
import dk.samsonicus.magitech.init.ModSounds;
import dk.samsonicus.magitech.init.Recipes;
import dk.samsonicus.magitech.utility.LogHelper;
import dk.samsonicus.magitech.world.gen.WorldGenereatorTestBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by 5k on 13-09-2016.
 */
public abstract class CommonProxy implements IProxy{
    @Override
    public void onPreInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        GameRegistry.registerWorldGenerator(new WorldGenereatorTestBlock(),0);
        ModSounds.registerSounds();
        LogHelper.info("PreInit complete");
    }

    @Override
    public void onInit(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
        MinecraftForge.EVENT_BUS.register(new KeyInputEventHandler());
        Recipes.registerRecipes();

    }

    @Override
    public void onPostInit(FMLPostInitializationEvent event) {

    }
}
