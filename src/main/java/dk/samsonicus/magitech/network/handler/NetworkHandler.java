package dk.samsonicus.magitech.network.handler;

import dk.samsonicus.magitech.network.common.MessegeExplode;
import dk.samsonicus.magitech.reference.Reference;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by 5k on 26-10-2016.
 */
public class NetworkHandler {
    private static SimpleNetworkWrapper INSTANCE;

    public static void init(){
        INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);

        INSTANCE.registerMessage(MessegeExplode.class,MessegeExplode.class,0, Side.SERVER);
    }
    public static void sendToServer(IMessage message){
        INSTANCE.sendToServer(message);
    }
}
