package com.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstAwtApplication {

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400,300);
        frame.setTitle("Yokkiiii");
        frame.setVisible(true);
        frame.setBackground(Color.BLACK);

        frame.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
