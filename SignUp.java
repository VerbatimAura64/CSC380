package com.MTProgram;

/**
 *
 *
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUpForm implements ActionListener {

    // create fields
    JFrame window = new JFrame("New Member Sign Up");
    JTextField nameTextField = new JTextField();
    JLabel ageLabel = new JLabel("Age:");
    JTextField ageTextField = new JTextField();
    JTextField emailTextField = new JTextField();
    JTextField verifyEmailTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    JPasswordField verifyPasswordTextField = new JPasswordField();
    JTextField displayError = new JTextField();
    JLabel nameLabel = new JLabel("Name:");
    JLabel emailLabel = new JLabel("Email Address:");
    JLabel verifyEmailLabel = new JLabel("Verify Email:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel verifyPasswordLabel = new JLabel("Verify Password:");
    JLabel displayErrorLabel = new JLabel("Status:");
    JButton confirmButton = new JButton("Confirm");
    JButton cancelButton = new JButton("Cancel");

    FileWriter fw;

    SignUpForm() {

        GridLayout gl = new GridLayout();
        gl.setColumns(2);
        gl.setRows(8);
        window.setLayout(gl);

        //add Listeners
        confirmButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // add accessories to the Grid
        window.add(nameLabel);
        window.add(nameTextField);

        window.add(ageLabel);
        window.add(ageTextField);

        window.add(emailLabel);
        window.add(emailTextField);
        window.add(verifyEmailLabel);
        window.add(verifyEmailTextField);

        window.add(passwordLabel);
        window.add(passwordTextField);
        window.add(verifyPasswordLabel);
        window.add(verifyPasswordTextField);

        window.add(displayErrorLabel);
        window.add(displayError);

        window.add(confirmButton);
        window.add(cancelButton);
        displayError.setEditable(false);

        // add tooltips
        nameLabel.setToolTipText("Enter Your First and Last Name");
        ageLabel.setToolTipText("Enter Your Age");
        emailLabel.setToolTipText("Enter a Valid Email Address");
        verifyEmailLabel.setToolTipText("Make Sure The Information Matches Or Your Account Will Not Be Created");
        passwordLabel.setToolTipText("Enter A Password");
        verifyPasswordLabel.setToolTipText("Make Sure The Information Matches Or Your Account Will Not Be Created");
        displayErrorLabel.setToolTipText("Click 'Confirm' To Continue Or 'Cancel' To Return To The Login Screen");
        confirmButton.setToolTipText("Click Here To Create Account");
        cancelButton.setToolTipText("Click Here To Cancel Account");

        //set size
        window.setSize(400, 250);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }

    public static void main(String[] args) throws FileNotFoundException {

        SignUpForm suf = new SignUpForm();
//        Payment_Information pi = new Payment_Information();
//        Confirmation_Page cp = new Confirmation_Page();
//        Login l = new Login();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand() == confirmButton.getActionCommand()) {

            try {
                // create variables
                String name, age, email, verifiedEmail,
                        password, verifiedPassword;

                //initialize variables
                verifiedEmail = verifyEmailTextField.getText();
                email = emailTextField.getText();
                verifiedPassword = verifyPasswordTextField.getText();
                password = passwordTextField.getText();
                age = ageTextField.getText();
                name = nameTextField.getText();

                if (name.isEmpty() || age.isEmpty() || email.isEmpty() || verifiedEmail.isEmpty() || password.isEmpty() || verifiedPassword.isEmpty()) {
                    if (name.isEmpty()) {
                        nameTextField.requestFocusInWindow();
                        displayError.setText("Please enter a name");

                    } else if (name.contains(":")) {
                        displayError.setText("Name cannot contain ':'");
                        nameTextField.requestFocusInWindow();
                    } else if (age.isEmpty()) {
                        ageTextField.requestFocusInWindow();
                        displayError.setText("Please enter your age");
                    } else if (age.contains(":")) {
                        displayError.setText("Age cannot contain ':'");
                        ageTextField.requestFocusInWindow();
                    } else if (email.isEmpty()) {
                        emailTextField.requestFocusInWindow();
                        displayError.setText("Please enter email");
                    } else if (email.contains(":")) {
                        displayError.setText("Email cannot contain ':'");
                        emailTextField.requestFocusInWindow();
                    } else if (verifiedEmail.isEmpty()) {
                        verifyEmailTextField.requestFocusInWindow();
                        displayError.setText("Please confirm email");
                    } else if (!email.equals(verifiedEmail)) {
                        verifyEmailTextField.requestFocusInWindow();
                        verifyEmailTextField.selectAll();
                        displayError.setText("Emails don't match");
                    } else if (verifiedEmail.contains(":")) {
                        displayError.setText("Email cannot contain ':'");
                        verifyEmailTextField.requestFocusInWindow();
                    } else if (password.isEmpty()) {
                        passwordTextField.requestFocusInWindow();
                        displayError.setText("Please enter password");
                    } else if (password.contains(":")) {
                        displayError.setText("Password cannot contain ':'");
                        passwordTextField.requestFocusInWindow();
                    } else if (verifiedPassword.isEmpty()) {
                        verifyPasswordTextField.requestFocusInWindow();
                        displayError.setText("Please verify password");
                    } else if (verifiedPassword.contains(":")) {
                        displayError.setText("Password cannot contain ':'");
                        verifyPasswordTextField.requestFocusInWindow();
                    }
                } else if (verifiedEmail.equals(email) && verifiedPassword.equals(password)) {
                    FileWriter fw = new FileWriter("customer.txt", true);

                    // EDIT
                    fw.write("Customer ID:" + getAccountID() + "\t");
//////////////////                      fw.write(":" + getAccountID());
                    fw.write("Age:\t" + ageTextField.getText() + "\t");
                    fw.write("Name:\t" + nameTextField.getText() + "\t");
                    fw.write("Email Address:\t" + verifyEmailTextField.getText() + "\t");
                    // verifyPasswordTextField.getPassword() yields encrypted text.
                    fw.write("Password:\t" + verifyPasswordTextField.getText() + "\n");
                    displayError.setText(null);
                    displayError.setText("Member Created");

                    //UPDATE LOGIN PAGE customerInfo.txt APPEND MAKE SURE STAYS TRUE
                    FileWriter fw2 = new FileWriter("customerInfo.txt", true);
                    fw2.write(verifyEmailTextField.getText() + ":" + verifyPasswordTextField.getText() + ":" + "\n");

                    // UPDATE FILE for DUPLICATES random.txt
                    FileWriter fw3 = new FileWriter("random.txt", true);
                    fw3.write(getAccountID() + ":" + ageTextField.getText() + ":" + nameTextField.getText()
                            + ":" + verifyEmailTextField.getText() + ":" + verifyPasswordTextField.getText() + ":");

                    fw.close();
                    fw2.close();
                    fw3.close();
                    window.setVisible(false);
                    window.dispose();
                    System.out.println("File Updated");
                    //Payment_Information pi = new Payment_Information();
                    MainWindow mw = new MainWindow();
                    mw.setVisible(true);

                    // This is Where we Should link to Payment Info
                    // such as Credit card or in store purchase
                } else {
                    if (!email.equals(verifiedEmail)) {
                        verifyEmailTextField.requestFocusInWindow();
                        verifyEmailTextField.selectAll();
                        displayError.setText("Emails don't match");
                    } else if (!password.equals(verifiedPassword)) {
                        verifyPasswordTextField.requestFocusInWindow();
                        verifyPasswordTextField.selectAll();
                        displayError.setText("Passwords don't match");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "");

            }
        }
        if (ae.getActionCommand() == cancelButton.getActionCommand()) {
            nameTextField.setText(null);
            emailTextField.setText(null);
            verifyEmailTextField.setText(null);
            passwordTextField.setText(null);
            verifyPasswordTextField.setText(null);
            displayError.setText(null);
            window.setVisible(false);
            window.dispose();
            Login l = new Login();
            // THIS IS WHERE WE SHOULD LINK LOGIN GUI, 
            // ONCE WE HIT CANCEL RETURN TO THE LOGIN/CREATE ACCOUNT SCREEN
        }
    }

    public static String getAccountID() throws FileNotFoundException {

        String accountID = Integer.toString(checkRNG()).trim();
        //System.out.println(accountID);
        return accountID;
    }

    public static int RandomNumGenerator() {
        Random r = new Random();
        int number = r.nextInt(899) + 100;
        //System.out.println(number);
        return number;
    }

    public static int checkRNG() throws FileNotFoundException {
        // Scanner with While LOOP to read file and build Arraylist
        Scanner s = new Scanner(new File("customer.txt"));
        ArrayList<String> aList = new ArrayList<String>();

        while (s.hasNext()) {
            //Regular Expression, only searchers for Number Characters
            s.useDelimiter("[^0-9]+");
            aList.add(s.next());
            //System.out.println(aList);

        }

        // While Loop to check for dups as Strings
        int randomnum = 0;

        // to convert an int to a string use the value + ""
        while (aList.contains(Integer.toString(randomnum))) {
            randomnum = RandomNumGenerator();
            //System.out.println("Duplicate");

        }

        //System.out.println("YOU ROCK");
        //System.out.println(randomnum);

        return randomnum;
    }
}
