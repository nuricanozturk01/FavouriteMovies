package com.company.FileOperations;

public interface IFileOperation 
{
    final String DESTINATION_PATH = "src/com/company/Images/Posters/";
    
    void CopyFile(String source, String Destination, int id, String extensionWithoutDot);
    void moveFile(String source, String Destination, int id, String extensionWithoutDot);
    void renameFile(String oldName, String newName);
    void resizeAndSaveImage(String source, String destination, int width, int height);
}
