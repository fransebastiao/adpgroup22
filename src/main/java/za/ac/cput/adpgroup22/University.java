/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;

/**
 *
 * @author DELL
 */
public class University {
    
     private String StudentName;
    private String StudentCourse; 
    private String Balance;

   
    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentCourse() {
        return StudentCourse;
    }

    public void setStudentCourse(String StudentCourse) {
        this.StudentCourse = StudentCourse;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String Balance) {
        this.Balance = Balance;
    }
    
    @Override
    public String toString() {
        return "University{" + "StudentName=" + StudentName + ", StudentCourse=" + StudentCourse + ", Balance=" + Balance + '}';
    }
    
  
