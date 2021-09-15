package com.bidu.swing.awt.app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtTextField extends Frame implements ActionListener {
    Button button1;

    AwtTextField(){
        button1 = new Button("+");
        button1.setBounds(50, 200, 50, 50);
        button1.addActionListener(this);


        add(button1);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            System.out.println("e = " + e.getSource());
        }
    }

    public static  void main(String[] args){
        new AwtTextField();
    }
}
