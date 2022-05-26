package com.company.Entities;

public class Rating
{
    private int movieID;
    private String userFullName;
    private String relation;
    private int rate;

    public Rating(int movieID, String userFullName, String relation, int rate)
    {
        this.movieID = movieID;
        this.userFullName = userFullName;
        this.relation = relation;
        this.rate = rate;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString()
    {
        return getMovieID()+" "+getUserFullName().replace(" ","_")+" "+getRelation().replace(" ","_")+" "+getRate();
    }
}
