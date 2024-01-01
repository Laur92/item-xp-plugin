package com.laur92.runelite.plugins;

import com.google.inject.Inject;
import com.laur92.runelite.plugins.skills.FarmingXP;
import net.runelite.api.Client;
import net.runelite.api.widgets.ComponentID;
import net.runelite.api.widgets.InterfaceID;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.tooltip.Tooltip;
import net.runelite.client.ui.overlay.tooltip.TooltipManager;

import java.awt.*;

public class ItemXPOverlay extends Overlay
{
    private final TooltipManager tooltipManager;
    private final FarmingXP farmingXP;
    private final Client client;

    @Inject
    public ItemXPOverlay(Client client, TooltipManager tooltipManager,
                         FarmingXP farmingXP)
    {
        this.client = client;
        this.tooltipManager = tooltipManager;
        this.farmingXP = farmingXP;
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        if (client.isMenuOpen()) return null;

        var menu = client.getMenuEntries();
        var menuSize = menu.length;
        if (menuSize == 0) return null;

        var entry = menu[menuSize - 1];
        var widget = entry.getWidget();
        if (widget == null) return null;

        var group = WidgetUtil.componentToInterface(widget.getId());
        var itemId = -1;

        if (group == InterfaceID.EQUIPMENT ||
                // For bank worn equipment, check widget parent to differentiate from normal bank items
                (group == InterfaceID.BANK && widget.getParentId() == ComponentID.BANK_INVENTORY_EQUIPMENT_ITEM_CONTAINER))
        {
            var widgetItem = widget.getChild(1);
            if (widgetItem != null)
            {
                itemId = widgetItem.getItemId();
            }
        }
        else if (widget.getId() == ComponentID.INVENTORY_CONTAINER
                || group == InterfaceID.EQUIPMENT_INVENTORY
                || widget.getId() == ComponentID.BANK_ITEM_CONTAINER
                || group == InterfaceID.BANK_INVENTORY
                || widget.getId() == ComponentID.GROUP_STORAGE_ITEM_CONTAINER
                || group == InterfaceID.GROUP_STORAGE_INVENTORY)
        {
            itemId = widget.getItemId();
        }

        if (itemId == -1) return null;

        var sb = new StringBuilder();
        var hasTooltip = false;

        var farming = farmingXP.getFarmingToolTip(itemId);
        if(farming != null)
        {
            sb.append(farming);
            hasTooltip = true;
        }

        if(hasTooltip)
        {
            tooltipManager.add(new Tooltip(sb.toString()));
        }

        return null;
    }
}
