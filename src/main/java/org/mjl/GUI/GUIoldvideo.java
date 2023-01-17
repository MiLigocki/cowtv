package org.mjl.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIoldvideo implements ActionListener {

    JFrame jFrame = new JFrame();
    JPanel jPanel = new JPanel();

    JLabel jLabel = new JLabel("Oto coś");
    public GUIoldvideo() {

        Border border1 = BorderFactory.createEmptyBorder(500,400,500,400);
        jPanel.setBorder(border1);
        jPanel.setLayout(new GridLayout(3,4));


        JButton button = new JButton("Pokaż program");
        button.addActionListener(this);



        jFrame.add(button);
        jFrame.add(jPanel, BorderLayout.CENTER);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Cowtv");
        jFrame.pack();
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
