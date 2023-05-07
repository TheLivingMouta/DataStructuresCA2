/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DataStructures;

import AppData.Appointment;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oran
 */
public class AppointmentListIT
{

    public AppointmentListIT() {
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
     * Test of size method, of class AppointmentList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AppointmentList instance = new AppointmentList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class AppointmentList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        AppointmentList instance = new AppointmentList();
        Appointment expResult = null;
        Appointment result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class AppointmentList.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Appointment appointment = null;
        AppointmentList instance = new AppointmentList();
        int expResult = 0;
        int result = instance.indexOf(appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class AppointmentList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Appointment appointment = null;
        AppointmentList instance = new AppointmentList();
        boolean expResult = false;
        boolean result = instance.add(appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class AppointmentList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 0;
        Appointment appointment = null;
        AppointmentList instance = new AppointmentList();
        Appointment expResult = null;
        Appointment result = instance.set(index, appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AppointmentList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Appointment appointment = null;
        AppointmentList instance = new AppointmentList();
        boolean expResult = false;
        boolean result = instance.remove(appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class AppointmentList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        AppointmentList instance = new AppointmentList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
