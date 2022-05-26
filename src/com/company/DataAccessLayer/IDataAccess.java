package com.company.DataAccessLayer;

import java.util.ArrayList;

public interface IDataAccess
{
    <T>ArrayList<T> readFile(String fileName,String type);
    <T>void writeFile(T obj,String fileName, boolean append);

}
