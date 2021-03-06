/*
 * GUI Frame for the Seat Selector.
 */
package com.movieprogram.Main;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Robert
 */
public class SeatSelector extends javax.swing.JFrame {

    /**
     * Creates new form SeatSelector Declare Variables
     */
    int seatTotal = TicketSelector.totalTickets;
    int seatCount = 0;
    String[] seats = new String[seatTotal];
    static String seatList = "";
    
    boolean a1Clicked = false;
    boolean a2Clicked = false;
    boolean a3Clicked = false;
    boolean a4Clicked = false;
    boolean a5Clicked = false;
    boolean a6Clicked = false;
    boolean a7Clicked = false;
    boolean a8Clicked = false;
    boolean b1Clicked = false;
    boolean b2Clicked = false;
    boolean b3Clicked = false;
    boolean b4Clicked = false;
    boolean b5Clicked = false;
    boolean b6Clicked = false;
    boolean b7Clicked = false;
    boolean b8Clicked = false;
    boolean c1Clicked = false;
    boolean c2Clicked = false;
    boolean c3Clicked = false;
    boolean c4Clicked = false;
    boolean c5Clicked = false;
    boolean c6Clicked = false;
    boolean c7Clicked = false;
    boolean c8Clicked = false;
    boolean d1Clicked = false;
    boolean d2Clicked = false;
    boolean d3Clicked = false;
    boolean d4Clicked = false;
    boolean d5Clicked = false;
    boolean d6Clicked = false;
    boolean d7Clicked = false;
    boolean d8Clicked = false;
    boolean e1Clicked = false;
    boolean e2Clicked = false;
    boolean e3Clicked = false;
    boolean e4Clicked = false;
    boolean e5Clicked = false;
    boolean e6Clicked = false;
    boolean e7Clicked = false;
    boolean e8Clicked = false;
    boolean f1Clicked = false;
    boolean f2Clicked = false;
    boolean f3Clicked = false;
    boolean f4Clicked = false;
    boolean f5Clicked = false;
    boolean f6Clicked = false;
    boolean f7Clicked = false;
    boolean f8Clicked = false;
    boolean g1Clicked = false;
    boolean g2Clicked = false;
    boolean g3Clicked = false;
    boolean g4Clicked = false;
    boolean g5Clicked = false;
    boolean g6Clicked = false;
    boolean g7Clicked = false;
    boolean g8Clicked = false;

    static int a1Available = 1;
    static int a2Available = 1;
    static int a3Available = 1;
    static int a4Available = 1;
    static int a5Available = 1;
    static int a6Available = 1;
    static int a7Available = 1;
    static int a8Available = 1;
    static int b1Available = 1;
    static int b2Available = 1;
    static int b3Available = 1;
    static int b4Available = 1;
    static int b5Available = 1;
    static int b6Available = 1;
    static int b7Available = 1;
    static int b8Available = 1;
    static int c1Available = 1;
    static int c2Available = 1;
    static int c3Available = 1;
    static int c4Available = 1;
    static int c5Available = 1;
    static int c6Available = 1;
    static int c7Available = 1;
    static int c8Available = 1;
    static int d1Available = 1;
    static int d2Available = 1;
    static int d3Available = 1;
    static int d4Available = 1;
    static int d5Available = 1;
    static int d6Available = 1;
    static int d7Available = 1;
    static int d8Available = 1;
    static int e1Available = 1;
    static int e2Available = 1;
    static int e3Available = 1;
    static int e4Available = 1;
    static int e5Available = 1;
    static int e6Available = 1;
    static int e7Available = 1;
    static int e8Available = 1;
    static int f1Available = 1;
    static int f2Available = 1;
    static int f3Available = 1;
    static int f4Available = 1;
    static int f5Available = 1;
    static int f6Available = 1;
    static int f7Available = 1;
    static int f8Available = 1;
    static int g1Available = 1;
    static int g2Available = 1;
    static int g3Available = 1;
    static int g4Available = 1;
    static int g5Available = 1;
    static int g6Available = 1;
    static int g7Available = 1;
    static int g8Available = 1;
    
    /*
    * Initialize Components
     */
    public SeatSelector() throws SQLException {
        a1Available=1;
        a2Available=1;
        a3Available=1;
        a4Available=1;
        a5Available=1;
        a6Available=1;
        a7Available=1;
        a8Available=1;
        b1Available=1;
        b2Available=1;
        b3Available=1;
        b4Available=1;
        b5Available=1;
        b6Available=1;
        b7Available=1;
        b8Available=1;
        c1Available=1;
        c2Available=1;
        c3Available=1;
        c4Available=1;
        c5Available=1;
        c6Available=1;
        c7Available=1;
        c8Available=1;
        d1Available=1;
        d2Available=1;
        d3Available=1;
        d4Available=1;
        d5Available=1;
        d6Available=1;
        d7Available=1;
        d8Available=1;
        e1Available=1;
        e2Available=1;
        e3Available=1;
        e4Available=1;
        e5Available=1;
        e6Available=1;
        e7Available=1;
        e8Available=1;
        f1Available=1;
        f2Available=1;
        f3Available=1;
        f4Available=1;
        f5Available=1;
        f6Available=1;
        f7Available=1;
        f8Available=1;
        g1Available=1;
        g2Available=1;
        g3Available=1;
        g4Available=1;
        g5Available=1;
        g6Available=1;
        g7Available=1;
        g8Available=1;
        initTable();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        a1Button = new javax.swing.JButton();
        a2Button = new javax.swing.JButton();
        a3Button = new javax.swing.JButton();
        a4Button = new javax.swing.JButton();
        a5Button = new javax.swing.JButton();
        a6Button = new javax.swing.JButton();
        a7Button = new javax.swing.JButton();
        a8Button = new javax.swing.JButton();
        c1Button = new javax.swing.JButton();
        d1Button = new javax.swing.JButton();
        e1Button = new javax.swing.JButton();
        f1Button = new javax.swing.JButton();
        g1Button = new javax.swing.JButton();
        c2Button = new javax.swing.JButton();
        d2Button = new javax.swing.JButton();
        e2Button = new javax.swing.JButton();
        f2Button = new javax.swing.JButton();
        g2Button = new javax.swing.JButton();
        c3Button = new javax.swing.JButton();
        d3Button = new javax.swing.JButton();
        e3Button = new javax.swing.JButton();
        f3Button = new javax.swing.JButton();
        g3Button = new javax.swing.JButton();
        b1Button = new javax.swing.JButton();
        b2Button = new javax.swing.JButton();
        b3Button = new javax.swing.JButton();
        b4Button = new javax.swing.JButton();
        c4Button = new javax.swing.JButton();
        d4Button = new javax.swing.JButton();
        e4Button = new javax.swing.JButton();
        f4Button = new javax.swing.JButton();
        g4Button = new javax.swing.JButton();
        b5Button = new javax.swing.JButton();
        c5Button = new javax.swing.JButton();
        d5Button = new javax.swing.JButton();
        e5Button = new javax.swing.JButton();
        f5Button = new javax.swing.JButton();
        g5Button = new javax.swing.JButton();
        b6Button = new javax.swing.JButton();
        c6Button = new javax.swing.JButton();
        d6Button = new javax.swing.JButton();
        e6Button = new javax.swing.JButton();
        f6Button = new javax.swing.JButton();
        g6Button = new javax.swing.JButton();
        b7Button = new javax.swing.JButton();
        c7Button = new javax.swing.JButton();
        d7Button = new javax.swing.JButton();
        e7Button = new javax.swing.JButton();
        f7Button = new javax.swing.JButton();
        g7Button = new javax.swing.JButton();
        b8Button = new javax.swing.JButton();
        c8Button = new javax.swing.JButton();
        d8Button = new javax.swing.JButton();
        e8Button = new javax.swing.JButton();
        f8Button = new javax.swing.JButton();
        g8Button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCREEN");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("A");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("B");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("C");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("D");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("E");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("F");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("G");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("1");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("2");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("3");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("4");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("5");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("6");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("7");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("8");

        a1Button.setText("A-1");
        if (a1Available == 0) {
            a1Button.setEnabled(false);
        }
        a1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ButtonActionPerformed(evt);
            }
        });

        a2Button.setText("A-2");
        if (a2Available == 0) {
            a2Button.setEnabled(false);
        }
        a2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ButtonActionPerformed(evt);
            }
        });

        a3Button.setText("A-3");
        if (a3Available == 0) {
            a3Button.setEnabled(false);
        }
        a3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ButtonActionPerformed(evt);
            }
        });

        a4Button.setText("A-4");
        if (a4Available == 0) {
            a4Button.setEnabled(false);
        }
        a4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ButtonActionPerformed(evt);
            }
        });

        a5Button.setText("A-5");
        if (a5Available == 0) {
            a5Button.setEnabled(false);
        }
        a5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ButtonActionPerformed(evt);
            }
        });

        a6Button.setText("A-6");
        if (a6Available == 0) {
            a6Button.setEnabled(false);
        }
        a6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ButtonActionPerformed(evt);
            }
        });

        a7Button.setText("A-7");
        if (a7Available == 0) {
            a7Button.setEnabled(false);
        }
        a7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ButtonActionPerformed(evt);
            }
        });

        a8Button.setText("A-8");
        if (a8Available == 0) {
            a8Button.setEnabled(false);
        }
        a8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ButtonActionPerformed(evt);
            }
        });

        c1Button.setText("C-1");
        if (c1Available == 0) {
            c1Button.setEnabled(false);
        }
        c1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ButtonActionPerformed(evt);
            }
        });

        d1Button.setText("D-1");
        if (d1Available == 0) {
            d1Button.setEnabled(false);
        }
        d1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ButtonActionPerformed(evt);
            }
        });

        e1Button.setText("E-1");
        if (e1Available == 0) {
            e1Button.setEnabled(false);
        }
        e1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ButtonActionPerformed(evt);
            }
        });

        f1Button.setText("F-1");
        if (f1Available == 0) {
            f1Button.setEnabled(false);
        }
        f1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ButtonActionPerformed(evt);
            }
        });

        g1Button.setText("G-1");
        if (g1Available == 0) {
            g1Button.setEnabled(false);
        }
        g1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ButtonActionPerformed(evt);
            }
        });

        c2Button.setText("C-2");
        if (c2Available == 0) {
            c2Button.setEnabled(false);
        }
        c2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ButtonActionPerformed(evt);
            }
        });

        d2Button.setText("D-2");
        if (d2Available == 0) {
            d2Button.setEnabled(false);
        }
        d2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ButtonActionPerformed(evt);
            }
        });

        e2Button.setText("E-2");
        if (e2Available == 0) {
            e2Button.setEnabled(false);
        }
        e2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ButtonActionPerformed(evt);
            }
        });

        f2Button.setText("F-2");
        if (f2Available == 0) {
            f2Button.setEnabled(false);
        }
        f2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ButtonActionPerformed(evt);
            }
        });

        g2Button.setText("G-2");
        if (g2Available == 0) {
            g2Button.setEnabled(false);
        }
        g2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ButtonActionPerformed(evt);
            }
        });

        c3Button.setText("C-3");
        if (c3Available == 0) {
            c3Button.setEnabled(false);
        }
        c3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ButtonActionPerformed(evt);
            }
        });

        d3Button.setText("D-3");
        if (d3Available == 0) {
            d3Button.setEnabled(false);
        }
        d3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ButtonActionPerformed(evt);
            }
        });

        e3Button.setText("E-3");
        if (e3Available == 0) {
            e3Button.setEnabled(false);
        }
        e3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ButtonActionPerformed(evt);
            }
        });

        f3Button.setText("F-3");
        if (f3Available == 0) {
            f3Button.setEnabled(false);
        }
        f3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ButtonActionPerformed(evt);
            }
        });

        g3Button.setText("G-3");
        if (g3Available == 0) {
            g3Button.setEnabled(false);
        }
        g3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ButtonActionPerformed(evt);
            }
        });

        b1Button.setText("B-1");
        if (b1Available == 0) {
            b1Button.setEnabled(false);
        }
        b1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ButtonActionPerformed(evt);
            }
        });

        b2Button.setText("B-2");
        if (b2Available == 0) {
            b2Button.setEnabled(false);
        }
        b2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ButtonActionPerformed(evt);
            }
        });

        b3Button.setText("B-3");
        if (b3Available == 0) {
            b3Button.setEnabled(false);
        }
        b3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ButtonActionPerformed(evt);
            }
        });

        b4Button.setText("B-4");
        if (b4Available == 0) {
            b4Button.setEnabled(false);
        }
        b4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ButtonActionPerformed(evt);
            }
        });

        c4Button.setText("C-4");
        if (c4Available == 0) {
            c4Button.setEnabled(false);
        }
        c4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ButtonActionPerformed(evt);
            }
        });

        d4Button.setText("D-4");
        if (d4Available == 0) {
            d4Button.setEnabled(false);
        }
        d4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ButtonActionPerformed(evt);
            }
        });

        e4Button.setText("E-4");
        if (e4Available == 0) {
            e4Button.setEnabled(false);
        }
        e4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e4ButtonActionPerformed(evt);
            }
        });

        f4Button.setText("F-4");
        if (f4Available == 0) {
            f4Button.setEnabled(false);
        }
        f4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ButtonActionPerformed(evt);
            }
        });

        g4Button.setText("G-4");
        if (g4Available == 0) {
            g4Button.setEnabled(false);
        }
        g4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ButtonActionPerformed(evt);
            }
        });

        b5Button.setText("B-5");
        if (b5Available == 0) {
            b5Button.setEnabled(false);
        }
        b5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ButtonActionPerformed(evt);
            }
        });

        c5Button.setText("C-5");
        if (c5Available == 0) {
            c5Button.setEnabled(false);
        }
        c5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ButtonActionPerformed(evt);
            }
        });

        d5Button.setText("D-5");
        if (d5Available == 0) {
            d5Button.setEnabled(false);
        }
        d5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ButtonActionPerformed(evt);
            }
        });

        e5Button.setText("E-5");
        if (e5Available == 0) {
            e5Button.setEnabled(false);
        }
        e5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e5ButtonActionPerformed(evt);
            }
        });

        f5Button.setText("F-5");
        if (f5Available == 0) {
            f5Button.setEnabled(false);
        }
        f5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ButtonActionPerformed(evt);
            }
        });

        g5Button.setText("G-5");
        if (g5Available == 0) {
            g5Button.setEnabled(false);
        }
        g5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g5ButtonActionPerformed(evt);
            }
        });

        b6Button.setText("B-6");
        if (b6Available == 0) {
            b6Button.setEnabled(false);
        }
        b6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ButtonActionPerformed(evt);
            }
        });

        c6Button.setText("C-6");
        if (c6Available == 0) {
            c6Button.setEnabled(false);
        }
        c6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ButtonActionPerformed(evt);
            }
        });

        d6Button.setText("D-6");
        if (d6Available == 0) {
            d6Button.setEnabled(false);
        }
        d6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6ButtonActionPerformed(evt);
            }
        });

        e6Button.setText("E-6");
        if (e6Available == 0) {
            e6Button.setEnabled(false);
        }
        e6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e6ButtonActionPerformed(evt);
            }
        });

        f6Button.setText("F-6");
        if (f6Available == 0) {
            f6Button.setEnabled(false);
        }
        f6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f6ButtonActionPerformed(evt);
            }
        });

        g6Button.setText("G-6");
        if (g6Available == 0) {
            g6Button.setEnabled(false);
        }
        g6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g6ButtonActionPerformed(evt);
            }
        });

        b7Button.setText("B-7");
        if (b7Available == 0) {
            b7Button.setEnabled(false);
        }
        b7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ButtonActionPerformed(evt);
            }
        });

        c7Button.setText("C-7");
        if (c7Available == 0) {
            c7Button.setEnabled(false);
        }
        c7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ButtonActionPerformed(evt);
            }
        });

        d7Button.setText("D-7");
        if (d7Available == 0) {
            d7Button.setEnabled(false);
        }
        d7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d7ButtonActionPerformed(evt);
            }
        });

        e7Button.setText("E-7");
        if (e7Available == 0) {
            e7Button.setEnabled(false);
        }
        e7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e7ButtonActionPerformed(evt);
            }
        });

        f7Button.setText("F-7");
        if (f7Available == 0) {
            f7Button.setEnabled(false);
        }
        f7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f7ButtonActionPerformed(evt);
            }
        });

        g7Button.setText("G-7");
        if (g7Available == 0) {
            g7Button.setEnabled(false);
        }
        g7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g7ButtonActionPerformed(evt);
            }
        });

        b8Button.setText("B-8");
        if (b8Available == 0) {
            b8Button.setEnabled(false);
        }
        b8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ButtonActionPerformed(evt);
            }
        });

        c8Button.setText("C-8");
        if (c8Available == 0) {
            c8Button.setEnabled(false);
        }
        c8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ButtonActionPerformed(evt);
            }
        });

        d8Button.setText("D-8");
        if (d8Available == 0) {
            d8Button.setEnabled(false);
        }
        d8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d8ButtonActionPerformed(evt);
            }
        });

        e8Button.setText("E-8");
        if (e8Available == 0) {
            e8Button.setEnabled(false);
        }
        e8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e8ButtonActionPerformed(evt);
            }
        });

        f8Button.setText("F-8");
        if (f8Available == 0) {
            f8Button.setEnabled(false);
        }
        f8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f8ButtonActionPerformed(evt);
            }
        });

        g8Button.setText("G-8");
        if (g8Available == 0) {
            g8Button.setEnabled(false);
        }
        g8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g8ButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Continue");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(e1Button)
                                .addGap(18, 18, 18)
                                .addComponent(e2Button)
                                .addGap(18, 18, 18)
                                .addComponent(e3Button)
                                .addGap(18, 18, 18)
                                .addComponent(e4Button)
                                .addGap(18, 18, 18)
                                .addComponent(e5Button)
                                .addGap(18, 18, 18)
                                .addComponent(e6Button)
                                .addGap(18, 18, 18)
                                .addComponent(e7Button)
                                .addGap(18, 18, 18)
                                .addComponent(e8Button))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c1Button)
                                .addGap(18, 18, 18)
                                .addComponent(c2Button)
                                .addGap(18, 18, 18)
                                .addComponent(c3Button)
                                .addGap(18, 18, 18)
                                .addComponent(c4Button)
                                .addGap(18, 18, 18)
                                .addComponent(c5Button)
                                .addGap(18, 18, 18)
                                .addComponent(c6Button)
                                .addGap(18, 18, 18)
                                .addComponent(c7Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c8Button))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a1Button)
                                        .addGap(18, 18, 18)
                                        .addComponent(a2Button)
                                        .addGap(18, 18, 18)
                                        .addComponent(a3Button))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel9)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel10)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(a4Button)
                                        .addGap(18, 18, 18)
                                        .addComponent(a5Button)
                                        .addGap(18, 18, 18)
                                        .addComponent(a6Button)
                                        .addGap(18, 18, 18)
                                        .addComponent(a7Button)
                                        .addGap(18, 18, 18)
                                        .addComponent(a8Button))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel12)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel13)
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel14)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel15)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel16))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(g1Button)
                                .addGap(18, 18, 18)
                                .addComponent(g2Button)
                                .addGap(18, 18, 18)
                                .addComponent(g3Button)
                                .addGap(18, 18, 18)
                                .addComponent(g4Button)
                                .addGap(18, 18, 18)
                                .addComponent(g5Button)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(g6Button)
                                        .addGap(18, 18, 18)
                                        .addComponent(g7Button)
                                        .addGap(18, 18, 18)
                                        .addComponent(g8Button))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b2Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b3Button)
                                .addGap(18, 18, 18)
                                .addComponent(b4Button)
                                .addGap(18, 18, 18)
                                .addComponent(b5Button)
                                .addGap(18, 18, 18)
                                .addComponent(b6Button)
                                .addGap(18, 18, 18)
                                .addComponent(b7Button)
                                .addGap(18, 18, 18)
                                .addComponent(b8Button))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d1Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(d2Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(d3Button)
                                .addGap(18, 18, 18)
                                .addComponent(d4Button)
                                .addGap(18, 18, 18)
                                .addComponent(d5Button)
                                .addGap(18, 18, 18)
                                .addComponent(d6Button)
                                .addGap(18, 18, 18)
                                .addComponent(d7Button)
                                .addGap(18, 18, 18)
                                .addComponent(d8Button))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(f1Button)
                                .addGap(10, 10, 10)
                                .addComponent(f2Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f3Button)
                                .addGap(18, 18, 18)
                                .addComponent(f4Button)
                                .addGap(18, 18, 18)
                                .addComponent(f5Button)
                                .addGap(18, 18, 18)
                                .addComponent(f6Button)
                                .addGap(26, 26, 26)
                                .addComponent(f7Button)
                                .addGap(18, 18, 18)
                                .addComponent(f8Button))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(a1Button)
                                    .addComponent(a2Button)
                                    .addComponent(a3Button)
                                    .addComponent(a4Button)
                                    .addComponent(a5Button)
                                    .addComponent(a6Button)
                                    .addComponent(a7Button)
                                    .addComponent(a8Button))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(b1Button)
                                    .addComponent(b2Button)
                                    .addComponent(b3Button)
                                    .addComponent(b4Button)
                                    .addComponent(b5Button)
                                    .addComponent(b6Button)
                                    .addComponent(b7Button)
                                    .addComponent(b8Button))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(c1Button)
                                    .addComponent(c2Button)
                                    .addComponent(c3Button)
                                    .addComponent(c4Button)
                                    .addComponent(c5Button)
                                    .addComponent(c6Button)
                                    .addComponent(c7Button)
                                    .addComponent(c8Button))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(d1Button)
                                    .addComponent(d2Button)
                                    .addComponent(d3Button)
                                    .addComponent(d4Button)
                                    .addComponent(d5Button)
                                    .addComponent(d6Button)
                                    .addComponent(d7Button)
                                    .addComponent(d8Button))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(e1Button)
                                    .addComponent(e2Button)
                                    .addComponent(e3Button)
                                    .addComponent(e4Button)
                                    .addComponent(e5Button)
                                    .addComponent(e6Button)
                                    .addComponent(e7Button)
                                    .addComponent(e8Button))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(f1Button)
                                    .addComponent(f2Button)
                                    .addComponent(f3Button)
                                    .addComponent(f4Button)
                                    .addComponent(f5Button)
                                    .addComponent(f6Button)
                                    .addComponent(f7Button)
                                    .addComponent(f8Button)))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(g1Button)
                        .addComponent(g2Button)
                        .addComponent(g3Button)
                        .addComponent(g4Button)
                        .addComponent(g5Button)
                        .addComponent(g6Button)
                        .addComponent(g7Button)
                        .addComponent(g8Button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Actions performed to select seats. Checks to see if seat is selected, if it isn't,
    * and the user has not selected enough seats it will select it. If it is selected
    * then it will deselect it.
     */
    private void a1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ButtonActionPerformed

        if (a1Clicked == true) {
            a1Button.setBackground(null);
            seatCount--;
            a1Clicked = false;
        } else if (a1Clicked == false) {
            if (seatCount < seatTotal) {
                a1Button.setBackground(Color.BLUE);
                seatCount++;
                a1Clicked = true;
            }
        }
    }//GEN-LAST:event_a1ButtonActionPerformed

    private void c1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ButtonActionPerformed
        if (c1Clicked == true) {
            c1Button.setBackground(null);
            seatCount--;
            c1Clicked = false;
        } else if (c1Clicked == false) {
            if (seatCount < seatTotal) {
                c1Button.setBackground(Color.BLUE);
                seatCount++;
                c1Clicked = true;
            }
        }
    }//GEN-LAST:event_c1ButtonActionPerformed

    private void d1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ButtonActionPerformed
        if (d1Clicked == true) {
            d1Button.setBackground(null);
            seatCount--;
            d1Clicked = false;
        } else if (d1Clicked == false) {
            if (seatCount < seatTotal) {
                d1Button.setBackground(Color.BLUE);
                seatCount++;
                d1Clicked = true;
            }
        }
    }//GEN-LAST:event_d1ButtonActionPerformed

    private void e1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ButtonActionPerformed
        if (e1Clicked == true) {
            e1Button.setBackground(null);
            seatCount--;
            e1Clicked = false;
        } else if (e1Clicked == false) {
            if (seatCount < seatTotal) {
                e1Button.setBackground(Color.BLUE);
                seatCount++;
                e1Clicked = true;
            }
        }
    }//GEN-LAST:event_e1ButtonActionPerformed

    private void f1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ButtonActionPerformed
        if (f1Clicked == true) {
            f1Button.setBackground(null);
            seatCount--;
            f1Clicked = false;
        } else if (f1Clicked == false) {
            if (seatCount < seatTotal) {
                f1Button.setBackground(Color.BLUE);
                seatCount++;
                f1Clicked = true;
            }
        }
    }//GEN-LAST:event_f1ButtonActionPerformed

    private void g1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ButtonActionPerformed
        if (g1Clicked == true) {
            g1Button.setBackground(null);
            seatCount--;
            g1Clicked = false;
        } else if (g1Clicked == false) {
            if (seatCount < seatTotal) {
                g1Button.setBackground(Color.BLUE);
                seatCount++;
                g1Clicked = true;
            }
        }
    }//GEN-LAST:event_g1ButtonActionPerformed

    private void b1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ButtonActionPerformed
        if (b1Clicked == true) {
            b1Button.setBackground(null);
            seatCount--;
            b1Clicked = false;
        } else if (b1Clicked == false) {
            if (seatCount < seatTotal) {
                b1Button.setBackground(Color.BLUE);
                seatCount++;
                b1Clicked = true;
            }
        }
    }//GEN-LAST:event_b1ButtonActionPerformed

    private void b5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ButtonActionPerformed
        if (b5Clicked == true) {
            b5Button.setBackground(null);
            seatCount--;
            b5Clicked = false;
        } else if (b5Clicked == false) {
            if (seatCount < seatTotal) {
                b5Button.setBackground(Color.BLUE);
                seatCount++;
                b5Clicked = true;
            }
        }
    }//GEN-LAST:event_b5ButtonActionPerformed

    private void a6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ButtonActionPerformed
        if (a6Clicked == true) {
            a6Button.setBackground(null);
            seatCount--;
            a6Clicked = false;
        } else if (a6Clicked == false) {
            if (seatCount < seatTotal) {
                a6Button.setBackground(Color.BLUE);
                seatCount++;
                a6Clicked = true;
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_a6ButtonActionPerformed

    private void a2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ButtonActionPerformed
        if (a2Clicked == true) {
            a2Button.setBackground(null);
            seatCount--;
            a2Clicked = false;
        } else if (a2Clicked == false) {
            if (seatCount < seatTotal) {
                a2Button.setBackground(Color.BLUE);
                seatCount++;
                a2Clicked = true;
            }
        }
    }//GEN-LAST:event_a2ButtonActionPerformed

    private void a3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ButtonActionPerformed
        if (a3Clicked == true) {
            a3Button.setBackground(null);
            seatCount--;
            a3Clicked = false;
        } else if (a3Clicked == false) {
            if (seatCount < seatTotal) {
                a3Button.setBackground(Color.BLUE);
                seatCount++;
                a3Clicked = true;
            }
        }
    }//GEN-LAST:event_a3ButtonActionPerformed

    private void a4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ButtonActionPerformed
        if (a4Clicked == true) {
            a4Button.setBackground(null);
            seatCount--;
            a4Clicked = false;
        } else if (a4Clicked == false) {
            if (seatCount < seatTotal) {
                a4Button.setBackground(Color.BLUE);
                seatCount++;
                a4Clicked = true;
            }
        }
    }//GEN-LAST:event_a4ButtonActionPerformed

    private void a5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ButtonActionPerformed
        if (a5Clicked == true) {
            a5Button.setBackground(null);
            seatCount--;
            a5Clicked = false;
        } else if (a5Clicked == false) {
            if (seatCount < seatTotal) {
                a5Button.setBackground(Color.BLUE);
                seatCount++;
                a5Clicked = true;
            }
        }
    }//GEN-LAST:event_a5ButtonActionPerformed

    private void a7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ButtonActionPerformed
        if (a7Clicked == true) {
            a7Button.setBackground(null);
            seatCount--;
            a7Clicked = false;
        } else if (a7Clicked == false) {
            if (seatCount < seatTotal) {
                a7Button.setBackground(Color.BLUE);
                seatCount++;
                a7Clicked = true;
            }
        }
    }//GEN-LAST:event_a7ButtonActionPerformed

    private void a8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ButtonActionPerformed
        if (a8Clicked == true) {
            a8Button.setBackground(null);
            seatCount--;
            a8Clicked = false;
        } else if (a8Clicked == false) {
            if (seatCount < seatTotal) {
                a8Button.setBackground(Color.BLUE);
                seatCount++;
                a8Clicked = true;
            }
        }
    }//GEN-LAST:event_a8ButtonActionPerformed

    private void b2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ButtonActionPerformed
        if (b2Clicked == true) {
            b2Button.setBackground(null);
            seatCount--;
            b2Clicked = false;
        } else if (b2Clicked == false) {
            if (seatCount < seatTotal) {
                b2Button.setBackground(Color.BLUE);
                seatCount++;
                b2Clicked = true;
            }
        }
    }//GEN-LAST:event_b2ButtonActionPerformed

    private void b3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ButtonActionPerformed
        if (b3Clicked == true) {
            b3Button.setBackground(null);
            seatCount--;
            b3Clicked = false;
        } else if (b3Clicked == false) {
            if (seatCount < seatTotal) {
                b3Button.setBackground(Color.BLUE);
                seatCount++;
                b3Clicked = true;
            }
        }
    }//GEN-LAST:event_b3ButtonActionPerformed

    private void b4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ButtonActionPerformed
        if (b4Clicked == true) {
            b4Button.setBackground(null);
            seatCount--;
            b4Clicked = false;
        } else if (b4Clicked == false) {
            if (seatCount < seatTotal) {
                b4Button.setBackground(Color.BLUE);
                seatCount++;
                b4Clicked = true;
            }
        }
    }//GEN-LAST:event_b4ButtonActionPerformed

    private void b6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ButtonActionPerformed
        if (b6Clicked == true) {
            b6Button.setBackground(null);
            seatCount--;
            b6Clicked = false;
        } else if (b6Clicked == false) {
            if (seatCount < seatTotal) {
                b6Button.setBackground(Color.BLUE);
                seatCount++;
                b6Clicked = true;
            }
        }
    }//GEN-LAST:event_b6ButtonActionPerformed

    private void b7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ButtonActionPerformed
        if (b7Clicked == true) {
            b7Button.setBackground(null);
            seatCount--;
            b7Clicked = false;
        } else if (b7Clicked == false) {
            if (seatCount < seatTotal) {
                b7Button.setBackground(Color.BLUE);
                seatCount++;
                b7Clicked = true;
            }
        }
    }//GEN-LAST:event_b7ButtonActionPerformed

    private void b8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ButtonActionPerformed
        if (b8Clicked == true) {
            b8Button.setBackground(null);
            seatCount--;
            b8Clicked = false;
        } else if (b8Clicked == false) {
            if (seatCount < seatTotal) {
                b8Button.setBackground(Color.BLUE);
                seatCount++;
                b8Clicked = true;
            }
        }
    }//GEN-LAST:event_b8ButtonActionPerformed

    private void c2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ButtonActionPerformed
        if (c2Clicked == true) {
            c2Button.setBackground(null);
            seatCount--;
            c2Clicked = false;
        } else if (c2Clicked == false) {
            if (seatCount < seatTotal) {
                c2Button.setBackground(Color.BLUE);
                seatCount++;
                c2Clicked = true;
            }
        }
    }//GEN-LAST:event_c2ButtonActionPerformed

    private void c3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ButtonActionPerformed
        if (c3Clicked == true) {
            c3Button.setBackground(null);
            seatCount--;
            c3Clicked = false;
        } else if (c3Clicked == false) {
            if (seatCount < seatTotal) {
                c3Button.setBackground(Color.BLUE);
                seatCount++;
                c3Clicked = true;
            }
        }
    }//GEN-LAST:event_c3ButtonActionPerformed

    private void c4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ButtonActionPerformed
        if (c4Clicked == true) {
            c4Button.setBackground(null);
            seatCount--;
            c4Clicked = false;
        } else if (c4Clicked == false) {
            if (seatCount < seatTotal) {
                c4Button.setBackground(Color.BLUE);
                seatCount++;
                c4Clicked = true;
            }
        }
    }//GEN-LAST:event_c4ButtonActionPerformed

    private void c5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ButtonActionPerformed
        if (c5Clicked == true) {
            c5Button.setBackground(null);
            seatCount--;
            c5Clicked = false;
        } else if (c5Clicked == false) {
            if (seatCount < seatTotal) {
                c5Button.setBackground(Color.BLUE);
                seatCount++;
                c5Clicked = true;
            }
        }
    }//GEN-LAST:event_c5ButtonActionPerformed

    private void c6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ButtonActionPerformed
        if (c6Clicked == true) {
            c6Button.setBackground(null);
            seatCount--;
            c6Clicked = false;
        } else if (c6Clicked == false) {
            if (seatCount < seatTotal) {
                c6Button.setBackground(Color.BLUE);
                seatCount++;
                c6Clicked = true;
            }
        }
    }//GEN-LAST:event_c6ButtonActionPerformed

    private void c7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ButtonActionPerformed
        if (c7Clicked == true) {
            c7Button.setBackground(null);
            seatCount--;
            c7Clicked = false;
        } else if (c7Clicked == false) {
            if (seatCount < seatTotal) {
                c7Button.setBackground(Color.BLUE);
                seatCount++;
                c7Clicked = true;
            }
        }
    }//GEN-LAST:event_c7ButtonActionPerformed

    private void c8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ButtonActionPerformed
        if (c8Clicked == true) {
            c8Button.setBackground(null);
            seatCount--;
            c8Clicked = false;
        } else if (c8Clicked == false) {
            if (seatCount < seatTotal) {
                c8Button.setBackground(Color.BLUE);
                seatCount++;
                c8Clicked = true;
            }
        }
    }//GEN-LAST:event_c8ButtonActionPerformed

    private void d2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ButtonActionPerformed
        if (d2Clicked == true) {
            d2Button.setBackground(null);
            seatCount--;
            d2Clicked = false;
        } else if (d2Clicked == false) {
            if (seatCount < seatTotal) {
                d2Button.setBackground(Color.BLUE);
                seatCount++;
                d2Clicked = true;
            }
        }
    }//GEN-LAST:event_d2ButtonActionPerformed

    private void d3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ButtonActionPerformed
        if (d3Clicked == true) {
            d3Button.setBackground(null);
            seatCount--;
            d3Clicked = false;
        } else if (d3Clicked == false) {
            if (seatCount < seatTotal) {
                d3Button.setBackground(Color.BLUE);
                seatCount++;
                d3Clicked = true;
            }
        }
    }//GEN-LAST:event_d3ButtonActionPerformed

    private void d4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ButtonActionPerformed
        if (d4Clicked == true) {
            d4Button.setBackground(null);
            seatCount--;
            d4Clicked = false;
        } else if (d4Clicked == false) {
            if (seatCount < seatTotal) {
                d4Button.setBackground(Color.BLUE);
                seatCount++;
                d4Clicked = true;
            }
        }
    }//GEN-LAST:event_d4ButtonActionPerformed

    private void d5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ButtonActionPerformed
        if (d5Clicked == true) {
            d5Button.setBackground(null);
            seatCount--;
            d5Clicked = false;
        } else if (d5Clicked == false) {
            if (seatCount < seatTotal) {
                d5Button.setBackground(Color.BLUE);
                seatCount++;
                d5Clicked = true;
            }
        }
    }//GEN-LAST:event_d5ButtonActionPerformed

    private void d6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6ButtonActionPerformed
        if (d6Clicked == true) {
            d6Button.setBackground(null);
            seatCount--;
            d6Clicked = false;
        } else if (d6Clicked == false) {
            if (seatCount < seatTotal) {
                d6Button.setBackground(Color.BLUE);
                seatCount++;
                d6Clicked = true;
            }
        }
    }//GEN-LAST:event_d6ButtonActionPerformed

    private void d7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d7ButtonActionPerformed
        if (d7Clicked == true) {
            d7Button.setBackground(null);
            seatCount--;
            d7Clicked = false;
        } else if (d7Clicked == false) {
            if (seatCount < seatTotal) {
                d7Button.setBackground(Color.BLUE);
                seatCount++;
                d7Clicked = true;
            }
        }
    }//GEN-LAST:event_d7ButtonActionPerformed

    private void d8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8ButtonActionPerformed
        if (d8Clicked == true) {
            d8Button.setBackground(null);
            seatCount--;
            d8Clicked = false;
        } else if (d8Clicked == false) {
            if (seatCount < seatTotal) {
                d8Button.setBackground(Color.BLUE);
                seatCount++;
                d8Clicked = true;
            }
        }
    }//GEN-LAST:event_d8ButtonActionPerformed

    private void e2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ButtonActionPerformed
        if (e2Clicked == true) {
            e2Button.setBackground(null);
            seatCount--;
            e2Clicked = false;
        } else if (e2Clicked == false) {
            if (seatCount < seatTotal) {
                e2Button.setBackground(Color.BLUE);
                seatCount++;
                e2Clicked = true;
            }
        }
    }//GEN-LAST:event_e2ButtonActionPerformed

    private void e3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ButtonActionPerformed
        if (e3Clicked == true) {
            e3Button.setBackground(null);
            seatCount--;
            e3Clicked = false;
        } else if (e3Clicked == false) {
            if (seatCount < seatTotal) {
                e3Button.setBackground(Color.BLUE);
                seatCount++;
                e3Clicked = true;
            }
        }
    }//GEN-LAST:event_e3ButtonActionPerformed

    private void e4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e4ButtonActionPerformed
        if (e4Clicked == true) {
            e4Button.setBackground(null);
            seatCount--;
            e4Clicked = false;
        } else if (e4Clicked == false) {
            if (seatCount < seatTotal) {
                e4Button.setBackground(Color.BLUE);
                seatCount++;
                e4Clicked = true;
            }
        }
    }//GEN-LAST:event_e4ButtonActionPerformed

    private void e5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e5ButtonActionPerformed
        if (e5Clicked == true) {
            e5Button.setBackground(null);
            seatCount--;
            e5Clicked = false;
        } else if (e5Clicked == false) {
            if (seatCount < seatTotal) {
                e5Button.setBackground(Color.BLUE);
                seatCount++;
                e5Clicked = true;
            }
        }
    }//GEN-LAST:event_e5ButtonActionPerformed

    private void e6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e6ButtonActionPerformed
        if (e6Clicked == true) {
            e6Button.setBackground(null);
            seatCount--;
            e6Clicked = false;
        } else if (e6Clicked == false) {
            if (seatCount < seatTotal) {
                e6Button.setBackground(Color.BLUE);
                seatCount++;
                e6Clicked = true;
            }
        }
    }//GEN-LAST:event_e6ButtonActionPerformed

    private void e7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e7ButtonActionPerformed
        if (e7Clicked == true) {
            e7Button.setBackground(null);
            seatCount--;
            e7Clicked = false;
        } else if (e7Clicked == false) {
            if (seatCount < seatTotal) {
                e7Button.setBackground(Color.BLUE);
                seatCount++;
                e7Clicked = true;
            }
        }
    }//GEN-LAST:event_e7ButtonActionPerformed

    private void e8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e8ButtonActionPerformed
        if (e8Clicked == true) {
            e8Button.setBackground(null);
            seatCount--;
            e8Clicked = false;
        } else if (e8Clicked == false) {
            if (seatCount < seatTotal) {
                e8Button.setBackground(Color.BLUE);
                seatCount++;
                e8Clicked = true;
            }
        }
    }//GEN-LAST:event_e8ButtonActionPerformed

    private void f2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ButtonActionPerformed
        if (f2Clicked == true) {
            f2Button.setBackground(null);
            seatCount--;
            f2Clicked = false;
        } else if (f2Clicked == false) {
            if (seatCount < seatTotal) {
                f2Button.setBackground(Color.BLUE);
                seatCount++;
                f2Clicked = true;
            }
        }
    }//GEN-LAST:event_f2ButtonActionPerformed

    private void f3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ButtonActionPerformed
        if (f3Clicked == true) {
            f3Button.setBackground(null);
            seatCount--;
            f3Clicked = false;
        } else if (f3Clicked == false) {
            if (seatCount < seatTotal) {
                f3Button.setBackground(Color.BLUE);
                seatCount++;
                f3Clicked = true;
            }
        }
    }//GEN-LAST:event_f3ButtonActionPerformed

    private void f4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ButtonActionPerformed
        if (f4Clicked == true) {
            f4Button.setBackground(null);
            seatCount--;
            f4Clicked = false;
        } else if (f4Clicked == false) {
            if (seatCount < seatTotal) {
                f4Button.setBackground(Color.BLUE);
                seatCount++;
                f4Clicked = true;
            }
        }
    }//GEN-LAST:event_f4ButtonActionPerformed

    private void f5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ButtonActionPerformed
        if (f5Clicked == true) {
            f5Button.setBackground(null);
            seatCount--;
            f5Clicked = false;
        } else if (f5Clicked == false) {
            if (seatCount < seatTotal) {
                f5Button.setBackground(Color.BLUE);
                seatCount++;
                f5Clicked = true;
            }
        }
    }//GEN-LAST:event_f5ButtonActionPerformed

    private void f6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f6ButtonActionPerformed
        if (f6Clicked == true) {
            f6Button.setBackground(null);
            seatCount--;
            f6Clicked = false;
        } else if (f6Clicked == false) {
            if (seatCount < seatTotal) {
                f6Button.setBackground(Color.BLUE);
                seatCount++;
                f6Clicked = true;
            }
        }
    }//GEN-LAST:event_f6ButtonActionPerformed

    private void f7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f7ButtonActionPerformed
        if (f7Clicked == true) {
            f7Button.setBackground(null);
            seatCount--;
            f7Clicked = false;
        } else if (f7Clicked == false) {
            if (seatCount < seatTotal) {
                f7Button.setBackground(Color.BLUE);
                seatCount++;
                f7Clicked = true;
            }
        }
    }//GEN-LAST:event_f7ButtonActionPerformed

    private void f8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f8ButtonActionPerformed
        if (f8Clicked == true) {
            f8Button.setBackground(null);
            seatCount--;
            f8Clicked = false;
        } else if (f8Clicked == false) {
            if (seatCount < seatTotal) {
                f8Button.setBackground(Color.BLUE);
                seatCount++;
                f8Clicked = true;
            }
        }
    }//GEN-LAST:event_f8ButtonActionPerformed

    private void g2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ButtonActionPerformed
        if (g2Clicked == true) {
            g2Button.setBackground(null);
            seatCount--;
            g2Clicked = false;
        } else if (g2Clicked == false) {
            if (seatCount < seatTotal) {
                g2Button.setBackground(Color.BLUE);
                seatCount++;
                g2Clicked = true;
            }
        }
    }//GEN-LAST:event_g2ButtonActionPerformed

    private void g3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ButtonActionPerformed
        if (g3Clicked == true) {
            g3Button.setBackground(null);
            seatCount--;
            g3Clicked = false;
        } else if (g3Clicked == false) {
            if (seatCount < seatTotal) {
                g3Button.setBackground(Color.BLUE);
                seatCount++;
                g3Clicked = true;
            }
        }
    }//GEN-LAST:event_g3ButtonActionPerformed

    private void g4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ButtonActionPerformed
        if (g4Clicked == true) {
            g4Button.setBackground(null);
            seatCount--;
            g4Clicked = false;
        } else if (g4Clicked == false) {
            if (seatCount < seatTotal) {
                g4Button.setBackground(Color.BLUE);
                seatCount++;
                g4Clicked = true;
            }
        }
    }//GEN-LAST:event_g4ButtonActionPerformed

    private void g5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g5ButtonActionPerformed
        if (g5Clicked == true) {
            g5Button.setBackground(null);
            seatCount--;
            g5Clicked = false;
        } else if (g5Clicked == false) {
            if (seatCount < seatTotal) {
                g5Button.setBackground(Color.BLUE);
                seatCount++;
                g5Clicked = true;
            }
        }
    }//GEN-LAST:event_g5ButtonActionPerformed

    private void g6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g6ButtonActionPerformed
        if (g6Clicked == true) {
            g6Button.setBackground(null);
            seatCount--;
            g6Clicked = false;
        } else if (g6Clicked == false) {
            if (seatCount < seatTotal) {
                g6Button.setBackground(Color.BLUE);
                seatCount++;
                g6Clicked = true;
            }
        }
    }//GEN-LAST:event_g6ButtonActionPerformed

    private void g7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g7ButtonActionPerformed
        if (g7Clicked == true) {
            g7Button.setBackground(null);
            seatCount--;
            g7Clicked = false;
        } else if (g7Clicked == false) {
            if (seatCount < seatTotal) {
                g7Button.setBackground(Color.BLUE);
                seatCount++;
                g7Clicked = true;
            }
        }
    }//GEN-LAST:event_g7ButtonActionPerformed

    private void g8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g8ButtonActionPerformed
        if (g8Clicked == true) {
            g8Button.setBackground(null);
            seatCount--;
            g8Clicked = false;
        } else if (g8Clicked == false) {
            if (seatCount < seatTotal) {
                g8Button.setBackground(Color.BLUE);
                seatCount++;
                g8Clicked = true;
            }
        }
    }//GEN-LAST:event_g8ButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        this.dispose();
        new TicketSelector().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*
        * Checks to see if the correct amount of seats are chosen. If they are they are
        * added to the seats array. If not an error is displayed.
         */
        if (seatCount == seatTotal) {
            seatSelection();
            seatsToString();
            this.setVisible(false);
            new Payment_Information().setVisible(true);
        } else {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "You must select " + seatTotal + " seats.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /*
    * When continue is selected and the correct number of seats were chosen
    * this adds all the selected seats to the seats array.
     */
    private void seatSelection() {
        int count = 0;
        if (a1Clicked == true) {
            seats[count] = "A1";
            count++;
        }
        if (a2Clicked == true) {
            seats[count] = "A2";
            count++;
        }
        if (a3Clicked == true) {
            seats[count] = "A3";
            count++;
        }
        if (a4Clicked == true) {
            seats[count] = "A4";
            count++;
        }
        if (a5Clicked == true) {
            seats[count] = "A5";
            count++;
        }
        if (a6Clicked == true) {
            seats[count] = "A6";
            count++;
        }
        if (a7Clicked == true) {
            seats[count] = "A7";
            count++;
        }
        if (a8Clicked == true) {
            seats[count] = "A8";
            count++;
        }
        if (b1Clicked == true) {
            seats[count] = "B1";
            count++;
        }
        if (b2Clicked == true) {
            seats[count] = "B2";
            count++;
        }
        if (b3Clicked == true) {
            seats[count] = "B3";
            count++;
        }
        if (b4Clicked == true) {
            seats[count] = "B4";
            count++;
        }
        if (b5Clicked == true) {
            seats[count] = "B5";
            count++;
        }
        if (b6Clicked == true) {
            seats[count] = "B6";
            count++;
        }
        if (b7Clicked == true) {
            seats[count] = "B7";
            count++;
        }
        if (b8Clicked == true) {
            seats[count] = "B8";
            count++;
        }
        if (c1Clicked == true) {
            seats[count] = "C1";
            count++;
        }
        if (c2Clicked == true) {
            seats[count] = "C2";
            count++;
        }
        if (c3Clicked == true) {
            seats[count] = "C3";
            count++;
        }
        if (c4Clicked == true) {
            seats[count] = "C4";
            count++;
        }
        if (c5Clicked == true) {
            seats[count] = "C5";
            count++;
        }
        if (c6Clicked == true) {
            seats[count] = "C6";
            count++;
        }
        if (c7Clicked == true) {
            seats[count] = "C7";
            count++;
        }
        if (c8Clicked == true) {
            seats[count] = "C8";
            count++;
        }
        if (d1Clicked == true) {
            seats[count] = "D1";
            count++;
        }
        if (d2Clicked == true) {
            seats[count] = "D2";
            count++;
        }
        if (d3Clicked == true) {
            seats[count] = "D3";
            count++;
        }
        if (d4Clicked == true) {
            seats[count] = "D4";
            count++;
        }
        if (d5Clicked == true) {
            seats[count] = "D5";
            count++;
        }
        if (d6Clicked == true) {
            seats[count] = "D6";
            count++;
        }
        if (d7Clicked == true) {
            seats[count] = "D7";
            count++;
        }
        if (d8Clicked == true) {
            seats[count] = "D8";
            count++;
        }
        if (e1Clicked == true) {
            seats[count] = "E1";
            count++;
        }
        if (e2Clicked == true) {
            seats[count] = "E2";
            count++;
        }
        if (e3Clicked == true) {
            seats[count] = "E3";
            count++;
        }
        if (e4Clicked == true) {
            seats[count] = "E4";
            count++;
        }
        if (e5Clicked == true) {
            seats[count] = "E5";
            count++;
        }
        if (e6Clicked == true) {
            seats[count] = "E6";
            count++;
        }
        if (e7Clicked == true) {
            seats[count] = "E7";
            count++;
        }
        if (e8Clicked == true) {
            seats[count] = "E8";
            count++;
        }
        if (f1Clicked == true) {
            seats[count] = "F1";
            count++;
        }
        if (f2Clicked == true) {
            seats[count] = "F2";
            count++;
        }
        if (f3Clicked == true) {
            seats[count] = "F3";
            count++;
        }
        if (f4Clicked == true) {
            seats[count] = "F4";
            count++;
        }
        if (f5Clicked == true) {
            seats[count] = "F5";
            count++;
        }
        if (f6Clicked == true) {
            seats[count] = "F6";
            count++;
        }
        if (f7Clicked == true) {
            seats[count] = "F7";
            count++;
        }
        if (f8Clicked == true) {
            seats[count] = "F8";
            count++;
        }
        if (g1Clicked == true) {
            seats[count] = "G1";
            count++;
        }
        if (g2Clicked == true) {
            seats[count] = "G2";
            count++;
        }
        if (g3Clicked == true) {
            seats[count] = "G3";
            count++;
        }
        if (g4Clicked == true) {
            seats[count] = "G4";
            count++;
        }
        if (g5Clicked == true) {
            seats[count] = "G5";
            count++;
        }
        if (g6Clicked == true) {
            seats[count] = "G6";
            count++;
        }
        if (g7Clicked == true) {
            seats[count] = "G7";
            count++;
        }
        if (g8Clicked == true) {
            seats[count] = "G8";
            count++;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeatSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SeatSelector().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SeatSelector.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton a1Button;
    public javax.swing.JButton a2Button;
    public javax.swing.JButton a3Button;
    public javax.swing.JButton a4Button;
    public javax.swing.JButton a5Button;
    public javax.swing.JButton a6Button;
    public javax.swing.JButton a7Button;
    public javax.swing.JButton a8Button;
    public javax.swing.JButton b1Button;
    public javax.swing.JButton b2Button;
    public javax.swing.JButton b3Button;
    public javax.swing.JButton b4Button;
    public javax.swing.JButton b5Button;
    public javax.swing.JButton b6Button;
    public javax.swing.JButton b7Button;
    public javax.swing.JButton b8Button;
    public javax.swing.JButton c1Button;
    public javax.swing.JButton c2Button;
    public javax.swing.JButton c3Button;
    public javax.swing.JButton c4Button;
    public javax.swing.JButton c5Button;
    public javax.swing.JButton c6Button;
    public javax.swing.JButton c7Button;
    public javax.swing.JButton c8Button;
    public javax.swing.JButton d1Button;
    public javax.swing.JButton d2Button;
    public javax.swing.JButton d3Button;
    public javax.swing.JButton d4Button;
    public javax.swing.JButton d5Button;
    public javax.swing.JButton d6Button;
    public javax.swing.JButton d7Button;
    public javax.swing.JButton d8Button;
    public javax.swing.JButton e1Button;
    public javax.swing.JButton e2Button;
    public javax.swing.JButton e3Button;
    public javax.swing.JButton e4Button;
    public javax.swing.JButton e5Button;
    public javax.swing.JButton e6Button;
    public javax.swing.JButton e7Button;
    public javax.swing.JButton e8Button;
    public javax.swing.JButton f1Button;
    public javax.swing.JButton f2Button;
    public javax.swing.JButton f3Button;
    public javax.swing.JButton f4Button;
    public javax.swing.JButton f5Button;
    public javax.swing.JButton f6Button;
    public javax.swing.JButton f7Button;
    public javax.swing.JButton f8Button;
    public javax.swing.JButton g1Button;
    public javax.swing.JButton g2Button;
    public javax.swing.JButton g3Button;
    public javax.swing.JButton g4Button;
    public javax.swing.JButton g5Button;
    public javax.swing.JButton g6Button;
    public javax.swing.JButton g7Button;
    public javax.swing.JButton g8Button;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    /*
    * Adds the seats to a string to be called later.
     */
    private void seatsToString() {
        for (int i = 0; i < seats.length; i++) {
            if (i == 0 && seats.length == 1) {
                seatList = seats[i];
            } else if (i == 0) {
                seatList = seats[i] + ", ";
            } else if (i == seats.length - 1) {
                seatList = seatList + seats[i];
            } else {
                seatList = seatList + seats[i] + ", ";
            }
        }
    }

    private void initTable() throws SQLException {
        try {
            String url = "jdbc:derby://localhost:1527/FinalDB";
            
            Connection conn = DriverManager.getConnection(url, "verb", "verb");
            try ( //Connection conn = DriverManager.getConnection(url, "csc", "380");
                    Statement st = conn.createStatement(); PreparedStatement stmt = conn.prepareStatement("SELECT * FROM VERB.SOLDSEATS WHERE SHOWING = '" + Mainpage.primaryKey + "'"); //PreparedStatement stmt = conn.prepareStatement("SELECT * FROM CSC.SOLDSEATS WHERE SHOWING = '" + Mainpage.primaryKey + "'");
                    ResultSet rs = stmt.executeQuery()) {
                
                while (rs.next()) {
                    a1Available = rs.getInt("A1");
                    a2Available = rs.getInt("A2");
                    a3Available = rs.getInt("A3");
                    a4Available = rs.getInt("A4");
                    a5Available = rs.getInt("A5");
                    a6Available = rs.getInt("A6");
                    a7Available = rs.getInt("A7");
                    a8Available = rs.getInt("A8");
                    b1Available = rs.getInt("B1");
                    b2Available = rs.getInt("B2");
                    b3Available = rs.getInt("B3");
                    b4Available = rs.getInt("B4");
                    b5Available = rs.getInt("B5");
                    b6Available = rs.getInt("B6");
                    b7Available = rs.getInt("B7");
                    b8Available = rs.getInt("B8");
                    c1Available = rs.getInt("C1");
                    c2Available = rs.getInt("C2");
                    c3Available = rs.getInt("C3");
                    c4Available = rs.getInt("C4");
                    c5Available = rs.getInt("C5");
                    c6Available = rs.getInt("C6");
                    c7Available = rs.getInt("C7");
                    c8Available = rs.getInt("C8");
                    d1Available = rs.getInt("D1");
                    d2Available = rs.getInt("D2");
                    d3Available = rs.getInt("D3");
                    d4Available = rs.getInt("D4");
                    d5Available = rs.getInt("D5");
                    d6Available = rs.getInt("D6");
                    d7Available = rs.getInt("D7");
                    d8Available = rs.getInt("D8");
                    e1Available = rs.getInt("E1");
                    e2Available = rs.getInt("E2");
                    e3Available = rs.getInt("E3");
                    e4Available = rs.getInt("E4");
                    e5Available = rs.getInt("E5");
                    e6Available = rs.getInt("E6");
                    e7Available = rs.getInt("E7");
                    e8Available = rs.getInt("E8");
                    f1Available = rs.getInt("F1");
                    f2Available = rs.getInt("F2");
                    f3Available = rs.getInt("F3");
                    f4Available = rs.getInt("F4");
                    f5Available = rs.getInt("F5");
                    f6Available = rs.getInt("F6");
                    f7Available = rs.getInt("F7");
                    f8Available = rs.getInt("F8");
                    g1Available = rs.getInt("G1");
                    g2Available = rs.getInt("G2");
                    g3Available = rs.getInt("G3");
                    g4Available = rs.getInt("G4");
                    g5Available = rs.getInt("G5");
                    g6Available = rs.getInt("G6");
                    g7Available = rs.getInt("G7");
                    g8Available = rs.getInt("G8");
                }
            }
        } catch (Exception e) {
            System.err.println("Error");
            System.err.println(e.getMessage());
        }
    }
}
