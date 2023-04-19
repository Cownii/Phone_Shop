/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CustomDateTest {
    
    public CustomDateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isLeapYear method, of class CustomDate.
     */
    @Test
    public void testIsLeapYear() {
//       CustomDate c = new CustomDate();
//       assertTrue("This year is not a leap year", c.isLeapYear());

        CustomDate c = new CustomDate(2020, 10, 02);
        assertTrue("year"+c.getYear()+"is not a leap year",c.isLeapYear());
    }

    /**
     * Test of getDay method, of class CustomDate.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        CustomDate instance = new CustomDate();
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDay method, of class CustomDate.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int day = 0;
        CustomDate instance = new CustomDate();
        instance.setDay(day);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class CustomDate.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        CustomDate instance = new CustomDate();
        int expResult = 0;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonth method, of class CustomDate.
     */
    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int month = 0;
        CustomDate instance = new CustomDate();
        instance.setMonth(month);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class CustomDate.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        CustomDate instance = new CustomDate();
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class CustomDate.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        CustomDate instance = new CustomDate();
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
