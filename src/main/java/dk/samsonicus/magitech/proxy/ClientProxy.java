package dk.samsonicus.magitech.proxy;

import dk.samsonicus.magitech.client.settings.Keybindings;
import dk.samsonicus.magitech.init.ModBlocks;
import dk.samsonicus.magitech.init.ModItems;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by 5k on 13-09-2016.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void onPreInit(FMLPreInitializationEvent event) {
        super.onPreInit(event);
        ModItems.registerItemRenders();
        ModBlocks.registerBlockrenders();
        registerKeyBindings();
    }

    @Override
    public void onInit(FMLInitializationEvent event) {
        super.onInit(event);
        //ModItems.registerItemRenders();
    }

    @Override
    public void onPostInit(FMLPostInitializationEvent event) {
        super.onPostInit(event);
    }

    private void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}
