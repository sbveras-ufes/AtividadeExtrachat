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
public class CharacterLimitCheck extends Check{
  private String message;
  
    
  @Override
    public String handle(String message){
        if (message.length()<= 280)
       return Next(message);
        else{    
            System.out.println("Mensagem muito grande! Limite: 280c");
            return null;
        
        }
    }  
}

