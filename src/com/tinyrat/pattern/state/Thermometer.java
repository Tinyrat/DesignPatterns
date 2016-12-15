package com.tinyrat.pattern.state;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Thermometer {
    TemperatureState state;

    public void showMessage() {
        System.out.println("**********");
        state.showTemperature();
        System.out.println("**********");
    }

    public void setState(TemperatureState state) {
        this.state = state;
    }
}
