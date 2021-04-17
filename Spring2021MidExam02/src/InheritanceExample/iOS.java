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
public class iOS extends MacOSX{
    
    
    public iOS(String screenResolution, String formFactor) {
        super(screenResolution, formFactor);
    }


    @Override
    public String getScreenResolution() {
        return screenResolution;
    }
    
    @Override
    public String deviceScreenResolSelector() {
         String D = null;
         switch(screenResolution){
             case "Super Retina XDR":
                D = "Your iPhone supports LTPO OLED Display";
                break;
            case "Super Retina":
                D = "Your iPhone supports OLED Display";
                break;
            case "Retina":
                D = "Your iPhone supports Retina Display";
                break;
         }
        return D;
         
    }

    @Override
    public String deviceFormFactor() {
        
        if(formFactor=="TouchID"){
            return "iPhone 8 Plus";
        }
        return "iPhone 12 Pro";
    }

    @Override
    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor; 
    }

    @Override
    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    @Override
    public String getFormFactor() {
        return formFactor;
    }
   
    
}
