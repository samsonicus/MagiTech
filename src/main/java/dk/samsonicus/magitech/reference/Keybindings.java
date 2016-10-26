package dk.samsonicus.magitech.reference;

import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by 5k on 02-10-2016.
 */
public enum Keybindings {
    EXPLODE(Names.Keys.EXPLODE, Keyboard.KEY_G),
    EXPLODE_BIG(Names.Keys.EXPLODE_BIG, Keyboard.KEY_H);

    final private KeyBinding keybinding;

    private Keybindings(String keyName, int defaultKeyCode){
        keybinding = new KeyBinding(keyName, defaultKeyCode, Names.Keys.CATEGORY);
    }

    public KeyBinding getKeybind(){
        return keybinding;
    }

    public boolean isPressed(){
        return keybinding.isPressed();
    }
}