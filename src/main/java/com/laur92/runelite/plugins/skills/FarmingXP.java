package com.laur92.runelite.plugins.skills;

import com.laur92.runelite.plugins.ItemXPConfig;
import com.laur92.runelite.plugins.skills.farming.CompostType;
import com.laur92.runelite.plugins.skills.farming.FarmingItem;
import com.laur92.runelite.plugins.skills.farming.FarmingItems;
import com.laur92.runelite.plugins.skills.farming.FarmingPatchType;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.client.ui.JagexColors;
import net.runelite.client.ui.SkillColor;
import net.runelite.client.util.ColorUtil;

import javax.inject.Inject;

import java.awt.*;
import java.text.DecimalFormat;

import static com.laur92.runelite.plugins.ItemXPPlugin.NEW_LINE;

public class FarmingXP
{
    private final ItemXPConfig config;
    private final Client client;

    private static final Color plantColor = new Color(99, 46, 23);
    private static final Color checkHealthColor = new Color(92, 217, 197);
    private static final Color harvestColor = new Color(18, 121, 7);
    private static final DecimalFormat df = new DecimalFormat("#,##0.#");

    @Inject
    public FarmingXP(ItemXPConfig config, Client client)
    {
        this.config = config;
        this.client = client;
    }

    public StringBuilder getFarmingToolTip(int itemID, int quantity)
    {
        if(!config.showFarmingSkill()) return null;

        FarmingItem item = FarmingItems.getFarmingItem(itemID);
        if(item == null) return null;

        StringBuilder sb = new StringBuilder();
        var currentLevel = client.getBoostedSkillLevel(Skill.FARMING);

        sb.append(ColorUtil.wrapWithColorTag("Farming", SkillColor.FARMING.getColor()));
        if(config.showLevelRequirement()) {
            sb.append(ColorUtil.wrapWithColorTag(" (lv ", JagexColors.DARK_ORANGE_INTERFACE_TEXT));
            sb.append(ColorUtil.wrapWithColorTag(Integer.toString(item.getLevel()), currentLevel >= item.getLevel() ? Color.GREEN : Color.RED));
            sb.append(ColorUtil.wrapWithColorTag(")", JagexColors.DARK_ORANGE_INTERFACE_TEXT));
        }

        sb.append(NEW_LINE);
        sb.append(getPatchType(item));
        sb.append(" patch");
        sb.append(NEW_LINE);

        FarmingXPCalc calc = new FarmingXPCalc(item);

        addPlant(sb, item, calc, quantity);
        addCheckHealth(sb, item, calc);
        addHarvest(sb, item);
        if(config.showFarmingHarvestRange()) addHarvestRange(sb, item, calc);
        if(config.showFarmingExpectedYield()) addExpectedHarvest(sb, item, calc);
        addTotal(sb, item, calc);
        addUseAll(sb, item, calc, quantity);

        return sb;
    }

    private void addPlant(StringBuilder sb, FarmingItem item, FarmingXPCalc calc, int quantity)
    {
        sb.append(ColorUtil.wrapWithColorTag("Plant: ", plantColor));
        sb.append(df.format(calc.getPlantXP()));
        sb.append("xp");
        if(item.getPlantQuantity() > 1)
        {
            sb.append(ColorUtil.wrapWithColorTag(" (", JagexColors.DARK_ORANGE_INTERFACE_TEXT));
            sb.append(ColorUtil.wrapWithColorTag(Integer.toString(item.getPlantQuantity()), quantity >= item.getPlantQuantity() ? Color.GREEN : Color.RED));
            sb.append(ColorUtil.wrapWithColorTag(" seeds)", JagexColors.DARK_ORANGE_INTERFACE_TEXT));
        }
        sb.append(NEW_LINE);
    }

    private void addCheckHealth(StringBuilder sb, FarmingItem item, FarmingXPCalc calc)
    {
        if(item.getCheckHealthXP() > 0)
        {
            sb.append(ColorUtil.wrapWithColorTag("Check Health: ", checkHealthColor));
            sb.append(df.format(calc.checkHealthXP));
            sb.append("xp");
            sb.append(NEW_LINE);
        }
    }

    private void addHarvest(StringBuilder sb, FarmingItem item)
    {
        if(item.getHarvestXP() > 0)
        {
            sb.append(ColorUtil.wrapWithColorTag("Harvest: ", harvestColor));
            sb.append(df.format(item.getHarvestXP()));
            if(item.getPatchType() != FarmingPatchType.FLOWER)
            {
                sb.append("xp per ");
                sb.append(item.getName());
            }
        }
    }

    private void addHarvestRange(StringBuilder sb, FarmingItem item, FarmingXPCalc calc)
    {
        if(calc.minHarvestQuantity == 0 && calc.maxHarvestQuantity == 0) return;

        sb.append(NEW_LINE);
        sb.append(ColorUtil.colorTag(Color.GRAY));

        sb.append("Harvest Range: ");
        if(calc.minHarvestQuantity == 0)
        // we're limited at the top of the range
        {
            sb.append("max ");
            sb.append(calc.maxHarvestQuantity);
            sb.append(" ");
            sb.append(calc.maxHarvestQuantity > 1 ? item.getPlural_name() : item.getName());
            if(item.getPatchType() != FarmingPatchType.FLOWER)
            {
                sb.append(" (max ");
                sb.append(df.format(calc.maxHarvestXP));
                sb.append("xp)");
            }
        }
        else if (calc.minHarvestQuantity == calc.maxHarvestQuantity)
        // we've got an exact number
        {
            sb.append(calc.minHarvestQuantity);
            sb.append(" ");
            sb.append(calc.minHarvestQuantity > 1 ? item.getPlural_name() : item.getName());
            if(item.getPatchType() != FarmingPatchType.FLOWER)
            {
                sb.append(" (");
                sb.append(df.format(calc.minHarvestXP));
                sb.append("xp)");
            }
        }
        else if (calc.maxHarvestQuantity == 0)
        // we're limited at the bottom of the range
        {
            sb.append("min ");
            sb.append(calc.minHarvestQuantity);
            sb.append(" ");
            sb.append(calc.minHarvestQuantity > 1 ? item.getPlural_name() : item.getName());
            if(item.getPatchType() != FarmingPatchType.FLOWER)
            {
                sb.append(" (min ");
                sb.append(df.format(calc.minHarvestXP));
                sb.append("xp)");
            }
        }
        else
        // we have a specific range
        {
            sb.append(calc.minHarvestQuantity);
            sb.append("-");
            sb.append(calc.maxHarvestQuantity);
            sb.append(" ");
            sb.append(calc.maxHarvestQuantity > 1 ? item.getPlural_name() : item.getName());
            if(item.getPatchType() != FarmingPatchType.FLOWER)
            {
                sb.append(" (");
                sb.append(df.format(calc.minHarvestXP));
                sb.append("-");
                sb.append(df.format(calc.maxHarvestXP));
                sb.append("xp)");
            }
        }

        sb.append(ColorUtil.CLOSING_COLOR_TAG);
    }


    private void addExpectedHarvest(StringBuilder sb, FarmingItem item, FarmingXPCalc calc)
    {
        if(calc.expectedHarvestQuantity == 0) return;

        sb.append(NEW_LINE);
        sb.append(ColorUtil.colorTag(Color.ORANGE));

        sb.append("Harvest Expected Yield: ");
        // we've got an exact number
        {
            sb.append(calc.expectedHarvestQuantity);
            sb.append(" ");
            sb.append(calc.expectedHarvestQuantity > 1 ? item.getPlural_name() : item.getName());
            if(item.getPatchType() != FarmingPatchType.FLOWER)
            {
                sb.append(" (");
                sb.append(df.format(calc.expectedHarvestXP));
                sb.append("xp)");
            }
        }

        sb.append(ColorUtil.CLOSING_COLOR_TAG);
    }

    private void addTotal(StringBuilder sb, FarmingItem item, FarmingXPCalc calc)
    {
        sb.append(NEW_LINE);
        sb.append("Total xp: ");

        var minXP = calc.plantXP + calc.checkHealthXP + calc.minHarvestXP;
        var maxXP = calc.plantXP + calc.checkHealthXP + calc.maxHarvestXP;
        var expectedXP = calc.plantXP + calc.checkHealthXP + calc.expectedHarvestXP;

        if(minXP == maxXP)
        {
            sb.append(minXP);
        }
        else
        {
            if(calc.minHarvestXP == 0)
            {
                sb.append("max ");
                sb.append(maxXP);
            }
            else if(calc.maxHarvestXP == 0)
            {
                sb.append("min ");
                sb.append(maxXP);
            }
            else
            {
                sb.append(minXP);
                sb.append("-");
                sb.append(maxXP);
            }

            if(config.showFarmingExpectedYield())
            {
                sb.append(" (expected ");
                sb.append(expectedXP);
                sb.append(")");
            }
        }
    }

    private void addUseAll(StringBuilder sb, FarmingItem item, FarmingXPCalc calc, int quantity)
    {

    }

    private static String getPatchType(FarmingItem item)
    {
        switch(item.getPatchType())
        {
            case ALLOTMENT:
                return "Allotment";
            case FLOWER:
                return "Flower";
            case HERB:
                return "Herb";
            case HOP:
                return "Hops";
            case BUSH:
                return "Bush";
            case TREE:
                return "Tree";
            case FRUIT_TREE:
                return "Fruit tree";
            default:
                return "Unknown";
        }
    }

    @Getter
    private class FarmingXPCalc
    {
        private double plantXP;
        private double checkHealthXP;

        private double minHarvestXP;
        private double maxHarvestXP;
        private double expectedHarvestXP;

        private int minHarvestQuantity;
        private int maxHarvestQuantity;
        private int expectedHarvestQuantity;

        private boolean usesHarvestLives;

        public FarmingXPCalc(FarmingItem item)
        {
            this(item, 1);
        }

        public FarmingXPCalc(FarmingItem item, int numTimes)
        {
            plantXP = item.getPlantXP();
            checkHealthXP = item.getCheckHealthXP();

            CompostType compost = config.compostType().compost;

            switch(item.getPatchType())
            {
                case ALLOTMENT:
                case HERB:
                case HOP:
                    //Harvest Lives
                    minHarvestQuantity = compost.getHarvestLives();
                    usesHarvestLives = true;
                    break;
                case FLOWER:
                case BUSH:
                    //Fixed
                    minHarvestQuantity = item.getMinHarvestQuantity();
                    maxHarvestQuantity = item.getMaxHarvestQuantity();
                    break;
                case TREE:
                    //Harvest not applicable
                    break;
            }

            if(usesHarvestLives)
            {
                expectedHarvestQuantity = 7; //TODO: Calculate this properly. This is a holding value.
            }
            else
            {
                expectedHarvestQuantity = (minHarvestQuantity + maxHarvestQuantity)/2;
            }

            if(item.getPatchType() != FarmingPatchType.FLOWER)
            {
                minHarvestXP = item.getHarvestXP() * minHarvestQuantity;
                maxHarvestXP = item.getHarvestXP() * maxHarvestQuantity;
                expectedHarvestXP = item.getHarvestXP() * expectedHarvestQuantity;
            }
            else
            {
                minHarvestXP = item.getHarvestXP();
                maxHarvestXP = item.getHarvestXP();
                expectedHarvestXP = item.getHarvestXP();
            }
        }
    }
}

