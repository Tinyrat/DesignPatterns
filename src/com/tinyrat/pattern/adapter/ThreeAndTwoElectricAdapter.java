package com.tinyrat.pattern.adapter;

/**
 * Created by Administrator on 2016/12/13.
 */
public class ThreeAndTwoElectricAdapter implements ThreeElectricOutlet, TwoElectricOutlet {
    ThreeElectricOutlet threeElectricOutlet;
    TwoElectricOutlet twoElectricOutlet;
    ThreeAndTwoElectricAdapter(ThreeElectricOutlet threeElectricOutlet,
                               TwoElectricOutlet twoElectricOutlet){
        this.threeElectricOutlet = threeElectricOutlet;
        this.twoElectricOutlet = twoElectricOutlet;
    }
    @Override
    public void connectElectricCurrent() {
        //ThreeElectricOutlet是被适配接口
        if (this instanceof ThreeElectricOutlet){
            twoElectricOutlet.connectElectricCurrent();
        }
        //TwoElectricOutlet是被适配接口
        if (this instanceof TwoElectricOutlet){
            threeElectricOutlet.connectElectricCurrent();
        }
    }
}
