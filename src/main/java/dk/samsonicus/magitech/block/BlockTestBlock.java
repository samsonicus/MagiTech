package dk.samsonicus.magitech.block;

import dk.samsonicus.magitech.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by 5k on 27-09-2016.
 */
public class BlockTestBlock extends BlockMagitech {
    public BlockTestBlock(){
        super();
        this.setUnlocalizedName("test_block");
    }
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if(worldIn.isAirBlock(new BlockPos(pos.getX(),pos.getY() +1, pos.getZ()))) {
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), ModBlocks.TEST_BLOCK.getDefaultState(), 2);
        }
        return true;
    }
}
