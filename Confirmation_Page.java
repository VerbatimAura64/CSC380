package outwrite;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Confirmation_Page implements ActionListener{

    // Frame
    JFrame frame = new JFrame("Confirmation Page");
    // Labels
    JLabel AccountIDLabel = new JLabel("Account Number:");
    JLabel purchaseIDLabel = new JLabel("Purchase ID:");
    JLabel totalLabel = new JLabel("Total:");
    JLabel nameLabel = new JLabel("Name:");
    JLabel movieLabel = new JLabel("Movie:");
    JLabel theaterLabel = new JLabel("Theater:");
    JLabel seatLabel = new JLabel("Seat(s):");

    // TextFields
    JTextField nameTextArea = new JTextField();
    JTextField accountIDTextField = new JTextField();
    JTextField purchaseIDTextField = new JTextField();
    JTextField totalPriceTextField = new JTextField();
    JTextField seatTextField = new JTextField();
    JTextField movieTextField = new JTextField();
    JTextField theaterTextField = new JTextField();

    // Buttons
    JButton submitButton = new JButton("Submit");
    JButton cancelButton = new JButton("Cancel");

    // FileWriter && BufferedReader
    FileWriter fw;
    BufferedReader br;

    public Confirmation_Page() {
        // Set Layout
        GridLayout cp = new GridLayout();
        cp.setColumns(2);
        cp.setRows(8);
        frame.setLayout(cp);

        // add listeners
        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);
        
        // add accessories to the grid
        frame.add(nameLabel);
        frame.add(nameTextArea);
        
        frame.add(AccountIDLabel);
        frame.add(accountIDTextField);
        
        frame.add(purchaseIDLabel);
        frame.add(purchaseIDTextField);
        
        frame.add(totalLabel);
        frame.add(totalPriceTextField);
        
        frame.add(movieLabel);
        frame.add(movieTextField);
        
        frame.add(theaterLabel);
        frame.add(theaterTextField);
        
        frame.add(seatLabel);
        frame.add(seatTextField);
        
        frame.add(submitButton);
        frame.add(cancelButton);
              
        //set size
        frame.setSize(400, 250);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
    }
    public static void main(String[] args) {

         Confirmation_Page cp = new Confirmation_Page();

    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
