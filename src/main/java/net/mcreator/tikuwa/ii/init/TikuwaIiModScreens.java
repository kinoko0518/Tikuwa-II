
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tikuwa.ii.init;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.tikuwa.ii.client.gui.FishnetguiScreen;

public class TikuwaIiModScreens {
	public static void load() {
		MenuScreens.register(TikuwaIiModMenus.FISHNETGUI, FishnetguiScreen::new);
	}
}
