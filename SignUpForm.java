package outwrite;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import static outwrite.OutWrite.getCustID;

public class SignUpForm implements ActionListener {

    // create fields
    JFrame window = new JFrame("New Member Sign Up");
    JTextField nameTextField = new JTextField();
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
        gl.setRows(7);
        window.setLayout(gl);

        //add Listeners
        confirmButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // add accessories to the Grid
        window.add(nameLabel);
        window.add(nameTextField);
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
        emailLabel.setToolTipText("Enter a Valid Email Address");
        verifyEmailLabel.setToolTipText("Make Sure The Information Matches Or Your Account Will Not Be Created");
        passwordLabel.setToolTipText("Enter A Password");
        verifyPasswordLabel.setToolTipText("Make Sure The Information Matches Or Your Account Will Not Be Created");
        displayErrorLabel.setToolTipText("Click 'Confirm' To Continue Or 'Cancel' To Return To The Login Screen");
        confirmButton.setToolTipText("Click Here To Create Account");
        cancelButton.setToolTipText("Click Here To Cancel Account");

        //set size
        window.setSize(550, 250);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

    public static void main(String[] args) {

        SignUpForm suf = new SignUpForm();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand() == confirmButton.getActionCommand()) {

            try {
                // create variables
                String name, email, verifiedEmail,
                        password, verifiedPassword;

                //initialize variables
                verifiedEmail = verifyEmailTextField.getText();
                email = emailTextField.getText();
                verifiedPassword = verifyPasswordTextField.getText();
                password = passwordTextField.getText();
                name = nameTextField.getText();
                
                if (name.isEmpty() || email.isEmpty() || verifiedEmail.isEmpty() || password.isEmpty() || verifiedPassword.isEmpty()) {
                    if (name.isEmpty()) {
                        nameTextField.requestFocusInWindow();
                        displayError.setText("Please enter a name");
                    } else if (email.isEmpty()) {
                        emailTextField.requestFocusInWindow();
                        displayError.setText("Please enter email");
                    } else if (verifiedEmail.isEmpty()) {
                        verifyEmailTextField.requestFocusInWindow();
                        displayError.setText("Please confirm email");
                    } else if (password.isEmpty()) {
                        passwordTextField.requestFocusInWindow();
                        displayError.setText("Please enter password");
                    } else if (verifiedPassword.isEmpty()) {
                        verifyPasswordTextField.requestFocusInWindow();
                        displayError.setText("Please verify password");
                    }
                } else if (verifiedEmail.equals(email) && verifiedPassword.equals(password)) {
                    FileWriter fw = new FileWriter("customer.txt", true);
                    fw.write("Customer ID:\t" + getAccountID() + "\t");
                    fw.write("Name:\t" + nameTextField.getText() + "\t");
                    fw.write("Email Address:\t" + verifyEmailTextField.getText() + "\t");
                    // verifyPasswordTextField.getPassword() yields encrypted text.
                    fw.write("Password:\t" + verifyPasswordTextField.getText() + "\n");
                    displayError.setText(null);
                    displayError.setText("Member Created");

                    fw.close();
                    System.out.println("File Updated");

                    // This is Where we Should link to Payment Info
                    // such as Credit card or in store purchase
                } else {
                    if (!email.equals(verifiedEmail)) {
                        verifyEmailTextField.requestFocusInWindow();
                        verifyEmailTextField.selectAll();
                        displayError.setText("Emails don't match");
                    } else if (password.equals(verifiedPassword)) {
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
            // THIS IS WHERE WE SHOULD LINK LOGIN GUI, 
            // ONCE WE HIT CANCEL RETURN TO THE LOGIN/CREATE ACCOUNT SCREEN
        }
    }

    private int getAccountID() {
        Random r = new Random();
        int accountID = r.nextInt(10) + 1;
        return accountID;

    }
}
