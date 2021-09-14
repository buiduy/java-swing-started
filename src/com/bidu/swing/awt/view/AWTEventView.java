package com.bidu.swing.awt.view;

import com.bidu.swing.awt.controller.AWTEventController;

import java.awt.*;

public class AWTEventView extends Frame {
    public TextField textField;

    public AWTEventView() {
        // tạo các thành phần
        textField = new TextField();
        textField.setBounds(60, 80, 170, 20);
        Button button = new Button("click me");
        button.setBounds(100, 120, 80, 30);
        // đăng ký listener
        AWTEventController obj = new AWTEventController(this);
        button.addActionListener(obj);
        // thêm thành phần, kích thước, layout, khả năng hiển thị
        setTitle("Vi du xu ly su kien Java AWT");
        add(button);
        add(textField);
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }
}
