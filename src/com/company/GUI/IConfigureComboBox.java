package com.company.GUI;

import com.company.Entities.Movie;
import java.util.ArrayList;
import javax.swing.JComboBox;


public interface IConfigureComboBox 
{
     public void getHighestRateComboBox(ArrayList<Movie> movies, JComboBox<String> box);
     public void getGenreComboBox(JComboBox<String> box);
     void showMovies(JComboBox<String> box, boolean isNull);
    public void showStars(JComboBox<String> starBox);
}
