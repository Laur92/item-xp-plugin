package com.laur92.runelite.plugins.skills.farming;

import com.google.common.collect.ImmutableSet;
import net.runelite.api.ItemID;

import java.util.*;

public enum FarmingItems
{
    POTATO_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.POTATO_SEED, ItemID.POTATO_SEED_7548))
            .name("potato")
            .plural_name("potatoes")
            .level(1)
            .plantXP(8)
            .plantQuantity(3)
            .harvestXP(9)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.ALLOTMENT)
            .build()),

    ONION_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.ONION_SEED, ItemID.ONION_SEED_7550))
            .name("onion")
            .plural_name("onions")
            .level(5)
            .plantXP(9.5)
            .plantQuantity(3)
            .harvestXP(10.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.ALLOTMENT)
            .build()),

    CABBAGE_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.CABBAGE_SEED))
            .name("cabbage")
            .plural_name("cabbages")
            .level(7)
            .plantXP(10)
            .plantQuantity(3)
            .harvestXP(11.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.ALLOTMENT)
            .build()),

    TOMATO_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.TOMATO_SEED, ItemID.TOMATO_SEED_7562))
            .name("tomato")
            .plural_name("tomatoes")
            .level(12)
            .plantXP(12.5)
            .plantQuantity(3)
            .harvestXP(14)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.ALLOTMENT)
            .build()),

    SWEETCORN_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.SWEETCORN_SEED))
            .name("sweetcorn")
            .plural_name("sweetcorn")
            .level(20)
            .plantXP(17)
            .plantQuantity(3)
            .harvestXP(19)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.ALLOTMENT)
            .build()),

    STRAWBERRY_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.STRAWBERRY_SEED))
            .name("strawberry")
            .plural_name("strawberries")
            .level(31)
            .plantXP(26)
            .plantQuantity(3)
            .harvestXP(29)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.ALLOTMENT)
            .build()),

    WATERMELON_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.WATERMELON_SEED))
            .name("watermelon")
            .plural_name("watermelons")
            .level(47)
            .plantXP(48.5)
            .plantQuantity(3)
            .harvestXP(54.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.ALLOTMENT)
            .build()),

    SNAPE_GRASS_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.SNAPE_GRASS_SEED))
            .name("snape grass")
            .plural_name("snape grass")
            .level(61)
            .plantXP(82)
            .plantQuantity(3)
            .harvestXP(82)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.ALLOTMENT)
            .build()),

    MARIGOLD_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.MARIGOLD_SEED))
            .name("marigold")
            .plural_name("marigolds")
            .level(2)
            .plantXP(8.5)
            .plantQuantity(1)
            .harvestXP(47)
            .minHarvestQuantity(1)
            .maxHarvestQuantity(1)
            .patchType(FarmingPatchType.FLOWER)
            .build()),

    ROSEMARY_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.ROSEMARY_SEED))
            .name("rosemary")
            .plural_name("rosemary")
            .level(11)
            .plantXP(12)
            .plantQuantity(1)
            .harvestXP(66.5)
            .minHarvestQuantity(1)
            .maxHarvestQuantity(1)
            .patchType(FarmingPatchType.FLOWER)
            .build()),

    NASTURTIUM_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.NASTURTIUM_SEED))
            .name("nasturtium")
            .plural_name("nasturtiums")
            .level(24)
            .plantXP(19.5)
            .plantQuantity(1)
            .harvestXP(111)
            .minHarvestQuantity(1)
            .maxHarvestQuantity(1)
            .patchType(FarmingPatchType.FLOWER)
            .build()),

    WOAD_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.WOAD_SEED))
            .name("woad leaf")
            .plural_name("woad leaves")
            .level(25)
            .plantXP(20)
            .plantQuantity(1)
            .harvestXP(115.5)
            .minHarvestQuantity(3)
            .maxHarvestQuantity(3)
            .patchType(FarmingPatchType.FLOWER)
            .build()),

    LIMPWURT_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.LIMPWURT_SEED))
            .name("limpwurt root")
            .plural_name("limpwurt roots")
            .level(26)
            .plantXP(21.5)
            .plantQuantity(1)
            .harvestXP(120)
            .minHarvestQuantity(3)
            .maxHarvestQuantity(13)
            .patchType(FarmingPatchType.FLOWER)
            .build()),

    WHITE_LILY_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.NASTURTIUM_SEED))
            .name("white lily")
            .plural_name("white lilies")
            .level(58)
            .plantXP(42)
            .plantQuantity(1)
            .harvestXP(250)
            .minHarvestQuantity(1)
            .maxHarvestQuantity(1)
            .patchType(FarmingPatchType.FLOWER)
            .build()),

    ACORN(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.ACORN, ItemID.OAK_SAPLING, ItemID.OAK_SEEDLING, ItemID.OAK_SEEDLING_W))
            .name("oak tree")
            .plural_name("oak trees")
            .level(15)
            .plantXP(14)
            .plantQuantity(1)
            .checkHealthXP(467.3)
            .patchType(FarmingPatchType.TREE)
            .build()),

    WILLOW_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.WILLOW_SEED, ItemID.WILLOW_SAPLING, ItemID.WILLOW_SEEDLING, ItemID.WILLOW_SEEDLING_W))
            .name("willow tree")
            .plural_name("willow trees")
            .level(30)
            .plantXP(25)
            .plantQuantity(1)
            .checkHealthXP(1456.5)
            .patchType(FarmingPatchType.TREE)
            .build()),

    MAPLE_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.MAPLE_SEED, ItemID.MAPLE_SAPLING, ItemID.MAPLE_SEEDLING, ItemID.MAPLE_SEEDLING_W))
            .name("maple tree")
            .plural_name("maple trees")
            .level(45)
            .plantXP(45)
            .plantQuantity(1)
            .checkHealthXP(3403.4)
            .patchType(FarmingPatchType.TREE)
            .build()),

    YEW_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.YEW_SEED, ItemID.YEW_SAPLING, ItemID.YEW_SEEDLING, ItemID.YEW_SEEDLING_W))
            .name("yew tree")
            .plural_name("yew trees")
            .level(60)
            .plantXP(81)
            .plantQuantity(1)
            .checkHealthXP(7069.9)
            .patchType(FarmingPatchType.TREE)
            .build()),

    MAGIC_TREE(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.MAGIC_SEED, ItemID.MAGIC_SAPLING, ItemID.MAGIC_SEEDLING, ItemID.MAGIC_SEEDLING_W))
            .name("magic tree")
            .plural_name("magic trees")
            .level(75)
            .plantXP(145.5)
            .plantQuantity(1)
            .checkHealthXP(13768.3)
            .patchType(FarmingPatchType.TREE)
            .build()),



    ;

    private static final Map<Integer, List<FarmingItem>> idsToFarmingItem = new HashMap<>();

    static
    {
        Arrays.stream(values())
                .map(fi -> fi.item)
                .forEach(fi -> fi.getItemIDs().forEach(id -> {
                    if (!idsToFarmingItem.containsKey(id))
                    {
                        idsToFarmingItem.put(id, new ArrayList<>());
                    }
                    idsToFarmingItem.get(id).add(fi);
                }));
    }

    public final FarmingItem item;
    FarmingItems(FarmingItem item)
    {
        this.item = item;
    }

    public static FarmingItem getFarmingItem(int farmingItemID)
    {
        if(!idsToFarmingItem.containsKey(farmingItemID)) return null;

        return idsToFarmingItem.get(farmingItemID).get(0);
    }
}

