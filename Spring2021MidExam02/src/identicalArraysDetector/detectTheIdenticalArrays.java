/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identicalArraysDetector;

import java.util.Arrays;

/**
 *
 * @author JayaShankar Mangina
 */
public class detectTheIdenticalArrays {
    
    public static boolean equals(int[][] m1,int[][] m2)
   {
       if (m1 == null)
       {
           return (m2 == null);
       }
       if (m2 == null | m1.length != m2.length)
       {
           return false;
       }

       for (int i = 0; i < m1.length; i++)
       {
           if (!Arrays.equals(m1[i], m2[i]))
           {
               return false;
           }
       }
       return true;
    }  
}
