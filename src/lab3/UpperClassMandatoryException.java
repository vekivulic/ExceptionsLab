/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author vekivulic
 */
public class UpperClassMandatoryException extends IllegalArgumentException{
    
    private static final String MSG="Input must be uppercase";

    public UpperClassMandatoryException() {
        super(MSG); // if its not static class doesnt have access to it 
        // no messages 
    }

    public UpperClassMandatoryException(String s)//ignore use the build one
    {
        // takes single message, when you catch expection you might be using the 
        // super class to catch it, when you catch the super class that it has its message
        super(MSG);
    }

    public UpperClassMandatoryException(String message, Throwable cause) {
        super(MSG, cause);
        // message and the cause, why is declaired as throwable, cathcing the super class and what to know 
        //specifically what you are cathing 
    }

    public UpperClassMandatoryException(Throwable cause) {
        super(cause);
        //caouse without a message 
    }
    
    
    
}
