package com.application.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveAreaGUI extends JPanel {

    private JLabel label;
    private static final String TEXT = "Programming is Fun";

    public MoveAreaGUI() {
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        label = new JLabel(TEXT);
        this.add(label);

    }

    public static Color setColorText(Color color) {
        return color;
    }

}
