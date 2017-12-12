package com.tyler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Login form
Enviromental variables set for USERNAME and PASSWORD
USERNAME = tcaldwell89
PASSWORD = Relic2015!
 */

public class Login extends JFrame {

    private JTextField txtFieldUsername;
    private JPasswordField txtFieldPassword;
    private JButton btnLoginOk;
    private JPanel rootPanel;

    Login() {
        configureLoginForm();
    }

    private void configureLoginForm() {
        setTitle("Login");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        getRootPane().setDefaultButton(btnLoginOk);
        configureListeners();
    }

    //
    // ACTION LISTENERS FOR LOGIN
    // Action event listener for the btnLoginOk button
    private void configureListeners() {
        btnLoginOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Get the user input from the username and password text fields
                // .getPassword() returns an array, call arrayToString method
                String username = txtFieldUsername.getText();
                String password = arrayToString(txtFieldPassword.getPassword());
                // Compare, ignoring case, the user input Strings to the
                // Environment Variables for USERNAME and PASSWORD
                if (username.equalsIgnoreCase(System.getenv("USERNAME"))
                        && password.equalsIgnoreCase(System.getenv("PASSWORD"))) {
                    //If true, setVisible to false and create an instance of the TwitterBotGUI
                    setVisible(false);
                    TwitterBotGUI gui = new TwitterBotGUI();
                } else {
                    //If false, display an error message
                    JOptionPane.showMessageDialog(Login.this, "Error: Wrong Username or Password");
                }

            }
        });
    }
    //
    // METHODS FOR LOGIN
    // Converts the user input from txtFieldPassword from a Character Array to a String
    private String arrayToString(char[] password) {
        // Create a new instance of the StringBuilder class. Use a foreach loop to
        // append every char in the array to the instance variable, return string.
        StringBuilder result = new StringBuilder();
        for (char p : password)
        {
            result.append(p);
        }
        return result.toString();
    }
}
