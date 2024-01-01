package com.laur92.runelite.plugins;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("itemXP")
public interface ItemXPConfig extends Config
{
    String SHOW_LEVEL_REQUIREMENT = "SHOW_LEVEL_REQUIREMENT";
    String SHOW_SKILL_FARMING = "SHOW_SKILL_FARMING";



    @ConfigSection(
            name = "Overall",
            description = "Overall settings for all tooltips",
            position = 0
    )
    String overallSection = "OVERALL_SECTION";

    @ConfigSection(
            name = "Skills",
            description = "Settings to turn on/off specific skills",
            position = 1
    )
    String skillsSection = "SKILLS_SECTION";



    @ConfigItem(
            position = 0,
            keyName = SHOW_LEVEL_REQUIREMENT,
            name = "Show Level Requirement",
            section = overallSection,
            description = "Configure whether to show the level requirement to use an item"
    )
    default boolean showLevelRequirement()
    {
        return true;
    }


    @ConfigItem(
            position = 0,
            keyName = SHOW_SKILL_FARMING,
            name = "Farming",
            section = skillsSection,
            description = "Show farming related XP on items"
    )
    default boolean showFarmingSkill()
    {
        return true;
    }
}
