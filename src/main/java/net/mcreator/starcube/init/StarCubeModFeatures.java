
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcube.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.starcube.world.features.ores.UraniumBlockFeature;
import net.mcreator.starcube.world.features.ores.JarositeBlockFeature;
import net.mcreator.starcube.StarCubeMod;

@Mod.EventBusSubscriber
public class StarCubeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, StarCubeMod.MODID);
	public static final RegistryObject<Feature<?>> URANIUM_BLOCK = REGISTRY.register("uranium_block", UraniumBlockFeature::feature);
	public static final RegistryObject<Feature<?>> JAROSITE_BLOCK = REGISTRY.register("jarosite_block", JarositeBlockFeature::feature);
}
