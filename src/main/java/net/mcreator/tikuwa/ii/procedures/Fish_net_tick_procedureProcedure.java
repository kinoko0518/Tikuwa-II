package net.mcreator.tikuwa.ii.procedures;

import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.tikuwa.ii.init.TikuwaIiModItems;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.concurrent.atomic.AtomicReference;

public class Fish_net_tick_procedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		while (TikuwaIiModItems.FISHFEEDNORMAL == (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() || TikuwaIiModItems.FISHFEEDNORMAL == (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() || TikuwaIiModItems.FISHFEEDNORMAL == (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getItem()) {
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 10) {
							if (Mth.nextInt(RandomSource.create(), 1, 100) <= 1) {
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									ItemStack stack = new ItemStack(Items.COD);
									stack.setCount(1);
									if (_ent != null) {
										((RandomizableContainerBlockEntity) _ent).setItem(0, stack);
									}
								}
							}
							return;
						}
					});
				}
			}.startDelay(world);
		}
	}
}
