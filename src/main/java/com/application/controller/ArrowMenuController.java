package com.application.controller;

import javax.swing.JLabel;

import com.application.components.MoveAreaGUI;

public class ArrowMenuController {

    public static void setPosition(int posX) {
        JLabel label = MoveAreaGUI.getLabel();
        int newPositionX = label.getX() + posX;

        int panelWidth = label.getParent().getWidth();
        int labelWidth = label.getWidth();

        if (newPositionX >= 0 && newPositionX + labelWidth <= panelWidth) {
            label.setLocation(newPositionX, label.getY());
        }
    }
}
