package dk.samsonicus.magitech.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by 5k on 02-10-2016.
 */
public class Recipes {
    public static void registerRecipes(){
        registerShapedRecipes();
        registerShapelessRecipes();
        registerSmeltingRecipes();
    }

    private static void registerShapedRecipes(){
        //For shaped recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.TEST_BLOCK),"TTT", " T ", " T ", 'T',ModItems.TEST_ITEM));
    }
    private static void registerShapelessRecipes(){
        //For shapeless recipes

    }
    private static void registerSmeltingRecipes(){
        //For smelting recipes

    }
}
