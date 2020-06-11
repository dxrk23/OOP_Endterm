package com.dxrk.EndtermMod.world.gen;

import com.dxrk.EndtermMod.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class TopazOreGen {
	public static void generatrOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			ConfiguredPlacement CustomConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 10, 0, 100));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
					Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockInit.topaz_ore.getDefaultState(), 8)).withPlacement(CustomConfig));
		}
	}
}
