package com.laur92.runelite.plugins.skills.firemaking;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

@Builder
@Getter
@ToString
public class FiremakingItem
{
    private Set<Integer> itemIDs;
    private FiremakingItemType itemType;
    private int level;
    private int minSacredOilDoses;
    private double xp;
}
