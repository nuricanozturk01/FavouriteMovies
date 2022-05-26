package com.company.GUI;

import com.company.Constants.Constant;
import com.company.Entities.Movie;
import com.company.Entities.Star;
import com.company.Exceptions.InvalidInputException;
import com.company.Service.IDataService;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class UpdateScreen extends javax.swing.JFrame {

    private IDataService dataService;
    private JTable movieTable;
    private JTable starTable;
    private IConfigureComboBox configureBox;
    
    public UpdateScreen(IDataService dataService, JTable table, JTable starTable,IConfigureComboBox configureBox) 
    {
        this.configureBox = configureBox;
        this.dataService = dataService;
        this.movieTable = table;
        this.starTable = starTable;
        setTitle("Update Screen");
        initComponents();
        configureBox.showMovies(movieComboBox, false);
        configureBox.showMovies(setMovie1ComboBox, true);
        configureBox.showMovies(setMovie2ComboBox, true);
        configureBox.showStars(starBox);
        setCaretColors(Color.WHITE);
    }

    private void setCaretColors(Color color)
    {
        idText.setCaretColor(color);
        titleText.setCaretColor(color);
        yearText.setCaretColor(color);
        lengthText.setCaretColor(color);
        genreText.setCaretColor(color);
        studioNameText.setCaretColor(color);
        producerNameText.setCaretColor(color);
        descArea.setCaretColor(color);
        fullNameText.setCaretColor(color);
    }

     private void showMovieInformations(Movie m)
    {
        idText.setText(Integer.toString(m.getMovieID()));
        titleText.setText(m.getTitle());
        yearText.setText(Integer.toString(m.getYear()));
        lengthText.setText(Integer.toString(m.getLength()));
        genreText.setText(m.getGenre());
        studioNameText.setText(m.getStudioName());
        producerNameText.setText(m.getProducerName());
   
        descArea.setText(m.getDescription());
        imageLbl.setIcon(new ImageIcon(Constant.DESTINATION_PATH+Constant.POSTER_NAME+idText.getText()+"."+Constant.POSTER_TYPE));    
    }


    
    
    
    private void showStarInformations(Star star)
    {
        fullNameText.setText(star.getStarFullName());
        ArrayList<Movie> m1 = dataService.getMoviesByStar(star);
        if (m1 == null)
        {
            movieTitle1Text.setText("NULL");
            movieTitle2Text.setText("NULL");
        }
        
        if (m1.size() == 1)
        {
            movieTitle1Text.setText(m1.get(0).getTitle());
            movieTitle2Text.setText("NULL");
        }
        if (m1.size() == 2)
        {
            movieTitle1Text.setText(m1.get(0).getTitle());
            movieTitle2Text.setText(m1.get(1).getTitle());
        }
      
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void clearMovies()
    {
        idText.setText(null);
        yearText.setText(null);
        lengthText.setText(null);
        titleText.setText(null);
        studioNameText.setText(null);
        producerNameText.setText(null);
        descArea.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imageLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        titleText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        yearText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lengthText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        genreText = new javax.swing.JTextField();
        studioNameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        producerNameText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descArea = new javax.swing.JTextArea();
        movieComboBox = new javax.swing.JComboBox<>();
        starBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fullNameText = new javax.swing.JTextField();
        movieTitle1Text = new javax.swing.JTextField();
        movieTitle2Text = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        setMovie1ComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        setMovie2ComboBox = new javax.swing.JComboBox<>();
        starBtn = new javax.swing.JButton();
        movieBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));
        jPanel1.setForeground(new java.awt.Color(178, 178, 178));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 157, 88)));

        imageLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(178, 178, 178)));

        idLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idLbl.setForeground(new java.awt.Color(178, 178, 178));
        idLbl.setText("ID:");

        idText.setEditable(false);
        idText.setBackground(new java.awt.Color(39, 39, 39));
        idText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idText.setForeground(new java.awt.Color(178, 178, 178));
        idText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleText.setBackground(new java.awt.Color(39, 39, 39));
        titleText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        titleText.setForeground(new java.awt.Color(178, 178, 178));
        titleText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(178, 178, 178));
        jLabel2.setText("Title:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(178, 178, 178));
        jLabel3.setText("Year:");

        yearText.setBackground(new java.awt.Color(39, 39, 39));
        yearText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yearText.setForeground(new java.awt.Color(178, 178, 178));
        yearText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(178, 178, 178));
        jLabel4.setText("Length:");

        lengthText.setBackground(new java.awt.Color(39, 39, 39));
        lengthText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lengthText.setForeground(new java.awt.Color(178, 178, 178));
        lengthText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(178, 178, 178));
        jLabel18.setText("minutes");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(178, 178, 178));
        jLabel5.setText("Genre:");

        genreText.setBackground(new java.awt.Color(39, 39, 39));
        genreText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genreText.setForeground(new java.awt.Color(178, 178, 178));
        genreText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        studioNameText.setBackground(new java.awt.Color(39, 39, 39));
        studioNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studioNameText.setForeground(new java.awt.Color(178, 178, 178));
        studioNameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(178, 178, 178));
        jLabel6.setText("Studio Name:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(178, 178, 178));
        jLabel7.setText("Producer Name:");

        producerNameText.setBackground(new java.awt.Color(39, 39, 39));
        producerNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        producerNameText.setForeground(new java.awt.Color(178, 178, 178));
        producerNameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(178, 178, 178));
        jLabel10.setText("Description: ");

        descArea.setBackground(new java.awt.Color(39, 39, 39));
        descArea.setColumns(20);
        descArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        descArea.setForeground(new java.awt.Color(178, 178, 178));
        descArea.setRows(5);
        jScrollPane1.setViewportView(descArea);

        movieComboBox.setBackground(new java.awt.Color(28, 28, 28));
        movieComboBox.setForeground(new java.awt.Color(178, 178, 178));
        movieComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                movieComboBoxİtemStateChanged(evt);
            }
        });

        starBox.setBackground(new java.awt.Color(28, 28, 28));
        starBox.setForeground(new java.awt.Color(178, 178, 178));
        starBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                starBoxİtemStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(178, 178, 178));
        jLabel11.setText("Star Full Name:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(178, 178, 178));
        jLabel12.setText("Movie 1:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(178, 178, 178));
        jLabel13.setText("Movie 2:");

        fullNameText.setBackground(new java.awt.Color(39, 39, 39));
        fullNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fullNameText.setForeground(new java.awt.Color(178, 178, 178));

        movieTitle1Text.setEditable(false);
        movieTitle1Text.setBackground(new java.awt.Color(39, 39, 39));
        movieTitle1Text.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movieTitle1Text.setForeground(new java.awt.Color(178, 178, 178));

        movieTitle2Text.setEditable(false);
        movieTitle2Text.setBackground(new java.awt.Color(39, 39, 39));
        movieTitle2Text.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movieTitle2Text.setForeground(new java.awt.Color(178, 178, 178));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(178, 178, 178));
        jLabel14.setText("Set Movie I");

        setMovie1ComboBox.setBackground(new java.awt.Color(28, 28, 28));
        setMovie1ComboBox.setForeground(new java.awt.Color(178, 178, 178));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(178, 178, 178));
        jLabel15.setText("Set Movie II");

        setMovie2ComboBox.setBackground(new java.awt.Color(28, 28, 28));
        setMovie2ComboBox.setForeground(new java.awt.Color(178, 178, 178));

        starBtn.setBackground(new java.awt.Color(28, 28, 28));
        starBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        starBtn.setForeground(new java.awt.Color(178, 178, 178));
        starBtn.setText("Enter");
        starBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starBtnActionPerformed(evt);
            }
        });

        movieBtn.setBackground(new java.awt.Color(28, 28, 28));
        movieBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movieBtn.setForeground(new java.awt.Color(178, 178, 178));
        movieBtn.setText("Enter");
        movieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieBtnActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(15, 157, 88));
        jLabel16.setText("MOVIE");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(15, 157, 88));
        jLabel17.setText("STAR");

        jLabel8.setBackground(new java.awt.Color(28, 28, 28));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(15, 157, 88));
        jLabel8.setText("[!] If you want to select one movie, you must sure other movie equals to non changed star movie.");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(15, 157, 88));
        jLabel9.setText("[!] If you do not want change, you must sure both movie are same title and order.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genreText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(producerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studioNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lengthText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(189, 189, 189)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(movieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(movieTitle1Text)
                                    .addComponent(movieTitle2Text)
                                    .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(starBox, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(setMovie1ComboBox, 0, 276, Short.MAX_VALUE)
                                            .addComponent(setMovie2ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(214, 214, 214)
                                        .addComponent(starBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(194, 194, 194)))
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel11, jLabel12, jLabel13});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fullNameText, movieTitle1Text, movieTitle2Text});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {setMovie1ComboBox, setMovie2ComboBox});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {movieComboBox, starBox});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(genreText)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studioNameText)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(producerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(movieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(starBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(movieTitle1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movieTitle2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setMovie1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setMovie2ComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(starBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel12, jLabel13});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fullNameText, movieTitle1Text, movieTitle2Text});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {setMovie1ComboBox, setMovie2ComboBox});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {movieComboBox, starBox});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieBtnActionPerformed
       try
       {
            int id = Integer.parseInt(idText.getText());
            int year = Integer.parseInt(yearText.getText());
            int length = Integer.parseInt(lengthText.getText());
            String title = titleText.getText();
            String studioName = studioNameText.getText();
            String producerName = producerNameText.getText();
            String desc = descArea.getText();

            Movie movie = dataService.getMovieByID(id); // Get exist Movie
            
            if (movie == null)
                throw new InvalidInputException();
            
            movie.setYear(year);
            movie.setLength(length);
            movie.setTitle(title);
            movie.setStudioName(studioName);
            movie.setProducerName(producerName);
            movie.setDescription(desc);
            
            dataService.updateMovie(id,movie);
            dataService.updateStarTable(starTable);
            dataService.updateMovieTable(movieTable,dataService.getMovies());
       }
       catch(NumberFormatException e)
       {
           Constant.showMessage("Please enter the integer values for necessary fields", "Error", JOptionPane.WARNING_MESSAGE);
       }
       catch(InvalidInputException ex)
       {
           Constant.showMessage("Movie does not found!", "Error", JOptionPane.WARNING_MESSAGE);
           clearMovies();
       }
        
    }//GEN-LAST:event_movieBtnActionPerformed

    private void movieComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_movieComboBoxİtemStateChanged
          if (evt != null && evt.getStateChange() == ItemEvent.SELECTED) 
        {
            Movie m = dataService.getMovieByTitle(movieComboBox.getSelectedItem().toString());
            showMovieInformations(m);    
        }
    }//GEN-LAST:event_movieComboBoxİtemStateChanged

    private void starBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_starBoxİtemStateChanged
        if (evt != null && evt.getStateChange() == ItemEvent.SELECTED) 
        {
            Star s = dataService.getStarByStarName(starBox.getSelectedItem().toString());
            //Star m = dataService.getByMovieTitle(movieComboBox.getSelectedItem().toString());
            showStarInformations(s);    
        }
    }//GEN-LAST:event_starBoxİtemStateChanged


    private void starBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starBtnActionPerformed
        
       try
       {
            String starName = fullNameText.getText();
            String movie1Title = setMovie1ComboBox.getSelectedItem().toString();
            String movie2Title = setMovie2ComboBox.getSelectedItem().toString();
       
            ArrayList<Movie> movies = new ArrayList<>();
            if (starName.isBlank() || starName.isEmpty())
                throw new InvalidInputException();
            if (!movie1Title.equals("NULL"))
                movies.add(dataService.getMovieByTitle(movie1Title));
            if (movie2Title.equals("NULL"))
                movies.add(new Movie(-1,"NULL",-1));
            else
                movies.add(dataService.getMovieByTitle(movie2Title));
           
            
            Star oldStar = dataService.getStarByStarName(starBox.getSelectedItem().toString());     
            
            dataService.updateStar(starName,movies,oldStar);
            dataService.updateStarTable(starTable);
            //showStars();
            configureBox.showStars(starBox);
            setMovie1ComboBox.setSelectedItem("NULL");
            setMovie2ComboBox.setSelectedItem("NULL");
            
            
            
            
       }
       catch(InvalidInputException e)
       {
           Constant.showMessage(e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
       }
               
        
    }//GEN-LAST:event_starBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descArea;
    private javax.swing.JTextField fullNameText;
    private javax.swing.JTextField genreText;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lengthText;
    private javax.swing.JButton movieBtn;
    private javax.swing.JComboBox<String> movieComboBox;
    private javax.swing.JTextField movieTitle1Text;
    private javax.swing.JTextField movieTitle2Text;
    private javax.swing.JTextField producerNameText;
    private javax.swing.JComboBox<String> setMovie1ComboBox;
    private javax.swing.JComboBox<String> setMovie2ComboBox;
    private javax.swing.JComboBox<String> starBox;
    private javax.swing.JButton starBtn;
    private javax.swing.JTextField studioNameText;
    private javax.swing.JTextField titleText;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
