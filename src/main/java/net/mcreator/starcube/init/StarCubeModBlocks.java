
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcube.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.starcube.block.UraniumBlockBlock;
import net.mcreator.starcube.StarCubeMod;

public class StarCubeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StarCubeMod.MODID);
	public static final RegistryObject<Block> URANIUM_BLOCK = REGISTRY.register("uranium_block", () -> new UraniumBlockBlock());
}