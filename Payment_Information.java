package com.MTProgram;

/**
 * Hello world!
 *
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    JTextField kidTicketTextField = new JTextField("0");
    JTextField adultTicketTextField = new JTextField("0");
    JTextField seniorTicketTextField = new JTextField("0");

    // Buttons
    JButton okButton = new JButton("OK");
    JButton clearButton = new JButton("Clear");
    JButton backButton = new JButton("Back");

    // FileWriter && BufferedReader
    FileWriter fw;
    BufferedReader br;

    public Payment_Information() throws FileNotFoundException {

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
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        // EDITS
        accountIDTextField.setEditable(false);
        placeHolderTextField.setEditable(false);
        //Random Number does not match
        //accountIDTextField.setText(SignUpForm.getAccountID().toString());
        //boolean vcc = false;
    }
//    public  boolean verifyCCNUM(){
//            boolean vccn = false;
//        try{
//                if (CCNumTextField.getText().trim().length() == 16 || CCNumTextField.getText().trim().length() == 15){
//            System.out.println("VALID");
//            vccn = true;
//                        } else{
//                    
//            CCNumTextField.requestFocusInWindow();
//            
//            JOptionPane.showMessageDialog(frame, "Please enter a valid Credit Card Number" , "Warning", JOptionPane.WARNING_MESSAGE);
//            
//            //okButton.setActionCommand(null);
//            
//        }}catch(Exception e){
//            
//        }
//            return vccn;
//}

    static int totalTickets = 0;
//    public void verifyCC(){
//        boolean vcc = false;
//        boolean vccn = false;
//        boolean expd = false;
//        boolean seccode = false;
//        String ccn = CCNumTextField.getText();
//        String exp = CCExpDateTextField.getText();
//        String sec = CCsecurityCodeTextField.getText();

//while(!verifyCCNUM())
//        while (seccode != true && expd != true && vccn != true)
//verifyCCNUM();
//        
//        if (CCNumTextField.getText().trim().length() == 16 || CCNumTextField.getText().trim().length() == 15){
//            System.out.println("VALID");
//            vccn = true;
//        } else{
//            CCNumTextField.requestFocusInWindow();
//            JOptionPane.showMessageDialog(frame, "Please enter a valid Credit Card Number" , "Warning", JOptionPane.WARNING_MESSAGE);
//            
//        }
//        if(){
//            expd = true;
//        } else{
//            CCExpDateTextField.requestFocusInWindow();
//            JOptionPane.showMessageDialog(frame, "Please enter a valid Expiration Date" , "Warning", JOptionPane.WARNING_MESSAGE);
//        }
//        if(){
//            seccode = true;
//        }else{
//            CCsecurityCodeTextField.requestFocusInWindow();
//            JOptionPane.showMessageDialog(frame, "Please enter a valid Security Code" , "Warning", JOptionPane.WARNING_MESSAGE);
////        } 
//        
//        
//    }
//    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //OK BUTTON COMMANDS
        //Create Variables
        String creditCardNum, expDate, securityCode, childTickets, adultTickets,
                seniorTickets, ID, accountID;
//        //Initialize Variables
        creditCardNum = CCNumTextField.getText();
        expDate = CCExpDateTextField.getText();
        securityCode = CCsecurityCodeTextField.getText();
        childTickets = kidTicketTextField.getText();
        adultTickets = adultTicketTextField.getText();
        seniorTickets = seniorTicketTextField.getText();
        totalTickets = 0;
        boolean vcc = false;

        if (ae.getActionCommand() == okButton.getActionCommand()) {
//                    //Create Variables
//        String  creditCardNum, expDate, securityCode, childTickets, adultTickets,
//                seniorTickets, ID, accountID;
//        //Initialize Variables
//        creditCardNum = CCNumTextField.getText();
//        expDate = CCExpDateTextField.getText();
//        securityCode = CCsecurityCodeTextField.getText();
//        childTickets = kidTicketTextField.getText();
//        adultTickets = adultTicketTextField.getText();
//        seniorTickets = seniorTicketTextField.getText();
//        totalTickets = 0;
            if (creditCardNum.isEmpty() || securityCode.isEmpty() || childTickets.isEmpty() || adultTickets.isEmpty() || seniorTickets.isEmpty()) {
                if (creditCardNum.isEmpty()) {
                    CCNumTextField.requestFocusInWindow();
                    System.out.println("1");

                } else if (!creditCardNum.isEmpty()) {
                    //CHECK NUMBER
                } else if (expDate.isEmpty()) {
                    CCExpDateTextField.requestFocusInWindow();
                } else if (!securityCode.isEmpty()) {
                    //CHECK NUM
                } else if (securityCode.isEmpty()) {
                    CCsecurityCodeTextField.requestFocusInWindow();
                } else if (!securityCode.isEmpty()) {
                    //CHECK NUM
                }
            } else if (!creditCardNum.isEmpty() && !securityCode.isEmpty() && !childTickets.isEmpty() && !adultTickets.isEmpty() && !seniorTickets.isEmpty()) {
//                if (CCNumTextField.getText().trim().length() == 16 || CCNumTextField.getText().trim().length() == 15) {
//                    System.out.println("VALID");
//                    if (date is correct) {
//                       if (security code is correct
//                        vcc == true;
//                        ) {
//                    
//                } else {
//                    CCsecurityCodeTextField.requestFocusInWindow();
//                    JOptionPane.showMessageDialog(frame, "Please enter a valid Security Code", "Warning", JOptionPane.WARNING_MESSAGE);
//        }
//                    }else {
//                        CCExpDateTextField.requestFocusInWindow();
//                        JOptionPane.showMessageDialog(frame, "Please enter a valid Expiration Date", "Warning", JOptionPane.WARNING_MESSAGE);
//                    }
//                } else {
//                    CCNumTextField.requestFocusInWindow();
//                    JOptionPane.showMessageDialog(frame, "Please enter a valid Credit Card Number", "Warning", JOptionPane.WARNING_MESSAGE);
//
//                }
                vcc = true;
            }
            //verifyCC();

            if (vcc == true) {

                try {
                    // SUM Tickets

                    totalTickets = Integer.valueOf(kidTicketTextField.getText()) + Integer.valueOf(adultTicketTextField.getText())
                            + Integer.valueOf(seniorTicketTextField.getText());
                    if (totalTickets > 10 /**or if the theater doesn't have enough seats for all the tickets*/) {
                        JOptionPane.showMessageDialog(frame, "You can only purchase 10 or less tickets", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else
                    {
                    SeatReservation sr = new SeatReservation();
                    
                    //frame.setVisible(false);
                    // frame.dispose();

                    placeHolderTextField.setText(String.valueOf(totalTickets));
                    }
//                FileWriter fw4 = new FileWriter(new File("dataTransfer.txt"));
//                fw4.write(placeHolderTextField.getText());
//                fw4.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Please Fill All  Fields.");

                }
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
            kidTicketTextField.setText("0");
            adultTicketTextField.setText("0");
            seniorTicketTextField.setText("0");
            CCsecurityCodeTextField.setText(null);
            placeHolderTextField.setText(null);

        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        Payment_Information pi = new Payment_Information();

    }
}
