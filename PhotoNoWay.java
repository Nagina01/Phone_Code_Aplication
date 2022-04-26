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
public class PhotoNoWay implements PhotoBehaviour {

    PhotoNoWay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void takePicture(){
        System.out.println("opps! I cant take a picture!!!");
    }

    
}
