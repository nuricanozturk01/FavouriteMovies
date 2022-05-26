
package com.company.Exceptions;


public class InvalidImageFormat extends Exception
{

    public InvalidImageFormat() {
    }

    @Override
    public String getMessage() {
        return "Please Check the file!";
    }
    
    
}
