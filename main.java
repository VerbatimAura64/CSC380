package csc380finalproject;

import java.time.Clock;
import java.util.Calendar;
import javax.swing.JFrame;

public class main {

    
    public static void main(String[] args) {
        JFrame clock = new TextClock();
        clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock.setSize(300, 100);
        clock.setVisible(true);
    }
    
}
