/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceExample;

/**
 *
 * @author JayaShankar Mangina
 */
public class InterfaceDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DevicesInterfaces DI = new DevicesInterfaces();
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("The Solution for the Problem 9(Interface) is: ");
        System.out.println("");
        DI.productName();
        System.out.println("");
        DI.nameOftheOS();
    }
    
}
