package com.application.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.application.controller.ArrowMenuController;

public class ArrowMenuGUI extends JPanel {
    private JButton left, right;

    public ArrowMenuGUI() {
        left = new JButton("<==");
        right = new JButton("==>");

        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);
        this.add(left);
        this.add(right);

        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ArrowMenuController.setPosition(10);
            }

        });

        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ArrowMenuController.setPosition(-10);
            }
        });
    }
}
