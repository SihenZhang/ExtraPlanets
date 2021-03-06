package com.mjr.extraplanets.world.features;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;
import com.mjr.extraplanets.blocks.fluid.ExtraPlanets_Fluids;
import com.mjr.extraplanets.util.MessageUtilities;
import com.mjr.extraplanets.util.WorldGenHelper;

public class WorldGenFrozenNitrogenPile extends WorldGenerator {

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		if (WorldGenHelper.checkValidSpawn(world, x, y, z, 10) == false)
			return false;
		else {
			if (Config.debugMode)
				MessageUtilities.debugMessageToLog("Spawning Frozen Nitrogen Pile at (x, y, z)" + x + " " + y + " " + z);
			generatreStructure(world, rand, x, y, z);
		}
		return true;
	}

	public boolean generatreStructure(World world, Random rand, int x, int y, int z) {
		world.setBlock(x + 0, y + 0, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 0, y + 0, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 0, y + 0, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 1, y + 0, z + 1, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 1, y + 0, z + 2, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 1, y + 0, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 1, y + 0, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 1, y + 0, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 0, z + 0, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 0, z + 1, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 0, z + 2, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 0, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 0, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 0, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 0, z + 6, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 0, z + 7, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 1, z + 2, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 1, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 1, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 2, y + 1, z + 5, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 2, y + 2, z + 2, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 2, y + 2, z + 3, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 2, y + 2, z + 4, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 2, y + 2, z + 5, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 2, y + 2, z + 6, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 2, y + 3, z + 3, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 2, y + 3, z + 4, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 2, y + 3, z + 5, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 3, y + 0, z + 1, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 0, z + 2, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 0, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 0, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 0, z + 6, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 0, z + 7, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 1, z + 2, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 1, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 1, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 1, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 1, z + 6, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 2, z + 2, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 3, y + 2, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 2, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 2, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 3, y + 2, z + 6, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 3, y + 3, z + 2, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 3, y + 3, z + 3, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 3, y + 3, z + 4, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 3, y + 3, z + 5, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 3, y + 3, z + 6, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 4, y + 0, z + 0, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 0, z + 1, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 0, z + 2, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 0, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 0, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 0, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 0, z + 6, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 0, z + 7, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 0, z + 8, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 1, z + 2, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 1, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 1, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 1, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 1, z + 6, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 2, z + 2, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 4, y + 2, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 2, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 2, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 4, y + 2, z + 6, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 4, y + 3, z + 2, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 4, y + 3, z + 3, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 4, y + 3, z + 4, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 4, y + 3, z + 5, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 4, y + 3, z + 6, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 5, y + 0, z + 1, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 5, y + 0, z + 2, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 5, y + 0, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 5, y + 0, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 5, y + 0, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 5, y + 0, z + 6, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 5, y + 1, z + 2, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 5, y + 1, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 5, y + 1, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 5, y + 1, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 5, y + 1, z + 6, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 5, y + 2, z + 2, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 5, y + 2, z + 3, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 5, y + 2, z + 4, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 5, y + 2, z + 5, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 5, y + 2, z + 6, ExtraPlanets_Fluids.nitrogen, 0, 3);
		world.setBlock(x + 5, y + 3, z + 3, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 5, y + 3, z + 4, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 5, y + 3, z + 5, ExtraPlanets_Fluids.nitrogen, 1, 3);
		world.setBlock(x + 6, y + 0, z + 1, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 6, y + 0, z + 2, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 6, y + 0, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 6, y + 0, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 6, y + 0, z + 5, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 7, y + 0, z + 3, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		world.setBlock(x + 7, y + 0, z + 4, ExtraPlanets_Blocks.frozenNitrogen, 0, 3);
		return true;
	}
}