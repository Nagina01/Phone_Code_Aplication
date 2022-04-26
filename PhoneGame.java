/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

/**
 *
 * @author user
 */
public class PhoneGame {
    private static PhoneGame uniqueInstance;
    
    private PhoneGame(){
        System.out.println("Game Startingg...");
    }
    public static PhoneGame getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new PhoneGame();
        }
        return uniqueInstance;
    }
    
    
    //other useful methods here 
    public void getPhones(){
        NokiaPhone myNokia = new NokiaPhone();
        Landline myLandline = new Landline();
        Smartphone mySmartphone = new Smartphone();
        
        myNokia.takePicture();
        mySmartphone.takePicture();
        myLandline.takePicture();
        
        mySmartphone.makeText();
        myNokia.makeText();
        myNokia.setTextBehaviour(new PredictedText());
        myNokia.makeText();
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

   
}
