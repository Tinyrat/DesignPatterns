package com.tinyrat.pattern.state;

/**
 * Created by Administrator on 2016/12/15.
 */
public class HighState implements TemperatureState {
    double n = 39;

    HighState(double n) {
        if (n >= 39) {
            this.n = n;
        }
    }

    @Override
    public void showTemperature() {
        System.out.println("现在的温度是：" + n + "属于高温");
    }
}
