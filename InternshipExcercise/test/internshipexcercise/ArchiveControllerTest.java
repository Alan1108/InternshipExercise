/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internshipexcercise;

import modelo.Employee;
import controlador.ArchiveController;
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
public class ArchiveControllerTest {
    
    public ArchiveControllerTest() {
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
     * Test of chargeOfficeSchedules method, of class ArchiveController.
     */
    @Test
    public void testChargeOfficeSchedules() {
        System.out.println("chargeOfficeSchedules");
        String docName = "EmployeesRegister.txt";
        ArchiveController instance = new ArchiveController();
        ArrayList<Employee> expResult = null;
        ArrayList<Employee> result = instance.chargeOfficeSchedules(docName);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
