package com.company.FileOperations;

import com.company.Constants.Constant;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class FileOperation implements IFileOperation
{
    
    @Override
    public void CopyFile(String source, String Destination, int id, String extensionWithoutDot) 
    {
      
        try 
        {
            Files.copy(Path.of(source), Path.of(Destination+"Poster_"+id+"."+extensionWithoutDot));
        } 
        catch (IOException ex) 
        {
            Constant.showMessage("We have some problem about Copy File!", "Copy File Problem", JOptionPane.WARNING_MESSAGE);
        }

    }

    @Override
    public void moveFile(String source, String Destination, int id, String extensionWithoutDot) 
    {
        try 
        {
            CopyFile(source, Destination, id,extensionWithoutDot);
            Files.delete(Path.of(source));
        } 
        catch (IOException ex) 
        {
            Constant.showMessage("IO Exception!", "Exception!", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void renameFile(String oldName, String newName) 
    {
        try 
        {
            File file = new File(oldName);
            Files.move(Path.of(oldName), Path.of(newName),StandardCopyOption.REPLACE_EXISTING);        
            file.renameTo(new File(newName));
        } 
        catch (IOException ex) 
        {
            Constant.showMessage("We have some problem about rename File!", "Rename File Problem", JOptionPane.WARNING_MESSAGE);
        }
       
    }
    @Override
    public  void resizeAndSaveImage(String source, String destination, int width, int height)
     {
       try
       {
            File inputFile = new File(source);
            BufferedImage inputImage = ImageIO.read(inputFile);

            BufferedImage outputImage = new BufferedImage(width,
                    height, inputImage.getType());

            Graphics2D g2d = outputImage.createGraphics();
            g2d.drawImage(inputImage, 0, 0, width, height, null);
            g2d.dispose();
            String formatName = destination.substring(destination
                    .lastIndexOf(".") + 1);
            ImageIO.write(outputImage, formatName, new File(destination));
       } 
       catch (IOException ex) 
       {
            Constant.showMessage("We have some problem about Resizing Poster!", "Image Resize Problem", JOptionPane.WARNING_MESSAGE);
       }
    }
     
   
}
