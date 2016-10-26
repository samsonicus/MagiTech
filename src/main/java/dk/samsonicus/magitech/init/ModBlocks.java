package dk.samsonicus.magitech.init;

import dk.samsonicus.magitech.block.BlockCamoMine;
import dk.samsonicus.magitech.block.BlockMagitech;
import dk.samsonicus.magitech.block.BlockMagitechTileEntity;
import dk.samsonicus.magitech.block.BlockTestBlock;
import dk.samsonicus.magitech.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by 5k on 27-09-2016.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    //Normal blocks
    public static final BlockMagitech TEST_BLOCK = new BlockTestBlock();
    //TileEntities
    public static final BlockMagitech CAMOMINE = new BlockCamoMine();


    public static void registerBlocks(){
        createItemBlock(TEST_BLOCK,"test_block");
        createItemBlock(CAMOMINE,"Camomine");
    }

    public static void createItemBlock(Block blockMagitech, String registryName){
        GameRegistry.register(blockMagitech.setRegistryName(registryName));
        GameRegistry.register(new ItemBlock(blockMagitech), blockMagitech.getRegistryName());
    }

    @SideOnly(Side.CLIENT)
    public static void registerBlockrenders(){
        registerBlockRenderFor(TEST_BLOCK);
        registerBlockRenderFor(CAMOMINE);
    }

    public static void registerBlockRenderFor(Block blockMagitech){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockMagitech),0, new ModelResourceLocation(blockMagitech.getUnlocalizedName().substring(5)));
    }
}
