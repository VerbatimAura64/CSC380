
package com.movieprogram.Main;

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
        Login login = new Login();
        login.setVisible(true);
        bot.delay(2000);
        bot.mouseMove(login.guestButton.getLocationOnScreen().x +5, login.guestButton.getLocationOnScreen().y +5);
        bot.delay(1000);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        
        //Main Window
        bot.delay(2000);
        bot.mouseMove(434, 420);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
        bot.mouseMove(866, 446);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
        bot.mouseMove(940, 642);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        
        //Ticket Selector
        bot.delay(2000);
        bot.mouseMove(756, 330);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
        bot.mouseMove(730, 400);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
        bot.mouseMove(586, 441);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
        
        
        //Seat Selector
        bot.mouseMove(868, 387);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
        bot.mouseMove(936, 390);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
        bot.mouseMove(840, 566);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
         
        
        //Payment Information
        bot.mouseMove(789, 215);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(1000);
        
        bot.keyPress(52); bot.keyRelease(52);
        bot.delay(100);
        bot.keyPress(48); bot.keyRelease(48);
        bot.delay(100);
        bot.keyPress(52); bot.keyRelease(52);
        bot.delay(100);
        bot.keyPress(49); bot.keyRelease(49);
        bot.delay(100);
        
        bot.keyPress(57); bot.keyRelease(57);
        bot.delay(100);
        bot.keyPress(51); bot.keyRelease(51);
        bot.delay(100);
        bot.keyPress(51); bot.keyRelease(51);
        bot.delay(100);
        bot.keyPress(55); bot.keyRelease(55);
        bot.delay(100);
        
        bot.keyPress(56); bot.keyRelease(56);
        bot.delay(100);
        bot.keyPress(48); bot.keyRelease(48);
        bot.delay(100);
        bot.keyPress(54); bot.keyRelease(54);
        bot.delay(100);
        bot.keyPress(50); bot.keyRelease(50);
        bot.delay(100);
        
        bot.keyPress(57); bot.keyRelease(57);
        bot.delay(100);
        bot.keyPress(50); bot.keyRelease(50);
        bot.delay(100);
        bot.keyPress(55); bot.keyRelease(55);
        bot.delay(100);
        bot.keyPress(52); bot.keyRelease(52);
        
        bot.delay(1000);
        bot.mouseMove(930, 253);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(100);
        bot.keyPress(48);
        bot.delay(100);
        bot.keyPress(54);
        bot.delay(100);
        bot.keyPress(52);
        
        bot.delay(1000);
        bot.mouseMove(834, 313);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(500);
        bot.mouseMove(850, 376);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(500);
        
        bot.delay(1000);
        bot.mouseMove(897, 313);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(500);
        bot.mouseMove(906, 450);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(500);
        
        bot.delay(1000);
        bot.mouseMove(789, 361);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.keyPress(16);
        bot.delay(100);
        bot.keyPress(87);
        bot.delay(100);
        bot.keyRelease(16);
        bot.delay(100);
        bot.keyPress(73);
        bot.delay(100);
        bot.keyPress(76);
        bot.keyRelease(76);
        bot.delay(100);
        bot.keyPress(76);
        
        bot.delay(100);
        bot.keyPress(32);
        bot.delay(100);
        
        bot.keyPress(16);
        bot.delay(100);
        bot.keyPress(65);
        bot.delay(100);
        bot.keyRelease(16);
        bot.delay(100);
        bot.keyPress(76);
        bot.delay(100);
        bot.keyPress(79);
        bot.delay(100);
        bot.keyPress(78);
        bot.delay(100);
        bot.keyPress(90);
        bot.delay(100);
        bot.keyPress(79);
        
        bot.delay(1000);
        bot.mouseMove(789, 398);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.keyPress(16);
        bot.delay(100);
        bot.keyPress(79);
        bot.delay(100);
        bot.keyRelease(16);
        bot.delay(100);
        bot.keyPress(83);
        bot.delay(100);
        bot.keyPress(87);
        bot.delay(100);
        bot.keyPress(69);
        bot.delay(100);
        bot.keyPress(71);
        bot.delay(100);
        bot.keyPress(79);
        
        bot.delay(1000);
        bot.mouseMove(891, 455);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(500);
        bot.mouseMove(926, 505);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
        bot.mouseMove(926, 560);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(500);
        bot.mouseMove(904, 602);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        bot.delay(1000);
        bot.mouseMove(864, 492);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.keyPress(49);
        bot.delay(100);
        bot.keyPress(51);
        bot.delay(100);
        bot.keyPress(49);
        bot.delay(100);
        bot.keyPress(50);
        bot.delay(100);
        bot.keyPress(54);

        bot.delay(1000);
        bot.mouseMove(800, 560);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        
        //Confirmation Page
        bot.delay(5000);
        bot.mouseMove(739, 476);
        bot.delay(500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        bot.delay(1000);
        
        
        //Login Again
        //UserID
        bot.mouseMove(680, 348);
        bot.delay(100);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(100);
        bot.keyPress(65);
        bot.delay(100);
        bot.keyPress(68);
        bot.delay(100);
        bot.keyPress(77);
        bot.delay(100);
        bot.keyPress(73);
        bot.delay(100);
        bot.keyPress(78);
        
        
        //Password
        bot.delay(200);
        bot.mouseMove(680, 386);
        bot.delay(100);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(100);
        bot.keyPress(65);
        bot.delay(100);
        bot.keyPress(68);
        bot.delay(100);
        bot.keyPress(77);
        bot.delay(100);
        bot.keyPress(73);
        bot.delay(100);
        bot.keyPress(78);
        
        bot.delay(500);
        bot.mouseMove(604, 448);
        bot.delay(100);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(100);
    }   
}
