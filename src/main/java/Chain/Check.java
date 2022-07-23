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
    

public static Check set (Check primeiro,Check... chain){
    Check atual=primeiro;
    for(Check nextinCheck:chain){
        atual.next=nextinCheck;
        atual=nextinCheck;
    }
    return primeiro;
}
public abstract boolean handle(String message);

boolean Next(String message){
    if(next==null) return true;
    else 
        return next.handle(message);
}
        
}
