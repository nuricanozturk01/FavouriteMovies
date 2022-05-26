
package com.company.Exceptions;


public class AlreadyEnteredUserException extends Throwable
{

    public AlreadyEnteredUserException() {
    }

    @Override
    public String getMessage() {
        return "User is already entered!";
    }
    
    
}
