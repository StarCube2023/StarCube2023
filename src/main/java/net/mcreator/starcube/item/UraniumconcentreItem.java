
package net.mcreator.starcube.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.starcube.init.StarCubeModTabs;

public class UraniumconcentreItem extends Item {
	public UraniumconcentreItem() {
		super(new Item.Properties().tab(StarCubeModTabs.TAB_MUNITIONS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
