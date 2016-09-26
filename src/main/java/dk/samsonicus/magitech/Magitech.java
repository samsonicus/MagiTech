package dk.samsonicus.magitech;

import dk.samsonicus.magitech.handler.ConfigurationHandler;
import dk.samsonicus.magitech.init.ModItems;
import dk.samsonicus.magitech.proxy.IProxy;
import dk.samsonicus.magitech.reference.Reference;
import dk.samsonicus.magitech.utility.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Magitech{
    @Mod.Instance(Reference.MOD_ID)
    public static Magitech instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.onPreInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.onInit(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.onPostInit(event);
    }
}
