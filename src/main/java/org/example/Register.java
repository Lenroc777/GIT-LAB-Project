package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Register extends JFrame {
    private List<User> users = new ArrayList<>();
    private JTextField userInputField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JTextArea usersListArea;

    public Register() {
        setTitle("Rejestracja użytkowników");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        JLabel label = new JLabel("Nazwa użytkownika:");
        userInputField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Hasło:");
        passwordField = new JPasswordField(15);

        JLabel emailLabel = new JLabel("Adres e-mail:");
        emailField = new JTextField(15);

        JButton addButton = new JButton("Dodaj");



        inputPanel.add(label);
        inputPanel.add(userInputField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);
        inputPanel.add(emailLabel);
        inputPanel.add(emailField);
        inputPanel.add(new JLabel());
        inputPanel.add(addButton);

        usersListArea = new JTextArea();
        usersListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(usersListArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userInputField.getText();
                String password = new String(passwordField.getPassword());
                String email = emailField.getText();

                if (!username.isEmpty() && !password.isEmpty() && !email.isEmpty()) {
                    addUser(username, password, email);
                    clearFields();
                } else {
                    usersListArea.append("Wszystkie pola muszą być wypełnione.\n");
                }
            }
        });
    }

    public void addUser(String username, String password, String email) {
        if (!isUserRegistered(username)) {
            users.add(new User(username, password, email));
            usersListArea.append("Dodano użytkownika: " + username + "\n");
        } else {
            usersListArea.append("Użytkownik " + username + " już istnieje.\n");
        }
    }

    public boolean isUserRegistered(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private void clearFields() {
        userInputField.setText("");
        passwordField.setText("");
        emailField.setText("");
    }

    private static class User {
        private String username;
        private String password;
        private String email;

        public User(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public String getUsername() {
            return username;
        }
    }
}
