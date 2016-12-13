package com.tinyrat.pattern.adapter;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Application2 {
    public static void main(String[] args) {
        ThreeElectricOutlet threeElectricOutlet;
        TwoElectricOutlet twoElectricOutlet;
        Wash wash = new Wash();
        TV tv = new TV();
        ThreeAndTwoElectricAdapter adapter = new ThreeAndTwoElectricAdapter(wash,tv);
        threeElectricOutlet = adapter;//适配器插在三相插座上
        threeElectricOutlet.connectElectricCurrent();
        twoElectricOutlet = adapter;
        twoElectricOutlet.connectElectricCurrent();//适配器插在两相插座上
    }
}
