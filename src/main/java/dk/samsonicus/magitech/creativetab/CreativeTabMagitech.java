package dk.samsonicus.magitech.creativetab;

import dk.samsonicus.magitech.init.ModItems;
import dk.samsonicus.magitech.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by 5k on 28-09-2016.
 */
public class CreativeTabMagitech {
    public static final CreativeTabs MAGITECH_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItems.TEST_ITEM);
        }
    };
}
