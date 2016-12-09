package com.tinyrat.pattern.command;

/**
 * Created by Administrator on 2016/12/9.
 */
public class OffCameraCommand implements Command {
    Camera camera;

    OffCameraCommand(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.off();
    }

    @Override
    public String getName() {
        return "关闭摄像头";
    }
}
