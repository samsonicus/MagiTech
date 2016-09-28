package dk.samsonicus.magitech.item;

import dk.samsonicus.magitech.creativetab.CreativeTabMagitech;
import dk.samsonicus.magitech.reference.Reference;
import dk.samsonicus.magitech.utility.LogHelper;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by 5k on 21-09-2016.
 */
public class ItemMagitech extends Item {
    public ItemMagitech(){
        super();
        this.setCreativeTab(CreativeTabMagitech.MAGITECH_TAB);
    }
    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s:%s", Reference.MOD_ID.toLowerCase(),getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s:%s", Reference.MOD_ID.toLowerCase(),getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
