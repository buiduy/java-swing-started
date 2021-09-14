package com.bidu.swing.awt.controller;

import com.bidu.swing.awt.view.AWTEventView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEventController implements ActionListener {
    AWTEventView obj;

    public AWTEventController(AWTEventView obj) {
        this.obj = obj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        obj.textField.setText("Welcome to Java AWT");
    }
}
