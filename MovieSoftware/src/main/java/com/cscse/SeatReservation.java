
package com.cscse;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Verbatim
 */
public class SeatReservation  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }
    
    private static class ThreadForGUI implements Runnable {

        public ThreadForGUI() {
        }

        @Override
        public void run() {
            SeatReservation gui = new SeatReservation();
            gui.getClass();
        }
        
    }
    
    public SeatReservation() {
        KFrame frame = new KFrame("");
        //frame.setVisible(true);
    }
    
    private class KFrame extends JFrame implements ActionListener{
        
        private JButton seat;
        private JButton seat1;
        private JButton seat2;
        private JButton seat3;
        private JButton seat4;
        private JButton seat5;
        private JButton seat6;
        private JButton seat7;
        private JButton seat8;
        
        private JLabel screenLabel;
        
        public KFrame(String title) {
            super(title);
            setSize(1000, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addComponents(getContentPane());
            addListeners();
            setVisible(true);
        }
        
        private void addComponents(Container contentPane){
            screenLabel = new JLabel("Select a seat");
            seat = new JButton("");
            seat1 = new JButton(" ");
            seat2 = new JButton("  ");
            seat3 = new JButton("   ");
            seat4 = new JButton("    ");
            seat5 = new JButton("     ");
            seat6 = new JButton("      ");
            seat7 = new JButton("       ");
            seat8 = new JButton("        ");
            GridLayout layout = new GridLayout(0,10);
            layout.setHgap(5);
            layout.setVgap(5);
            contentPane.setLayout(layout);
            contentPane.add(screenLabel);
            contentPane.add(seat);
            contentPane.add(seat1);
            contentPane.add(seat2);
            contentPane.add(seat3);
            contentPane.add(seat4);
            contentPane.add(seat5);
            contentPane.add(seat6);
            contentPane.add(seat7);
            contentPane.add(seat8);
        }
        
        private void addListeners() {
            seat.addActionListener(this);
            seat1.addActionListener(this);
            seat2.addActionListener(this);
            seat3.addActionListener(this);
            seat4.addActionListener(this);
            seat5.addActionListener(this);
            seat6.addActionListener(this);
            seat7.addActionListener(this);
            seat8.addActionListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            if (command.equals("")) {
                seat.setBackground(Color.ORANGE);
                /*seat1.setBackground(null);
                seat2.setBackground(null);
                seat3.setBackground(null);
                seat4.setBackground(null);
                seat5.setBackground(null);
                seat6.setBackground(null);
                seat7.setBackground(null);
                seat8.setBackground(null);*/
            } else if (command.equals(" ")) {
                seat1.setBackground(Color.ORANGE);
                //seat.setBackground(null);
                seat2.setBackground(null);
                seat3.setBackground(null);
                seat4.setBackground(null);
                seat5.setBackground(null);
                seat6.setBackground(null);
                seat7.setBackground(null);
                seat8.setBackground(null);
            } else if (command.equals("  ")) {
                seat2.setBackground(Color.ORANGE);
                seat1.setBackground(null);
                //seat.setBackground(null);
                seat3.setBackground(null);
                seat4.setBackground(null);
                seat5.setBackground(null);
                seat6.setBackground(null);
                seat7.setBackground(null);
                 seat8.setBackground(null);
            } else if (command.equals("   ")) {
                seat3.setBackground(Color.ORANGE);
                seat1.setBackground(null);
                seat2.setBackground(null);
                //seat.setBackground(null);
                seat4.setBackground(null);
                seat5.setBackground(null);
                seat6.setBackground(null);
                seat7.setBackground(null);
            } else if (command.equals("    ")) {
                seat4.setBackground(Color.ORANGE);
                seat1.setBackground(null);
                seat2.setBackground(null);
                seat3.setBackground(null);
               // seat.setBackground(null);
                seat5.setBackground(null);
                seat6.setBackground(null);
                seat7.setBackground(null);
            } else if (command.equals("     ")) {
                seat5.setBackground(Color.ORANGE);
                seat1.setBackground(null);
                seat2.setBackground(null);
                seat3.setBackground(null);
                seat4.setBackground(null);
                //seat.setBackground(null);
                seat6.setBackground(null);
                seat7.setBackground(null);
            } else if (command.equals("      ")) {
                seat6.setBackground(Color.ORANGE);
                seat1.setBackground(null);
                seat2.setBackground(null);
                seat3.setBackground(null);
                seat4.setBackground(null);
                seat5.setBackground(null);
                //seat.setBackground(null);
                seat7.setBackground(null);
            } else if (command.equals("       ")) {
                seat7.setBackground(Color.ORANGE);
                seat1.setBackground(null);
                seat2.setBackground(null);
                seat3.setBackground(null);
                seat4.setBackground(null);
                seat5.setBackground(null);
                seat6.setBackground(null);
              //  seat.setBackground(null);
            } else if (command.equals("        ")) {
                seat8.setBackground(Color.ORANGE);
                seat1.setBackground(null);
                seat2.setBackground(null);
                seat3.setBackground(null);
                seat4.setBackground(null);
                seat5.setBackground(null);
                seat6.setBackground(null);
                seat7.setBackground(null);
               // seat.setBackground(null);
            }
        }
    }
}
