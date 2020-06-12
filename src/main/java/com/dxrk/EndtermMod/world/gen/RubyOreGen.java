package com.dxrk.EndtermMod.world.gen;

import com.dxrk.EndtermMod.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class RubyOreGen {
	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			biome.addFeature(Decoration.UNDERGROUND_ORES,
					Feature.ORE
							.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
									BlockInit.ruby_ore.getDefaultState(), 10))
							.withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 5, 0, 100))));
		}
	}
}