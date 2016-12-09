package com.tinyrat.pattern.command;

/**
 * Created by Administrator on 2016/12/9.
 */
public class OnCameraCommand implements Command {
    Camera camera;

    OnCameraCommand(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.on();
    }

    @Override
    public String getName() {
        return "打开摄像头";
    }
}
