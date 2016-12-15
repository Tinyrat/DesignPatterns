package com.tinyrat.pattern.prototype;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cubic cubic = new Cubic(12, 20, 66);
        System.out.println("cubic的长宽高：");
        System.out.println(cubic.length + "," + cubic.width + "," + cubic.height);
        Cubic cubicCopy = (Cubic) cubic.cloneMe();
        System.out.println("cubicCopy的长宽高：");
        System.out.println(cubicCopy.length + "," + cubicCopy.width + "," + cubicCopy.height);
        Goat goat = new Goat();
        goat.setColor(new StringBuffer("白颜色的山羊"));
        System.out.println("goat是" + goat.getColor());
        Goat goatCopy = (Goat) goat.cloneMe();
        System.out.println("goatCopy是" + goatCopy.getColor());
        System.out.println("goatCopy改颜色为黑色");
        goatCopy.setColor(new StringBuffer("黑颜色的山羊"));
        System.out.println("goat依然是" + goat.getColor());
        System.out.println("goatCopy是" + goatCopy.getColor());
    }
}
