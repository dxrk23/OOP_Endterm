package com.dxrk.EndtermMod.init;

import com.dxrk.EndtermMod.DxrkMod;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = DxrkMod.Mod_id, bus = Bus.MOD)
@ObjectHolder(DxrkMod.Mod_id)
public class ItemInit {

	// topaz gem
	public static final Item test_item = null;

	// Tools
	public static final Item topaz_pickaxe = null;
	public static final Item topaz_sword = null;
	public static final Item topaz_axe = null;
	public static final Item topaz_shovel = null;
	public static final Item topaz_hoe = null;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry()
				.register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("test_item"));

		event.getRegistry()
				.register(new SwordItem(TopazTier.TOPAZ, 9, 2.5f, new Item.Properties().group(ItemGroup.COMBAT))
						.setRegistryName("topaz_sword"));

		event.getRegistry()
				.register(new PickaxeItem(TopazTier.TOPAZ, 6, 2.5f, new Item.Properties().group(ItemGroup.TOOLS))
						.setRegistryName("topaz_pickaxe"));

		event.getRegistry()
				.register(new AxeItem(TopazTier.TOPAZ, 12, 1.5f, new Item.Properties().group(ItemGroup.TOOLS))
						.setRegistryName("topaz_axe"));

		event.getRegistry()
				.register(new ShovelItem(TopazTier.TOPAZ, 4, 2.5f, new Item.Properties().group(ItemGroup.TOOLS))
						.setRegistryName("topaz_shovel"));

		event.getRegistry().register(new HoeItem(TopazTier.TOPAZ, 2.5f, new Item.Properties().group(ItemGroup.TOOLS))
				.setRegistryName("topaz_hoe"));
	}

}
