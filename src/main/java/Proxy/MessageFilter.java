/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import Chain.CharacterLimitCheck;
import Chain.Check;
import Chain.CopyrightCheck;
import Chain.HTMLCheck;

/**
 *
 * @author UFES
 */
public class MessageFilter {
    private Check chain= set(new CharacterLimitCheck(),new HTMLCheck(),new CopyrightCheck());;

    public void setchain(Check chain) {
        this.chain = chain;
    }
    
    public static Check set (Check primeiro,Check... chain){
    Check atual=primeiro;
    for(Check nextinCheck:chain){
        atual.setNext(nextinCheck);
        atual=nextinCheck;
    }
    return primeiro;
}
    public String filter(String message){
        return chain.handle(message);
    }
}
