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
public class iPadOS extends MacOSX{
    
    
    private boolean faceID;

    public iPadOS(boolean faceID, String screenResolution, String formFactor) {
        super(screenResolution, formFactor);
        this.faceID = faceID;
    }

    public boolean isFaceID() {
        return faceID;
    }

    @Override
    public String getScreenResolution() {
        return screenResolution;
    }

    public void setFaceID(boolean faceID) {
        this.faceID = faceID;
    }

    @Override
    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    @Override
    public String deviceScreenResolSelector() {
        
        String R = null;
        switch (screenResolution) {
            case "1668 x 2388 pixels":
                R = "It's an 11-inch iPad Pro";
                break;
            case "1640 x 2360 pixels":
                R = "It's an 10.9-inch iPad Air";
                break;
            case "2160 x 1620 pixels":
                R = "It's an 10.2-inch iPad";
                break;
        }
        return R;
    }

    @Override
    public String deviceFormFactor() {
        
        if(formFactor=="BezelLess"){
            return "High-End iPad Pro.";
        }
        return "Low-End iPad.";
    }
    
    

    @Override
    public String toString() {
        if(faceID){
            return super.toString()+"\n"
                    +"FaceID: " +""+isFaceID()+"."+" "+"Yes! It has FaceID";
        }
        else
            return super.toString()+"\n"
                    +"FaceID: " +""+isFaceID()+"."+" "+"Sad! It doesn't support FaceID";
    }
}
