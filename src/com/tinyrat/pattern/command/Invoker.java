package com.tinyrat.pattern.command;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Invoker {
    JButton button;
    Command command;

    Invoker() {
        button = new JButton();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand();
            }
        });
    }

    public void setCommand(Command command) {
        this.command = command;
        button.setText(command.getName());
    }

    public JButton getButton() {
        return button;
    }

    private void executeCommand() {
        command.execute();
    }
}
