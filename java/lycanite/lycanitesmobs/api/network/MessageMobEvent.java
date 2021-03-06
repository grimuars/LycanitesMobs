package lycanite.lycanitesmobs.api.network;

import io.netty.buffer.ByteBuf;

import java.io.IOException;

import lycanite.lycanitesmobs.ExtendedWorld;
import lycanite.lycanitesmobs.LycanitesMobs;
import lycanite.lycanitesmobs.api.mobevent.MobEventBase;
import lycanite.lycanitesmobs.api.mobevent.MobEventManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;

public class MessageMobEvent implements IMessage, IMessageHandler<MessageMobEvent, IMessage> {
	public String mobEventName;


	// ==================================================
	//                    Constructors
	// ==================================================
	public MessageMobEvent() {}
	public MessageMobEvent(MobEventBase mobEvent) {
        if(mobEvent != null)
		    this.mobEventName = mobEvent.name;
        else
            this.mobEventName = "";
    }
	
	
	// ==================================================
	//                    On Message
	// ==================================================
	/**
	 * Called when this message is received.
	 */
	@Override
	public IMessage onMessage(MessageMobEvent message, MessageContext ctx) {
		if(ctx.side != Side.CLIENT) return null;
		EntityPlayer player = LycanitesMobs.proxy.getClientPlayer();
		World world = player.worldObj;
		
		if("".equals(message.mobEventName))
			MobEventManager.instance.stopMobEvent();
		else {
			MobEventManager.instance.startMobEvent(message.mobEventName, world);
		}
		return null;
	}
	
	
	// ==================================================
	//                    From Bytes
	// ==================================================
	/**
	 * Reads the message from bytes.
	 */
	@Override
	public void fromBytes(ByteBuf buf) {
		PacketBuffer packet = new PacketBuffer(buf);
        try {
		    this.mobEventName = packet.readStringFromBuffer(256);
        } catch (IOException e) {
            LycanitesMobs.printWarning("", "There was a problem decoding the packet: " + packet + ".");
            e.printStackTrace();
        }
	}
	
	
	// ==================================================
	//                     To Bytes
	// ==================================================
	/**
	 * Writes the message into bytes.
	 */
	@Override
	public void toBytes(ByteBuf buf) {
		PacketBuffer packet = new PacketBuffer(buf);
        try {
		    packet.writeStringToBuffer(this.mobEventName);
        } catch (IOException e) {
            LycanitesMobs.printWarning("", "There was a problem encoding the packet: " + packet + ".");
            e.printStackTrace();
        }
	}
	
}
