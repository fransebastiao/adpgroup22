/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package za.ac.cput.adpgroup22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author shina kara 219333181
 */
public class ShinaJavaClassTest {
    
    
    private ShinaJavaClass calculater1;
    private ShinaJavaClass calculater2;
    private ShinaJavaClass calculater3;
     
    
    
    @BeforeEach
    public void setUp() {
        calculater1 = new ShinaJavaClass();
         calculater2 = new ShinaJavaClass();
          calculater3 = calculater1;
          }
    
    //test equality
    @Test
    public void testEquality()
    {
        assertEquals(calculater1, calculater3);
        assertNotEquals(calculater1,calculater2);
          }
     //test identity
    @Test
    public void testIdentity()
    {
        assertSame(calculater1, calculater3);
        assertNotSame(calculater1, calculater2);
    }
    //Disabled testing
    @Test
    @Disabled
    public void skippedTest()
    {
        assertEquals(calculater1,calculater2);
    }
    
    //Timeout
    @Test
    @Timeout(value= 700, unit = TimeUnit.MILLISECONDS)
    void timeoutTest()
    {
    assertNotEquals(calculater1,calculater2);
    }
    
    //test fail
    @Test
    public void failingTest()
    {
      assertEquals(calculater1,calculater3);
      fail("Failed due to this test");
    
    }
    
       
}