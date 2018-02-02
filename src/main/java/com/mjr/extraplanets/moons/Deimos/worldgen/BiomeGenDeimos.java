package com.mjr.extraplanets.moons.Deimos.worldgen;

import com.mjr.extraplanets.Config;

import net.minecraftforge.common.BiomeDictionary;

public class BiomeGenDeimos extends DeimosBiomes {

	public BiomeGenDeimos(int par1) {
		super(par1);
		if (Config.REGISTER_BIOME_TYPES)
			BiomeDictionary.registerBiomeType(this, BiomeDictionary.Type.COLD, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DEAD);
	}
}
