package dk.samsonicus.magitech.tileentity;


import dk.samsonicus.magitech.utility.LogHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.List;

/**
 * Created by 5k on 26-10-2016.
 */
public class TileEntityCamoMine extends TileEntity implements ITickable {

    private int timer = 60;

    @Override
    public void update() {
        if (timer > 0) timer--;
        //LogHelper.info(timer);
        if(timer <= 0 && !worldObj.isRemote){
            List<Entity> entities = worldObj.getEntitiesWithinAABB(Entity.class,new AxisAlignedBB(getPos()).expandXyz(1));
            if (entities.size()>0) {
                worldObj.createExplosion(null, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 3f, true);
            }
        }
    }


    @Override
    public void readFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);
        timer = compound.getInteger("timer");


    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("timer",timer);
        return compound;
    }
}
