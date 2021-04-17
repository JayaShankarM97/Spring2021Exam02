/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identicalArraysDetector;

import java.util.Scanner;

/**
 *
 * @author JayaShankar Mangina
 */
public class identicalArraysDetectorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("The Solution for the Problem 2 is :");
        System.out.println("");
        detectTheIdenticalArrays a = new detectTheIdenticalArrays();
        Scanner sc = new Scanner(System.in);
        int[][] m1 =  new int[3][3];
        int[][] m2 =  new int[3][3];
        System.out.println("Enter list1: ");
        for(int i=0; i<m1[0].length; i++)
        {
           for(int j=0; j<m1[0].length; j++)
           {
               m1[i][j] = sc.nextInt();
           }
        }
        System.out.println();
        System.out.println("Enter list2: ");
        for(int i=0; i<m2[0].length; i++)
        {
           for(int j=0; j<m2[0].length; j++)
           {
               m2[i][j] = sc.nextInt();
           }
        }
       if (a.equals(m1, m2))
       {
           System.out.println("The two arrays are strictly identical");
       }
       else
       {
           System.out.println("The two arrays are not strictly identical");
       }
    }
    
}
