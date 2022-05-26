package com.company.Service;

import com.company.Constants.Constant;
import com.company.DataAccessLayer.IDataAccess;
import com.company.Entities.Movie;
import com.company.Entities.Rating;
import com.company.Entities.Star;
import com.company.Entities.User;
import com.company.Exceptions.AlreadyEnteredUserException;
import com.company.Exceptions.InvalidInputException;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DataService implements IDataService
{
    private IDataAccess dataAccess;
    private ArrayList<Object> moviesList;
    private ArrayList<Object> ratingsList;
    private ArrayList<Object> usersList;
    private ArrayList<Object> starsList;
    private ArrayList<Object> genreList;

    public DataService(IDataAccess dataAccess)
    {
        this.dataAccess = dataAccess;
        
        moviesList = dataAccess.readFile(Constant.MOVIES_FILE,Constant.MOVIE_TYPE);
        ratingsList = dataAccess.readFile(Constant.RATINGS_FILE,Constant.RATING_TYPE);
        usersList = dataAccess.readFile(Constant.USERS_FILE,Constant.USER_TYPE);
        starsList = dataAccess.readFile(Constant.STARS_FILE,Constant.STAR_TYPE);
        genreList = dataAccess.readFile(Constant.GENRES_FILE, Constant.GENRE_TYPE);
    }

    
    // ---------------------------------MOVIES---------------------------------
    
    @Override
    public Movie getMovieByID(int id)
    {
        for (int i = 0; i < moviesList.size(); i++)
            if (((Movie)moviesList.get(i)).getMovieID() == id)
                return (Movie) moviesList.get(i);

        return null;
    }

    @Override
    public Movie getMovieByTitle(String title)
    {

        for (int i = 0; i < moviesList.size(); i++)
            if (((Movie)moviesList.get(i)).getTitle().equals(title))
                return (Movie) moviesList.get(i);

        return null;
    }

    
     // If highest rated movie more than one (ex: both are 10), show both
    @Override
    public ArrayList<Movie> getHighestRateMoviesByGenre(String genre)
    {
        double max = 0.01;
        Movie m = null;
        ArrayList<Movie> movies = new ArrayList<>();
        for (int i = 0; i < moviesList.size(); i++)
        {
            if (((Movie)moviesList.get(i)).getGenre().equals(genre))
            {
                double rate = ((Movie)moviesList.get(i)).getAvgRate();
                if (rate == max)
                    movies.add(((Movie)moviesList.get(i)));
                if (rate > max)
                {
                    max = rate;
                    m = ((Movie)moviesList.get(i));  
                }
            }
        }
        movies.add(m);

        return movies;
    }
    @Override
    public ArrayList<Movie> getMoviesByStar(Star star)
    {
        ArrayList<Movie> moviesOfStar = new ArrayList<>();

        for (int i = 0; i < moviesList.size(); i++)
        {
            Movie m = (Movie) moviesList.get(i);
            if (star.getMovieID1() == m.getMovieID() || star.getMovieID2() == m.getMovieID())
                moviesOfStar.add(m);
        }
        return moviesOfStar;
    }
   
    private boolean isMovieExists(Movie movie)
    {
        if (moviesList.isEmpty())
            return false;
        String newTitle = movie.getTitle().trim().toLowerCase().replaceAll("\\s", "");
        for (int i = 0; i < moviesList.size(); i++)
        {
            Movie m = ((Movie) moviesList.get(i));
            String existTitle = m.getTitle().trim().toLowerCase().replaceAll("\\s", "");
            if (existTitle.equals(newTitle) )
            {
                System.out.println(m);
                return true;
            }
        }
        return false;
    }
     @Override
    public int getMovieID(String title)
    {
        for (int i = 0; i < moviesList.size(); i++)
            if (((Movie)moviesList.get(i)).getTitle().equals(title))
                return ((Movie)moviesList.get(i)).getMovieID();

        return -1;
    }
     @Override
    public void addMovie(Movie movie)
    {
        int id = moviesList.size() == 0 ? 1 : moviesList.size() + 1;
        if (isMovieExists(movie))
        {
            JOptionPane.showMessageDialog(null,"Movie was already exists!","Error!",JOptionPane.WARNING_MESSAGE);
            return;
        }

        movie.setMovieID(id);
        moviesList.add(movie);
        updateFile(moviesList,Constant.MOVIES_FILE);
        JOptionPane.showMessageDialog(null,"ID: "+ movie.getMovieID()+ " added!","Success!",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void removeInStars(Movie movie)
    {
        ArrayList<Star> stars = getStarsByMovieID(movie.getMovieID());
        
        
            
        for (int i = 0 ; i < stars.size(); ++i)
        {
            if (stars.get(i).getMovieID1() == movie.getMovieID() && stars.get(i).getMovieID2() != movie.getMovieID())
            {
                stars.get(i).setMovieID1(-1);
                stars.get(i).setMovieTitle1("NULL");
                stars.get(i).setMovieYear1(-1);
                
            }
            
            if (stars.get(i).getMovieID2() == movie.getMovieID() && stars.get(i).getMovieID1() != movie.getMovieID())
            {
                stars.get(i).setMovieID2(-1);
                stars.get(i).setMovieTitle2("NULL");
                stars.get(i).setMovieYear2(-1);
                
            }
        }
        updateFiles();
    }
    
    private int getSumOfFileASCII(String name)
    {
        int sum = 0;
        for (int i = 0; i < name.length(); sum += name.charAt(i),++i);
        return sum;
            
    }
    
    
    
    
    private File[] getSortedFiles()
    {
        File[] files = new File(Constant.DESTINATION_PATH).listFiles();
        
        for (int i = 0; i < files.length - 1; ++i)
        {
            for (int j = 0 ; j < files.length - 1; ++j)
            {
                int file1ASCII_1  = getSumOfFileASCII(files[j].getName());
                int file1ASCII_2  = getSumOfFileASCII(files[j + 1].getName());
                
                if (file1ASCII_1 > file1ASCII_2)
                {
                    File temp = files[j];
                    files[j] = files[j + 1];
                    files[j + 1] = temp; 
                }
            }
        }
        return files;
    }
     private void removeInPosters(Movie movie) 
    {
        try
        {
            File removedFile = new File(Constant.DESTINATION_PATH+Constant.POSTER_NAME+movie.getMovieID()+Constant.POSTER_TYPE);

            if(!removedFile.delete())
                throw new Exception("File not removed!");

            File[] files = getSortedFiles();


            for (int i = 0; i < files.length; ++i)
            {
                File f = files[i];
                File destFile = new File("src/com/company/Images/Posters/"+"Poster_"+(i + 1)+".jpg");
                f.renameTo(destFile);
            }
        }
        catch(Exception e)
        {
            Constant.showMessage(e.getMessage(), "FILE DID NOT REMOVED!", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void removeInList(Movie movie)
    {
        moviesList.remove(movie.getMovieID() - 1);
        for (int i = 0; i < moviesList.size(); ++i)
            ((Movie)moviesList.get(i)).setMovieID(i + 1);
        updateFiles();
    }
    
    private void removeInRatings(Movie movie)
    {
        for (int i = 0; i < ratingsList.size(); ++i)
        {
            Rating r = ((Rating)ratingsList.get(i));
            
            if(r.getMovieID() == movie.getMovieID())
                ratingsList.remove(i);
        }
        updateFiles();
    }
    @Override
    public void removeMovie(String movieTitle)
    {
        Movie movie = getMovieByTitle(movieTitle);
        removeInPosters(movie);

        System.out.println("POSTER WAS DELETED!");
        removeInStars(movie);
        removeInRatings(movie);
        removeInList(movie);
        System.out.println("MOVIE WAS DELETED!");
    }

    // ---------------------------------MOVIES---------------------------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //---------------------------------STAR---------------------------------
    
    @Override
    public Star getStarByMovieID(int movieID) 
    {
        for (int i = 0; i < starsList.size(); i++) 
        {
            Star s = (Star) starsList.get(i);
            if(s.getMovieID1() == movieID || s.getMovieID2() == movieID)
                return s;
        }
        return null;
    }
    private ArrayList<Star> getStarsByMovieID(int movieID) 
    {
        ArrayList<Star> stars = new ArrayList<>();
        for (int i = 0; i < starsList.size(); i++) 
        {
            Star s = (Star) starsList.get(i);
            if(s.getMovieID1() == movieID || s.getMovieID2() == movieID)
                stars.add(s);
        }
        return stars;
    }
     @Override
    public Star getStarByStarName(String star)
    {
        for (int i = 0; i < starsList.size(); ++i)
        {
            Star s = ((Star)starsList.get(i));
            if (s.getStarFullName().equals(star))
                return s;
        }
        return null;
    }
    private int getStarIndexByStar(Star star)
    {
        for (int i = 0; i < starsList.size(); ++i)
            if (star.getStarFullName().equals(((Star)starsList.get(i)).getStarFullName()))
                return i;
        return -1;
    }
    @Override
    public void setMovieOfStar(Star star,int movieID, String title, int year)
    {        
        try
        {
            if (!isStarExists(star))
                throw new InvalidInputException();
                           
            if (star.getMovieID1() == -1)
                star.setMovie1(movieID,title,year);
            
            else if (star.getMovieID2() == -1 && star.getMovieID1() != -1)
                star.setMovie2(movieID,title,year);
            
            else throw new Exception();
            
            int idx = getStarIndexByStar(star); // Not to be -1 because start exists.
            
            starsList.set(idx, star);
            updateFiles();         
        }
        catch(InvalidInputException e)
        {
            Constant.showMessage("Star is not exists!","Error!",JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception ex)
        {
            Constant.showMessage(star.getStarFullName() + " has already two movie","Error",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
     @Override
    public void addStar(Star star)
    {
        try
        {
            if (isStarExists(star))
                throw new InvalidInputException();
          
            starsList.add(star);
            updateFiles();
        }
        catch(InvalidInputException e)
        {
            JOptionPane.showMessageDialog(null,"Star is already exists or you enter the empty characters!","Error!",JOptionPane.WARNING_MESSAGE);
        }
        
        
    }


    private boolean isStarExists(Star star)
    {
        for (int i = 0; i < starsList.size(); i++)
        {
            Star s = ((Star) starsList.get(i));
            if (s.getStarFullName().trim().toLowerCase().replaceAll("\\s", "").equals(star.getStarFullName().trim().toLowerCase().replaceAll("\\s", "")))
                return true;
        }
        return false;
    }
    
    @Override
    public void removeStar(String starName)
    {
        Star star = getStarByStarName(starName);
        int idx = getStarIndexByStar(star);
        starsList.remove(idx);
        updateFiles();
    }
    
    //---------------------------------STAR---------------------------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //---------------------------------USER---------------------------------
    
     @Override
    public User getUserByUsername(String username)
    {
        for (int i = 0 ; i < usersList.size(); ++i)
            if (((User)usersList.get(i)).getUsername().equals(username))
                return ((User)usersList.get(i));
        return null;
    }
    
     private boolean isUserExists(String username)
    {
        
        for (int i = 0; i < usersList.size(); ++i)
            if (((User)usersList.get(i)).getUsername().equals(username))
                return true;
        return false;
    }
    
    @Override
    public void addUser(String fullname, String username)
    {
        try
        {
            if (isUserExists(username))
                throw new AlreadyEnteredUserException();
            User user = new User(fullname,username);
            dataAccess.writeFile(user ,Constant.USERS_FILE, true);
            Constant.showMessage("Welcome to Program", "Welcome Message!", JOptionPane.INFORMATION_MESSAGE);
            usersList.add(user);
            updateFiles();
        }
        catch(AlreadyEnteredUserException e)
        {
            Constant.showMessage(e.getMessage(), "Invalid Username!", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    //---------------------------------USER---------------------------------
    
    
   
 

   
    
    
    
    
    
    
    
    
    
    
    
    
    //---------------------------------GENERAL OPERATIONS---------------------------------

     @Override
    public void watch(User user, Movie movie)
    {
        movie.setNumberOfWatched(movie.getNumberOfWatched() + 1);
        updateFiles();
    }



    @Override
    public void rate(Movie movie, User user, String relation, int rate)
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        
        ratingsList.add(new Rating(movie.getMovieID(),user.getUsername(), relation, rate));
        
        if (movie.getAvgRate() >= 0 && movie.getAvgRate() < 1)
            movie.setAvgRate(rate);
        
        else 
        {
            String rating = decimalFormat.format((movie.getAvgRate() + rate) / 2).replace(",", ".");
            System.out.println(rating);
            movie.setAvgRate(Double.parseDouble(rating));
        }
        
        int id = movie.getMovieID() - 1;
        moviesList.set(id, movie);
        updateFiles();
    }

   

    
    @Override
    public ArrayList<Object> getMovies()
    {
        return moviesList;
    }

    @Override
    public ArrayList<Object> getStars()
    {
        return starsList;
    }

    @Override
    public ArrayList<Object> getRatings()
    {
        return ratingsList;
    }

    @Override
    public ArrayList<Object> getUsers() {
        return usersList;
    }

    @Override
    public ArrayList<Object> getGenres()
    {
        return genreList;
    }
    
    //---------------------------------GENERAL OPERATIONS---------------------------------

   
    
   

   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //--------------------------UPDATE--------------------------
    @Override
    public void updateStarTable(JTable starTable)
    {
        ((DefaultTableModel)starTable.getModel()).getDataVector().removeAllElements();
        ((DefaultTableModel)starTable.getModel()).fireTableDataChanged();
        ArrayList<Object> stars = getStars();
        
        for (int i = 0 ; i < stars.size(); ++i)
        {
            Star s = ((Star)stars.get(i));
            ArrayList<Movie> movies = getMoviesByStar(s);
            if (movies.isEmpty())
                ((DefaultTableModel)starTable.getModel()).addRow(new Object[]{s.getStarFullName(),"NO MOVIE"});
            for (int j = 0; j < movies.size(); ++j)
            {
                String title = movies.get(j).getTitle();
                Object[] row = {s.getStarFullName(), title};
                ((DefaultTableModel)starTable.getModel()).addRow(row);
            }
        }
    }
    
     @Override
     public void updateMovieTable(JTable table,ArrayList<Object> movies)
    {
       ((DefaultTableModel)table.getModel()).getDataVector().removeAllElements();
        ((DefaultTableModel)table.getModel()).fireTableDataChanged();
        for (int i = 0 ; i < movies.size(); ++i)
        {
            Movie movie = ((Movie)movies.get(i));
            Object[] row = {movie.getMovieID(),movie.getTitle(),movie.getAvgRate()};
            ((DefaultTableModel)table.getModel()).addRow(row);
        }
    }
     
     
     
     @Override
     public void updateStar(String newStarName, ArrayList<Movie> movies, Star star)
     {
         int idx = getStarIndexByStar(star);
         
         star.setStarFullName(newStarName);
         if (movies.isEmpty() || movies == null)
             return;
         if (movies.size() >= 1)
             star.setMovie1(movies.get(0).getMovieID(), movies.get(0).getTitle(), movies.get(0).getYear());
         if (movies.size() == 2)
             star.setMovie2(movies.get(1).getMovieID(), movies.get(1).getTitle(), movies.get(1).getYear());
         starsList.set(idx, star);
         updateFiles();
         
     }
     
     private void updateMovieOfStars(Movie movie)    
     {
         for (int i = 0 ; i < starsList.size(); ++i)
         {
             Star star = ((Star)starsList.get(i));
             if (star.getMovieID1() == movie.getMovieID())
             {
                 star.setMovie1(movie.getMovieID(), movie.getTitle(), movie.getYear());
                 int k = getStarIndexByStar(star);
                 starsList.set(k, star);
             }
             if (star.getMovieID2() == movie.getMovieID())
             {
                 star.setMovie2(movie.getMovieID(), movie.getTitle(), movie.getYear());
                 int k = getStarIndexByStar(star);
                starsList.set(k, star);
             }
             
         }
         
     }
     @Override
     public void updateMovie(int id, Movie movie)
     {
         try
         {
             if (id > moviesList.size())
                 throw new Exception();
             moviesList.set(id - 1, movie);
             updateMovieOfStars(movie);
             updateFiles();
         }
         catch(Exception e)
         {
             Constant.showMessage("Movie ID not valid!", "Error", JOptionPane.WARNING_MESSAGE);
         }
     }
     
      private void updateFile(ArrayList<Object> list, String fileName)
    {
        dataAccess.writeFile(list.get(0),fileName,false);
        for (int i = 1; i < list.size(); i++)
            dataAccess.writeFile(list.get(i),fileName,true);
    }

    @Override
    public void updateFiles()
    {
        if (!moviesList.isEmpty())
            updateFile(moviesList,Constant.MOVIES_FILE);
        if (!ratingsList.isEmpty())
            updateFile(ratingsList,Constant.RATINGS_FILE);
        if (!usersList.isEmpty())
            updateFile(usersList,Constant.USERS_FILE);
        if (!starsList.isEmpty())
            updateFile(starsList,Constant.STARS_FILE);
    }
     
     //--------------------------UPDATE--------------------------


   
}
