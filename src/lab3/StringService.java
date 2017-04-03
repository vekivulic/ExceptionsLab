/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Locale;

/**
 *
 * @author vekivulic
 */
public class StringService {
    
    public void saveText(String text)throws IllegalArgumentException{
        if(!text.equals(text.toUpperCase())){
        throw new UpperClassMandatoryException();
    }
   }
    
}
