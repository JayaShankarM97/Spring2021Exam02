/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeDupesArraylist;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author JayaShankar Mangina
 */
public class removeDupesArrayListDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("The Solution for the Problem 1 is: ");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        removeDupeArray rd = new removeDupeArray();
        ArrayList<Integer> myarrlist = new ArrayList<>();
        System.out.println("Enter ten integers: ");
        int count = 10;
        for(int i=0; i<count; i++){
            myarrlist.add(scan.nextInt());
        }
        
        rd.removeDuplicate(myarrlist);
        
    }  
}
