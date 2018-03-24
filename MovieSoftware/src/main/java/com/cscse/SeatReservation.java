
package com.cscse;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class SeatReservation implements ActionListener {

    int seatCount = 0;
    // frame
    JFrame window = new JFrame("Seat Reservation");
    // LABELS
    JLabel selectLabel = new JLabel();
    // A Buttons
    JButton A1 = new JButton("A1");
    JButton A2 = new JButton("A2");
    JButton A3 = new JButton("A3");
    JButton A4 = new JButton("A4");
    JButton A5 = new JButton("A5");
    JButton A6 = new JButton("A6");
    JButton A7 = new JButton("A7");
    JButton A8 = new JButton("A8");
    JButton A9 = new JButton("A9");
    JButton A10 = new JButton("A10");
    //B Buttons
    JButton B1 = new JButton("B1");
    JButton B2 = new JButton("B2");
    JButton B3 = new JButton("B3");
    JButton B4 = new JButton("B4");
    JButton B5 = new JButton("B5");
    JButton B6 = new JButton("B6");
    JButton B7 = new JButton("B7");
    JButton B8 = new JButton("B8");
    JButton B9 = new JButton("B9");
    JButton B10 = new JButton("B10");
    //C Buttons
    JButton C1 = new JButton("C1");
    JButton C2 = new JButton("C2");
    JButton C3 = new JButton("C3");
    JButton C4 = new JButton("C4");
    JButton C5 = new JButton("C5");
    JButton C6 = new JButton("C6");
    JButton C7 = new JButton("C7");
    JButton C8 = new JButton("C8");
    JButton C9 = new JButton("C9");
    JButton C10 = new JButton("C10");
    //D Buttons
    JButton D1 = new JButton("D1");
    JButton D2 = new JButton("D2");
    JButton D3 = new JButton("D3");
    JButton D4 = new JButton("D4");
    JButton D5 = new JButton("D5");
    JButton D6 = new JButton("D6");
    JButton D7 = new JButton("D7");
    JButton D8 = new JButton("D8");
    JButton D9 = new JButton("D9");
    JButton D10 = new JButton("D10");
    // OK CANCEL BUTTONS
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("BACK");

    // grid placeholders 
    //JLabel blank = new JLabel("");
    JLabel blank1 = new JLabel("");
    JLabel blank2 = new JLabel("");
    JLabel blank3 = new JLabel("");
    JLabel blank4 = new JLabel("");
    JLabel blank5 = new JLabel("");
    JLabel blank6 = new JLabel("S", SwingConstants.CENTER);
    JLabel blank7 = new JLabel("C", SwingConstants.CENTER);
    JLabel blank8 = new JLabel("R", SwingConstants.CENTER);
    JLabel blank9 = new JLabel("E", SwingConstants.CENTER);
    JLabel blank10 = new JLabel("E", SwingConstants.CENTER);
    JLabel blank11 = new JLabel("N", SwingConstants.CENTER);
    JLabel blank12 = new JLabel("");
    JLabel blank13 = new JLabel("");
    JLabel blank14 = new JLabel("");
    JLabel blank15 = new JLabel("");
    JLabel blank16 = new JLabel("");
    JLabel blank17 = new JLabel("");
    JLabel blank18 = new JLabel("");
    JLabel blank19 = new JLabel("");
    JLabel blank20 = new JLabel("");
    JLabel blank21 = new JLabel("");
    JLabel blank22 = new JLabel("");
    JLabel blank23 = new JLabel("");
    JLabel blank24 = new JLabel("");
    JLabel blank25 = new JLabel("");
    JLabel blank26 = new JLabel("");
    JLabel blank27 = new JLabel("");
    JLabel blank28 = new JLabel("");
    JLabel blank29 = new JLabel("");
    JLabel blank30 = new JLabel("");
    JLabel blank31 = new JLabel("");
    JLabel blank32 = new JLabel("");
    JLabel blank33 = new JLabel("");
    JLabel blank34 = new JLabel("");
    JLabel blank35 = new JLabel("");
    JLabel blank36 = new JLabel("");
    JLabel blank37 = new JLabel("");
    JLabel blank38 = new JLabel("");
    JLabel blank39 = new JLabel("");
    JLabel blank40 = new JLabel("");
    JLabel blank41 = new JLabel("");
    JLabel blank42 = new JLabel("");
    JLabel blank43 = new JLabel("");
    JLabel blank44 = new JLabel("");
    JLabel blank45 = new JLabel("");
    JLabel blank46 = new JLabel("");
    JLabel blank47 = new JLabel("");
    JLabel blank48 = new JLabel("");
    JLabel blank49 = new JLabel("");
    JLabel blank50 = new JLabel("");
    JLabel blank51 = new JLabel("");
    JLabel blank52 = new JLabel("");
    JLabel blank53 = new JLabel("");
    JLabel blank54 = new JLabel("");
    JLabel blank55 = new JLabel("");
    JLabel blank56 = new JLabel("");
    JLabel blank57 = new JLabel("");
    JLabel blank58 = new JLabel("");
    JLabel blank59 = new JLabel("");
    JLabel blank60 = new JLabel("");
    JLabel blank61 = new JLabel("");
    JLabel blank62 = new JLabel("");
    JLabel blank63 = new JLabel("");
    JLabel blank64 = new JLabel("");
    JLabel blank65 = new JLabel("");
    JLabel blank66 = new JLabel("");
    JLabel blank67 = new JLabel("");
    JLabel blank68 = new JLabel("");
    JLabel blank69 = new JLabel("");
    JLabel blank70 = new JLabel("");
    JLabel blank71 = new JLabel("");
    JLabel blank72 = new JLabel("");
    JLabel blank73 = new JLabel("");
    JLabel blank74 = new JLabel("");
    JLabel blank75 = new JLabel("");
    JLabel blank76 = new JLabel("");
    JLabel blank77 = new JLabel("");
    JLabel blank78 = new JLabel("");
    JLabel blank79 = new JLabel("");
    JLabel blank80 = new JLabel("");
    JLabel blank81 = new JLabel("");
    JLabel blank82 = new JLabel("");
    JLabel blank83 = new JLabel("");
    JLabel blank84 = new JLabel("");
    JLabel blank85 = new JLabel("");
    JLabel blank86 = new JLabel("");
    JLabel blank87 = new JLabel("");
    JLabel blank88 = new JLabel("");
    JLabel blank89 = new JLabel("");
    JLabel blank90 = new JLabel("");
    JLabel blank91 = new JLabel("");
    JLabel blank92 = new JLabel("");
    JLabel blank93 = new JLabel("");
    JLabel blank94 = new JLabel("");
    JLabel blank95 = new JLabel("");
    JLabel blank96 = new JLabel("");
    JLabel blank97 = new JLabel("");
    JLabel blank98 = new JLabel("");
    JLabel blank99 = new JLabel("");
    JLabel blank100 = new JLabel("");
    JLabel blank101 = new JLabel("");
    JLabel blank102 = new JLabel("");
    JLabel blank103 = new JLabel("");
    JLabel blank104 = new JLabel("");
    JLabel blank105 = new JLabel("");
    JLabel blank106 = new JLabel("");
    JLabel blank107 = new JLabel("");
    JLabel blank108 = new JLabel("");
    JLabel blank109 = new JLabel("");
    JLabel blank110 = new JLabel("");
    JLabel blank111 = new JLabel("");
    JLabel blank112 = new JLabel("");
    JLabel blank113 = new JLabel("");
    JLabel blank114 = new JLabel("");
    JLabel blank115 = new JLabel("");
    JLabel blank116 = new JLabel("");
    JLabel blank117 = new JLabel("");
    JLabel blank118 = new JLabel("");
    //Scanner sc;
    BufferedReader br;
    FileWriter wr;

    public SeatReservation() {
        //set GridLayout
        GridLayout gl = new GridLayout();
        gl.setColumns(14);
        gl.setRows(9);
        window.setLayout(gl);
        //add Listeners A BUTTONS
        A1.addActionListener(this);
        A2.addActionListener(this);
        A3.addActionListener(this);
        A4.addActionListener(this);
        A5.addActionListener(this);
        A6.addActionListener(this);
        A7.addActionListener(this);
        A8.addActionListener(this);
        A9.addActionListener(this);
        A10.addActionListener(this);
        //add Listeners B BUTTONS
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
        B8.addActionListener(this);
        B9.addActionListener(this);
        B10.addActionListener(this);
        //add Listeners C BUTTONS
        C1.addActionListener(this);
        C2.addActionListener(this);
        C3.addActionListener(this);
        C4.addActionListener(this);
        C5.addActionListener(this);
        C6.addActionListener(this);
        C7.addActionListener(this);
        C8.addActionListener(this);
        C9.addActionListener(this);
        C10.addActionListener(this);
        //add Listeners D BUTTONS
        D1.addActionListener(this);
        D2.addActionListener(this);
        D3.addActionListener(this);
        D4.addActionListener(this);
        D5.addActionListener(this);
        D6.addActionListener(this);
        D7.addActionListener(this);
        D8.addActionListener(this);
        D9.addActionListener(this);
        D10.addActionListener(this);
        //add Listeners ok Button/Cancel button
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // SET BACKGROUND A BUTTONS
        A1.setBackground(Color.BLUE);
        A2.setBackground(Color.BLUE);
        A3.setBackground(Color.BLUE);
        A4.setBackground(Color.BLUE);
        A5.setBackground(Color.BLUE);
        A6.setBackground(Color.BLUE);
        A7.setBackground(Color.BLUE);
        A8.setBackground(Color.BLUE);
        A9.setBackground(Color.BLUE);
        A10.setBackground(Color.BLUE);
        // SET BACKGROUND B BUTTONS
        B1.setBackground(Color.BLUE);
        B2.setBackground(Color.BLUE);
        B3.setBackground(Color.BLUE);
        B4.setBackground(Color.BLUE);
        B5.setBackground(Color.BLUE);
        B6.setBackground(Color.BLUE);
        B7.setBackground(Color.BLUE);
        B8.setBackground(Color.BLUE);
        B9.setBackground(Color.BLUE);
        B10.setBackground(Color.BLUE);
        // SET BACKGROUND C BUTTONS
        C1.setBackground(Color.BLUE);
        C2.setBackground(Color.BLUE);
        C3.setBackground(Color.BLUE);
        C4.setBackground(Color.BLUE);
        C5.setBackground(Color.BLUE);
        C6.setBackground(Color.BLUE);
        C7.setBackground(Color.BLUE);
        C8.setBackground(Color.BLUE);
        C9.setBackground(Color.BLUE);
        C10.setBackground(Color.BLUE);
        // SET BACKGROUND D BUTTONS
        D1.setBackground(Color.BLUE);
        D2.setBackground(Color.BLUE);
        D3.setBackground(Color.BLUE);
        D4.setBackground(Color.BLUE);
        D5.setBackground(Color.BLUE);
        D6.setBackground(Color.BLUE);
        D7.setBackground(Color.BLUE);
        D8.setBackground(Color.BLUE);
        D9.setBackground(Color.BLUE);
        D10.setBackground(Color.BLUE);

        // add accessories to the grid
        //by 16 items
////        window.add(blank1);
        window.add(blank2);
        window.add(blank3);
        window.add(blank4);
        window.add(blank5);
        window.add(blank6);
        window.add(blank7);
        window.add(blank8);
        window.add(blank9);
        window.add(blank10);
        window.add(blank11);
        window.add(blank12);
        window.add(blank13);
        window.add(blank14);
        window.add(blank15);
////        window.add(blank16);
        //by 16 items
        // window.add(blank17);
        window.add(blank18);
        window.add(blank19);
        window.add(blank20);
        window.add(blank21);
        window.add(blank22);
        window.add(blank23);
        window.add(blank24);
        window.add(blank25);
        window.add(blank26);
        window.add(blank27);
        window.add(blank28);
        window.add(blank29);
        window.add(blank30);
        window.add(blank31);
        // window.add(blank32);

        //by 16 items
        // window.add(blank33);
        window.add(blank34);
        window.add(A1);
        window.add(A2);
        window.add(blank35);
        window.add(A3);
        window.add(A4);
        window.add(A5);
        window.add(A6);
        window.add(A7);
        window.add(A8);
        window.add(blank36);
        window.add(A9);
        window.add(A10);
        window.add(blank37);
        // window.add(blank38);

        //by 16 items A ROW
        // window.add(blank33);
        window.add(blank34);
        window.add(A1);
        window.add(A2);
        window.add(blank35);
        window.add(A3);
        window.add(A4);
        window.add(A5);
        window.add(A6);
        window.add(A7);
        window.add(A8);
        window.add(blank36);
        window.add(A9);
        window.add(A10);
        window.add(blank37);
        // window.add(blank38);

        //by 16 items B ROW
        // window.add(blank39);
        window.add(blank40);
        window.add(B1);
        window.add(B2);
        window.add(blank41);
        window.add(B3);
        window.add(B4);
        window.add(B5);
        window.add(B6);
        window.add(B7);
        window.add(B8);
        window.add(blank42);
        window.add(B9);
        window.add(B10);
        window.add(blank43);
        // window.add(blank44);

        //by 16 items C ROW
        //  window.add(blank45);
        window.add(blank46);
        window.add(C1);
        window.add(C2);
        window.add(blank47);
        window.add(C3);
        window.add(C4);
        window.add(C5);
        window.add(C6);
        window.add(C7);
        window.add(C8);
        window.add(blank48);
        window.add(C9);
        window.add(C10);
        window.add(blank49);
        //  window.add(blank50);

        //by 16 items D ROW
        // window.add(blank51);
        window.add(blank52);
        window.add(D1);
        window.add(D2);
        window.add(blank53);
        window.add(D3);
        window.add(D4);
        window.add(D5);
        window.add(D6);
        window.add(D7);
        window.add(D8);
        window.add(blank54);
        window.add(D9);
        window.add(D10);
        window.add(blank55);
        // window.add(blank56);

        //by 16 items
        // window.add(blank57);
        window.add(blank58);
        window.add(blank59);
        window.add(blank60);
        window.add(blank61);
        window.add(blank62);
        window.add(blank63);
        window.add(blank64);
        window.add(blank65);
        window.add(blank66);
        window.add(blank67);
        window.add(blank68);
        window.add(blank69);
        window.add(blank70);
        window.add(blank71);
        // window.add(blank72);

        //by 16 items
////        window.add(blank73);
////        window.add(blank74);
////        window.add(blank75);
////        window.add(blank76);
////        window.add(blank77);
////        window.add(blank78);
////        window.add(blank79);
////        window.add(blank80);
////        window.add(blank81);
////        window.add(blank82);
////        window.add(blank83);
////        window.add(blank84);
////        window.add(blank85);
////        window.add(blank86);
////        window.add(blank87);
////        window.add(blank88);
        //by 16 items wiTH buttonS
        //   window.add(blank89);
        window.add(blank90);
        window.add(blank91);
        window.add(blank92);
        window.add(blank93);
        window.add(blank94);
        window.add(okButton);
        window.add(blank95);
        window.add(blank96);
        window.add(cancelButton);
        window.add(blank97);
        window.add(blank98);
        window.add(blank99);
        window.add(blank100);
        window.add(blank101);
        //  window.add(blank102);

        //by 16 items
        // window.add(blank103);
        window.add(blank104);
        window.add(blank105);
        window.add(blank106);
        window.add(blank107);
        window.add(blank108);
        window.add(blank109);
        window.add(blank110);
        window.add(blank111);
        window.add(blank112);
        window.add(blank113);
        window.add(blank114);
        window.add(blank115);
        window.add(blank116);
        window.add(blank117);
        //  window.add(blank118);

        //set size
        gl.setVgap(1);
        gl.setHgap(1);

        window.setSize(955, 350);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

            //INT N = AVAILABLE SEAT DEPENDS ON VALUE FROM Payment_Information

        int n = Payment_Information.totalTickets;
 
       
        //LOGIN BUTTON ACTIONS
        if (ae.getActionCommand() == A1.getActionCommand()) {
            if (A1.getBackground() == Color.ORANGE) {
                A1.setBackground(Color.BLUE);
                seatCount--;
            } else if (A1.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    A1.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == A2.getActionCommand()) {
            if (A2.getBackground() == Color.ORANGE) {
                A2.setBackground(Color.BLUE);
                seatCount--;
            } else if (A2.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    A2.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // END COMMAND
        if (ae.getActionCommand() == A3.getActionCommand()) {
            if (A3.getBackground() == Color.ORANGE) {
                A3.setBackground(Color.BLUE);
                seatCount--;
            } else if (A3.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    A3.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == A4.getActionCommand()) {
            if (A4.getBackground() == Color.ORANGE) {
                A4.setBackground(Color.BLUE);
                seatCount--;
            } else if (A4.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    A4.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == A5.getActionCommand()) {
            if (A5.getBackground() == Color.ORANGE) {
                A5.setBackground(Color.BLUE);
                seatCount--;
            } else if (A5.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    A5.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == A6.getActionCommand()) {
            if (A6.getBackground() == Color.ORANGE) {
                A6.setBackground(Color.BLUE);
                seatCount--;
            } else if (A6.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    A6.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == A7.getActionCommand()) {
            if (A7.getBackground() == Color.ORANGE) {
                A7.setBackground(Color.BLUE);
                seatCount--;
            } else if (A7.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    A7.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == A8.getActionCommand()) {
            if (A8.getBackground() == Color.ORANGE) {
                A8.setBackground(Color.BLUE);
                seatCount--;
            } else if (A8.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    A8.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == A9.getActionCommand()) {
            if (A9.getBackground() == Color.ORANGE) {
                A9.setBackground(Color.BLUE);
                seatCount--;
            } else if (A9.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    A9.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == A10.getActionCommand()) {
            if (A10.getBackground() == Color.ORANGE) {
                A10.setBackground(Color.BLUE);
                seatCount--;
            } else if (A10.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    A10.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command for A BUTTONS
        //Begin BUTTONS
        if (ae.getActionCommand() == B1.getActionCommand()) {
            if (B1.getBackground() == Color.ORANGE) {
                B1.setBackground(Color.BLUE);
                seatCount--;
            } else if (B1.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    B1.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == B2.getActionCommand()) {
            if (B2.getBackground() == Color.ORANGE) {
                B2.setBackground(Color.BLUE);
                seatCount--;
            } else if (B2.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    B2.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // END COMMAND
        if (ae.getActionCommand() == B3.getActionCommand()) {
            if (B3.getBackground() == Color.ORANGE) {
                B3.setBackground(Color.BLUE);
                seatCount--;
            } else if (B3.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    B3.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == B4.getActionCommand()) {
            if (B4.getBackground() == Color.ORANGE) {
                B4.setBackground(Color.BLUE);
                seatCount--;
            } else if (B4.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    B4.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == B5.getActionCommand()) {
            if (B5.getBackground() == Color.ORANGE) {
                B5.setBackground(Color.BLUE);
                seatCount--;
            } else if (B5.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    B5.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == B6.getActionCommand()) {
            if (B6.getBackground() == Color.ORANGE) {
                B6.setBackground(Color.BLUE);
                seatCount--;
            } else if (B6.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    B6.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == B7.getActionCommand()) {
            if (B7.getBackground() == Color.ORANGE) {
                B7.setBackground(Color.BLUE);
                seatCount--;
            } else if (B7.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    B7.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == B8.getActionCommand()) {
            if (B8.getBackground() == Color.ORANGE) {
                B8.setBackground(Color.BLUE);
                seatCount--;
            } else if (B8.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    B8.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == B9.getActionCommand()) {
            if (B9.getBackground() == Color.ORANGE) {
                B9.setBackground(Color.BLUE);
                seatCount--;
            } else if (B9.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    B9.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == B10.getActionCommand()) {
            if (B10.getBackground() == Color.ORANGE) {
                B10.setBackground(Color.BLUE);
                seatCount--;
            } else if (B10.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    B10.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command for B BUTTONS
        // BEGIN C BUTTONS
        if (ae.getActionCommand() == C1.getActionCommand()) {
            if (C1.getBackground() == Color.ORANGE) {
                C1.setBackground(Color.BLUE);
                seatCount--;
            } else if (C1.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    C1.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == C2.getActionCommand()) {
            if (C2.getBackground() == Color.ORANGE) {
                C2.setBackground(Color.BLUE);
                seatCount--;
            } else if (C2.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    C2.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // END COMMAND
        if (ae.getActionCommand() == C3.getActionCommand()) {
            if (C3.getBackground() == Color.ORANGE) {
                C3.setBackground(Color.BLUE);
                seatCount--;
            } else if (C3.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    C3.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == C4.getActionCommand()) {
            if (C4.getBackground() == Color.ORANGE) {
                C4.setBackground(Color.BLUE);
                seatCount--;
            } else if (C4.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    C4.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == C5.getActionCommand()) {
            if (C5.getBackground() == Color.ORANGE) {
                C5.setBackground(Color.BLUE);
                seatCount--;
            } else if (C5.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    C5.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == C6.getActionCommand()) {
            if (C6.getBackground() == Color.ORANGE) {
                C6.setBackground(Color.BLUE);
                seatCount--;
            } else if (C6.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    C6.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == C7.getActionCommand()) {
            if (C7.getBackground() == Color.ORANGE) {
                C7.setBackground(Color.BLUE);
                seatCount--;
            } else if (C7.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    C7.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == C8.getActionCommand()) {
            if (C8.getBackground() == Color.ORANGE) {
                C8.setBackground(Color.BLUE);
                seatCount--;
            } else if (C8.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    C8.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == C9.getActionCommand()) {
            if (C9.getBackground() == Color.ORANGE) {
                C9.setBackground(Color.BLUE);
                seatCount--;
            } else if (C9.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    C9.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == C10.getActionCommand()) {
            if (C10.getBackground() == Color.ORANGE) {
                C10.setBackground(Color.BLUE);
                seatCount--;
            } else if (C10.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    C10.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command for C BUTTONS
        //BEGIN D BUTTONS
        if (ae.getActionCommand() == D1.getActionCommand()) {
            if (D1.getBackground() == Color.ORANGE) {
                D1.setBackground(Color.BLUE);
                seatCount--;
            } else if (D1.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    D1.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == D2.getActionCommand()) {
            if (D2.getBackground() == Color.ORANGE) {
                D2.setBackground(Color.BLUE);
                seatCount--;
            } else if (D2.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    D2.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // END COMMAND
        if (ae.getActionCommand() == D3.getActionCommand()) {
            if (D3.getBackground() == Color.ORANGE) {
                D3.setBackground(Color.BLUE);
                seatCount--;
            } else if (D3.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    D3.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == D4.getActionCommand()) {
            if (D4.getBackground() == Color.ORANGE) {
                D4.setBackground(Color.BLUE);
                seatCount--;
            } else if (D4.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    D4.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == D5.getActionCommand()) {
            if (D5.getBackground() == Color.ORANGE) {
                D5.setBackground(Color.BLUE);
                seatCount--;
            } else if (D5.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    D5.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == D6.getActionCommand()) {
            if (D6.getBackground() == Color.ORANGE) {
                D6.setBackground(Color.BLUE);
                seatCount--;
            } else if (D6.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    D6.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == D7.getActionCommand()) {
            if (D7.getBackground() == Color.ORANGE) {
                D7.setBackground(Color.BLUE);
                seatCount--;
            } else if (D7.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    D7.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == D8.getActionCommand()) {
            if (D8.getBackground() == Color.ORANGE) {
                D8.setBackground(Color.BLUE);
                seatCount--;
            } else if (D8.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    D8.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == D9.getActionCommand()) {
            if (D9.getBackground() == Color.ORANGE) {
                D9.setBackground(Color.BLUE);
                seatCount--;
            } else if (D9.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    D9.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command
        if (ae.getActionCommand() == D10.getActionCommand()) {
            if (D10.getBackground() == Color.ORANGE) {
                D10.setBackground(Color.BLUE);
                seatCount--;
            } else if (D10.getBackground() == Color.BLUE) {
                if (seatCount < n) {
                    D10.setBackground(Color.ORANGE);
                    seatCount++;
                } else {

                }
            }
        } // End Command for D BUTTONS
        //Ok Button commands
        if (ae.getActionCommand() == okButton.getActionCommand()) {
            
            if (seatCount == n) {
                
                try {
                    Confirmation_Page cp = new Confirmation_Page();
                    window.setVisible(false);
                    window.dispose();
                } catch (Exception e) {
                    System.out.println("error");
                }
            } else{
                JOptionPane.showMessageDialog(window, "Please select " + n + " seats.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        // Cancel Commands
        if (ae.getActionCommand() == cancelButton.getActionCommand()) {
            try {
                Login l = new Login();
                window.setVisible(false);
                window.dispose();
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }

    public static void main(String[] args) {
        SeatReservation sr = new SeatReservation();
    }
}
