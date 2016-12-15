package com.tinyrat.pattern.abstractfactory;

/**
 * Created by Administrator on 2016/12/15.
 */
public class WesternUpperClothes extends UpperClothes {
    private int chestSize;
    private int height;
    private String name;

    WesternUpperClothes(String name, int chestSize, int height) {
        this.name = name;
        this.chestSize = chestSize;
        this.height = height;
    }

    @Override
    public int getChestSize() {
        return chestSize;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return name;
    }
}
