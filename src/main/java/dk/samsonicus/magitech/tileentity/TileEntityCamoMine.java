package dk.samsonicus.magitech.tileentity;




import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.model.ModelLoader;


import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by 5k on 26-10-2016.
 */
public class TileEntityCamoMine extends TileEntityMagitech implements ITickable {

    private int timer = 60;
    private ItemStack camoStack;

    @Override
    public void update() {
        if (timer > 0) timer--;
        if(timer <= 0 && !worldObj.isRemote){
            List<Entity> entities = worldObj.getEntitiesWithinAABB(Entity.class,new AxisAlignedBB(getPos()).expandXyz(1));
            if (entities.size()>0) {
                worldObj.createExplosion(null, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 3f, true);
            }
        }
    }

    public void setCamouflage(ItemStack camoStack) {
        this.camoStack = camoStack;
        this.markDirty();
        this.refreshBlock();
    }

    public void refreshBlock(){
        if(worldObj != null){
            IBlockState state = worldObj.getBlockState(getPos());
            worldObj.notifyBlockUpdate(getPos(),state,state,3);
        }
    }

    public ItemStack getCamouflage() {
        return camoStack;
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        return writeToNBT(new NBTTagCompound());
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        NBTTagCompound tagCompound = new NBTTagCompound();
        this.writeToNBT(tagCompound);
        return new SPacketUpdateTileEntity(getPos(),1,tagCompound);
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        this.readFromNBT(pkt.getNbtCompound());
    }

    @Override
    public void readFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);
        timer = compound.getInteger("timer");
        if (compound.hasKey("camoStack")){
            camoStack = ItemStack.loadItemStackFromNBT(compound.getCompoundTag("camoStack"));
        }   else {
            camoStack = null;
        }


    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("timer",timer);
        if (camoStack != null) {
            NBTTagCompound t = new NBTTagCompound();
            camoStack.writeToNBT(t);
            compound.setTag("camoStack", t);
        }
        return compound;
    }
}
