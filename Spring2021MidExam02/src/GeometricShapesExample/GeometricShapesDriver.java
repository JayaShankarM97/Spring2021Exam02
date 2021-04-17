/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometricShapesExample;

import java.util.Scanner;

/**
 *
 * @author JayaShankar Mangina
 */
public class GeometricShapesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("The Solution for the Problem 6 is: ");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");
        int s1=Integer.parseInt(s[0]);
        int s2=Integer.parseInt(s[1]);
        int s3=Integer.parseInt(s[2]);
        String s4 = s[3];
        boolean s5 = Boolean.parseBoolean(s[4]);
        
        Triangle t = new Triangle(s1,s2,s3,s4,s5);
       
        System.out.println("Perimeter of the triangle : "+t.perimeter());
        System.out.println("Area of the triangle : "+(Math.round(t.Area()*100))/100);
        System.out.println("Color of the triangle : "+t.getColor());
        System.out.println("Triangle is filled : "+t.isFilled());
    }
    
}
