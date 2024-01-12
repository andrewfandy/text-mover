package com.application.controller;

import java.awt.Color;

import javax.swing.JLabel;

import com.application.components.MoveAreaGUI;

public class ColorMenuController {
    private static JLabel LABEL = MoveAreaGUI.getLabel();

    public static void setColorText(Color color) {
        LABEL.setForeground(color);
    }
}
