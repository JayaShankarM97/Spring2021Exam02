/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumExample;

/**
 *
 * @author JayaShankar Mangina
 */

/**
 * 
 * Declared Attribute
 */
public class OperatingSystems {
    private String OsType;

    /**
     * Constructor with the parameter OsType
     * @param OsType 
     */
    public OperatingSystems(String OsType) {
        this.OsType = OsType;
    }
    
    /**
     * Method that retrieves and returns the cost of the Selected OS Device
     * @return cost
     */
    public double getCostofDevice(){
        double cost = 0;
        if(OsType.equals(OperatingSystemsEnum.ANDROID.toString())){
            cost = OperatingSystemsEnum.ANDROID.getPriceCost();
        }
        else if(OsType.equals(OperatingSystemsEnum.IOS.toString())){
            cost = OperatingSystemsEnum.IOS.getPriceCost();
        }
        else 
            cost = OperatingSystemsEnum.WINDOWS.getPriceCost();
        
        return cost;
    }

    /**
     * toString Method to print the Output
     * @return 
     */
    @Override
    public String toString() {
        return "The Operating System Selected is: "+OsType+"\n"+"The Cost of the device is: "+getCostofDevice();
    }
    
    

}
