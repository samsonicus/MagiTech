package dk.samsonicus.magitech.block;

import dk.samsonicus.magitech.tileentity.TileEntityCamoMine;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by 5k on 26-10-2016.
 */
public class BlockCamoMine extends BlockMagitech implements ITileEntityProvider {

    public BlockCamoMine(){
        super();
        this.setUnlocalizedName("Camomine");
        this.setTickRandomly(true);
    }


    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityCamoMine();
    }
}
