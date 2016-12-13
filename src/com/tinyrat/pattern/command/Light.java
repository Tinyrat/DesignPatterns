package com.tinyrat.pattern.command;

import javax.swing.*;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Light extends JPanel {
    String name;
    Icon imageIcon;
    JLabel label;

    public Light() {
        label = new JLabel("我是照明灯");
        add(label);
    }

    public void on() {
        label.setIcon(new ImageIcon("./file/command/lightOpen.jpg"));
    }

    public void off() {
        label.setIcon(new ImageIcon("./file/command/lightClose.jpg"));
    }
}
