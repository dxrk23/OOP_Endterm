package com.dxrk.EndtermMod;

import com.dxrk.EndtermMod.world.gen.RubyOreGen;
import com.dxrk.EndtermMod.world.gen.TopazOreGen;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("dxrkmod")
public class DxrkMod {
	public static final String Mod_id = "dxrkmod";

	public DxrkMod() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		TopazOreGen.generateOre();
		RubyOreGen.generateOre();
	}

	private void doClientStuff(final FMLClientSetupEvent event) {

	}

}
