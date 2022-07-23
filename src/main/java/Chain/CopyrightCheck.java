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
public class CopyrightCheck extends Check{
    
    @Override
    public String handle(String message){
    message= message.replaceAll("IBM", "***");
    message= message.replaceAll("Apple", "*****");
    message= message.replaceAll("Microsoft", "*********");
    
    return Next(message);
    }   
}
