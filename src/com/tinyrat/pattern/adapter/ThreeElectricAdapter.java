package com.tinyrat.pattern.adapter;

/**
 * Created by Administrator on 2016/12/13.
 */
public class ThreeElectricAdapter implements ThreeElectricOutlet {
    TwoElectricOutlet outlet;

    ThreeElectricAdapter(TwoElectricOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public void connectElectricCurrent() {
        outlet.connectElectricCurrent();
    }
}
