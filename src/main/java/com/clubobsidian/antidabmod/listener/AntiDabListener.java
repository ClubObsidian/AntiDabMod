package com.clubobsidian.antidabmod.listener;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AntiDabListener {

	@SubscribeEvent
	public void listenForDab(ClientChatReceivedEvent e)
	{
		IChatComponent comp  = e.message;
		String msg = comp.getFormattedText();
		if(msg.contains("<o/") || msg.contains("\\o>"))
		{
			msg = msg.replace("<o/", "xd")
					 .replace("\\o>", "xd");
			e.setCanceled(true);
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(msg));
		}
	}
}