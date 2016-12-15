package com.tinyrat.pattern.builder;

import javax.swing.*;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    public JPanel constrctProduct() {
        builder.buildButton();
        builder.buildLabel();
        builder.buildTextField();
        return builder.getPannel();
    }

}
