/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieprogram.Main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 *
 * @author Robert
 */
public class AppTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        Robot bot = new Robot();
        Login l = new Login();
        bot.delay(3000);
        l.setVisible(true);
        bot.delay(1000);
        l.loginTextField.setText("Alex Pantaleev");
        bot.delay(1000);
        l.passwordField.setText("12345");
        bot.delay(1000);
        System.out.println(l.confirmButton.getX() + " " + l.confirmButton.getY());
        bot.mouseMove(l.confirmButton.getX(), l.confirmButton.getY());
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
    
}
