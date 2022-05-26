package com.company.GUI;

import com.company.Entities.Movie;
import com.company.Entities.Star;
import com.company.Service.IDataService;
import java.util.ArrayList;
import javax.swing.JComboBox;


public class ConfigureComboBox implements IConfigureComboBox
{
    private IDataService dataService;
    
    public ConfigureComboBox(IDataService dataService) 
    {
        this.dataService = dataService;
    }
    
    
    
    @Override
    public void getGenreComboBox(JComboBox<String> box)
    {
    
        
        ArrayList<Object> list = dataService.getGenres();

          Object[] arr = list.toArray();

          for(int i = 0; i < arr.length; ++i)
          {
              String genre = ((String)arr[i]);
              box.addItem(genre);
          }
          
    }
    @Override
    public void getHighestRateComboBox(ArrayList<Movie> movies,JComboBox<String> box)
    {
        Object[] arr = movies.toArray();
        for (int i = 0 ; i < arr.length ; ++i)
        {
            String title = ((Movie)arr[i]).getTitle();      
            box.addItem(title);
        }
        
    }
    
    @Override
    public void showMovies(JComboBox<String> box, boolean isNull)
    {
         box.removeAllItems();
          ArrayList<Object> list = dataService.getMovies();

          Object[] arr = list.toArray();

          for(int i = 0; i < arr.length; ++i)
          {
              String movieTitle= ((Movie)arr[i]).getTitle();
              box.addItem(movieTitle);
          }
          if (isNull)
            box.addItem("NULL");
    }
    
    @Override
    public void showStars(JComboBox<String> starBox)
    {
          starBox.removeAllItems();
          
          ArrayList<Object> list = dataService.getStars();

          Object[] arr = list.toArray();

          for(int i = 0; i < arr.length; ++i)
          {
              String starName= ((Star)arr[i]).getStarFullName();
              starBox.addItem(starName);
          }
         
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
}
