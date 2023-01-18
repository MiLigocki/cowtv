package org.mjl.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {



    public MyFrame () {

        JButton button = new JButton();
        button.setBounds(20,20,20,20);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("I am a button");
        button.setFocusable(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cowtv");
        this.setSize(1000,800);
//        this.getContentPane().setBackground(new Color(131, 57, 133));
        ImageIcon image = new ImageIcon("src/main/logo.png");
//        this.setIconImage(image.getImage());
        this.add(button);
        this.setVisible(true);

    }


}
