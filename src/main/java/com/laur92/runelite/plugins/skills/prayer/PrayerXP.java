package com.laur92.runelite.plugins.skills.prayer;

import com.laur92.runelite.plugins.ItemXPConfig;
import net.runelite.api.Client;

import javax.inject.Inject;

public class PrayerXP
{
    /* gilded: 2.5-3-3.5; chaos: 3.5(x2); sinster: 3 */

    private final ItemXPConfig config;
    private final Client client;

    @Inject
    public PrayerXP(ItemXPConfig config, Client client)
    {
        this.config = config;
        this.client = client;
    }

    public StringBuilder getPrayerToolTip(int itemID, int quantity)
    {
        //TODO: implement
        return null;
    }
}
