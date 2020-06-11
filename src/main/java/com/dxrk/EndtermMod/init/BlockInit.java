package com.dxrk.EndtermMod.init;

import com.dxrk.EndtermMod.DxrkMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(DxrkMod.Mod_id)
@Mod.EventBusSubscriber(modid = DxrkMod.Mod_id, bus = Bus.MOD)
public class BlockInit {
	public static final Block topaz_ore = null;

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry()
				.register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.7f, 15.0f)
						.sound(SoundType.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE)).setRegistryName("topaz_ore"));
	}

	@SubscribeEvent
	public static void registerBlockItem(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(
				new BlockItem(topaz_ore, new Item.Properties().maxStackSize(64).group(ItemGroup.DECORATIONS))
						.setRegistryName("topaz_ore"));
	}
}
