package dk.samsonicus.magitech.block;

import dk.samsonicus.magitech.tileentity.TileEntityCamoMine;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

import javax.annotation.Nullable;

/**
 * Created by 5k on 26-10-2016.
 */
public class BlockCamoMine extends BlockMagitechTileEntity {

    public BlockCamoMine(){
        super();
        this.setUnlocalizedName("Camomine");
        this.setTickRandomly(true);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            TileEntityCamoMine te = ((TileEntityCamoMine) worldIn.getTileEntity(pos));
            te.setCamouflage(playerIn.getHeldItemMainhand());
        }
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityCamoMine();
    }
}
