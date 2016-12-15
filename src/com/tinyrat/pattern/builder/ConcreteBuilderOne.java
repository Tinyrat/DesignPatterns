package com.tinyrat.pattern.builder;

import javax.swing.*;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ConcreteBuilderOne implements Builder {
    private PanelProduct panel;

    ConcreteBuilderOne() {
        panel = new PanelProduct();
    }

    @Override
    public void buildButton() {
        panel.button = new JButton("按钮");
    }

    @Override
    public void buildLabel() {
        panel.label = new JLabel("标签");
    }

    @Override
    public void buildTextField() {
        panel.field = new JTextField("文本框");
    }

    @Override
    public JPanel getPannel() {
        panel.add(panel.field);
        panel.add(panel.label);
        panel.add(panel.button);
        return panel;
    }
}
