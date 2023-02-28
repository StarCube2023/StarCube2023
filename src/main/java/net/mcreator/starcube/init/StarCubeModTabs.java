
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcube.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class StarCubeModTabs {
	public static CreativeModeTab TAB_MUNITIONS;

	public static void load() {
		TAB_MUNITIONS = new CreativeModeTab("tabmunitions") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.CAMPFIRE);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
