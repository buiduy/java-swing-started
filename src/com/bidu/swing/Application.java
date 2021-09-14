package com.bidu.swing;

import javax.swing.*;

public class Application {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();

        addButton(jFrame);
        setSize(jFrame);
    }

    public static void addButton(JFrame jFrame){
        JButton jButton = new JButton("Check");
        jButton.setBounds(130,50,100,40);

        jFrame.setTitle("My Fi");
        jFrame.add(jButton);
    }

    public static void setSize(JFrame jFrame){
        jFrame.setSize(400, 200);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
