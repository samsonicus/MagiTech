package dk.samsonicus.magitech.client.handler;

import dk.samsonicus.magitech.network.common.MessegeExplode;
import dk.samsonicus.magitech.network.handler.NetworkHandler;
import dk.samsonicus.magitech.reference.Keybindings;
import dk.samsonicus.magitech.utility.LogHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

/**
 * Created by 5k on 02-10-2016.
 */
public class KeyInputEventHandler {
    private static Keybindings getPressedKeybinding(){
        for (Keybindings key: Keybindings.values()) {
            if (key.isPressed()) return key;
        }
            return null;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
        Keybindings key = getPressedKeybinding();
        if (key != null){
            switch (key){
                case EXPLODE:
                    NetworkHandler.sendToServer(new MessegeExplode(3));
                    break;
                case EXPLODE_BIG:
                    NetworkHandler.sendToServer(new MessegeExplode(10));
                    break;
                default:
                    //NOOP
                    break;
            }
        }
    }
}
