/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain;

/**
 *
 * @author UFES
 */
public abstract class Check {
    private Check next;
    

    public void setNext(Check next) {
        this.next = next;
    }



public abstract String handle(String message);

String Next(String message){
    if(next==null) return message;
    else 
        return next.handle(message);
}
        
}
