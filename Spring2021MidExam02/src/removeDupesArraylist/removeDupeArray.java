/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeDupesArraylist;

import java.util.ArrayList;

/**
 *
 * @author JayaShankar Mangina
 */
public class removeDupeArray {
    
    public static void removeDuplicate(ArrayList<Integer> list)
    {
        ArrayList <Integer>  myarrlist2= new ArrayList<Integer>();
        for (Integer element : list)
        {
            if (!myarrlist2.contains(element))
            {
                myarrlist2.add(element);
            }
        }
        
        System.out.print("The distinct integers are ");

        for(Integer element : myarrlist2 )
        {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
