package com.company.DataAccessLayer;

import com.company.Constants.Constant;
import com.company.Entities.Movie;
import com.company.Entities.Rating;
import com.company.Entities.Star;
import com.company.Entities.User;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DataAccess implements IDataAccess
{

    private final String DELIMITER = " ";
    private final String WRITE_DELIMITER = "_";

    @Override
    public <T> void writeFile(T obj, String fileName, boolean append)
    {
        try(FileOutputStream fos = new FileOutputStream(fileName,append);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos, StandardCharsets.UTF_8)))
        {
            writer.write(obj.toString());
            writer.newLine();
        }
        catch (IOException e)
        {
            Constant.showMessage("We have some problem about writing file!", "Writing file Problem", JOptionPane.WARNING_MESSAGE);
        }
    }


    @Override
    public <T> ArrayList<T> readFile(String fileName,String type)
    {
        if (!type.equals(Constant.MOVIE_TYPE) && !type.equals(Constant.USER_TYPE) && !type.equals(Constant.STAR_TYPE) && 
                !type.equals(Constant.RATING_TYPE) && !type.equals(Constant.GENRE_TYPE))
            return null;

        ArrayList<T> list = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] splitArray = line.split(DELIMITER);
                addToList(type,list,splitArray);
            }
        }
        catch (IOException e)
        {
           Constant.showMessage("We have some problem about reading file!", "Reading file Problem", JOptionPane.WARNING_MESSAGE);
        }
        return list;
    }


    private <T> void addToList(String type, ArrayList<T> list, String[] splitArray)
    {
        switch (type)
        {
            case Constant.USER_TYPE:
                addUser(list,splitArray);
                break;
            case Constant.MOVIE_TYPE:
                addMovie(list,splitArray);
                break;
            case Constant.STAR_TYPE:
                addStar(list,splitArray);
                break;
            case Constant.RATING_TYPE:
                addRating(list,splitArray);
                break;
            case Constant.GENRE_TYPE:
                addGenre(list,splitArray);
                break;
        }
    }

    private <T> void addGenre(ArrayList<T> list, String[] splitArray)
    {    
        list.add((T) splitArray[0]);
    }
    private <T> void addRating(ArrayList<T> list, String[] splitArray)
    {
        Rating rating = new Rating(Integer.parseInt(splitArray[0]),splitArray[1].replace(WRITE_DELIMITER,DELIMITER),
                splitArray[2].replace(WRITE_DELIMITER,DELIMITER),Integer.parseInt(splitArray[3]));
        list.add((T) rating);
    }

    private <T> void addStar(ArrayList<T> list, String[] splitArray)
    {

        Star star = new Star(splitArray[0].replace(WRITE_DELIMITER,DELIMITER),Integer.parseInt(splitArray[1]),
                splitArray[2].replace(DELIMITER,WRITE_DELIMITER),
                Integer.parseInt(splitArray[3]),Integer.parseInt(splitArray[4]),splitArray[5].replace(DELIMITER,WRITE_DELIMITER),
                Integer.parseInt(splitArray[6]));
        list.add((T)star);
    }

    private <T> void addMovie(ArrayList<T> list, String[] splitArray)
    {
        Movie movie = new Movie(Integer.parseInt(splitArray[0]),
                splitArray[1].replace(WRITE_DELIMITER,DELIMITER),
                Integer.parseInt(splitArray[2]),
                Integer.parseInt(splitArray[3]),
                splitArray[4].replace(WRITE_DELIMITER,DELIMITER),
                splitArray[5].replace(WRITE_DELIMITER,DELIMITER),
                splitArray[6].replace(WRITE_DELIMITER,DELIMITER),
                splitArray[7].replace(WRITE_DELIMITER,DELIMITER),
                Double.parseDouble(splitArray[8]),
                Integer.parseInt(splitArray[9]));
        list.add((T) movie);
    }

    private <T> void addUser(ArrayList<T> list, String[] arr)
    {
        list.add((T) new User(arr[0].replace(WRITE_DELIMITER,DELIMITER),arr[1]));
    }

}
