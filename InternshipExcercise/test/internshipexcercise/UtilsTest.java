/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internshipexcercise;

import controlador.Utils;
import modelo.Comparator;
import modelo.Employee;
import modelo.Time;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alan Bermudez
 */
public class UtilsTest {
    
    public UtilsTest() {
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
     * Test of separeteCheckInChekOutHours method, of class Utils.
     */
    @Test
    public void testSepareteCheckInChekOutHours() {
        System.out.println("separeteCheckInChekOutHours");
        String[] schedule = null;
        ArrayList<Time> checkIn = null;
        ArrayList<Time> checkOut = null;
        Utils.separeteCheckInChekOutHours(schedule, checkIn, checkOut);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareSchedule method, of class Utils.
     */
    @Test
    public void testCompareSchedule() {
        System.out.println("compareSchedule");
        ArrayList<Employee> employees = null;
        ArrayList<Comparator> expResult = null;
        ArrayList<Comparator> result = Utils.compareSchedule(employees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
