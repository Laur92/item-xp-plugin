package com.laur92.runelite.plugins.skills.farming;

public enum Compost
{
    NONE(CompostType.builder().name("No Compost").harvestLives(3).build()),
    NORMAL(CompostType.builder().name("Compost").harvestLives(4).build()),
    SUPERCOMPOST(CompostType.builder().name("Supercompost").harvestLives(5).build()),
    ULTRACOMPOST(CompostType.builder().name("Ultracompost").harvestLives(6).build());

    public final CompostType compost;
    Compost(CompostType compost) { this.compost = compost; }
}
