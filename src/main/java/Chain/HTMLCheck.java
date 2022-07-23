/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author UFES
 */
public class HTMLCheck extends Check{
  @Override
  public String handle(String message){
      ArrayList <String> Html=new ArrayList<>(Arrays.asList("<img","<table","<p","<a href"));
      for(String tag :Html){  
      if (message.contains(tag)){
        return("HTML proibido");
        }
      }
      return Next(message);
  }      
        
}
