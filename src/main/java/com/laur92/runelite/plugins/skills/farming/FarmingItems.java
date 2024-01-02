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
            .itemIDs(ImmutableSet.of(ItemID.WHITE_LILY_SEED))
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

    GUAM_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.GUAM_SEED))
            .name("guam leaf")
            .plural_name("guam leaves")
            .level(9)
            .plantXP(11)
            .plantQuantity(1)
            .harvestXP(12.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    MARRENTILL_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.MARRENTILL_SEED))
            .name("marrentill leaf")
            .plural_name("marrentill leaves")
            .level(14)
            .plantXP(13.5)
            .plantQuantity(1)
            .harvestXP(15)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    TARROMIN_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.TARROMIN_SEED))
            .name("tarromin leaf")
            .plural_name("tarromin leaves")
            .level(19)
            .plantXP(16)
            .plantQuantity(1)
            .harvestXP(18)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    HARRALANDER_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.HARRALANDER_SEED))
            .name("harralander leaf")
            .plural_name("harralander leaves")
            .level(26)
            .plantXP(21.5)
            .plantQuantity(1)
            .harvestXP(24)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    GOUT_TUBER(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.GOUT_TUBER))
            .name("goutweed")
            .plural_name("goutweed")
            .level(29)
            .plantXP(105)
            .plantQuantity(1)
            .harvestXP(45)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    RANARR_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.RANARR_SEED))
            .name("ranarr leaf")
            .plural_name("ranarr leaves")
            .level(32)
            .plantXP(27)
            .plantQuantity(1)
            .harvestXP(30.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    TOADFLAX_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.TOADFLAX_SEED))
            .name("toadflax leaf")
            .plural_name("toadflax leaves")
            .level(38)
            .plantXP(34)
            .plantQuantity(1)
            .harvestXP(38.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    IRIT_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.IRIT_SEED))
            .name("irit leaf")
            .plural_name("irit leaves")
            .level(44)
            .plantXP(43)
            .plantQuantity(1)
            .harvestXP(48.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    AVANTOE_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.AVANTOE_SEED))
            .name("avantoe leaf")
            .plural_name("avantoe leaves")
            .level(50)
            .plantXP(54.5)
            .plantQuantity(1)
            .harvestXP(61.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    KWUARM_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.HARRALANDER_SEED))
            .name("kwuarm leaf")
            .plural_name("kwuarm leaves")
            .level(56)
            .plantXP(69)
            .plantQuantity(1)
            .harvestXP(78)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    SNAPDRAGON_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.SNAPDRAGON_SEED))
            .name("snapdragon leaf")
            .plural_name("snapdragon leaves")
            .level(62)
            .plantXP(87.5)
            .plantQuantity(1)
            .harvestXP(98.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    CADANTINE_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.CADANTINE_SEED))
            .name("cadantine leaf")
            .plural_name("cadantine leaves")
            .level(67)
            .plantXP(106.5)
            .plantQuantity(1)
            .harvestXP(120)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    LANTADYME_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.LANTADYME_SEED))
            .name("lantadyme leaf")
            .plural_name("lantadyme leaves")
            .level(73)
            .plantXP(134.5)
            .plantQuantity(1)
            .harvestXP(151.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    DWARF_WEED_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.DWARF_WEED_SEED))
            .name("dwarf weed leaf")
            .plural_name("dwarf weed leaves")
            .level(79)
            .plantXP(170.5)
            .plantQuantity(1)
            .harvestXP(192)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    TORSTOL_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.TORSTOL_SEED))
            .name("torstol leaf")
            .plural_name("torstol leaves")
            .level(85)
            .plantXP(199.5)
            .plantQuantity(1)
            .harvestXP(244.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HERB)
            .build()),

    BARLEY_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.BARLEY_SEED))
            .name("barley")
            .plural_name("barley")
            .level(3)
            .plantXP(8.5)
            .plantQuantity(4)
            .harvestXP(9.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HOP)
            .build()),

    HAMMERSTONE_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.HAMMERSTONE_SEED))
            .name("hammerstone hops")
            .plural_name("hammerstone hops")
            .level(4)
            .plantXP(9)
            .plantQuantity(4)
            .harvestXP(10)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HOP)
            .build()),

    ASGARNIAN_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.ASGARNIAN_SEED))
            .name("asgarnian hops")
            .plural_name("asgarnian hops")
            .level(8)
            .plantXP(10.9)
            .plantQuantity(4)
            .harvestXP(12)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HOP)
            .build()),

    JUTE_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.JUTE_SEED))
            .name("jute fibre")
            .plural_name("jute fibres")
            .level(13)
            .plantXP(13)
            .plantQuantity(4)
            .harvestXP(14.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HOP)
            .build()),

    YANILLIAN_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.YANILLIAN_SEED))
            .name("yanillian hops")
            .plural_name("yanillian hops")
            .level(16)
            .plantXP(14.5)
            .plantQuantity(4)
            .harvestXP(16)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HOP)
            .build()),

    KRANDORIAN_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.KRANDORIAN_SEED))
            .name("krandorian hops")
            .plural_name("krandorian hops")
            .level(21)
            .plantXP(17.5)
            .plantQuantity(4)
            .harvestXP(19.5)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HOP)
            .build()),

    WILDBLOOD_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.WILDBLOOD_SEED))
            .name("wildblood hops")
            .plural_name("wildblood hops")
            .level(28)
            .plantXP(23)
            .plantQuantity(4)
            .harvestXP(26)
            .minHarvestQuantity(3)
            .patchType(FarmingPatchType.HOP)
            .build()),

    REDBERRY_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.REDBERRY_SEED))
            .name("redberries")
            .plural_name("redberries")
            .level(10)
            .plantXP(11.5)
            .plantQuantity(1)
            .checkHealthXP(64)
            .harvestXP(4.5)
            .minHarvestQuantity(4)
            .patchType(FarmingPatchType.BUSH)
            .build()),

    CADAVABERRY_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.CADAVABERRY_SEED))
            .name("cadava berries")
            .plural_name("cadava berries")
            .level(22)
            .plantXP(18)
            .plantQuantity(1)
            .checkHealthXP(102.5)
            .harvestXP(7)
            .minHarvestQuantity(4)
            .patchType(FarmingPatchType.BUSH)
            .build()),

    DWELLBERRY_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.DWELLBERRY_SEED))
            .name("dwellberries")
            .plural_name("dwellberries")
            .level(36)
            .plantXP(31.5)
            .plantQuantity(1)
            .checkHealthXP(177.5)
            .harvestXP(12)
            .minHarvestQuantity(4)
            .patchType(FarmingPatchType.BUSH)
            .build()),

    JANGERBERRY_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.JANGERBERRY_SEED))
            .name("jangerberries")
            .plural_name("jangerberries")
            .level(48)
            .plantXP(50.5)
            .plantQuantity(1)
            .checkHealthXP(284.5)
            .harvestXP(19)
            .minHarvestQuantity(4)
            .maxHarvestQuantity(4)
            .patchType(FarmingPatchType.BUSH)
            .build()),

    WHITEBERRY_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.WHITEBERRY_SEED))
            .name("white berries")
            .plural_name("white berries")
            .level(59)
            .plantXP(78)
            .plantQuantity(1)
            .checkHealthXP(437.5)
            .harvestXP(29)
            .minHarvestQuantity(4)
            .maxHarvestQuantity(4)
            .patchType(FarmingPatchType.BUSH)
            .build()),

    POISON_IVY_SEED(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.POISON_IVY_SEED))
            .name("poison ivy berries")
            .plural_name("poison ivy berries")
            .level(70)
            .plantXP(120)
            .plantQuantity(1)
            .checkHealthXP(675)
            .harvestXP(45)
            .minHarvestQuantity(4)
            .patchType(FarmingPatchType.BUSH)
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

    APPLE_TREE(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.APPLE_TREE_SEED, ItemID.APPLE_SAPLING, ItemID.APPLE_SEEDLING, ItemID.APPLE_SEEDLING_W))
            .name("cooking apple")
            .plural_name("cooking apples")
            .level(27)
            .plantXP(22)
            .plantQuantity(1)
            .checkHealthXP(1199.5)
            .harvestXP(8.5)
            .minHarvestQuantity(6)
            .maxHarvestQuantity(6)
            .patchType(FarmingPatchType.FRUIT_TREE)
            .build()),

    BANANA_TREE(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.BANANA_TREE_SEED, ItemID.BANANA_SAPLING, ItemID.BANANA_SEEDLING, ItemID.BANANA_SEEDLING_W))
            .name("banana")
            .plural_name("bananas")
            .level(33)
            .plantXP(28)
            .plantQuantity(1)
            .checkHealthXP(1750.5)
            .harvestXP(10.5)
            .minHarvestQuantity(6)
            .maxHarvestQuantity(6)
            .patchType(FarmingPatchType.FRUIT_TREE)
            .build()),

    ORANGE_TREE(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.ORANGE_TREE_SEED, ItemID.ORANGE_SAPLING, ItemID.ORANGE_SEEDLING, ItemID.ORANGE_SEEDLING_W))
            .name("orange")
            .plural_name("oranges")
            .level(39)
            .plantXP(35.5)
            .plantQuantity(1)
            .checkHealthXP(2470.2)
            .harvestXP(13.5)
            .minHarvestQuantity(6)
            .maxHarvestQuantity(6)
            .patchType(FarmingPatchType.FRUIT_TREE)
            .build()),

    CURRY_TREE(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.CURRY_TREE_SEED, ItemID.CURRY_SAPLING, ItemID.CURRY_SEEDLING, ItemID.CURRY_SEEDLING_W))
            .name("curry leaf")
            .plural_name("curry leaves")
            .level(42)
            .plantXP(40)
            .plantQuantity(1)
            .checkHealthXP(2906.9)
            .harvestXP(15)
            .minHarvestQuantity(6)
            .maxHarvestQuantity(6)
            .patchType(FarmingPatchType.FRUIT_TREE)
            .build()),

    PINEAPPLE_TREE(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.PINEAPPLE_SEED, ItemID.PINEAPPLE_SAPLING, ItemID.PINEAPPLE_SEEDLING, ItemID.PINEAPPLE_SEEDLING_W))
            .name("pineapple")
            .plural_name("pineapples")
            .level(51)
            .plantXP(57)
            .plantQuantity(1)
            .checkHealthXP(4605)
            .harvestXP(21.5)
            .minHarvestQuantity(6)
            .maxHarvestQuantity(6)
            .patchType(FarmingPatchType.FRUIT_TREE)
            .build()),

    PAPAYA_TREE(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.PAPAYA_TREE_SEED, ItemID.PAPAYA_SAPLING, ItemID.PAPAYA_SEEDLING, ItemID.PAPAYA_SEEDLING_W))
            .name("papaya fruit")
            .plural_name("papaya fruits")
            .level(57)
            .plantXP(72)
            .plantQuantity(1)
            .checkHealthXP(6146.6)
            .harvestXP(27)
            .minHarvestQuantity(6)
            .maxHarvestQuantity(6)
            .patchType(FarmingPatchType.FRUIT_TREE)
            .build()),

    PALM_TREE(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.PALM_TREE_SEED, ItemID.PALM_SAPLING, ItemID.PALM_SEEDLING, ItemID.PALM_SEEDLING_W))
            .name("coconut")
            .plural_name("coconuts")
            .level(68)
            .plantXP(110.5)
            .plantQuantity(1)
            .checkHealthXP(10150.1)
            .harvestXP(41.5)
            .minHarvestQuantity(6)
            .maxHarvestQuantity(6)
            .patchType(FarmingPatchType.FRUIT_TREE)
            .build()),

    DRAGONFRUIT_TREE(FarmingItem.builder()
            .itemIDs(ImmutableSet.of(ItemID.DRAGONFRUIT_TREE_SEED, ItemID.DRAGONFRUIT_SAPLING, ItemID.DRAGONFRUIT_SEEDLING, ItemID.DRAGONFRUIT_SEEDLING_W))
            .name("dragonfruit")
            .plural_name("dragonfruits")
            .level(81)
            .plantXP(140)
            .plantQuantity(1)
            .checkHealthXP(17335)
            .harvestXP(70)
            .minHarvestQuantity(6)
            .maxHarvestQuantity(6)
            .patchType(FarmingPatchType.FRUIT_TREE)
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

