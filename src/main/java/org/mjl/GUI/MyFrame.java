package org.mjl.GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cowtv");
        this.setSize(600,700);
        this.getContentPane().setBackground(new Color(131, 57, 133));
        ImageIcon image = new ImageIcon("src/main/logo.png");
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }
}
