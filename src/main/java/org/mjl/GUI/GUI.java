package org.mjl.GUI;

import javax.swing.*;

public class GUI  {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("src/main/biglogo.png");

        JLabel label = new JLabel();
        label.setText("Bro, do you even code");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);


        MyFrame myFrame = new MyFrame();

        myFrame.add(label);






    }
}
