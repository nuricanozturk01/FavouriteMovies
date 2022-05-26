package com.company.Exceptions;


public class InvalidUserException extends Exception 
{

    public InvalidUserException() 
    {
        
    }

    @Override
    public String getMessage() {
        return "Please Enter the correct username! If you do not subscribe program, you can subscribe!";
    }
    
    
    
    
    
}
