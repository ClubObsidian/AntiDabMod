package com.clubobsidian.antidabmod;

import com.clubobsidian.antidabmod.listener.AntiDabListener;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid="antidabmod", name="AntiDabMod")
public class AntiDabMod {

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		MinecraftForge.EVENT_BUS.register(new AntiDabListener());
    }
}