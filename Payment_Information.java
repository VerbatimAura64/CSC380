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

    //Variable Labels

    JLabel AccountIDLabel = new JLabel("Account Number:");
    JLabel ageLabel = new JLabel("Age:");
    JLabel numTicketLabel = new JLabel("Number of Tickets:");
    JLabel kidLabel = new JLabel("Number of Child Tickets:");
    JLabel adultLabel = new JLabel("Number 0f Adult Tickets:");
    JLabel seniorLabel = new JLabel("Number of Senior Tickets:");
    JLabel movieLabel = new JLabel("Zeee Moviez");


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
    
    public Payment_Information(){
       
        //set GridLayout
        GridLayout fl = new GridLayout();
        fl.setColumns(2);
        fl.setRows(10);
        frame.setLayout(fl);
        
        //add Listeners
        okButton.addActionListener(this);
        clearButton.addActionListener(this);
        
        // add accessories to the grid
        frame.add(AccountIDLabel);
        frame.add(accountIDTextField);
              
        frame.add(CCNumLabel);
        frame.add(CCNumTextField);
        
        frame.add(CCExpDateLabel);
        frame.add(CCExpDateTextField);
        
        frame.add(CCsecurityCodeLabel);
        frame.add(CCsecurityCodeTextField);
              
        frame.add(kidLabel);
        frame.add(kidTicketTextField);
        
        frame.add(adultLabel);
        frame.add(adultTicketTextField);
        
        frame.add(seniorLabel);
        frame.add(seniorTicketTextField);
        
        frame.add(numTicketLabel);
        frame.add(placeHolderTextField);
//        
//        frame.add(totalLabel);
//        frame.add(totalPriceTextField);
        
        frame.add(okButton);
        frame.add(clearButton);
        
        frame.add(backButton);
        frame.add(movieLabel);
        

        
        
//set size
        frame.setSize(400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        
    }
    public static void main(String[] args) {

        Payment_Information pi = new Payment_Information();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
