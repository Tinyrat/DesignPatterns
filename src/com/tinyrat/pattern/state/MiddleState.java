package com.tinyrat.pattern.state;

/**
 * Created by Administrator on 2016/12/15.
 */
public class MiddleState implements TemperatureState {
    double n = 15;

    MiddleState(double n) {
        if (n >= 10 && n <= 26) {
            this.n = n;
        }
    }

    @Override
    public void showTemperature() {
        System.out.println("现在的温度是：" + n + "属于常温");
    }
}
