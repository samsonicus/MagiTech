package dk.samsonicus.magitech.world.gen;

import dk.samsonicus.magitech.init.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by 5k on 03-10-2016.
 */
public class WorldGenereatorTestBlock implements IWorldGenerator{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        world.setBlockState(new BlockPos(chunkX * 16,30,chunkZ * 16), ModBlocks.TEST_BLOCK.getDefaultState(),2);
    }
}
