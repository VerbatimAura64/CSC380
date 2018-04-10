/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieprogram.Main;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Robert
 */
public class MainSuite extends TestCase {
    
    public MainSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("MainSuite");
        suite.addTest(SQLTestTest.suite());
        suite.addTest(ConfirmationPageTest.suite());
        suite.addTest(MainTest.suite());
        suite.addTest(Payment_InformationTest.suite());
        suite.addTest(DunkirkTest.suite());
        suite.addTest(JohnWickTest.suite());
        suite.addTest(SeatSelectorTest.suite());
        suite.addTest(GuardiansTest.suite());
        suite.addTest(MainpageTest.suite());
        suite.addTest(TicketSelectorTest.suite());
        suite.addTest(MovieAdmin1Test.suite());
        suite.addTest(AppTesterTest.suite());
        suite.addTest(LoginTest.suite());
        suite.addTest(AdminPricesTest.suite());
        suite.addTest(AdminMainPageTest.suite());
        suite.addTest(SignUpFormTest.suite());
        suite.addTest(TermsAndServiceTest.suite());
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
    
}
