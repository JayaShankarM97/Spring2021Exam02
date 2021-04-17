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
 * Created Enum Class - Operating Systems
 */
public enum OperatingSystemsEnum {
    
    ANDROID(299.99), IOS(999.99), WINDOWS(649.99);
    
    /**
     * Declared Attributes
     */
    private final double priceCost;

    /**
     * Constructor with the Argument - PriceCost
     * @param priceCost 
     */
    private OperatingSystemsEnum(double priceCost) {
        this.priceCost = priceCost;
    }

    /**
     * Getter Method to return the Constant ANDROID
     * @return 
     */
    public static OperatingSystemsEnum getANDROID() {
        return ANDROID;
    }

    /**
     * Getter Method to return the Constant IOS
     * @return 
     */
    public static OperatingSystemsEnum getIOS() {
        return IOS;
    }

    /**
     * Getter Method to return the Constant WINDOWS
     * @return 
     */
    public static OperatingSystemsEnum getWINDOWS() {
        return WINDOWS;
    }

    /**
     * Getter Method to return the PriceCost 
     * @return 
     */
    public double getPriceCost() {
        return priceCost;
    }
        
}
