package com.laur92.runelite.plugins;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Item XP",
	description = "A plugin that adds xp potential tooltips on items",
	tags = {"item", "xp"}
)
@Slf4j
public class ItemXPPlugin extends Plugin
{
	@Inject	private ItemXPOverlay overlay;
	@Inject	private OverlayManager overlayManager;

	public static final String NEW_LINE = "</br>";

	@Override
	protected void startUp()
	{
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(overlay);
	}

	@Provides
	ItemXPConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ItemXPConfig.class);
	}
}
