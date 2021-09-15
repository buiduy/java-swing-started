package com.bidu.swing.awt.controller;

import com.bidu.swing.awt.view.AWTEventView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class AWTEventController implements ActionListener {
    AWTEventView obj;

    public AWTEventController(AWTEventView obj) {
        this.obj = obj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String ip= "";
        try {
            ip = java.net.InetAddress.getByName("google.com").getHostAddress();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        obj.textField.setText("Welcome to  "+ ip);
    }
}
