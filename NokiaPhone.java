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

    public class NokiaPhone extends Phone{
    
    public NokiaPhone(){
        photoBehaviour = new PhotoNoWay();
        textBehaviour = new TextWithButtons();
    }
    
    public void display(){
        System.out.println("I am a nokia phone yeeehhh");
    }
    
    
    
    
}


