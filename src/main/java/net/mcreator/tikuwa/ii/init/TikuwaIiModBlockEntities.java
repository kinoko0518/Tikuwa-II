
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tikuwa.ii.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tikuwa.ii.block.entity.FishnetBlockEntity;
import net.mcreator.tikuwa.ii.TikuwaIiMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class TikuwaIiModBlockEntities {
	public static BlockEntityType<?> FISHNET;

	public static void load() {
		FISHNET = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(TikuwaIiMod.MODID, "fishnet"), FabricBlockEntityTypeBuilder.create(FishnetBlockEntity::new, TikuwaIiModBlocks.FISHNET).build(null));
	}
}
