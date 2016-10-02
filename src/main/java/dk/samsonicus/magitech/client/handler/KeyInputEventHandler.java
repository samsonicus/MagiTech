package dk.samsonicus.magitech.client.handler;

import dk.samsonicus.magitech.client.settings.Keybindings;
import dk.samsonicus.magitech.reference.Key;
import dk.samsonicus.magitech.utility.LogHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

/**
 * Created by 5k on 02-10-2016.
 */
public class KeyInputEventHandler {
    private static Key getPressedKeybinding(){
        if (Keybindings.charge.isPressed()){
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed()){
            return Key.RELEASE;
        }
            return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
        LogHelper.info(getPressedKeybinding());
    }
}
