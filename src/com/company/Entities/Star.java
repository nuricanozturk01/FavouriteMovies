package com.company.Entities;


public class Star
{
    private int movieID1 = -1;
    private int movieID2 = -1;
    private String  movieTitle1 = "NULL";
    private String  movieTitle2 = "NULL";
    private int movieYear1 = -1;
    private int movieYear2 = -1;
    private String starFullName;


    public Star(String starFullName,int movieID1, String movieTitle1, int movieYear1, int movieID2,String movieTitle2, int movieYear2)
    {
        this.movieID1 = movieID1;
        this.movieID2 = movieID2;
        this.movieTitle1 = movieTitle1;
        this.movieTitle2 = movieTitle2;
        this.movieYear1 = movieYear1;
        this.movieYear2 = movieYear2;
        this.starFullName = starFullName;

    }


    public Star(String starFullName)
    {
        this.starFullName = starFullName;
    }



    public void setMovie1(int movieID, String title, int year)
    {
        this.movieID1 = movieID;
        this.movieTitle1 = title;
        this.movieYear1 = year;
        setMovieID1(movieID);
        setMovieTitle1(title);
        setMovieYear1(year);
    }

    public void setMovie2(int movieID, String title, int year)
    {
        this.movieID2 = movieID;
        this.movieTitle2 = title;
        this.movieYear2 = year;
    }
    public int getMovieID1() {
        return movieID1;
    }

    public void setMovieID1(int movieID1) {
        this.movieID1 = movieID1;
    }

    public int getMovieID2() {
        return movieID2;
    }

    public void setMovieID2(int movieID2) {
        this.movieID2 = movieID2;
    }

    public String getMovieTitle1() {
        return movieTitle1;
    }

    public void setMovieTitle1(String movieTitle1) {
        this.movieTitle1 = movieTitle1;
    }

    public String getMovieTitle2() {
        return movieTitle2;
    }

    public void setMovieTitle2(String movieTitle2) {
        this.movieTitle2 = movieTitle2;
    }

    public int getMovieYear1() {
        return movieYear1;
    }

    public void setMovieYear1(int movieYear1) {
        this.movieYear1 = movieYear1;
    }

    public int getMovieYear2() {
        return movieYear2;
    }

    public void setMovieYear2(int movieYear2) {
        this.movieYear2 = movieYear2;
    }

    public String getStarFullName() {
        return starFullName;
    }

    public void setStarFullName(String starFullName) {
        this.starFullName = starFullName;
    }



    public String print()
    {
        return starFullName.replace("_"," ")+" "+ movieID1 +" "+movieTitle1.replace("_"," ")+" "+movieYear1+" "+movieID2+" "+
                movieTitle2.replace("_"," ")+" "
                +movieYear2;
    }

    @Override
    public String toString()
    {
        return starFullName.replace(" ","_")+" "+ movieID1 +" "+movieTitle1.replace(" ","_")+" "+movieYear1+" "+movieID2+" "+
                movieTitle2.replace(" ","_")+" "
                +movieYear2;
    }



}
