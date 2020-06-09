package com.dxrk.EndetrmMod.init;

import com.dxrk.EndetrmMod.DxrkMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = DxrkMod.Mod_id, bus = Bus.MOD)
@ObjectHolder(DxrkMod.Mod_id)
public class Iteminit {

	public static final Item test_item_1 = null;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry()
				.register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("test_item"));
	}
}
