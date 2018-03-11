package com.cscse;

//this file goes in this directory to test "\\src\\test\\java\\com\\cscse\\AppTest.java"
//then on command line go to the top maven project folder, whatever you called it, and type mvn clean test

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigorous Test :-)
     * @throws java.awt.AWTException
     * @throws java.io.IOException
     */
    public void testApp() throws AWTException, IOException
    {
        Main.Launch();
        Robot bot = new Robot();
        bot.mouseMove(256,294);
        bot.delay(2000);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
        SignUp suf = new SignUp();
        bot.delay(3000);
        suf.nameTextField.setText("Alex Pantaleev");
        suf.ageTextField.setText("34");
        suf.emailTextField.setText("alex@cs.oswego.edu");
        suf.verifyEmailTextField.setText("alex@cs.oswego.edu");
        suf.passwordTextField.setText("YouPass");
        suf.verifyPasswordTextField.setText("YouPass");
        bot.delay(2000);
        bot.mouseMove(152, 227);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
        bot.mouseMove(100, 200);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(5000);
        
        
    }
}
