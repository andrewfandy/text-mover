package com.application.gui;

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
        this.add(left, FlowLayout.CENTER);
        this.add(right, FlowLayout.CENTER);
    }
}
