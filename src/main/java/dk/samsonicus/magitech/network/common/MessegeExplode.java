package dk.samsonicus.magitech.network.common;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by 5k on 26-10-2016.
 */
public class MessegeExplode extends MessegeBase<MessegeExplode> {

    private float explosionSize;

    public MessegeExplode(){}

    public MessegeExplode(float explosionSize){
        this.explosionSize = explosionSize;
    }

    @Override
    public void handleClientSide(MessegeExplode message, EntityPlayer player) {

    }

    @Override
    public void handleServerSide(MessegeExplode message, EntityPlayer player) {
        player.worldObj.createExplosion(player,player.posX,player.posY-10,player.posZ,message.explosionSize,true);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        explosionSize = buf.readFloat();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeFloat(explosionSize);
    }
}
