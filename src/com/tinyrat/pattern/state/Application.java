package com.tinyrat.pattern.state;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Application {
    public static void main(String[] args) {
        TemperatureState state = new LowState(-12);
        Thermometer thermometer = new Thermometer();
        thermometer.setState(state);
        thermometer.showMessage();
        thermometer.setState(new MiddleState(20));
        thermometer.showMessage();
        thermometer.setState(new HighState(40));
        thermometer.showMessage();
    }
}
