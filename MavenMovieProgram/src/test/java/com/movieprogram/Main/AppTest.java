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
import java.sql.SQLException;

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
    
    public void testApp() throws AWTException, IOException, SQLException
    {
//        Robot bot = new Robot();
//        Login login = new Login();
//        Mainpage mp = new Mainpage();
//        TicketSelector ts = new TicketSelector();
//        SeatSelector ss = new SeatSelector();
//        Payment_Information pi = new Payment_Information();
//        ConfirmationPage cp = new ConfirmationPage();
//        SignUpForm suf = new SignUpForm();
//        AdminPrices ap = new AdminPrices();
//        AdminMainPage admin = new AdminMainPage();
//        Guardians gotg = new Guardians();
//
//        mp.setVisible(true);
//        int contx = mp.continueButton.getLocationOnScreen().x;
//        int conty = mp.continueButton.getLocationOnScreen().y;
//        int gotgx = mp.movie1RadioButton.getLocationOnScreen().x;
//        int gotgy = mp.movie1RadioButton.getLocationOnScreen().y;
//        int timex = mp.movie1Time2.getLocationOnScreen().x;
//        int timey = mp.movie1Time2.getLocationOnScreen().y;
//        int dunkx = mp.movie2RadioButton.getLocationOnScreen().x;
//        int dunky = mp.movie2RadioButton.getLocationOnScreen().y;
//        int time1x = mp.movie2Time2.getLocationOnScreen().x;
//        int time1y = mp.movie2Time2.getLocationOnScreen().y;
//        int gotgpx = mp.goTGPicture.getLocationOnScreen().x;
//        int gotgpy = mp.goTGPicture.getLocationOnScreen().y;
//        mp.setVisible(false);
//        
//        
//        gotg.setVisible(true);
//        int backx = gotg.backButton.getLocationOnScreen().x;
//        int backy = gotg.backButton.getLocationOnScreen().y;
//        gotg.setVisible(false);
//        
//        
//        ts.setVisible(true);
//        int atx = ts.adultTickets.getLocationOnScreen().x;
//        int aty = ts.adultTickets.getLocationOnScreen().y;
//        int nextx = ts.okbutton.getLocationOnScreen().x;
//        int nexty = ts.okbutton.getLocationOnScreen().y;
//        ts.setVisible(false);
//        
//        
//        ss.setVisible(true);
//        int seat1x = ss.d4Button.getLocationOnScreen().x;
//        int seat1y = ss.d4Button.getLocationOnScreen().y;
//        int seat2x = ss.d5Button.getLocationOnScreen().x;
//        int seat2y = ss.d5Button.getLocationOnScreen().y;
//        int seat3x = ss.c4Button.getLocationOnScreen().x;
//        int seat3y = ss.c4Button.getLocationOnScreen().y;
//        int seat4x = ss.c5Button.getLocationOnScreen().x;
//        int seat4y = ss.c5Button.getLocationOnScreen().y;
//        int goonx = ss.jButton2.getLocationOnScreen().x;
//        int goony = ss.jButton2.getLocationOnScreen().y;
//        ss.setVisible(false);
//        
//        
//        pi.setVisible(true);
//        int ccx = pi.creditCardNumberField.getLocationOnScreen().x;
//        int ccy = pi.creditCardNumberField.getLocationOnScreen().y;
//        int ccvx = pi.ccvNumberField.getLocationOnScreen().x;
//        int ccvy = pi.ccvNumberField.getLocationOnScreen().y;
//        int monthx = pi.monthComboBox.getLocationOnScreen().x;
//        int monthy = pi.monthComboBox.getLocationOnScreen().y;
//        int yearx = pi.yearComboBox.getLocationOnScreen().x;
//        int yeary = pi.yearComboBox.getLocationOnScreen().y;
//        int nameCardx = pi.nameTextField.getLocationOnScreen().x;
//        int nameCardy = pi.nameTextField.getLocationOnScreen().y;
//        int addressx = pi.address1TextField.getLocationOnScreen().x;
//        int addressy = pi.address1TextField.getLocationOnScreen().y;
//        int statex = pi.stateComboBox.getLocationOnScreen().x;
//        int statey = pi.stateComboBox.getLocationOnScreen().y;
//        int zipx = pi.zipTextField.getLocationOnScreen().x;
//        int zipy = pi.zipTextField.getLocationOnScreen().y;
//        int confirmx = pi.jButton1.getLocationOnScreen().x;
//        int confirmy = pi.jButton1.getLocationOnScreen().y;
//        pi.setVisible(false);
//        
//        
//        cp.setVisible(true);
//        int quitx = cp.quitButton.getLocationOnScreen().x;
//        int quity = cp.quitButton.getLocationOnScreen().y;
//        cp.setVisible(false);
//        
//        
//        admin.setVisible(true);
//        int closex = admin.jButton2.getLocationOnScreen().x;
//        int closey = admin.jButton2.getLocationOnScreen().y;
//        int pricex = admin.jButton1.getLocationOnScreen().x;
//        int pricey = admin.jButton1.getLocationOnScreen().y;
//        admin.setVisible(false);
//        
//        suf.setVisible(true);
//        int namex = suf.nameTextField.getLocationOnScreen().x;
//        int namey = suf.nameTextField.getLocationOnScreen().y;
//        int dobmx = suf.monthDOB.getLocationOnScreen().x;
//        int dobmy = suf.monthDOB.getLocationOnScreen().y;
//        int dobdx = suf.dayDOB.getLocationOnScreen().x;
//        int dobdy = suf.dayDOB.getLocationOnScreen().y;
//        int dobyx = suf.jComboBox3.getLocationOnScreen().x;
//        int dobyy = suf.jComboBox3.getLocationOnScreen().y;
//        int emailx= suf.emailTextField.getLocationOnScreen().x;
//        int emaily= suf.emailTextField.getLocationOnScreen().y;
//        int verifyex = suf.verifyEmailTextField.getLocationOnScreen().x;
//        int verifyey = suf.verifyEmailTextField.getLocationOnScreen().y;
//        int passx = suf.passwordField.getLocationOnScreen().x;
//        int passy = suf.passwordField.getLocationOnScreen().y;
//        int verifypx = suf.verifyPasswordField.getLocationOnScreen().x;
//        int verifypy = suf.verifyPasswordField.getLocationOnScreen().y;
//        int tnsx = suf.termsCheckBox.getLocationOnScreen().x;
//        int tnsy = suf.termsCheckBox.getLocationOnScreen().y;
//        int acceptx = suf.createButton.getLocationOnScreen().x;
//        int accepty = suf.createButton.getLocationOnScreen().y;
//        suf.setVisible(false);
//        
//        
//        ap.setVisible(true);
//        int adultx = ap.adultPricesField.getLocationOnScreen().x;
//        int adulty = ap.adultPricesField.getLocationOnScreen().y;
//        int childx = ap.childPricesField.getLocationOnScreen().x;
//        int childy = ap.childPricesField.getLocationOnScreen().y;
//        int seniorx = ap.seniorPricesField.getLocationOnScreen().x;
//        int seniory = ap.seniorPricesField.getLocationOnScreen().y;
//        int applyx = ap.jButton1.getLocationOnScreen().x;
//        int applyy = ap.jButton1.getLocationOnScreen().y;
//        ap.setVisible(false);
//        
//        login.setVisible(true);
//        int userx = login.loginTextField.getLocationOnScreen().x;
//        int usery = login.loginTextField.getLocationOnScreen().y;
//        int passTextx = login.passwordField.getLocationOnScreen().x;
//        int passTexty = login.passwordField.getLocationOnScreen().y;
//        int signinx = login.confirmButton.getLocationOnScreen().x;
//        int signiny = login.confirmButton.getLocationOnScreen().y;
//        int SUBx = login.signUpLabel.getLocationOnScreen().x;
//        int SUBy = login.signUpLabel.getLocationOnScreen().y;
//        bot.delay(2000);
//        bot.mouseMove(login.guestButton.getLocationOnScreen().x +5, login.guestButton.getLocationOnScreen().y +5);
//        bot.delay(1000);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);//        
//        
//        //Main Window
//        bot.delay(2000);
//        bot.mouseMove(dunkx+10, dunky+20);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(time1x+5, time1y+8);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(contx+20, conty+15);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        
//        //Ticket Selector
//        bot.delay(2000);
//        bot.mouseMove(atx, aty);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(atx+5, aty+65);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(nextx+20, nexty+15);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        
//        
//        //Seat Selector
//        bot.mouseMove(seat1x+10, seat1y+15);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(seat2x+13, seat2y+17);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(goonx+7, goony+9);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//         
//        
//        //Payment Information
//        bot.mouseMove(ccx+10, ccy+10);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        
//        bot.keyPress(52); bot.keyRelease(52);
//        bot.delay(100);
//        bot.keyPress(48); bot.keyRelease(48);
//        bot.delay(100);
//        bot.keyPress(52); bot.keyRelease(52);
//        bot.delay(100);
//        bot.keyPress(49); bot.keyRelease(49);
//        bot.delay(100);
//        
//        bot.keyPress(57); bot.keyRelease(57);
//        bot.delay(100);
//        bot.keyPress(51); bot.keyRelease(51);
//        bot.delay(100);
//        bot.keyPress(51); bot.keyRelease(51);
//        bot.delay(100);
//        bot.keyPress(55); bot.keyRelease(55);
//        bot.delay(100);
//        
//        bot.keyPress(56); bot.keyRelease(56);
//        bot.delay(100);
//        bot.keyPress(48); bot.keyRelease(48);
//        bot.delay(100);
//        bot.keyPress(54); bot.keyRelease(54);
//        bot.delay(100);
//        bot.keyPress(50); bot.keyRelease(50);
//        bot.delay(100);
//        
//        bot.keyPress(57); bot.keyRelease(57);
//        bot.delay(100);
//        bot.keyPress(50); bot.keyRelease(50);
//        bot.delay(100);
//        bot.keyPress(55); bot.keyRelease(55);
//        bot.delay(100);
//        bot.keyPress(52); bot.keyRelease(52);
//        
//        bot.delay(1000);
//        bot.mouseMove(ccvx, ccvy+11);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(100);
//        bot.keyPress(48);
//        bot.delay(100);
//        bot.keyPress(54);
//        bot.delay(100);
//        bot.keyPress(52);
//        
//        bot.delay(1000);
//        bot.mouseMove(monthx+4, monthy+6);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        bot.mouseMove(monthx+26, monthy+63);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        
//        bot.delay(1000);
//        bot.mouseMove(yearx, yeary);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        bot.mouseMove(yearx+9, yeary+137);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        
//        bot.delay(1000);
//        bot.mouseMove(nameCardx, nameCardy);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(87);
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.delay(100);
//        bot.keyPress(73);
//        bot.delay(100);
//        bot.keyPress(76);
//        bot.keyRelease(76);
//        bot.delay(100);
//        bot.keyPress(76);
//        
//        bot.delay(100);
//        bot.keyPress(32);
//        bot.delay(100);
//        
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(65);
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.delay(100);
//        bot.keyPress(76);
//        bot.delay(100);
//        bot.keyPress(79);
//        bot.delay(100);
//        bot.keyPress(78);
//        bot.delay(100);
//        bot.keyPress(90);
//        bot.delay(100);
//        bot.keyPress(79);
//        
//        bot.delay(1000);
//        bot.mouseMove(addressx, addressy);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(79);
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.delay(100);
//        bot.keyPress(83);
//        bot.delay(100);
//        bot.keyPress(87);
//        bot.delay(100);
//        bot.keyPress(69);
//        bot.delay(100);
//        bot.keyPress(71);
//        bot.delay(100);
//        bot.keyPress(79);
//        
//        bot.delay(1000);
//        bot.mouseMove(statex, statey);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        bot.mouseMove(statex+35, statey+50);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
//        bot.mouseMove(statex+35, statey+105);
//        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        bot.mouseMove(statex+13, statey+147);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        
//        bot.delay(1000);
//        bot.mouseMove(zipx, zipy);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.keyPress(49);
//        bot.delay(100);
//        bot.keyPress(51);
//        bot.delay(100);
//        bot.keyPress(49);
//        bot.delay(100);
//        bot.keyPress(50);
//        bot.delay(100);
//        bot.keyPress(54);
//
//        bot.delay(1000);
//        bot.mouseMove(confirmx, confirmy);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        
//        
//        //Confirmation Page
//        bot.delay(5000);
//        bot.mouseMove(quitx, quity);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        
//        
//        //Login Again
//        //UserID
//        bot.mouseMove(userx, usery);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        bot.keyPress(16); //shift down
//        bot.delay(100);
//        bot.keyPress(65); //A
//        bot.delay(100);
//        bot.keyRelease(16); //shift release
//        bot.delay(100);
//        bot.keyPress(68); //d
//        bot.delay(100);
//        bot.keyPress(77); //m
//        bot.delay(100);
//        bot.keyPress(73); //i
//        bot.delay(100);
//        bot.keyPress(78); //n
//        
//        
//        //Password
//        bot.delay(500);
//        bot.mouseMove(passTextx, passTexty);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(100);
//        bot.keyPress(80); //p
//        bot.delay(100);
//        bot.keyPress(65); //a
//        bot.delay(100);
//        bot.keyPress(83); //s
//        bot.delay(100);
//        bot.keyPress(83); //s
//        bot.delay(100);
//        bot.keyPress(87); //w
//        bot.delay(100);
//        bot.keyPress(79); //o
//        bot.delay(100);
//        bot.keyPress(82); //r
//        bot.delay(100);
//        bot.keyPress(68); //d
//        bot.delay(100);
//        bot.keyPress(49); //1
//        
//        
//        bot.delay(500);
//        bot.mouseMove(signinx, signiny);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//
//        bot.mouseMove(pricex, pricey);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(200);
//        bot.mouseMove(adultx+10, adulty+5);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.keyPress(49);
//        bot.delay(200);
//        bot.keyPress(50);
//        bot.delay(200);
//        bot.keyPress(110);
//        bot.delay(200);
//        bot.keyPress(53);
//        bot.delay(200);
//        bot.keyPress(48);
//        bot.delay(200);
//        bot.mouseMove(childx+10, childy+5);
//        bot.delay(1000);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.keyPress(49);
//        bot.delay(200);
//        bot.keyPress(49);
//        bot.delay(200);
//        bot.keyPress(110);
//        bot.delay(200);
//        bot.keyPress(55);
//        bot.delay(200);
//        bot.keyPress(53);
//        bot.delay(200);
//        bot.mouseMove(seniorx+10, seniory+5);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.keyPress(55);
//        bot.delay(200);
//        bot.keyPress(110);
//        bot.delay(200);
//        bot.keyPress(50);
//        bot.delay(200);
//        bot.keyPress(53);
//        bot.delay(2000);
//        bot.mouseMove(applyx, applyy);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(closex, closey);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        
//        //Back to Login and into Sign Up
//        bot.mouseMove(SUBx, SUBy+5);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(100);
//        
//        //Sign Up
//        bot.delay(1000);
//        bot.mouseMove(namex, namey);
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(65); //A
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.delay(100);
//        bot.keyPress(76); //l
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(88); //x
//       
//        bot.delay(100);
//        bot.keyPress(32);
//        bot.delay(100);
//        
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(80); //P
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.delay(100);
//        bot.keyPress(65); //a
//        bot.delay(100);
//        bot.keyPress(78); //n
//        bot.delay(100);
//        bot.keyPress(84); //t
//        bot.delay(100);
//        bot.keyPress(65); //a
//        bot.delay(100);
//        bot.keyPress(76); //l
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(86); //v
//        bot.delay(2000);
//        
//        bot.mouseMove(dobmx, dobmy);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        bot.mouseMove(dobmx+10, dobmy+50);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        bot.mouseMove(dobdx, dobdy);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        bot.mouseMove(dobdx+10, dobdy+105);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        bot.mouseMove(dobyx, dobyy);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        bot.mouseMove(dobyx+50, dobyy+73);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        bot.mouseMove(dobyx+50, dobyy+100);
//        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        bot.mouseMove(dobyx+10, dobyy+105);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        bot.mouseMove(emailx, emaily);
//        bot.delay(100);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(100);
//        bot.keyPress(65); //a
//        bot.delay(100);
//        bot.keyPress(76); //l
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(88); //x
//        bot.delay(100);
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(50); //@
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.delay(100);
//        bot.keyPress(67); //c
//        bot.delay(100);
//        bot.keyPress(83); //s
//        bot.delay(100);
//        bot.keyPress(110); //.
//        bot.delay(100);
//        bot.keyPress(79); //o
//        bot.delay(100);
//        bot.keyPress(83); //s
//        bot.delay(100);
//        bot.keyPress(87); //w
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(71); //g
//        bot.delay(100);
//        bot.keyPress(79); //o
//        bot.delay(100);
//        bot.keyPress(110); //.
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(68); //d
//        bot.delay(100);
//        bot.keyPress(85); //u
//        bot.delay(500);
//        bot.mouseMove(verifyex, verifyey);
//        bot.delay(200);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(100);
//        bot.keyPress(65); //a
//        bot.delay(100);
//        bot.keyPress(76); //l
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(88); //x
//        bot.delay(100);
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(50); //@
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.delay(100);
//        bot.keyPress(67); //c
//        bot.delay(100);
//        bot.keyPress(83); //s
//        bot.delay(100);
//        bot.keyPress(110); //.
//        bot.delay(100);
//        bot.keyPress(79); //o
//        bot.delay(100);
//        bot.keyPress(83); //s
//        bot.delay(100);
//        bot.keyPress(87); //w
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(71); //g
//        bot.delay(100);
//        bot.keyPress(79); //o
//        bot.delay(100);
//        bot.keyPress(110); //.
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(68); //d
//        bot.delay(100);
//        bot.keyPress(85); //u
//        bot.delay(500);
//        bot.mouseMove(passx, passy);
//        bot.delay(200);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(100);
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(89); //Y
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.keyPress(79); //o
//        bot.delay(100);
//        bot.keyPress(85); //u
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(80); //P
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.keyPress(65); //a
//        bot.delay(100);
//        bot.keyPress(83); //s
//        bot.delay(100);
//        bot.keyPress(83); //s
//        bot.delay(1000);
//        bot.mouseMove(verifypx, verifypy);
//        bot.delay(200);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(100);
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(89); //Y
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.keyPress(79); //o
//        bot.delay(100);
//        bot.keyPress(85); //u
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(80); //P
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.keyPress(65); //a
//        bot.delay(100);
//        bot.keyPress(83); //s
//        bot.delay(100);
//        bot.keyPress(83); //s
//        bot.delay(1000);
//        bot.mouseMove(tnsx, tnsy);
//        bot.delay(200);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(300);
//        bot.mouseMove(acceptx, accepty);
//        bot.delay(200);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        
//        
//        //Main Window
//        bot.delay(2000);
//        bot.mouseMove(gotgpx, gotgpy +15);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(5000);
//        bot.mouseMove(backx, backy);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(gotgx+5, gotgy+5);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(timex+5, timey+5);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.mouseMove(contx, conty);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//       
//        //Ticket Selector
//        bot.delay(2000);
//        bot.mouseMove(atx+5, aty+5);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(atx+7, aty+75);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(nextx, nexty);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        
//        //Seat Selector
//        bot.mouseMove(seat3x+10, seat3y+15);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(seat4x+13, seat4y+17);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//        bot.mouseMove(goonx+7, goony+9);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(2000);
//         
//        
//        //Payment Information
//        bot.mouseMove(ccx+10, ccy+10);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(1000);
//        
//        bot.keyPress(49); 
//        bot.delay(100);
//        bot.keyPress(52); 
//        bot.delay(100);
//        bot.keyPress(48);
//        bot.delay(100);
//        bot.keyPress(53);
//        bot.delay(100);
//        
//        bot.keyPress(52);
//        bot.delay(100);
//        bot.keyPress(51);
//        bot.delay(100);
//        bot.keyPress(51);
//        bot.delay(100);
//        bot.keyPress(52);
//        bot.delay(100);
//        
//        bot.keyPress(56);
//        bot.delay(100);
//        bot.keyPress(55);
//        bot.delay(100);
//        bot.keyPress(54);
//        bot.delay(100);
//        bot.keyPress(54);
//        bot.delay(100);
//        
//        bot.keyPress(56);
//        bot.delay(100);
//        bot.keyPress(49);
//        bot.delay(100);
//        bot.keyPress(48);
//        bot.delay(100);
//        bot.keyPress(50);
//        
//        bot.delay(1000);
//        bot.mouseMove(ccvx+6, ccvy+11);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(100);
//        bot.keyPress(50);
//        bot.delay(100);
//        bot.keyPress(49);
//        bot.delay(100);
//        bot.keyPress(48);
//        
//        bot.delay(1000);
//        bot.mouseMove(monthx+8, monthy+9);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        bot.mouseMove(monthx+16, monthy+63);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        
//        bot.delay(1000);
//        bot.mouseMove(yearx, yeary);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        bot.mouseMove(yearx+11, yeary+99);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        
//        bot.delay(1000);
//        bot.mouseMove(nameCardx, nameCardy);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(65); //A
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.delay(100);
//        bot.keyPress(76); //l
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(88); //x
//        
//        bot.delay(100);
//        bot.keyPress(32);
//        bot.delay(100);
//        
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(80); //P
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.delay(100);
//        bot.keyPress(65); //a
//        bot.delay(100);
//        bot.keyPress(78); //n
//        bot.delay(100);
//        bot.keyPress(84); //t
//        bot.delay(100);
//        bot.keyPress(65); //a
//        bot.delay(100);
//        bot.keyPress(76); //l
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(69); //e
//        bot.delay(100);
//        bot.keyPress(86); //v
//        bot.delay(2000);
//        
//        bot.delay(1000);
//        bot.mouseMove(addressx, addressy);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.keyPress(16);
//        bot.delay(100);
//        bot.keyPress(79);
//        bot.delay(100);
//        bot.keyRelease(16);
//        bot.delay(100);
//        bot.keyPress(83);
//        bot.delay(100);
//        bot.keyPress(87);
//        bot.delay(100);
//        bot.keyPress(69);
//        bot.delay(100);
//        bot.keyPress(71);
//        bot.delay(100);
//        bot.keyPress(79);
//        
//        bot.delay(1000);
//        bot.mouseMove(statex, statey);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        bot.mouseMove(statex+35, statey+50);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
//        bot.mouseMove(statex+35, statey+105);
//        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(500);
//        bot.mouseMove(statex+13, statey+147);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        
//        bot.delay(1000);
//        bot.mouseMove(zipx, zipy);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.keyPress(49);
//        bot.delay(100);
//        bot.keyPress(51);
//        bot.delay(100);
//        bot.keyPress(49);
//        bot.delay(100);
//        bot.keyPress(50);
//        bot.delay(100);
//        bot.keyPress(54);
//
//        bot.delay(1000);
//        bot.mouseMove(confirmx, confirmy);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        
//        
//        //Confirmation Page
//        bot.delay(5000);
//        bot.mouseMove(quitx, quity);
//        bot.delay(500);
//        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK); bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        bot.delay(5000);
    }   
}

//For emailing within java application see below

//https://www.tutorialspoint.com/java/java_sending_email.htm
