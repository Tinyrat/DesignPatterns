package com.tinyrat.pattern.state;

/**
 * Created by Administrator on 2016/12/15.
 */
public class LowState implements TemperatureState {
    double n = 0;

    LowState(double n) {
        if (n <= 0) {
            this.n = n;
        }
    }

    @Override
    public void showTemperature() {
        System.out.println("现在的温度是" + n + "属于低温");
    }
}
