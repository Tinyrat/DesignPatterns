package com.tinyrat.pattern.observer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2016/12/10.
 */
public class Application extends JFrame {
    Application() {
        InputTextSubject textSubject = new InputTextSubject();
        ShowWord observerOne = new ShowWord(textSubject);
        ShowDigit observerTwo = new ShowDigit(textSubject);
        setLayout(new FlowLayout());
        add(new JScrollPane(textSubject.getJTextArea()));
        add(observerOne);
        add(observerTwo);
        setBounds(20, 20, 600, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Application();
    }
}
