package com.tyler;

import twitter4j.StatusUpdate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwitterBotGUI extends JFrame {
    private JTextField statusUpdateTextField;
    private JButton updateStatusButton;
    private JPanel rootPanel;

    TwitterBotGUI() {
        setTitle("Final Fantasy Twitter Bot");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        addListeners();
    }

    private void addListeners() {
        updateStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String status = statusUpdateTextField.getText();
                if (status.trim().length() == 0) {
                    JOptionPane.showMessageDialog(TwitterBotGUI.this, "Please Enter A Status Update");
                    return;
                }


            }
        });
    }

}
