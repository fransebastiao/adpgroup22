/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;


/**
 *
 * @author shina kara 219333181
 * This program is a calculator that add,subtracts,multiplies and divides.
 */

public class ShinaJavaClass {
   
    public static int add(int num1, int num2)
    {
    return num1 + num2;
    }
    
     public static int sub(int num1, int num2)
    {
    return num1 - num2;
    }
      public static int div(int num1, int num2)
    {
        if (num2==0){
        throw new IllegalArgumentException("Number 2 canot be divided by 0");
        }
    return num1 / num2;
    }
  public static int mul(int num1, int num2)
    {
    return num1 * num2;
    }
    public static void main(String[] args) {
        
    }
        }