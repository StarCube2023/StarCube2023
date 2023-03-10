
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcube.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.starcube.block.entity.ModuledeconcentrationBlockEntity;
import net.mcreator.starcube.StarCubeMod;

public class StarCubeModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			StarCubeMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> MODULEDECONCENTRATION = register("moduledeconcentration",
			StarCubeModBlocks.MODULEDECONCENTRATION, ModuledeconcentrationBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
