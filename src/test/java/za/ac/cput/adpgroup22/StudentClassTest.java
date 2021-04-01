/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;


/**
 *
 * @author Franciel Sebastiao - 219466912
 * 
 */
public class StudentClassTest {
    
    private int studentMarks1;  
    private int studentMarks2;
    private int studentMarks3; 
    private int studentMarks4; 
    private int studentMarks5; 
    private String studentName1;
    private String studentName2;
    private String studentName3;
    private String studentName4;
    private String studentName5;
    
    @BeforeEach
    public void setUp() {
        studentMarks1 = 100;
        studentMarks2 = 50;
        studentMarks3 = studentMarks1;
        studentMarks4 = 80;
        studentMarks5 = studentMarks3;
        studentName1 = "Xavier";
        studentName2 = "Franciel Sebastiao";
        studentName3 = "Marcos";
        studentName4 = "Jon Jones";
        studentName5 = studentName2;
    }
     
    @Test
    public void testIdentity(){                 //Object Identity
        assertSame(studentMarks1, studentMarks1);
    }
    
    @Test
    public void testEquality(){                 //Object Equality 
        assertEquals(studentMarks1,studentMarks5);
    }
  
    @Test
    public void testGetStudentName() {          //Object Equality
        System.out.println("GetStudentName");
        String expResult = studentName2;
        String result;
        String studentName = studentName5;
        result = studentName;
        assertEquals(expResult, result);
    }

    @Test
    public void testGetStudentMarks() {         //Both, Object Identity and Equality
        System.out.println("GetStudentMarks");
        int expResult = studentMarks5;
        int result;
        result = studentMarks1;
        assertEquals(expResult, result);
        assertSame(expResult, result);
    }

    @Test
    public void testSetStudentMarks() {         //Failing Test( Deliberately Failed )
        System.out.println("GetStudentMarks");  // The expected answer was 100 but the result was 9.
        int expResult = studentMarks5;
        int result;
        result = 9;
        assertEquals(expResult, result);
        assertSame(expResult, result);
        fail("Failing Test.");
    }
    
    @Test
    @Timeout(14)                                //Timeout Test
    public void TimeoutTest() throws InterruptedException{
        Thread.sleep(13500);
        System.out.println("Timout Test passed"); 
    }
    
    @Disabled("Disabled until I fix it")  //Disabling Test
    @Test
    public void testToString() {
        System.out.println("toString");
        String instance = studentName1;
        String expResult = "Xavier";
        String result = instance.toString();
        assertEquals(expResult, result);
    }   
}

