/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tikuwa.ii.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tikuwa.ii.item.TikuwaSemiconductorItem;
import net.mcreator.tikuwa.ii.item.TikuwaItem;
import net.mcreator.tikuwa.ii.item.TikuwaBreadItem;
import net.mcreator.tikuwa.ii.item.SatumaAgeItem;
import net.mcreator.tikuwa.ii.item.MashedFishItem;
import net.mcreator.tikuwa.ii.item.FishfeednormalItem;
import net.mcreator.tikuwa.ii.TikuwaIiMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class TikuwaIiModItems {
	public static Item MASHED_FISH;
	public static Item TIKUWA;
	public static Item TIKUWA_BREAD;
	public static Item TIKUWA_BLOCK;
	public static Item FISHFEEDNORMAL;
	public static Item TIKUWA_SEMICONDUCTOR;
<<<<<<< HEAD
	public static Item FISHNET;
=======
	public static Item SATUMA_AGE;
>>>>>>> 9566dc02338c20c1409e2debfccd683f377ac068

	public static void load() {
		MASHED_FISH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TikuwaIiMod.MODID, "mashed_fish"), new MashedFishItem());
		TIKUWA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TikuwaIiMod.MODID, "tikuwa"), new TikuwaItem());
		TIKUWA_BREAD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TikuwaIiMod.MODID, "tikuwa_bread"), new TikuwaBreadItem());
		TIKUWA_BLOCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TikuwaIiMod.MODID, "tikuwa_block"), new BlockItem(TikuwaIiModBlocks.TIKUWA_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(TIKUWA_BLOCK));
		FISHFEEDNORMAL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TikuwaIiMod.MODID, "fishfeednormal"), new FishfeednormalItem());
		TIKUWA_SEMICONDUCTOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TikuwaIiMod.MODID, "tikuwa_semiconductor"), new TikuwaSemiconductorItem());
<<<<<<< HEAD
		FISHNET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TikuwaIiMod.MODID, "fishnet"), new BlockItem(TikuwaIiModBlocks.FISHNET, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.accept(FISHNET));
=======
		SATUMA_AGE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TikuwaIiMod.MODID, "satuma_age"), new SatumaAgeItem());
>>>>>>> 9566dc02338c20c1409e2debfccd683f377ac068
	}

	public static void clientLoad() {
	}
}
