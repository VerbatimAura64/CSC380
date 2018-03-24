/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc380ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;

/**
 *
 * @author Robert
 */
public class TextClock extends JPanel {

    private JTextField timeField;

    public TextClock() {
        timeField = new JTextField(100);
        timeField.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        timeField.setBackground(Color.WHITE);
        timeField.setHorizontalAlignment(JTextField.CENTER);

        //Container content = this.getContentPane();
       // content.setLayout(new FlowLayout());
       // content.add(timeField);

        //this.pack();
        javax.swing.Timer time = new javax.swing.Timer(0, (ActionEvent e) -> {
            String meridiem;
            String currentHour;
            String currentMinutes;
            Calendar current = Calendar.getInstance();
            int hours = current.get(Calendar.HOUR);
            if (hours == 0) {
                currentHour = "12";
            } else {
                currentHour = Integer.toString(hours);
            }
            int minutes = current.get(Calendar.MINUTE);
            if (minutes < 10) {
                currentMinutes = "0" + Integer.toString(minutes);
            } else {
                currentMinutes = Integer.toString(minutes);
            }
            String month = current.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault(Locale.Category.DISPLAY));
            int day = current.get(Calendar.DATE);
            int ampm = current.get(Calendar.AM_PM);
            if (ampm == 1) {
                meridiem = "pm";
            } else {
                meridiem = "am";
            }
            timeField.setText(month + " " + day + ", " + currentHour + ":" + currentMinutes + " " + meridiem);
        });
        time.start();
    }

}
