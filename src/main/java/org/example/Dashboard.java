package org.example;

import javax.swing.*;
import java.awt.*;

public class Dashboard {

    public static void launchDashboard() {

        JFrame frame = new JFrame("Procesy Wytwarzania Oprogramowania");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Welcome to the Dashboard!", SwingConstants.CENTER);
        JButton button1 = new JButton("Option 1");
        JButton button2 = new JButton("Option 2");
        JButton button3 = new JButton("Option 3");

        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.add(panel);

        frame.setVisible(true);
    }
}
