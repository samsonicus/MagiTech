package dk.samsonicus.magitech.init;

import dk.samsonicus.magitech.item.ItemMagitech;
import dk.samsonicus.magitech.item.ItemTestItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by 5k on 21-09-2016.
 */
public class ModItems {
    public static final ItemMagitech TEST_ITEM = new ItemTestItem();

    public static void registerItem(){
        GameRegistry.register(TEST_ITEM.setRegistryName("test_item"));
    }

    public static void registerItemRenders(){
        registerItemRenderFor(TEST_ITEM);
    }
    public static void registerItemRenderFor(ItemMagitech itemMagitech){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemMagitech,0, new ModelResourceLocation(itemMagitech.getUnlocalizedName().substring(5),"inventory"));
    }

}
