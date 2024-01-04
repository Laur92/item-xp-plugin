package com.laur92.runelite.plugins.skills.prayer;

import com.laur92.runelite.plugins.ItemXPConfig;
import com.laur92.runelite.plugins.skills.farming.Compost;
import com.laur92.runelite.plugins.skills.farming.CompostType;
import com.laur92.runelite.plugins.skills.farming.FarmingItem;
import com.laur92.runelite.plugins.skills.farming.FarmingItems;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.SkillColor;
import net.runelite.client.util.ColorUtil;

import javax.inject.Inject;
import java.awt.*;

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
        if(itemID == -1) return null;
        if(!config.showPrayerSkill()) return null;

        PrayerItem item = PrayerItems.getPrayerItem(itemID);

        if(item == null) return null;

        StringBuilder sb = new StringBuilder();
        var currentLevel = client.getRealSkillLevel(Skill.PRAYER);

        sb.append(ColorUtil.wrapWithColorTag("Prayer", SkillColor.PRAYER.getColor()));

        if (config.showLevelRequirement())
        {
            sb.append(ColorUtil.wrapWithColorTag(" (lv ", ColorScheme.BRAND_ORANGE));
            sb.append(ColorUtil.wrapWithColorTag(Integer.toString(item.getLevel()), currentLevel >= item.getLevel() ? Color.GREEN : Color.RED));
            sb.append(ColorUtil.wrapWithColorTag(")", ColorScheme.BRAND_ORANGE));
        }

        //TODO: implement remainder of prayer


        return sb;
    }
}
