
package com.company.Exceptions;


public class InvalidInputException extends Exception
{

    public InvalidInputException() {
    }

    @Override
    public String getMessage() {
        return "You must not enter blank or empty character!";
    }
    
    
    
    
}
