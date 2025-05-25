package ui;

import javax.swing.*;
import dao.UserDAO;
import model.User;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FASTag Login");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton loginBtn = new JButton("Login");

        frame.setSize(300, 200);
        frame.setLayout(null);

        userLabel.setBounds(30, 30, 80, 25);
        passLabel.setBounds(30, 70, 80, 25);
        userField.setBounds(120, 30, 120, 25);
        passField.setBounds(120, 70, 120, 25);
        loginBtn.setBounds(100, 110, 80, 25);

        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userField);
        frame.add(passField);
        frame.add(loginBtn);

        loginBtn.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());
            User user = new User(username, password);
            if (UserDAO.validateUser(user)) {
                JOptionPane.showMessageDialog(frame, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}