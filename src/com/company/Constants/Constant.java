package com.company.Constants;

import javax.swing.*;

public class Constant
{
    public static final String MOVIES_FILE = "src/com/company/Files/Movies.txt";
    public static final String RATINGS_FILE = "src/com/company/Files/Ratings.txt";
    public static final String STARS_FILE = "src/com/company/Files/Stars.txt";
    public static final String USERS_FILE = "src/com/company/Files/Users.txt";
    public static final String GENRES_FILE = "src/com/company/Files/Genre.txt";
    public static final String DESTINATION_PATH = "src/com/company/Images/Posters/";

    public static final String MOVIE_TYPE = "Movie";
    public static final String USER_TYPE = "User";
    public static final String RATING_TYPE = "Rating";
    public static final String STAR_TYPE = "Star";
    public static final String GENRE_TYPE = "Genre";

    public static final String POSTER_TYPE = "jpg";
    public static final String POSTER_NAME = "Poster_";
    
    public static final int IMAGE_WIDTH = 209;
    public static final int IMAGE_HEIGHT = 202;
    public static void showMessage(String msg, String title, int msgType)
    {
        JOptionPane.showMessageDialog(null,msg,title,msgType);
    }

}
