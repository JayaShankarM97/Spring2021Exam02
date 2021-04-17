/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractExample;


/**
 *
 * @author JayaShankar Mangina
 */
public class MobileDevices extends AppleProducts{
    
    private String deviceName;
    private boolean available;
    
    @Override
    public double cost(){
        if(available){
            return 999.99;
        }
        else
            return 0.00;
    }
 
    public MobileDevices(String deviceName, boolean available) {
        this.deviceName = deviceName;
        this.available = available;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        if(available){
            return "Device Name: "+deviceName+" "+"\n"
                    +"Cost: "+cost();
        }else
            return "Sorry. The Device you requested is OUT Of STOCK";
        
    }
    
    
    
}
