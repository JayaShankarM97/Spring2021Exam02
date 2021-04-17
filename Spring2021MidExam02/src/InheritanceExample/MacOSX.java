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
public class MacOSX {
    
    String screenResolution;
    String formFactor;

    public MacOSX(String screenResolution, String formFactor) {
        this.screenResolution = screenResolution;
        this.formFactor = formFactor;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String deviceScreenResolSelector(){
        String S = null;
        switch (screenResolution) {
            case "3840 x 2160 px":
                S = "Wow! Your Mac has 4K Screen Resolution";
                break;
            case "2048 × 1080 px":
                S = "Great! Your Mac has 2K Screen resolution";
                break;
            case "1920 × 1080 px":
                S = "Good! Your Mac has Full HD Screen resolution";
                break;
        }
        return S;
    }
    
    public String deviceFormFactor(){
        if(formFactor=="16-inch"){
            return "High-End MacBook Pro";
        }
        return "Low-End MacBook Pro";
    }
    
    @Override
    public String toString() {
        return "The Device you selected is: "+deviceFormFactor()+"\n"
                +"The Device has the ScreenResolution/Display: "+screenResolution;
    }

}
