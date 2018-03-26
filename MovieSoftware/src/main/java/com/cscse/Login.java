/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cscse;

/**
 *
 * @author Robert
 */
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {

    // frame
    JFrame window = new JFrame("Login");

    // text/password fields
    JTextField emailTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();

    //Jbuttons
    JButton loginButton = new JButton("Login");
    JButton cancelButton = new JButton("Cancel");
    JButton guestButton = new JButton("Guest");
    JButton signUpButton = new JButton("Sign Up");

    // JLabels
    JLabel emailLabel = new JLabel("Email:");
    JLabel passwordLabel = new JLabel("Password:");

    // grid placeholders 
    JLabel blank = new JLabel("");
    JLabel blank1 = new JLabel("");
    JLabel blank2 = new JLabel("");
    JLabel blank3 = new JLabel("");
    JLabel blank4 = new JLabel("");
    JLabel blank5 = new JLabel("");
    JLabel blank6 = new JLabel("");
    JLabel blank7 = new JLabel("");
    JLabel blank8 = new JLabel("");
    JLabel blank9 = new JLabel("");
    JLabel blank10 = new JLabel("");
    JLabel blank11 = new JLabel("");
    JLabel blank12 = new JLabel("");

    //Scanner sc;
    BufferedReader br;
    FileWriter wr;

    public Login() {

        //set GridLayout
        GridLayout gl = new GridLayout();
        gl.setColumns(6);
        gl.setRows(7);
        window.setLayout(gl);

        //add Listeners
        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);
        guestButton.addActionListener(this);
        signUpButton.addActionListener(this);

        // add accessories to the grid
        window.add(blank);
        window.add(blank1);
        window.add(blank2);

        window.add(emailLabel);
        window.add(emailTextField);
        window.add(blank3);

        window.add(blank4);
        window.add(blank5);
        window.add(blank6);

        window.add(passwordLabel);
        window.add(passwordTextField);
        window.add(blank7);

        window.add(blank8);
        window.add(blank9);
        window.add(blank10);

        window.add(signUpButton);
        window.add(loginButton);
        window.add(guestButton);

        window.add(blank11);
        window.add(cancelButton);
        window.add(blank12);

        //set size
        window.setSize(400, 250);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //LOGIN BUTTON ACTIONS
        if (ae.getActionCommand() == loginButton.getActionCommand()) {

            try {
                // create variables
                // initialize variables
                boolean found = false;

                try {
                    Scanner sc = new Scanner(System.in);
                    sc = new Scanner(new File("customerInfo.txt"));
                    sc.useDelimiter(":");
                    String email, password;
                    String tempEmail = emailTextField.getText().trim();
                    String tempPassword = passwordTextField.getText().trim();

                    while (sc.hasNext() && !found) {
                        email = sc.next().trim();
                        password = sc.next().trim();

                        if (tempEmail.equals(email) && tempPassword.equals(password)) {
                            found = true;
                            blank3.setText("Success");
                            blank7.setText("Success");
                            found = true;
                            // Look for account number 
                            Scanner sca = new Scanner(new File("random.txt"));

                            // Open frame
                            Payment_Information pi = new Payment_Information();
                            System.out.println("Login Success");
                            blank3.setText(null);
                            blank7.setText(null);
                            window.setVisible(false);
                            window.dispose();

                        }
                        if (tempEmail.equals(email)) {
                            blank3.setText("Success");
                        } else {
                            blank3.setText("Incorrect");

                        }
                        if (tempPassword.equals(password)) {
                            blank7.setText("Success");
                        } else {
                            blank7.setText("Incorrect");
                        }
                        if (tempEmail.isEmpty()) {
                            blank7.setText("Enter a Password");
                        }
                        if (tempPassword.isEmpty()) {
                            blank3.setText("Enter an Email");
                        }
                    }

                } catch (Exception e) {

                }

                System.out.println("Login Attempt");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "");

            }
        }

        // CANCEL BUTTON ACTIONS
        if (ae.getActionCommand() == cancelButton.getActionCommand()) {
            try {
                emailTextField.setText(null);
                passwordTextField.setText(null);
                blank3.setText(null);
                blank7.setText(null);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "");

            }
        }
        // SIGN UP BUTTON ACTIONS
        if (ae.getActionCommand() == signUpButton.getActionCommand()) {
            try {
                emailTextField.setText(null);
                passwordTextField.setText(null);
                window.setVisible(false);
                window.dispose();
                SignUpForm suf = new SignUpForm();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "");

            }
        }
        // GUEST BUTTON COMMANDS
        if (ae.getActionCommand() == guestButton.getActionCommand()) {
            try {
                emailTextField.setText(null);
                passwordTextField.setText(null);
                blank3.setText(null);
                blank7.setText(null);
                window.setVisible(false);
                window.dispose();
                Payment_Information pi = new Payment_Information();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "");

            }
        }
    }

    public static void scan() throws FileNotFoundException {
        boolean found = false;
        Scanner sca = new Scanner(new File("random.txt"));
        String a,b,c,d,e;
        sca.useDelimiter(":");

        while (sca.hasNext() && !found) {
            a = sca.next().trim();
            b = sca.next().trim();
            c = sca.next().trim();
            d = sca.next().trim();
            e = sca.next().trim();
            System.out.println(a + " " + b + " " + c + " " + d + " " + e);
       
        }
        
    }

    public static void main(String[] args) throws FileNotFoundException {
        Login l = new Login();
//        SignUpForm suf = new SignUpForm();
//        Payment_Information pi = new Payment_Information();
//        SeatReservation s = new SeatReservation();
//        Confirmation_Page p = new Confirmation_Page();
//scan();
    }
}
