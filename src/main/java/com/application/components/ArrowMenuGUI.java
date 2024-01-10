package com.application.components;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ArrowMenuGUI extends JPanel {
    private JButton left, right;

    public ArrowMenuGUI() {
        left = new JButton("<==");
        right = new JButton("==>");

        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);
        this.add(left);
        this.add(right);
    }
}
