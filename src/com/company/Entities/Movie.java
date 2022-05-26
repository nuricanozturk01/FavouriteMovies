package com.company.Entities;

public class Movie
{
    private int movieID;
    private String title;
    private int year;
    private int length;
    private String genre;
    private String studioName;
    private String producerName;
    private String description;
    private double avgRate = 0;
    private int numberOfWatched = 0;

    

    public Movie(int id, String title, int year)
    {
        this.movieID = id;
        this.title = title;
        this.year = year;
    }
    public Movie(int movieID, String title, int year, int length,
                 String genre, String studioName, String producerName,
                 String description, double avgRate, int numberOfWatched) {
        this.movieID = movieID;
        this.title = title;
        this.year = year;
        this.length = length;
        this.genre = genre;
        this.studioName = studioName;
        this.producerName = producerName;
        this.description = description;
        this.avgRate = avgRate;
        this.numberOfWatched = numberOfWatched;
    }
    public Movie(String title, int year, int length,
                 String genre, String studioName, String producerName,
                 String description, double avgRate, int numberOfWatched) {

        this.movieID = getMovieID();
        this.title = title;
        this.year = year;
        this.length = length;
        this.genre = genre;
        this.studioName = studioName;
        this.producerName = producerName;
        this.description = description;
        this.avgRate = avgRate;
        this.numberOfWatched = numberOfWatched;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAvgRate() {
        return avgRate;
    }

    public void setAvgRate(double avgRate) {
        this.avgRate = avgRate;
    }

    public int getNumberOfWatched() {
        return numberOfWatched;
    }

    public void setNumberOfWatched(int numberOfWatched) {
        this.numberOfWatched = numberOfWatched;
    }

    public String print()
    {
        return getMovieID()+" " + getTitle()+" "+getYear()+" "+getLength()+" "+
                getGenre()+" "+getStudioName()+" "+getProducerName()+" "+getDescription()+
                " " + getAvgRate()+" "+getNumberOfWatched();
    }
    @Override
    public String toString()
    {
        return getMovieID()+" " + getTitle().replace(" ","_")+" "+getYear()+" "+getLength()+" "+
                getGenre().replace(" ","_")+" "+getStudioName().replace(" ","_")+
                " "+getProducerName().replace(" ","_")+" "+
                getDescription().replace(" ","_")+
                " " + getAvgRate()+" "+getNumberOfWatched();
    }
}
