package com.tinyrat.pattern.builder;

import javax.swing.*;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Application {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilderOne();
        Director director = new Director(builder);
        JPanel panel = director.constrctProduct();
        JFrame frameOne = new JFrame();
        frameOne.add(panel);
        frameOne.setBounds(12, 12, 200, 200);
        frameOne.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameOne.setVisible(true);
        builder = new ConcreteBuilderTwo();
        director = new Director(builder);
        panel = director.constrctProduct();
        JFrame frameTwo = new JFrame();
        frameTwo.add(panel);
        frameTwo.setBounds(212, 12, 200, 200);
        frameTwo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameTwo.setVisible(true);
    }
}
