package com.tinyrat.pattern.flyweight;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Application {
    public static void main(String[] args) {
        FlyweightFactory factory = FlyweightFactory.getFactory();
        double width = 1.82, height = 1.47, length = 5.12;
        String key = "" + width + "#" + height + "#" + length;
        Flyweight flyweight = factory.getFlyweight(key);
        Car audiA6One = new Car(flyweight, "奥迪A6", "黑色", 128);
        Car audiA6Two = new Car(flyweight, "奥迪A6", "灰色", 160);
        audiA6One.print();
        audiA6Two.print();
    }
}
