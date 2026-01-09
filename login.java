package blood.management.system;

import Project.conn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener {

    JTextField tfusername;
    JPasswordField tfpassword; 

    login() {
        getContentPane().setBackground(new Color(153, 0, 0));
        setLayout(null);

        // Username Label
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(100, 40, 100, 30);
        lblusername.setForeground(Color.WHITE);
        add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(200, 40, 250, 30);
        add(tfusername);

        // Password Label
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(100, 90, 100, 30);
        lblpassword.setForeground(Color.WHITE);
        add(lblpassword);

        tfpassword = new JPasswordField(); 
        tfpassword.setBounds(200, 90, 250, 30);
        add(tfpassword);

        // Login Button
        JButton login = new JButton("Login");
        login.setBounds(200, 140, 100, 30);
        login.setBackground(Color.WHITE);
        login.setForeground(Color.RED);
        login.addActionListener(this);
        add(login);

        // Close Button
        JButton close = new JButton("Close");
        close.setBounds(350, 140, 100, 30);
        close.setBackground(Color.WHITE);
        close.setForeground(Color.RED);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Close the application
            }
        });
        add(close);

        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String username = tfusername.getText();
        char[] passwordChars = tfpassword.getPassword();
        String password = new String(passwordChars); 

        conn c = new conn();
        String query = "SELECT * FROM login WHERE username = ? AND password = ?"; 

        try (PreparedStatement pst = c.getConnection().prepareStatement(query)) {
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                setVisible(false); 
                new homepage().setVisible(true);  
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
