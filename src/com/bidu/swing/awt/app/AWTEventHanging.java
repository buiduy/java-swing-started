package com.bidu.swing.awt.app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEventHanging extends Frame implements ActionListener {
    private TextField textField;

    public AWTEventHanging() {
        // tạo các thành phần
        textField = new TextField();
        textField.setBounds(60, 80, 170, 20);
        Button button = new Button("click me");
        button.setBounds(100, 120, 80, 30);

        // đăng ký trình listener
        button.addActionListener(this);

        // thêm thành phần, kích thước, layout, khả năng hiển thị
        setTitle("Vi du xu ly su kien Java AWT");
        add(button);
        add(textField);
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Welcome to Java AWT");
    }

    public static void main(String args[]) {
        new AWTEventHanging();
    }
}
