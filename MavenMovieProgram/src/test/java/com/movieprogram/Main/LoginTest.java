/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieprogram.Main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Robert
 */
public class LoginTest extends TestCase {
    
    public LoginTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(LoginTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of main method, of class Login.
     */
    public void testMain() throws AWTException {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        
        Robot bot = new Robot();
        Login l = new Login();
        bot.delay(3000);
        l.setVisible(true);
        bot.delay(1000);
        l.loginTextField.setText("Admin");
        bot.delay(1000);
        l.passwordField.setText("password1");
        bot.delay(1000);
        
        //Cancel Button 
        //bot.mouseMove(689,448);
       // Guest Button 
        //bot.mouseMove(648,486);
        // Confirm Button
        bot.mouseMove(604,448);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }
    
}
