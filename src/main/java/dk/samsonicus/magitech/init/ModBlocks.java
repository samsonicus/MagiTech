package dk.samsonicus.magitech.init;

import dk.samsonicus.magitech.block.BlockMagitech;
import dk.samsonicus.magitech.block.BlockTestBlock;
import dk.samsonicus.magitech.reference.Reference;
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
    public static final BlockMagitech TEST_BLOCK = new BlockTestBlock();


    public static void registerBlocks(){
        createItemBlock(TEST_BLOCK,"test_block");
    }

    public static void createItemBlock(BlockMagitech blockMagitech, String registryName){
        GameRegistry.register(blockMagitech.setRegistryName(registryName));
        GameRegistry.register(new ItemBlock(blockMagitech), blockMagitech.getRegistryName());
    }

    @SideOnly(Side.CLIENT)
    public static void registerBlockrenders(){
        registerBlockRenderFor(TEST_BLOCK);
    }

    public static void registerBlockRenderFor(BlockMagitech blockMagitech){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockMagitech),0, new ModelResourceLocation(blockMagitech.getUnlocalizedName().substring(5)));
    }
}
