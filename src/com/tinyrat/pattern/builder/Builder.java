package com.tinyrat.pattern.builder;

import javax.swing.*;

/**
 * Created by Administrator on 2016/12/15.
 */
public interface Builder {
    public abstract void buildButton();

    public abstract void buildLabel();

    public abstract void buildTextField();

    public abstract JPanel getPannel();
}
