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
    String SHOW_STACK_CALCULATIONS = "SHOW_STACK_CALCULATIONS";
    String SHOW_SKILL_FARMING = "SHOW_SKILL_FARMING";
    String SHOW_SKILL_PRAYER = "SHOW_SKILL_PRAYER";
    String FARMING_SHOW_RANGE = "FARMING_SHOW_RANGE";
    String FARMING_SHOW_EXPECTED_YIELD = "FARMING_SHOW_EXPECTED_YIELD";
    String FARMING_COMPOST_TYPE = "FARMING_COMPOST_TYPE";
    String FARMING_MAGIC_SECATEURS = "FARMING_MAGIC_SECATEURS";
    String FARMING_SKILL_CAPE = "FARMING_SKILL_CAPE";
    String FARMING_ATTAS = "FARMING_ATTAS";



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

    @ConfigSection(
            name = "Prayer",
            description = "Prayer specfic settings",
            position = 3,
            closedByDefault = true
    )
    String prayerSkillSection = "PRAYER_SKILL_SECTION";



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
            position = 1,
            keyName = SHOW_STACK_CALCULATIONS,
            name = "Show Stack XP",
            section = overallSection,
            description = "Also show XP for using entire stack in addition to per item"
    )
    default boolean showStackCalculations() { return true; }


    @ConfigItem(
            position = 0,
            keyName = SHOW_SKILL_FARMING,
            name = "Farming",
            section = skillsSection,
            description = "Show farming related XP on items",
            warning = "This plugin does not take into account the effects of disease or death; all plants are assumed to survive"
    )
    default boolean showFarmingSkill()
    {
        return true;
    }
    @ConfigItem(
            position = 1,
            keyName = SHOW_SKILL_PRAYER,
            name = "Prayer",
            section = skillsSection,
            description = "Show prayer related XP on items"
    )
    default boolean showPrayerSkill()
    {
        return true;
    }

    @ConfigItem(
            position = 0,
            keyName = FARMING_SHOW_RANGE,
            name = "Show Yield Range",
            section = farmingSkillSection,
            description = "Show min/max yield from plants"
    )
    default boolean showFarmingYieldRange() { return true; }

    @ConfigItem(
            position = 1,
            keyName = FARMING_SHOW_EXPECTED_YIELD,
            name = "Show Expected Yield",
            section = farmingSkillSection,
            description = "Show the expected number of items harvested for crops",
            warning = "This will be based on other settings in this section"
    )
    default boolean showFarmingExpectedYield() { return true; }

    @ConfigItem(
            position = 2,
            keyName = FARMING_COMPOST_TYPE,
            name = "Compost",
            section = farmingSkillSection,
            description = "The type of compost you use, for harvest calculations"
    )
    default Compost compostType() { return Compost.NONE; }


    @ConfigItem(
            position = 3,
            keyName = FARMING_MAGIC_SECATEURS,
            name = "Magic Secateurs",
            section = farmingSkillSection,
            description = "If you are wielding magic secateurs for harvest bonus"
    )
    default boolean farmingUsingMagicSecateurs() { return false; }

    @ConfigItem(
            position = 4,
            keyName = FARMING_SKILL_CAPE,
            name = "Skill Cape",
            section = farmingSkillSection,
            description = "If you are wearing a farming or max cape"
    )
    default boolean farmingUsingSkillCape() { return false; }

    @ConfigItem(
            position = 5,
            keyName = FARMING_ATTAS,
            name = "Attas Plant",
            section = farmingSkillSection,
            description = "If you have an attas plant growing in the anima patch at the Farming Guild"
    )
    default boolean farmingUsingAttas() { return false; }


}
