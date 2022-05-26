package com.company.GUI;

import com.company.Constants.Constant;
import com.company.Entities.Movie;
import com.company.Exceptions.InvalidImageFormat;
import com.company.Exceptions.InvalidInputException;
import com.company.FileOperations.FileOperation;
import com.company.FileOperations.IFileOperation;
import com.company.Service.IDataService;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddMovieScreen extends javax.swing.JFrame 
{

    private IDataService service;
    private IFileOperation fileOperation;
    private JTable table;
    private IConfigureComboBox configureBox;
    public AddMovieScreen(IDataService service, JTable table,IConfigureComboBox configureBox) 
    {
        this.configureBox = configureBox;
        this.table = table;
        this.service = service;
        initComponents();
        setResizable(false);
        setTitle("Add Movie Screen");
        configureBox.getGenreComboBox(genreBox);
    }

    
    
    private void setImage(ImageIcon imageicon)
    {
        imageLbl.setIcon(imageicon);
    }
    
    
    private boolean isValidInputs(String[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
            if (arr[i].isBlank() || arr[i].isEmpty())
                return false;
        return true;
    }
    
     private void clearText() 
     {
         titleText.setText(null);
         yearText.setText(null);
         lengthText.setText(null);
         studioNameText.setText(null);
         producerNameText.setText(null);
         descArea.setText(null);
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        lengthText = new javax.swing.JTextField();
        yearText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        studioNameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        producerNameText = new javax.swing.JTextField();
        numOfWatchText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        avgRateText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descArea = new javax.swing.JTextArea();
        selectImageBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        lengthLbl = new javax.swing.JLabel();
        minutes = new javax.swing.JLabel();
        genreBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));

        imageLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(178, 178, 178)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(178, 178, 178));
        jLabel2.setText("Title:");

        titleText.setBackground(new java.awt.Color(39, 39, 39));
        titleText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        titleText.setForeground(new java.awt.Color(178, 178, 178));

        lengthText.setBackground(new java.awt.Color(39, 39, 39));
        lengthText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lengthText.setForeground(new java.awt.Color(178, 178, 178));

        yearText.setBackground(new java.awt.Color(39, 39, 39));
        yearText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yearText.setForeground(new java.awt.Color(178, 178, 178));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(178, 178, 178));
        jLabel3.setText("Year:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(178, 178, 178));
        jLabel5.setText("Genre:");

        studioNameText.setBackground(new java.awt.Color(39, 39, 39));
        studioNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studioNameText.setForeground(new java.awt.Color(178, 178, 178));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(178, 178, 178));
        jLabel6.setText("Studio Name:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(178, 178, 178));
        jLabel7.setText("Producer Name:");

        producerNameText.setBackground(new java.awt.Color(39, 39, 39));
        producerNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        producerNameText.setForeground(new java.awt.Color(178, 178, 178));

        numOfWatchText.setEditable(false);
        numOfWatchText.setBackground(new java.awt.Color(39, 39, 39));
        numOfWatchText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numOfWatchText.setForeground(new java.awt.Color(178, 178, 178));
        numOfWatchText.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(178, 178, 178));
        jLabel9.setText("Number Of Watched:");

        avgRateText.setEditable(false);
        avgRateText.setBackground(new java.awt.Color(39, 39, 39));
        avgRateText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        avgRateText.setForeground(new java.awt.Color(178, 178, 178));
        avgRateText.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(178, 178, 178));
        jLabel8.setText("Average Rate:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(178, 178, 178));
        jLabel10.setText("Description: ");

        descArea.setBackground(new java.awt.Color(39, 39, 39));
        descArea.setColumns(20);
        descArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        descArea.setForeground(new java.awt.Color(178, 178, 178));
        descArea.setRows(5);
        jScrollPane1.setViewportView(descArea);

        selectImageBtn.setBackground(new java.awt.Color(28, 28, 28));
        selectImageBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectImageBtn.setForeground(new java.awt.Color(178, 178, 178));
        selectImageBtn.setText("Select Image");
        selectImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImageBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(28, 28, 28));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(178, 178, 178));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        lengthLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lengthLbl.setForeground(new java.awt.Color(178, 178, 178));
        lengthLbl.setText("Length:");

        minutes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        minutes.setForeground(new java.awt.Color(178, 178, 178));
        minutes.setText("minutes");

        genreBox.setBackground(new java.awt.Color(28, 28, 28));
        genreBox.setForeground(new java.awt.Color(178, 178, 178));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectImageBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studioNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(avgRateText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(numOfWatchText, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(producerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(lengthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lengthText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(genreBox, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {producerNameText, studioNameText, titleText});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectImageBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lengthText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lengthLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studioNameText)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(producerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avgRateText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numOfWatchText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBtn)
                .addGap(21, 21, 21))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {producerNameText, studioNameText, titleText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImageBtnActionPerformed
        try
        {
            this.fileOperation = new FileOperation();
            File file;
            int id = 0;

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("*.jpg", "jpg"));

            if ((fileChooser.showOpenDialog(null)) == JFileChooser.APPROVE_OPTION)
            {
                file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                id = service.getMovies().size() + 1;
                fileOperation.resizeAndSaveImage(file.getAbsolutePath(),fileOperation.DESTINATION_PATH+"Poster_"+id+"."+Constant.POSTER_TYPE, Constant.IMAGE_WIDTH, Constant.IMAGE_HEIGHT);
            }
            else throw new InvalidImageFormat();

            setImage(new ImageIcon(fileOperation.DESTINATION_PATH+Constant.POSTER_NAME+id+"."+Constant.POSTER_TYPE));
        }
        catch(InvalidImageFormat e)
        {
            Constant.showMessage(e.getMessage(), "Invalid File", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_selectImageBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try
        {
            String title = titleText.getText();
            String year = yearText.getText();
            String length = lengthText.getText();
            String genre = genreBox.getSelectedItem().toString();
            String studioName = studioNameText.getText();
            String producerName = producerNameText.getText();
            String description = descArea.getText();

            int y_year = Integer.parseInt(year); 
            
            if (!isValidInputs(new String[]{title,year,length,studioName,producerName,description}))
                throw new InvalidInputException();
            
            if (y_year < 1888 && y_year > LocalDate.now().getYear())
                throw new Exception("Invalid Year!");
            
            
            Movie movie = new Movie(title, Integer.parseInt(year), Integer.parseInt(length), 
                    genre,studioName, producerName, description, Double.parseDouble(avgRateText.getText()),
                    Integer.parseInt(numOfWatchText.getText()));
            
            service.addMovie(movie);
            service.updateMovieTable(table,service.getMovies());
        } 
        catch (InvalidInputException ex) 
        {
            Constant.showMessage(ex.getMessage(), "Invalid Input", JOptionPane.WARNING_MESSAGE);
            clearText();
        }
        catch(NumberFormatException e)
        {
            Constant.showMessage(e.getMessage(), "Please enter the number for necessary fields!", JOptionPane.WARNING_MESSAGE);
            clearText();
        }
        catch(Exception e)
        {
            Constant.showMessage(e.getMessage(), "Invalid Year", JOptionPane.WARNING_MESSAGE);
            clearText();
        }
    }//GEN-LAST:event_addBtnActionPerformed


    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField avgRateText;
    private javax.swing.JTextArea descArea;
    private javax.swing.JComboBox<String> genreBox;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lengthLbl;
    private javax.swing.JTextField lengthText;
    private javax.swing.JLabel minutes;
    private javax.swing.JTextField numOfWatchText;
    private javax.swing.JTextField producerNameText;
    private javax.swing.JButton selectImageBtn;
    private javax.swing.JTextField studioNameText;
    private javax.swing.JTextField titleText;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables

   
}
