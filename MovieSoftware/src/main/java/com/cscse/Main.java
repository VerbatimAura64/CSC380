/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cscse;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Main
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Launch();
    }
    static void Launch() {
        LoginUIV1 login = new LoginUIV1();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setVisible(true);
        //SeatReservation seat = new SeatReservation();
        //seat.SetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //seat.setVisible(true);
        //MainWindow mainUI = new MainWindow();
        //mainUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mainUI.setVisible(true);
        //JohnWickMovie johnWick = new JohnWickMovie();
        //johnWick.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //johnWick.setVisible(true);
        //JFrame clock = new TextClock();
        //clock.setVisible(true);
        //clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //clock.setSize(300, 100);
        //clock.setVisible(true);
    }
    
}
