package com.tinyrat.pattern.command;

import javax.swing.*;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Camera extends JPanel {
    String name;
    Icon imageIcon;
    JLabel label;

    public Camera() {
        label = new JLabel("我是摄像头");
        add(label);
    }

    public void on() {
        label.setIcon(new ImageIcon("cameraOpen.jpg"));
    }

    public void off() {
        label.setIcon(new ImageIcon("cameraClosed.jpg"));
    }
}
