package com.mjr.extraplanets.planets.Uranus.worldgen.biomes;

import java.util.List;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;

import com.google.common.collect.Lists;
import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;
import com.mjr.extraplanets.planets.Uranus.worldgen.UranusBiomes;

public class BiomeGenUranusFrozenWaterSea extends UranusBiomes {

	public BiomeGenUranusFrozenWaterSea(int var1) {
		super(var1);
		if (Config.REGISTER_BIOME_TYPES)
			BiomeDictionary.registerBiomeType(this, BiomeDictionary.Type.COLD, BiomeDictionary.Type.WET, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.OCEAN);
		this.topBlock = ExtraPlanets_Blocks.URANUS_BLOCKS.getDefaultState();
		this.fillerBlock = ExtraPlanets_Blocks.URANUS_BLOCKS.getStateFromMeta(1);
	}

	@Override
	public List<BiomeGenBase.SpawnListEntry> getSpawnableList(EnumCreatureType creatureType) {
		return Lists.<BiomeGenBase.SpawnListEntry> newArrayList();
	}
}
