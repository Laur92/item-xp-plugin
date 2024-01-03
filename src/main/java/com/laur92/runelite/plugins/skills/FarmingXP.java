package com.laur92.runelite.plugins.skills;

import com.laur92.runelite.plugins.ItemXPConfig;
import com.laur92.runelite.plugins.skills.farming.FarmingItem;
import com.laur92.runelite.plugins.skills.farming.FarmingItems;
import com.laur92.runelite.plugins.skills.farming.FarmingPatchType;
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

        addPlant(sb, item, quantity);
        addCheckHealth(sb, item);
        addHarvest(sb, item);
        addTotal(sb, item);
        addUseAll(sb, item, quantity);

        return sb;
    }

    private static void addPlant(StringBuilder sb, FarmingItem item, int quantity)
    {
        sb.append(ColorUtil.wrapWithColorTag("Plant: ", plantColor));
        sb.append(df.format(item.getPlantXP()));
        sb.append("xp");
        if(item.getPlantQuantity() > 1)
        {
            sb.append(ColorUtil.wrapWithColorTag(" (", JagexColors.DARK_ORANGE_INTERFACE_TEXT));
            sb.append(ColorUtil.wrapWithColorTag(Integer.toString(item.getPlantQuantity()), quantity >= item.getPlantQuantity() ? Color.GREEN : Color.RED));
            sb.append(item.getPlantQuantity());
            sb.append(ColorUtil.wrapWithColorTag(" seeds)", JagexColors.DARK_ORANGE_INTERFACE_TEXT));
        }
        sb.append(NEW_LINE);
    }

    private static void addCheckHealth(StringBuilder sb, FarmingItem item)
    {
        if(item.getCheckHealthXP() > 0)
        {
            sb.append(ColorUtil.wrapWithColorTag("Check Health: ", checkHealthColor));
            sb.append(df.format(item.getCheckHealthXP()));
            sb.append("xp");
            sb.append(NEW_LINE);
        }
    }

    private static void addHarvest(StringBuilder sb, FarmingItem item)
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

            var minXP = df.format(item.getHarvestXP() * item.getMinHarvestQuantity());
            var maxXP = df.format(item.getHarvestXP() * item.getMaxHarvestQuantity());

            if(item.getMinHarvestQuantity() == 0)
            {
                if(item.getMaxHarvestQuantity() == 0) return;

                sb.append(ColorUtil.colorTag(Color.GRAY));
                sb.append(" (max ");
                sb.append(item.getMaxHarvestQuantity());
                sb.append(" ");
                sb.append(item.getMaxHarvestQuantity() > 1 ? item.getPlural_name() : item.getName());
                if(item.getPatchType() != FarmingPatchType.FLOWER)
                {
                    sb.append("; max ");
                    sb.append(maxXP);
                    sb.append("xp");
                }
                sb.append(")");
                sb.append(ColorUtil.CLOSING_COLOR_TAG);
            }
            else
            {
                if(item.getMaxHarvestQuantity() == 0)
                {
                    sb.append(ColorUtil.colorTag(Color.GRAY));
                    sb.append(" (min ");
                    sb.append(item.getMinHarvestQuantity());
                    sb.append(" ");
                    sb.append(item.getMinHarvestQuantity() > 1 ? item.getPlural_name() : item.getName());
                    if(item.getPatchType() != FarmingPatchType.FLOWER)
                    {
                        sb.append("; min ");
                        sb.append(minXP);
                        sb.append("xp");
                    }
                    sb.append(")");
                    sb.append(ColorUtil.CLOSING_COLOR_TAG);
                }
                else
                {
                    if(item.getMinHarvestQuantity() != item.getMaxHarvestQuantity())
                    {
                        sb.append(ColorUtil.colorTag(Color.GRAY));
                        sb.append(" (");
                        sb.append(item.getMinHarvestQuantity());
                        sb.append("-");
                        sb.append(item.getMaxHarvestQuantity());
                        sb.append(" ");
                        sb.append(item.getMaxHarvestQuantity() > 1 ? item.getPlural_name() : item.getName());
                        if(item.getPatchType() != FarmingPatchType.FLOWER)
                        {
                            sb.append("; ");
                            sb.append(minXP);
                            sb.append("-");
                            sb.append(maxXP);
                            sb.append("xp");
                        }
                        sb.append(")");
                        sb.append(ColorUtil.CLOSING_COLOR_TAG);
                    }
                    else
                    {
                        sb.append(ColorUtil.colorTag(Color.GRAY));
                        sb.append(" (");
                        sb.append(item.getMinHarvestQuantity());
                        sb.append(" ");
                        sb.append(item.getMinHarvestQuantity() > 1 ? item.getPlural_name() : item.getName());
                        if(item.getPatchType() != FarmingPatchType.FLOWER)
                        {
                            sb.append("; ");
                            sb.append(minXP);
                            sb.append("xp");
                        }
                        sb.append(")");
                        sb.append(ColorUtil.CLOSING_COLOR_TAG);
                    }
                }
            }
        }
    }

    private static void addTotal(StringBuilder sb, FarmingItem item)
    {

    }

    private static void addUseAll(StringBuilder sb, FarmingItem item, int quantity)
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
}

