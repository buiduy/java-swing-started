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

        //region Update Label
        Label label1, label2;
        label1 = new Label("Name");
        label1.setBounds(50, 180, 100, 30);
        label2 = new Label("Name 2");
        label2.setBounds(50, 150, 100, 30);

        add(label1);
        add(label2);
        //endregion

        //region TextField
        TextField t1, t2;
        t1 = new TextField("Welcome to AWT");
        t1.setBounds(50, 200, 200, 30);
        t2 = new TextField("Vi du AWT TextFiled");
        t2.setBounds(50, 250, 200, 30);
        add(t1);
        add(t2);
        //endregion

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }
}
