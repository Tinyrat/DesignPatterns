package com.tinyrat.pattern.adapter;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Application {
    public static void main(String[] args) {
        ThreeElectricOutlet outlet;
        outlet = new Wash();
        outlet.connectElectricCurrent();
        outlet = new ThreeElectricAdapter(new TV());
        outlet.connectElectricCurrent();
    }
}

class Wash implements ThreeElectricOutlet {
    String name;

    Wash() {
        name = "洗衣机";
    }

    public void connectElectricCurrent() {
        turnOn();
    }

    public void turnOn() {
        System.out.println(name + "开始洗衣服");
    }
}

class TV implements TwoElectricOutlet {
    String name;

    TV() {
        name = "电视机";
    }

    @Override
    public void connectElectricCurrent() {
        turnOn();
    }

    public void turnOn() {
        System.out.println(name + "开始播放电视节目");
    }
}
