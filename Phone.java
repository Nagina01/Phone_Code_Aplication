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
public abstract class Phone{
    TextBehaviour textBehaviour;
    PhotoBehaviour photoBehaviour;

public  Phone (){
    
    
}
public void setTextBehaviour(TextBehaviour newTextBehaviour){
textBehaviour = newTextBehaviour;
}
public void setPhotoBehaviour(PhotoBehaviour newPhotoBehaviour){
    photoBehaviour = newPhotoBehaviour;
}

public void call(){
    System.out.println("I am making a call");
}
abstract void display();
public void makeText(){
    textBehaviour.text();
}
public void takePicture(){
    photoBehaviour.takePicture();
}



}