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
public class Smartphone extends Phone{
    
    public Smartphone(){
        textBehaviour = new TextWithSmartphone();
        photoBehaviour = new Photo();
    }
    
    public void display(){
        System.out.println("ohhh HI there! I am a smartphoneee!");
    }
    
}
