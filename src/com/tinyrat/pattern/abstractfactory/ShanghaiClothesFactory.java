package com.tinyrat.pattern.abstractfactory;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ShanghaiClothesFactory implements ClothesFactory {
    @Override
    public UpperClothes createUpperClothes(int chestSize, int height) {
        return new CowboyUpperClothes("上海牌牛仔上装", chestSize, height);
    }

    @Override
    public Trousers createTrousers(int waistSize, int height) {
        return new CowboyTrousers("上海牌牛仔裤子", waistSize, height);
    }
}
