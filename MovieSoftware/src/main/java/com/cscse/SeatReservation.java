
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
        
        private int seatCount = 0;
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
            seat.setBackground(Color.BLUE);
            seat1.setBackground(Color.BLUE);
            seat2.setBackground(Color.BLUE);
            seat3.setBackground(Color.BLUE);
            seat4.setBackground(Color.BLUE);
            seat5.setBackground(Color.BLUE);
            seat6.setBackground(Color.BLUE);
            seat7.setBackground(Color.BLUE);
            seat8.setBackground(Color.BLUE);
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
            //Changed the command for seat reservation. Set a variable for seat count that
            //will count how many seats chosen. Will not let users select more than 4 seats.
            //Later will change to how many tickets selected.
            String command = event.getActionCommand();
            if (command.equals("")) {
                if (seat.getBackground() == Color.ORANGE)
                {
                    seat.setBackground(Color.BLUE);
                    seatCount--;
                }
                else if (seat.getBackground() == Color.BLUE)
                {
                    if (seatCount < 4)
                    {
                    seat.setBackground(Color.ORANGE);
                    seatCount++;
                    }
                    else
                    {
                        
                    }
                }
                
            } else if (command.equals(" ")) {
                if (seat1.getBackground() == Color.ORANGE)
                {
                    seat1.setBackground(Color.BLUE);
                    seatCount--;
                }
                else if (seat1.getBackground() == Color.BLUE)
                {
                    if (seatCount < 4)
                    {
                    seat1.setBackground(Color.ORANGE);
                    seatCount++;
                    }
                    else
                    {
                        
                    }
                }
            } else if (command.equals("  ")) {
                if (seat2.getBackground() == Color.ORANGE)
                {
                    seat2.setBackground(Color.BLUE);
                    seatCount--;
                }
                else if (seat2.getBackground() == Color.BLUE)
                {
                    if (seatCount < 4)
                    {
                    seat2.setBackground(Color.ORANGE);
                    seatCount++;
                    }
                    else
                    {
                        
                    }
                }
            } else if (command.equals("   ")) {
                if (seat3.getBackground() == Color.ORANGE)
                {
                    seat3.setBackground(Color.BLUE);
                    seatCount--;
                }
                else if (seat3.getBackground() == Color.BLUE)
                {
                    if (seatCount < 4)
                    {
                    seat3.setBackground(Color.ORANGE);
                    seatCount++;
                    }
                    else
                    {
                        
                    }
                }
            } else if (command.equals("    ")) {
                if (seat4.getBackground() == Color.ORANGE)
                {
                    seat4.setBackground(Color.BLUE);
                    seatCount--;
                }
                else if (seat4.getBackground() == Color.BLUE)
                {
                    if (seatCount < 4)
                    {
                    seat4.setBackground(Color.ORANGE);
                    seatCount++;
                    }
                    else
                    {
                        
                    }
                }
            } else if (command.equals("     ")) {
                if (seat5.getBackground() == Color.ORANGE)
                {
                    seat5.setBackground(Color.BLUE);
                    seatCount--;
                }
                else if (seat5.getBackground() == Color.BLUE)
                {
                    if (seatCount < 4)
                    {
                    seat5.setBackground(Color.ORANGE);
                    seatCount++;
                    }
                    else
                    {
                        
                    }
                }
            } else if (command.equals("      ")) {
               if (seat6.getBackground() == Color.ORANGE)
                {
                    seat6.setBackground(Color.BLUE);
                    seatCount--;
                }
                else if (seat6.getBackground() == Color.BLUE)
                {
                    if (seatCount < 4)
                    {
                    seat6.setBackground(Color.ORANGE);
                    seatCount++;
                    }
                    else
                    {
                        
                    }
                }
            } else if (command.equals("       ")) {
                if (seat7.getBackground() == Color.ORANGE)
                {
                    seat7.setBackground(Color.BLUE);
                    seatCount--;
                }
                else if (seat7.getBackground() == Color.BLUE)
                {
                    if (seatCount < 4)
                    {
                    seat7.setBackground(Color.ORANGE);
                    seatCount++;
                    }
                    else
                    {
                        
                    }
                }
            } else if (command.equals("        ")) {
                if (seat8.getBackground() == Color.ORANGE)
                {
                    seat8.setBackground(Color.BLUE);
                    seatCount--;
                }
                else if (seat8.getBackground() == Color.BLUE)
                {
                    if (seatCount < 4)
                    {
                    seat8.setBackground(Color.ORANGE);
                    seatCount++;
                    }
                    else
                    {
                        
                    }
                }
            }
        }
    }
}
