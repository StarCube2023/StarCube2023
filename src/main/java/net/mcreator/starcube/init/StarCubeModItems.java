
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcube.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.starcube.item.UraniumconcentreItem;
import net.mcreator.starcube.item.UraniumItem;
import net.mcreator.starcube.item.JarositeingotItem;
import net.mcreator.starcube.item.Douille9mmItem;
import net.mcreator.starcube.item.Chargeur9mmItem;
import net.mcreator.starcube.StarCubeMod;

public class StarCubeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StarCubeMod.MODID);
	public static final RegistryObject<Item> URANIUM_BLOCK = block(StarCubeModBlocks.URANIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> JAROSITE_BLOCK = block(StarCubeModBlocks.JAROSITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> JAROSITEINGOT = REGISTRY.register("jarositeingot", () -> new JarositeingotItem());
	public static final RegistryObject<Item> URANIUMCONCENTRE = REGISTRY.register("uraniumconcentre", () -> new UraniumconcentreItem());
	public static final RegistryObject<Item> DOUILLE_9MM = REGISTRY.register("douille_9mm", () -> new Douille9mmItem());
	public static final RegistryObject<Item> CHARGEUR_9MM = REGISTRY.register("chargeur_9mm", () -> new Chargeur9mmItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
