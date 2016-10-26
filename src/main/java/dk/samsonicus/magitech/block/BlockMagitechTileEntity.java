package dk.samsonicus.magitech.block;

import dk.samsonicus.magitech.creativetab.CreativeTabMagitech;
import dk.samsonicus.magitech.reference.Reference;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

/**
 * Created by 5k on 26-10-2016.
 */
public abstract class BlockMagitechTileEntity extends BlockContainer {
    public BlockMagitechTileEntity(Material material){
        super(material);
    }

    public BlockMagitechTileEntity(){
        this(Material.ROCK);
        this.setCreativeTab(CreativeTabMagitech.MAGITECH_TAB);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
