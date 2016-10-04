package dk.samsonicus.magitech.world.gen;

import dk.samsonicus.magitech.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by 5k on 03-10-2016.
 */
public class WorldGenereatorTestBlock implements IWorldGenerator{
    private WorldGenMinable TestBlockGen = new WorldGenMinable(ModBlocks.TEST_BLOCK.getDefaultState(), 32);

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        int x = chunkX * 16;
        int z = chunkZ * 16;
        switch (world.provider.getDimension()){
            case 0:
                generateSurface(world,x,z,random);
                break;
            case -1:
                //NOOP
                break;
            case 1:
                //NOOP
                break;
            default:
                generateSurface(world,x,z,random);
                break;

        }
    }

    private void generateSurface(World world,int x, int z, Random random){
        if (random.nextInt(10) == 0) {
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = world.getTopSolidOrLiquidBlock(new BlockPos(randX,0,randZ)).getY();
            generateTestBlock(world,randX,randY,randZ);
        }
        for (int i = 0; i < 5; i++) {
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = 20 + random.nextInt(40);
            TestBlockGen.generate(world,random,new BlockPos(randX,randY,randZ));
        }
    }

    private void generateTestBlock(World world, int x, int y, int z) {
        if (!world.getBlockState(new BlockPos(x,y,z)).getMaterial().isLiquid()){
            for (int i = 0; i < 10; i++) {
                world.setBlockState(new BlockPos(x, y + i, z), Blocks.OAK_FENCE.getDefaultState(), 2);
            }
            for (int i = 7; i < 10; i++) {
                for (int j = 1; j < 5; j++) {
                    world.setBlockState(new BlockPos(x + j, y + i, z), ModBlocks.TEST_BLOCK.getDefaultState(), 2);
                }
            }
        }
    }
}
