package dk.samsonicus.magitech.init;


import dk.samsonicus.magitech.reference.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by 5k on 05-10-2016.
 */
public class ModSounds {
    public static SoundEvent HIT_METAL;

    public static void registerSounds(){
        HIT_METAL = registerSoundFor("hit_metal");
    }

    private static SoundEvent registerSoundFor(String nameOfSound){
        final ResourceLocation soundResourceLoc = new ResourceLocation(Reference.MOD_ID,nameOfSound);
        return GameRegistry.register(new SoundEvent(soundResourceLoc).setRegistryName(soundResourceLoc));
    }
}
