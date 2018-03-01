/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc380ui;

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
        LoginUIV1 login = new LoginUIV1();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setVisible(true);
        
        //MainUI1 mainUI = new MainUI1();
        //mainUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mainUI.setVisible(true);
        //JohnWickMovie johnWick = new JohnWickMovie();
        //johnWick.setVisible(true);
        //JFrame clock = new TextClock();
        //clock.setVisible(true);
        //clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //clock.setSize(300, 100);
        //clock.setVisible(true);
    }
    
}
