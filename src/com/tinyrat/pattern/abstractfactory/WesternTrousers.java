package com.tinyrat.pattern.abstractfactory;

/**
 * Created by Administrator on 2016/12/15.
 */
public class WesternTrousers extends Trousers {
    private int waistSize;
    private int height;
    private String name;

    WesternTrousers(String name, int waistSize, int height) {
        this.name = name;
        this.waistSize = waistSize;
        this.height = height;
    }

    @Override
    public int getWaistSize() {
        return waistSize;
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
