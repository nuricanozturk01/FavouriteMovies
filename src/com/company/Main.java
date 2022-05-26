package com.company;

import com.company.GUI.LoginScreen;
import com.company.Constants.Constant;
import com.company.DataAccessLayer.DataAccess;
import com.company.Service.DataService;
import java.io.File;
import java.io.IOException;

public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        new File(Constant.MOVIES_FILE).createNewFile();
        new File(Constant.STARS_FILE).createNewFile();
        new File(Constant.USERS_FILE).createNewFile();
        new File(Constant.RATINGS_FILE).createNewFile();
        
        LoginScreen loginScreen = new LoginScreen(new DataService(new DataAccess()));
        loginScreen.setVisible(true);      
    }
}
