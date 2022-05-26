package com.company.Service;

import com.company.Entities.Movie;
import com.company.Entities.Star;
import com.company.Entities.User;

import java.util.ArrayList;
import javax.swing.JTable;

public interface IDataService
{
    ArrayList<Movie> getHighestRateMoviesByGenre(String genre);
    ArrayList<Movie> getMoviesByStar(Star star);
    ArrayList<Object> getMovies();
    ArrayList<Object> getStars();
    ArrayList<Object> getRatings();
    ArrayList<Object> getUsers();
    ArrayList<Object> getGenres();
    
    Movie getMovieByID(int id);
    Movie getMovieByTitle(String title);
    
    User getUserByUsername(String username);
    
    Star getStarByStarName(String name);
    Star getStarByMovieID(int movieID);
    
    int getMovieID(String title);
    
    void addMovie(Movie movie);
    void addStar(Star star);
    void watch(User user, Movie movie);
    void rate(Movie movie, User user, String relation, int rate);
    void updateFiles();
    void setMovieOfStar(Star star,int movieID, String title, int year);
    void addUser(String fullname, String username); 
    void updateStarTable(JTable table);
    void updateMovieTable(JTable table,ArrayList<Object> movies);
    void updateMovie(int id, Movie movie);
    void updateStar(String newStarName, ArrayList<Movie> movies, Star star);
    void removeStar(String starName);
    void removeMovie(String movieTitle);
    
}
