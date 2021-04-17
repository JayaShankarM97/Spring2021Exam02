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
public class DevicesInterfaces implements OperatingSystems,AppleIDevices{

    /**
     * Overriding the abstract interface method nameOftheOS() used in OperatingSystems Interface
     */
    @Override
    public void nameOftheOS() {
        System.out.println("List of all the OS used in Apple Devices: " +""+"\n"
                +"1.iOS"+""+"\n"+"2.iPadOS"+""+"\n"+"3.watchOS"+""+"\n"
                +"4.macOS"+""+"\n"+"5.tvOS"+""+"\n"+"6.homePodOS");
    }

    /**
     * Overriding the abstract interface method productName() used in AppleIDevices Interface
     */
    @Override
    public void productName() {
        System.out.println("List of all the Apple devices: " +""+"\n"
        +"1.iPhone"+""+"\n"+"2.iPad"+""+"\n"+""+"3.Apple Watch"+""+"\n"
        +"4.MacBook"+""+"\n"+"5.Apple TV"+""+"\n"+"6.HomePod Mini");
    }
    
}
