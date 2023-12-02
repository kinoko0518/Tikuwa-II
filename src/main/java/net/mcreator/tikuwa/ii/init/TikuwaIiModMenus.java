
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tikuwa.ii.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tikuwa.ii.world.inventory.FishnetguiMenu;
import net.mcreator.tikuwa.ii.TikuwaIiMod;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

public class TikuwaIiModMenus {
	public static MenuType<FishnetguiMenu> FISHNETGUI;

	public static void load() {
		FISHNETGUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(TikuwaIiMod.MODID, "fishnetgui"), new ExtendedScreenHandlerType<>(FishnetguiMenu::new));
		FishnetguiMenu.screenInit();
	}
}
