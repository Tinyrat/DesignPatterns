package com.tinyrat.pattern.abstractfactory;

/**
 * Created by Administrator on 2016/12/15.
 */
public class BeijingClothesFactory implements ClothesFactory {
    @Override
    public UpperClothes createUpperClothes(int chestSize, int height) {
        return new WesternUpperClothes("北京牌西服上装", chestSize, height);
    }

    @Override
    public Trousers createTrousers(int waistSize, int height) {
        return new WesternTrousers("北京牌西服裤子", waistSize, height);
    }
}
