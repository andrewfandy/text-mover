package com.application.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.application.controller.ColorMenuController;

public class ColorMenuGUI extends JPanel {

    private JRadioButton redBtn, yellowBtn, blackBtn, orangeBtn, greenBtn;

    public ColorMenuGUI() {
        ButtonGroup group = new ButtonGroup();
        redBtn = new JRadioButton("Red");
        yellowBtn = new JRadioButton("Yellow");
        blackBtn = new JRadioButton("Black");
        orangeBtn = new JRadioButton("Orange");
        greenBtn = new JRadioButton("Green");

        // Grouping buttons
        group.add(redBtn);
        group.add(yellowBtn);
        group.add(blackBtn);
        group.add(orangeBtn);
        group.add(greenBtn);

        // Add each button to panel
        this.add(redBtn);
        this.add(yellowBtn);
        this.add(blackBtn);
        this.add(orangeBtn);
        this.add(greenBtn);

        redBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ColorMenuController.setColorText(Color.RED);
            }
        });

        yellowBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ColorMenuController.setColorText(Color.YELLOW);
            }
        });

        blackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ColorMenuController.setColorText(Color.BLACK);
            }
        });

        orangeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ColorMenuController.setColorText(Color.ORANGE);
            }
        });

        greenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ColorMenuController.setColorText(Color.GREEN);
            }
        });

    }

}
