package dk.samsonicus.magitech.init;

import dk.samsonicus.magitech.item.ItemMagitech;
import dk.samsonicus.magitech.item.ItemTestItem;
import dk.samsonicus.magitech.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by 5k on 21-09-2016.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemMagitech TEST_ITEM = new ItemTestItem();

    public static void registerItems(){
        GameRegistry.register(TEST_ITEM.setRegistryName("test_item"));
    }
    @SideOnly(Side.CLIENT)
    public static void registerItemRenders(){
        registerItemRenderFor(TEST_ITEM);
    }

    public static void registerItemRenderFor(ItemMagitech itemMagitech){
        ModelLoader.setCustomModelResourceLocation(itemMagitech, 0,new ModelResourceLocation(itemMagitech.getUnlocalizedName().substring(5)));
    }

}
