/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.eduardocoteron08_entornosexev2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class RelojTest {
    
    public RelojTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setHora method, of class Reloj.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        int hora = 0;
        Reloj instance = null;
        instance.setHora(hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinuto method, of class Reloj.
     */
    @Test
    public void testSetMinuto() {
        System.out.println("setMinuto");
        int minuto = 0;
        Reloj instance = null;
        instance.setMinuto(minuto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSegundo method, of class Reloj.
     */
    @Test
    public void testSetSegundo() {
        System.out.println("setSegundo");
        int segundo = 0;
        Reloj instance = null;
        instance.setSegundo(segundo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class Reloj.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Reloj instance = null;
        int expResult = 0;
        int result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinuto method, of class Reloj.
     */
    @Test
    public void testGetMinuto() {
        System.out.println("getMinuto");
        Reloj instance = null;
        int expResult = 0;
        int result = instance.getMinuto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegundo method, of class Reloj.
     */
    @Test
    public void testGetSegundo() {
        System.out.println("getSegundo");
        Reloj instance = null;
        int expResult = 0;
        int result = instance.getSegundo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementa method, of class Reloj.
     */
    @Test
    public void testIncrementa() {
        System.out.println("incrementa");
        Reloj instance = null;
        instance.incrementa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrementa method, of class Reloj.
     */
    @Test
    public void testDecrementa() {
        System.out.println("decrementa");
        Reloj instance = null;
        instance.decrementa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hora12 method, of class Reloj.
     */
    @Test
    public void testHora12() {
        System.out.println("hora12");
        Reloj instance = null;
        String expResult = "";
        String result = instance.hora12();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hora24 method, of class Reloj.
     */
    @Test
    public void testHora24() {
        System.out.println("hora24");
        Reloj instance = null;
        String expResult = "";
        String result = instance.hora24();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
