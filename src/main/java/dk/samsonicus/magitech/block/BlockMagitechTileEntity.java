package dk.samsonicus.magitech.block;

import dk.samsonicus.magitech.creativetab.CreativeTabMagitech;
import dk.samsonicus.magitech.reference.Reference;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by 5k on 26-10-2016.
 */
public class BlockMagitechTileEntity extends BlockMagitech implements ITileEntityProvider {

    public BlockMagitechTileEntity(Material material){
        super(material);
    }

    public BlockMagitechTileEntity(){
        super();
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return null;
    }
}
