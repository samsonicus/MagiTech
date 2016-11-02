package dk.samsonicus.magitech.block;

import dk.samsonicus.magitech.creativetab.CreativeTabMagitech;
import dk.samsonicus.magitech.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;



/**
 * Created by 5k on 27-09-2016.
 */
public class BlockMagitech extends Block {
    public BlockMagitech(Material material){
        super(material);
        this.setCreativeTab(CreativeTabMagitech.MAGITECH_TAB);
    }

    public BlockMagitech(){
        this(Material.ROCK);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

