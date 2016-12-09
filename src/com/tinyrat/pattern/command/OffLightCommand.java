package com.tinyrat.pattern.command;

/**
 * Created by Administrator on 2016/12/9.
 */
public class OffLightCommand implements Command {
    Light light;

    OffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public String getName() {
        return "关闭照明灯";
    }
}
