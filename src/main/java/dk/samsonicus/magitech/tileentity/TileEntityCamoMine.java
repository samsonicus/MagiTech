package dk.samsonicus.magitech.tileentity;


import dk.samsonicus.magitech.utility.LogHelper;
import dk.samsonicus.magitech.utility.NBTHelper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

/**
 * Created by 5k on 26-10-2016.
 */
public class TileEntityCamoMine extends TileEntity implements ITickable {

    private int timer = 60;

    @Override
    public void update() {
        timer--;
        LogHelper.info(timer);
        if(timer == 0 && !worldObj.isRemote){
            worldObj.createExplosion(null,pos.getX() + 0.5,pos.getY()+0.5,pos.getZ()+0.5,3f,true);
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);
        timer = compound.getInteger("timer");

    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound){
        super.writeToNBT(compound);
        compound.setInteger("timer",timer);
        return compound;
    }


}
