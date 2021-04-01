/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Jody Kearns - 209023651
 */
public class ConverterTest {
    
    private Converter converter1;
    private Converter converter2;
    private Converter converter3;
    private Converter converter4;
    
    @BeforeEach
    void setUp(){
        converter1 = new Converter(10,"CM");
        converter2 = new Converter(10,"CM");
        converter3 = converter1;
        converter4 = new Converter(20,"KM");
    }
    
    //Testing for object equality.
    @Test
    void testEquality(){
        assertEquals(converter1,converter3); 
        assertNotEquals(converter1,converter2);
        
    }
    
    //Testing for object identity.
    @Test
    void testIdentity(){
        assertSame(converter1,converter3);
        assertNotSame(converter1,converter2);
    }
    
    //Failing Test
    @Test
    void failingTest(){
        
        String str3 = converter1.measurementConverter();
        String str4 = converter2.measurementConverter();
        assertEquals(str3,str4);
        fail("Purposefully failing this test as method for Kilometer conversion has not been created yet");
    }
    
    
    //Timeout Test
    @Test
    @Timeout(value = 500,unit = TimeUnit.MILLISECONDS)   //I set the value to a high number to ensure that the test does not timeout amd fail.
    void timeoutTest(){
        String str1 = converter1.measurementConverter();
        String str2 = converter2.measurementConverter();
        assertEquals(str1,str2);
        
    }    
    
    //Disabling Test
    @Disabled("Disabled as I know it will fail")
    @Test
    void disabledTest(){
        assertEquals(converter1,converter2);
    }
    
    
}