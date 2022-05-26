package com.company.Entities;

public class User
{
    private String fullName;
    private String username;

    public User(String fullName, String username)
    {
        this.fullName = fullName;
        this.username = username;
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getUsername()
    {
        return username;
    }

    @Override
    public String toString()
    {
        return getFullName().replace(" ","_") + " " + getUsername();
    }
}
