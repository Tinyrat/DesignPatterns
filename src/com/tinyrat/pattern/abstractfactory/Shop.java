package com.tinyrat.pattern.abstractfactory;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Shop {
    UpperClothes clothes;
    Trousers trousers;

    public void giveSuit(ClothesFactory factory, int chestSize, int waistSize, int height) {
        clothes = factory.createUpperClothes(chestSize, height);
        trousers = factory.createTrousers(chestSize, height);
        showMess();
    }

    private void showMess() {
        System.out.println("<套装信息>");
        System.out.println(clothes.getName() + "：");
        System.out.println("胸围：" + clothes.getChestSize());
        System.out.println("身高：" + clothes.getHeight());
        System.out.println(trousers.getName() + "：");
        System.out.println("腰围：" + trousers.getWaistSize());
        System.out.println("身高：" + trousers.getHeight());
    }
}
