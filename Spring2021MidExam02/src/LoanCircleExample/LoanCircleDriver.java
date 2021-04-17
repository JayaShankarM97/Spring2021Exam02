/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoanCircleExample;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JayaShankar Mangina
 */
public class LoanCircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("The solution for the Problem 3 is: ");
        System.out.println("");
        ArrayList<Object> arr = new ArrayList<>();
        Loan l = new Loan(10000,"Education Loan");
        Circle c = new Circle(200);
        String s ="Hello! Welcome to Apple Store";
        Date d = new Date();
        arr.add(l);
        arr.add(c);
        arr.add(s);
        arr.add(d);
       
        for(Object o : arr)
        {
            System.out.println(o);
        }
    }
    
}
