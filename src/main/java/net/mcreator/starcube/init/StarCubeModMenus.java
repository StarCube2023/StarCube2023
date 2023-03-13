
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcube.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.starcube.world.inventory.ConcentartionGUIMenu;
import net.mcreator.starcube.StarCubeMod;

public class StarCubeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StarCubeMod.MODID);
	public static final RegistryObject<MenuType<ConcentartionGUIMenu>> CONCENTARTION_GUI = REGISTRY.register("concentartion_gui",
			() -> IForgeMenuType.create(ConcentartionGUIMenu::new));
}
