package com.laur92.runelite.plugins;

import com.laur92.runelite.plugins.skills.farming.Compost;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("itemXP")
public interface ItemXPConfig extends Config
{
    String SHOW_LEVEL_REQUIREMENT = "SHOW_LEVEL_REQUIREMENT";
    String SHOW_SKILL_FARMING = "SHOW_SKILL_FARMING";
    String FARMING_SHOW_RANGE = "FARMING_SHOW_RANGE";
    String FARMING_SHOW_EXPECTED_YIELD = "FARMING_SHOW_EXPECTED_YIELD";
    String FARMING_COMPOST_TYPE = "FARMING_COMPOST_TYPE";



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

    @ConfigSection(
            name = "Farming",
            description = "Farming specfic settings",
            position = 2,
            closedByDefault = true
    )
    String farmingSkillSection = "FARMING_SKILL_SECTION";



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

    @ConfigItem(
            position = 0,
            keyName = FARMING_SHOW_RANGE,
            name = "Show Harvest Range",
            section = farmingSkillSection,
            description = "Show the min/max yield from plants"
    )
    default boolean showFarmingHarvestRange() { return true; }

    @ConfigItem(
            position = 1,
            keyName = FARMING_SHOW_EXPECTED_YIELD,
            name = "Show Expected Harvest",
            section = farmingSkillSection,
            description = "Show the average expected yield for a crop, see below values"
    )
    default boolean showFarmingExpectedYield() { return true; }

    @ConfigItem(
            position = 2,
            keyName = FARMING_COMPOST_TYPE,
            name = "Type of compost used",
            section = farmingSkillSection,
            description = "The type of compost you use, for expected yield calculations"
    )
    default Compost compostType() { return Compost.NONE; }

}
