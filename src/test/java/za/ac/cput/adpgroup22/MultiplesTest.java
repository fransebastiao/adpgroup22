/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;

import org.junit.jupiter.api.Disabled;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jade Kannemeyer 219448507
 */
public class MultiplesTest {
    
    private Multiples multiply1;
    private Multiples multiply2;
    private Multiples multiply3;
    
    @BeforeEach
    public void setUp() {
        multiply1 = new Multiples();
        multiply2 = new Multiples();
        multiply3 = multiply1;
    }
    
    //Identity test
    @Test
    void testIdentity(){
        assertSame(multiply1, multiply3);
        assertNotSame(multiply1, multiply2);
    }
    
    //Equality test
    @Test
    void testEquality(){
        assertEquals( multiply1, multiply3);
        assertNotEquals(multiply1, multiply2);
    }
    
    //Failure test
    @Test
    void testFailing(){
        assertEquals( multiply1, multiply2);//They are not equal to each other therefore they fail.
        fail("They are not equal.");
    }
    
    //Timeout test
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeouts(){
        assertEquals( multiply1, multiply3);
    }
    
    //Disabled test
    @Disabled("It is disabled.")
    @Test
    void testDisabled(){
        assertEquals( multiply1, multiply3);
    }
    
}