package outwrite;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

////    private int CCNum, CCiD[security code], ExpDate;
////    int purchaseID, totalPrice;
public class Payment_Information implements ActionListener {

    // create Frame
    JFrame frame = new JFrame("Enter Payment Preferences");

    // Labels
    JLabel CCNumLabel = new JLabel("Credit Card Number:");
    JLabel CCExpDateLabel = new JLabel("Expiration Date:");
    JLabel CCsecurityCodeLabel = new JLabel("Security Code:");

    // blank labels
    JLabel blank = new JLabel();
    JLabel blank1 = new JLabel();
    JLabel blank2 = new JLabel();
    JLabel blank3 = new JLabel();
    JLabel blank4 = new JLabel();
    JLabel blank5 = new JLabel();
    JLabel blank6 = new JLabel();
    JLabel blank7 = new JLabel();
    JLabel blank8 = new JLabel();
    JLabel blank9 = new JLabel();

    //Variable Labels
    JLabel AccountIDLabel = new JLabel("Account Number:");
    JLabel numTicketLabel = new JLabel("Number of Tickets:");
    JLabel kidLabel = new JLabel("Num. of Child Tickets:");
    JLabel adultLabel = new JLabel("Num. of Adult Tickets:");
    JLabel seniorLabel = new JLabel("Num of Senior Tickets:");
    JLabel movieLabel = new JLabel("         Zeee Moviez");

    // Text & Password Fields
    JTextField accountIDTextField = new JTextField();
    JTextField CCNumTextField = new JTextField();
    JTextField CCExpDateTextField = new JTextField();
    JTextField CCsecurityCodeTextField = new JTextField();
    JTextField placeHolderTextField = new JTextField();
    JTextField kidTicketTextField = new JTextField();
    JTextField adultTicketTextField = new JTextField();
    JTextField seniorTicketTextField = new JTextField();

    // Buttons
    JButton okButton = new JButton("OK");
    JButton clearButton = new JButton("Clear");
    JButton backButton = new JButton("Back");

    // FileWriter && BufferedReader
    FileWriter fw;
    BufferedReader br;

    public Payment_Information() {

        //set GridLayout
        GridLayout fl = new GridLayout();
        fl.setColumns(2);
        fl.setRows(10);
        frame.setLayout(fl);

        //add Listeners
        okButton.addActionListener(this);
        clearButton.addActionListener(this);
        backButton.addActionListener(this);

        // add accessories to the grid
        frame.add(AccountIDLabel);
        frame.add(accountIDTextField);
        frame.add(blank);

        frame.add(CCNumLabel);
        frame.add(CCNumTextField);
        frame.add(blank1);

        frame.add(CCExpDateLabel);
        frame.add(CCExpDateTextField);
        frame.add(blank2);

        frame.add(CCsecurityCodeLabel);
        frame.add(CCsecurityCodeTextField);
        frame.add(blank3);

        frame.add(kidLabel);
        frame.add(kidTicketTextField);
        frame.add(blank4);

        frame.add(adultLabel);
        frame.add(adultTicketTextField);
        frame.add(blank5);

        frame.add(seniorLabel);
        frame.add(seniorTicketTextField);
        frame.add(blank6);

        frame.add(numTicketLabel);
        frame.add(placeHolderTextField);
        frame.add(blank7);

        frame.add(backButton);
        frame.add(okButton);
        frame.add(clearButton);

        frame.add(blank8);
        frame.add(movieLabel);
        frame.add(blank9);

//set size
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        // EDITS
        accountIDTextField.setEditable(false);
        placeHolderTextField.setEditable(false);

    }

    public static void main(String[] args) {

        Payment_Information pi = new Payment_Information();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //OK BUTTON COMMANDS
        //Create Variables
        String creditCardNum, expDate, securityCode, childTickets, adultTickets,
                seniorTickets;
        int totalTickets = 0;

        //Initialize Variables
        creditCardNum = CCNumTextField.getText();
        expDate = CCExpDateTextField.getText();
        securityCode = CCsecurityCodeTextField.getText();
        childTickets = kidTicketTextField.getText();
        adultTickets = adultTicketTextField.getText();
        seniorTickets = seniorTicketTextField.getText();

        if (ae.getActionCommand() == okButton.getActionCommand()) {
            try {
                // SUM Tickets
                totalTickets = Integer.valueOf(kidTicketTextField.getText()) + Integer.valueOf(adultTicketTextField.getText())
                        + Integer.valueOf(seniorTicketTextField.getText());

                placeHolderTextField.setText(String.valueOf(totalTickets));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "");

            }
        }

        //BACK BUTTON COMMANDS
        if (ae.getActionCommand() == backButton.getActionCommand()) {
            accountIDTextField.setText(null);
            CCNumTextField.setText(null);
            CCExpDateTextField.setText(null);
            CCsecurityCodeTextField.setText(null);
            kidTicketTextField.setText(null);
            adultTicketTextField.setText(null);
            seniorTicketTextField.setText(null);
            CCsecurityCodeTextField.setText(null);
            placeHolderTextField.setText(null);
            Login l = new Login();
            frame.setVisible(false);
            frame.dispose();
        }

        // Clear BUTTON COMMANDS
        if (ae.getActionCommand() == clearButton.getActionCommand()) {
            CCNumTextField.setText(null);
            CCExpDateTextField.setText(null);
            CCsecurityCodeTextField.setText(null);
            kidTicketTextField.setText(null);
            adultTicketTextField.setText(null);
            seniorTicketTextField.setText(null);
            CCsecurityCodeTextField.setText(null);
            placeHolderTextField.setText(null);

        }
    }
}
