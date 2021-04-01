/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;

/**
 *
 * @author Franciel Sebastiao - 219466912
 * This program Set a student name and his marks.
 */
public class StudentClass {
    private String studentName;
    private int studentMarks;

    public StudentClass(String studentName, int studentMarks) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }
    
    public String studentName(){
        return this.studentName;
    }
    
    public void setStudentName(String studentName){
        this.studentName = "Franciel Sebastiao";
    }
    
    public int studentMarks(){
        return this.studentMarks;
    }
    
    public void setStudentMarks(int studentMarks){
        this.studentMarks = 100;
    }
 
    @Override
    public String toString(){
        return "Your student name is:" + studentName
                + "and your marks are:"
                + studentMarks+"%.";
    }

}

