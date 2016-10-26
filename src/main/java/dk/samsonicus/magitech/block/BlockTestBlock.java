package dk.samsonicus.magitech.block;

import dk.samsonicus.magitech.init.ModSounds;
import dk.samsonicus.magitech.utility.LogHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by 5k on 27-09-2016.
 */
public class BlockTestBlock extends BlockMagitech {
    public BlockTestBlock(){
        super();
        this.setUnlocalizedName("test_block");
        this.setTickRandomly(true);
    }
    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        //LogHelper.info("Ticked test block");
        worldIn.playSound(null,pos,ModSounds.HIT_METAL, SoundCategory.BLOCKS,1.0F,rand.nextFloat()*2+0.5F);
    }
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        //Kept for reference.
        /*if(worldIn.isAirBlock(new BlockPos(pos.getX(),pos.getY() +1, pos.getZ()))) {
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), ModBlocks.TEST_BLOCK.getDefaultState(), 2);
        }*/
        worldIn.playSound(pos.getX(),pos.getY(),pos.getZ(), ModSounds.HIT_METAL, SoundCategory.BLOCKS,5.0F, playerIn.getRNG().nextFloat()+0.5F,false);
        return true;
    }
}
