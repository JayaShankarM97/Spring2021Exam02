/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceExample;

/**
 *
 * @author JayaShankar Mangina
 */
public class OSDetectorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("The Solution for the Problem 4(Inheritance"
                + ",Polymorphism and Late-Binding Polymorphism is: )");
        System.out.println("");
        MacOSX M = new MacOSX("3840 x 2160 px", "16-inch");
        System.out.println(M.toString());
        System.out.println("");
        
        iOS I = new iOS("Super Retina XDR", "FaceID");
        System.out.println(I.toString());
        System.out.println("");
        
        MacOSX MC = new iPadOS(true, "1668 x 2388 pixels", "BezelLess");
        System.out.println(MC.toString());
        
        
        
        
        
    }
    
}
