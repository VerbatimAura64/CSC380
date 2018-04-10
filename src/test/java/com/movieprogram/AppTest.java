package com.cscse;

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
        Robot bot = new Robot();
        SignUp suf = new SignUp();
        bot.delay(3000);
        suf.window.setVisible(true);
        bot.delay(1000);
        suf.nameTextField.setText("Alex Pantaleev");
        bot.delay(1000);
        suf.ageTextField.setText("31");
        bot.delay(1000);
        suf.emailTextField.setText("alex@cs.oswego.edu");
        bot.delay(1000);
        suf.verifyEmailTextField.setText("alex@cs.oswego.edu");
        bot.delay(1000);
        suf.passwordTextField.setText("YouPassTheClass");
        bot.delay(1000);
        suf.verifyPasswordTextField.setText("YouPassTheClass");
        bot.delay(2000);
        bot.mouseMove(186, 227);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
        bot.mouseMove(800, 20);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
    }
    
    public void testApp1() throws AWTException, IOException
    {
        SignUp suf = new SignUp();
        Robot bot = new Robot();
        suf.window.setVisible(true);
        bot.delay(1000);
        suf.nameTextField.setText("Alex Pantaleev");
        bot.delay(1000);
        suf.ageTextField.setText("31");
        bot.delay(1000);
        suf.emailTextField.setText("alex@cs.oswego.edu");
        bot.delay(1000);
        suf.verifyEmailTextField.setText("walonzo@oswego.edu");
        bot.delay(1000);
        suf.passwordTextField.setText("YouPassTheClass");
        bot.delay(1000);
        suf.verifyPasswordTextField.setText("YouPassTheClass");
        bot.delay(2000);
        bot.mouseMove(186, 227);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //assert (SignUp.FileUpdated());
        bot.delay(2000);
        suf.window.setVisible(false);
        bot.delay(2000);
    }
    
    public void testApp2() throws AWTException, IOException
    {
        MainWindow mw = new MainWindow();
        Robot bot = new Robot();
        mw.setVisible(true);
        bot.delay(5000);
        mw.setVisible(true);
        bot.mouseMove(145,294);
        bot.delay(2000);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
        mw.setVisible(false);
        bot.delay(2000);
        
    }
}
