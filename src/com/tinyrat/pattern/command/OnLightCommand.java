package com.tinyrat.pattern.command;

/**
 * Created by Administrator on 2016/12/9.
 */
public class OnLightCommand implements Command {
    Light light;

    OnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public String getName() {
        return "打开照明灯";
    }
}
