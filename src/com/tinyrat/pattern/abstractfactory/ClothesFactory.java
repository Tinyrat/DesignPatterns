package com.tinyrat.pattern.abstractfactory;

/**
 * Created by Administrator on 2016/12/15.
 */
public interface ClothesFactory {
    public abstract UpperClothes createUpperClothes(int chestSize, int height);

    public abstract Trousers createTrousers(int waistSize, int height);
}
