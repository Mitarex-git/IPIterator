package com.mitarexcomp.IPIterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MiTaReX
 */
public class IPIteratorTest {
    
    public IPIteratorTest() {
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
     * Test of validateIP method, of class IPIterator.
     */
    @Test
    public void testValidateIP() {
        System.out.println("validateIP");
        String ipAddress = "192.168.0.2";
        boolean expResult = true;
        boolean result = IPIterator.validateIP(ipAddress);
        assertEquals(expResult, result);
        ipAddress = "blah.6548.-96h";
        expResult = false;
        result = IPIterator.validateIP(ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of ipToLong method, of class IPIterator.
     */
    @Test
    public void testIpToLong() {
        System.out.println("ipToLong");
        String ipAddress = "192.168.0.2";
        long expResult = 3232235522L;
        long result = IPIterator.ipToLong(ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of longToIp method, of class IPIterator.
     */
    @Test
    public void testLongToIp() {
        System.out.println("longToIp");
        long ip = 3232235774L;
        String expResult = "192.168.0.254";
        String result = IPIterator.longToIp(ip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
