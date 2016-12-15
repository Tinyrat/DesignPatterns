package com.tinyrat.pattern.builder;

import javax.swing.*;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ConcreteBuilderTwo implements Builder {
    private PanelProduct panel;

    ConcreteBuilderTwo() {
        panel = new PanelProduct();
    }

    @Override
    public void buildButton() {
        panel.button = new JButton("button");
    }

    @Override
    public void buildLabel() {
        panel.label = new JLabel("label");
    }

    @Override
    public void buildTextField() {
        panel.field = new JTextField("field");
    }

    @Override
    public JPanel getPannel() {
        panel.add(panel.field);
        panel.add(panel.label);
        panel.add(panel.button);
        return panel;
    }
}
