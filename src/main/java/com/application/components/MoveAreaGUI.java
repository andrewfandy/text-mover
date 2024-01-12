package com.application.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveAreaGUI extends JPanel {

    private static final String TEXT = "Programming is Fun";
    private static JLabel label;

    public MoveAreaGUI() {
        this.setLayout(null);
        label = new JLabel(TEXT);
        // label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(label.getPreferredSize());

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(label);

    }

    public static JLabel getLabel() {
        return label;
    }

    public void centerLabel() {
        int x = (this.getWidth() - label.getWidth()) / 2;
        int y = (this.getHeight() - label.getHeight()) / 2;
        label.setLocation(x, y);
    }

    public static Point getTextPosition() {
        return label.getLocationOnScreen();
    }

}
