
package net.mcreator.tikuwa.ii.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.tikuwa.ii.world.inventory.FishnetguiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FishnetguiScreen extends AbstractContainerScreen<FishnetguiMenu> {
	private final static HashMap<String, Object> guistate = FishnetguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FishnetguiScreen(FishnetguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tikuwa_ii:textures/screens/fishnetgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("tikuwa_ii:textures/screens/fish_net_gui_feeds.png"), this.leftPos + 6, this.topPos + 16, 0, 0, 64, 64, 64, 64);

		guiGraphics.blit(new ResourceLocation("tikuwa_ii:textures/screens/feed.png"), this.leftPos + 141, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("tikuwa_ii:textures/screens/gold_feed.png"), this.leftPos + 124, this.topPos + 40, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("tikuwa_ii:textures/screens/gui_fish_net_chest.png"), this.leftPos + 16, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(font, Component.translatable("gui.tikuwa_ii.fishnetgui.label_fish_net"), 69, 3, -10066330);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
