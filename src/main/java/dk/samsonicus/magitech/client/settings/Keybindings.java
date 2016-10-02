package dk.samsonicus.magitech.client.settings;

import dk.samsonicus.magitech.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by 5k on 02-10-2016.
 */
public class Keybindings {
    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_R,Names.Keys.CATEGORY);
}
