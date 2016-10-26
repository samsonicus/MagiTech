package dk.samsonicus.magitech.init;

import dk.samsonicus.magitech.reference.Reference;
import dk.samsonicus.magitech.tileentity.TileEntityCamoMine;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by 5k on 26-10-2016.
 */
public class ModTileEntity {

    public static void init(){
        registerTileEntityFor(TileEntityCamoMine.class,"Camomine");

    }

    private static void registerTileEntityFor(Class tileEntity,String id){
        GameRegistry.registerTileEntity(tileEntity, Reference.MOD_ID+":"+id);
    }
}
