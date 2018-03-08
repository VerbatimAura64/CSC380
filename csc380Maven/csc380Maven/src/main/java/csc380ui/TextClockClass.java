package csc380ui;

import java.time.Clock;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextClockClass{

    
    public static void main(String[] args) {
        TextClock clock = new TextClock();
        clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock.setSize(300, 50);
        clock.setVisible(true);
    }
    
}
