package dk.samsonicus.magitech.block;

import dk.samsonicus.magitech.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by 5k on 27-09-2016.
 */
public class BlockMagitech extends Block {
    public BlockMagitech(Material material){
        super(material);
    }

    public BlockMagitech(){
        this(Material.ROCK);
        this.setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

