package com.bidu.swing.awt.app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class AwtTextArea extends Frame implements ActionListener {
    private Label label1, label2;
    private TextArea textArea;
    private Button button;

    int count = 0;
    public AwtTextArea() {
        label1 = new Label();
        label1.setBounds(50, 50, 100, 30);
        label2 = new Label();
        label2.setBounds(160, 50, 100, 30);
        textArea = new TextArea();
        textArea.setBounds(20, 100, 300, 300);
        textArea.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                System.out.println("count++ = " + count++);
            }
        });

        button = new Button("Count Words");
        button.setBounds(100, 400, 100, 30);
        button.addActionListener(this);
        add(label1);
        add(label2);
        add(textArea);
        add(button);
        setSize(400, 450);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        String words[] = text.split("\\s");
        label1.setText("Words: " + words.length);
        label2.setText("Characters: " + text.length());
    }

    public static void main(String[] args) {
        new AwtTextArea();
    }
}
