package com.laur92.runelite.plugins;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ItemXPPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ItemXPPlugin.class);
		RuneLite.main(args);
	}
}