package com.kamesuta.mc.bnnwidget.compat;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.ResourceLocation;

public class Compat {
	public static PositionedSoundRecord createClickSound() {
		throw new IllegalStateException("Not Compatible");
	}

	public static class CompatGuiTextField extends GuiTextField {
		public CompatGuiTextField() {
			super(1, Minecraft_font(), 0, 0, 0, 0);
			throw new IllegalStateException("Not Compatible");
		}

		public int getX() {
			throw new IllegalStateException("Not Compatible");
		}

		public void setX(final int value) {
			throw new IllegalStateException("Not Compatible");
		}

		public int getY() {
			throw new IllegalStateException("Not Compatible");
		}

		public void setY(final int value) {
			throw new IllegalStateException("Not Compatible");
		}
	}

	public static abstract class CompatFontRenderer extends FontRenderer {
		public CompatFontRenderer(final GameSettings gameSettingsIn, final ResourceLocation location, final TextureManager textureManagerIn, final boolean unicode) {
			super(gameSettingsIn, location, textureManagerIn, unicode);
			throw new IllegalStateException("Not Compatible");
		}

		@Override
		public int drawStringWithShadow(@Nullable final String str, final float x, final float y, final int color) {
			throw new IllegalStateException("Not Compatible");
		}

		protected abstract int drawStringWithShadowCompat(@Nullable final String str, final float x, final float y, final int color);

		@Override
		public int drawString(@Nullable final String str, final float x, final float y, final int color, final boolean shadow) {
			throw new IllegalStateException("Not Compatible");
		}

		protected abstract int drawStringCompat(@Nullable final String str, final float x, final float y, final int color, final boolean shadow);

		@Override
		public int getWordWrappedHeight(final String str, final int maxLength) {
			throw new IllegalStateException("Not Compatible");
		}

		public abstract int getWordWrappedHeightCompat(final String str, final int maxLength);
	}

	public static @Nonnull Minecraft getMinecraft() {
		throw new IllegalStateException("Not Compatible");
	}

	public static @Nonnull FontRenderer Minecraft_font() {
		throw new IllegalStateException("Not Compatible");
	}

	public static @Nonnull WVertex getWVertex() {
		throw new IllegalStateException("Not Compatible");
	}

	public static int getStringWidthWithoutFormattingCodes(final @Nonnull String s) {
		throw new IllegalStateException("Not Compatible");
	}
}