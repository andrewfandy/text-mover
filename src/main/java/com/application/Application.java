package com.application;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.application.gui.ArrowMenuGUI;
import com.application.gui.ColorMenuGUI;
import com.application.gui.MoveAreaGUI;

public class Application extends JFrame {

    Application() {
        this.setVisible(true);

        this.setSize(420, 240);
        this.setTitle("Text Mover Application");

        // centering frame relative to screen
        this.setLocationRelativeTo(null);

        // Close the app when user clicks the Exit Button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main frame layout
        BorderLayout layout = new BorderLayout();
        this.setLayout(layout);

        // Add Color Menu Bar
        ColorMenuGUI menu = new ColorMenuGUI();
        this.add(menu, BorderLayout.NORTH);

        // Add Move Area
        MoveAreaGUI area = new MoveAreaGUI();
        this.add(area, BorderLayout.CENTER);

        // Add Arrows Menu
        ArrowMenuGUI arrows = new ArrowMenuGUI();
        this.add(arrows, BorderLayout.PAGE_END);

    }

    public static void main(String[] args) {
        new Application();
    }

}