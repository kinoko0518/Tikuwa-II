
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tikuwa.ii.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tikuwa.ii.block.TikuwaBlockBlock;
import net.mcreator.tikuwa.ii.TikuwaIiMod;

public class TikuwaIiModBlocks {
	public static Block TIKUWA_BLOCK;

	public static void load() {
		TIKUWA_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TikuwaIiMod.MODID, "tikuwa_block"), new TikuwaBlockBlock());
	}

	public static void clientLoad() {
		TikuwaBlockBlock.clientInit();
	}
}
