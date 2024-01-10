package com.application.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveAreaGUI extends JPanel {

    private static final String TEXT = "Programming is Fun";
    private final static JLabel LABEL = new JLabel(TEXT);
    private final Color DEFAULT_COLOR = new Color(0xFF0000);

    public MoveAreaGUI() {
        BorderLayout layout = new BorderLayout();
        this.setLayout(layout);

        LABEL.setHorizontalAlignment(JLabel.CENTER);

        // Set default color when instantiate this class
        setColorText(DEFAULT_COLOR);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(LABEL);

    }

    public static void setColorText(Color color) {
        LABEL.setForeground(color);
    }

    public static Point getTextPosition() {
        return LABEL.getLocationOnScreen();
    }

}
