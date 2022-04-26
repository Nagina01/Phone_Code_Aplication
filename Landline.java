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

public class Landline extends Phone {
 
    public Landline (){
        setTextBehaviour (new TextNoWay());
        setPhotoBehaviour (new PhotoNoWay());
        
    }
    
    public void display() {
        System.out.println("I'm a Landline");
    }
    
}