package com.company.GUI;

import com.company.Constants.Constant;
import com.company.Entities.Movie;
import com.company.Entities.Star;
import com.company.Entities.User;
import com.company.Exceptions.InvalidInputException;
import com.company.Service.IDataService;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



class HeaderColor extends DefaultTableCellRenderer
{
    public HeaderColor()
    {
        setOpaque(true);
    }
    
    
    
    public Component getTableCellRendererComponent(JTable table, Object val, boolean selected, boolean focused, int row, int col)
    {
        super.getTableCellRendererComponent(table, val, selected, focused, row, col);
        this.setBackground(new Color(27,27,27));
        this.setForeground(new Color(178,178,178)); 
        this.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        this.setVerticalAlignment(DefaultTableCellRenderer.CENTER);
        return this;
    }
    
}





public class MainScreen extends javax.swing.JFrame 
{

    private IDataService dataService;
    
    private DefaultTableModel model;
    private String username;        
    
    private IConfigureComboBox configureComboBox;
    
    public MainScreen(IDataService dataService, String username) 
    {        
        this.configureComboBox = new ConfigureComboBox(dataService);
        this.username = username;
        this.dataService = dataService;
        
        setTitle("Favourite Movies");
        setResizable(false);
            
        initComponents();
    
        model = (DefaultTableModel)table.getModel();
        
        settingTable(jScrollPane2,table);
        settingTable(table2ScrollPane,starTable);
        
        
        dataService.updateMovieTable(table,dataService.getMovies());
        dataService.updateStarTable(starTable);
        
        
        configureComboBox.getGenreComboBox(genreBox);
        
        //showGenres();
        
    }

    

    void settingTable(JScrollPane pane, JTable table)
    {
        pane.getViewport().setBackground(new Color(27,27,27));
        pane.getViewport().setForeground(new Color(178,178,178));      
        table.getTableHeader().setDefaultRenderer(new HeaderColor());
        table.setFont(new Font("Monaco",Font.BOLD,12));table.setGridColor(new Color(27,27,27));
        DefaultTableCellRenderer rend = new DefaultTableCellRenderer();
        rend.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        pane.getVerticalScrollBar().setBackground(new Color(39,39,39));
        pane.getHorizontalScrollBar().setBackground(new Color(39,39,39));
        pane.getVerticalScrollBar().setUI(new BasicScrollBarUI()          
        {
            @Override
            protected void configureScrollBarColors()
            {
                this.thumbColor = new Color(60,63,65);
            }
            @Override
            protected JButton createDecreaseButton(int orientation) 
            {
                JButton button = super.createDecreaseButton(orientation);
                button.setBackground(new Color(39,39,39));
                return button;
            }

            @Override
            protected JButton createIncreaseButton(int orientation) 
            {
                JButton button = super.createIncreaseButton(orientation);
                button.setBackground(new Color(39,39,39));
                return button;
            }
        }
        );
        for (int i = 0 ; i < table.getColumnCount(); ++i)
            table.getColumnModel().getColumn(i).setCellRenderer(rend);     
    }
    
    
    private void showMovieInformations(Movie m)
    {
        clearMovieInformations();
        idText.setText(Integer.toString(m.getMovieID()));
        titleText.setText(m.getTitle());
        yearText.setText(Integer.toString(m.getYear()));
        lengthText.setText(Integer.toString(m.getLength()));
        genreText.setText(m.getGenre());
        studioNameText.setText(m.getStudioName());
        producerNameText.setText(m.getProducerName());
        avgRateText.setText(Double.toString(m.getAvgRate() ));
        numOfWatchText.setText(Integer.toString(m.getNumberOfWatched()));
        descArea.setText(m.getDescription());
        imageLbl.setIcon(new ImageIcon(Constant.DESTINATION_PATH+Constant.POSTER_NAME+m.getMovieID()+"."+Constant.POSTER_TYPE));    
    }
    
 
   


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        addMovieBtn = new javax.swing.JButton();
        imageLbl = new javax.swing.JLabel();
        addStarBtn = new javax.swing.JButton();
        idLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descArea = new javax.swing.JTextArea();
        idText = new javax.swing.JTextField();
        titleText = new javax.swing.JTextField();
        yearText = new javax.swing.JTextField();
        lengthText = new javax.swing.JTextField();
        genreText = new javax.swing.JTextField();
        studioNameText = new javax.swing.JTextField();
        producerNameText = new javax.swing.JTextField();
        avgRateText = new javax.swing.JTextField();
        numOfWatchText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        ratingBtn = new javax.swing.JButton();
        watchMovieBtn = new javax.swing.JButton();
        showImageBtn = new javax.swing.JButton();
        highestRateBtn = new javax.swing.JButton();
        moviesOfStarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        genreBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        movieIdTextField = new javax.swing.JTextField();
        movieIDD = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        movieIDRatingText = new javax.swing.JTextField();
        relationText = new javax.swing.JTextField();
        rateText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        resultBox = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        table2ScrollPane = new javax.swing.JScrollPane();
        starTable = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        idForStarText = new javax.swing.JTextField();
        starNameText = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        showIdBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));
        jPanel1.setForeground(new java.awt.Color(178, 178, 178));
        jPanel1.setPreferredSize(new java.awt.Dimension(1485, 792));

        jScrollPane2.setBackground(new java.awt.Color(28, 28, 28));
        jScrollPane2.setForeground(new java.awt.Color(39, 39, 39));

        table.setBackground(new java.awt.Color(39, 39, 39));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setForeground(new java.awt.Color(178, 178, 178));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MovieID", "MovieName", "Rate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setGridColor(new java.awt.Color(178,178,178));
        table.setRowSelectionAllowed(false);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.setShowGrid(true);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        addMovieBtn.setBackground(new java.awt.Color(28, 28, 28));
        addMovieBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addMovieBtn.setForeground(new java.awt.Color(178, 178, 178));
        addMovieBtn.setText("Add Movie");
        addMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieBtnActionPerformed(evt);
            }
        });

        imageLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(178, 178, 178)));

        addStarBtn.setBackground(new java.awt.Color(28, 28, 28));
        addStarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addStarBtn.setForeground(new java.awt.Color(178, 178, 178));
        addStarBtn.setText("Add Star");
        addStarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStarBtnActionPerformed(evt);
            }
        });

        idLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idLbl.setForeground(new java.awt.Color(178, 178, 178));
        idLbl.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(178, 178, 178));
        jLabel2.setText("Title:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(178, 178, 178));
        jLabel3.setText("Year:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(178, 178, 178));
        jLabel4.setText("Length:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(178, 178, 178));
        jLabel5.setText("Genre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(178, 178, 178));
        jLabel6.setText("Studio Name:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(178, 178, 178));
        jLabel7.setText("Producer Name:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(178, 178, 178));
        jLabel8.setText("Average Rate:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(178, 178, 178));
        jLabel9.setText("Number Of Watched:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(178, 178, 178));
        jLabel10.setText("Description: ");

        descArea.setEditable(false);
        descArea.setBackground(new java.awt.Color(39, 39, 39));
        descArea.setColumns(20);
        descArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        descArea.setForeground(new java.awt.Color(178, 178, 178));
        descArea.setRows(5);
        jScrollPane1.setViewportView(descArea);

        idText.setEditable(false);
        idText.setBackground(new java.awt.Color(39, 39, 39));
        idText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idText.setForeground(new java.awt.Color(178, 178, 178));
        idText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleText.setEditable(false);
        titleText.setBackground(new java.awt.Color(39, 39, 39));
        titleText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        titleText.setForeground(new java.awt.Color(178, 178, 178));
        titleText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titleText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        yearText.setEditable(false);
        yearText.setBackground(new java.awt.Color(39, 39, 39));
        yearText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yearText.setForeground(new java.awt.Color(178, 178, 178));
        yearText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lengthText.setEditable(false);
        lengthText.setBackground(new java.awt.Color(39, 39, 39));
        lengthText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lengthText.setForeground(new java.awt.Color(178, 178, 178));
        lengthText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lengthText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        genreText.setEditable(false);
        genreText.setBackground(new java.awt.Color(39, 39, 39));
        genreText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genreText.setForeground(new java.awt.Color(178, 178, 178));
        genreText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genreText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        studioNameText.setEditable(false);
        studioNameText.setBackground(new java.awt.Color(39, 39, 39));
        studioNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studioNameText.setForeground(new java.awt.Color(178, 178, 178));
        studioNameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studioNameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        producerNameText.setEditable(false);
        producerNameText.setBackground(new java.awt.Color(39, 39, 39));
        producerNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        producerNameText.setForeground(new java.awt.Color(178, 178, 178));
        producerNameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        producerNameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        avgRateText.setEditable(false);
        avgRateText.setBackground(new java.awt.Color(39, 39, 39));
        avgRateText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        avgRateText.setForeground(new java.awt.Color(178, 178, 178));
        avgRateText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        avgRateText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        numOfWatchText.setEditable(false);
        numOfWatchText.setBackground(new java.awt.Color(39, 39, 39));
        numOfWatchText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numOfWatchText.setForeground(new java.awt.Color(178, 178, 178));
        numOfWatchText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOfWatchText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(178, 178, 178));
        jLabel11.setText("Search:");

        searchText.setBackground(new java.awt.Color(39, 39, 39));
        searchText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchText.setForeground(new java.awt.Color(178, 178, 178));
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });

        ratingBtn.setBackground(new java.awt.Color(28, 28, 28));
        ratingBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ratingBtn.setForeground(new java.awt.Color(178, 178, 178));
        ratingBtn.setText("Rate");
        ratingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingBtnActionPerformed(evt);
            }
        });

        watchMovieBtn.setBackground(new java.awt.Color(28, 28, 28));
        watchMovieBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        watchMovieBtn.setForeground(new java.awt.Color(178, 178, 178));
        watchMovieBtn.setText("Watch");
        watchMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchMovieBtnActionPerformed(evt);
            }
        });

        showImageBtn.setBackground(new java.awt.Color(28, 28, 28));
        showImageBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showImageBtn.setForeground(new java.awt.Color(178, 178, 178));
        showImageBtn.setText("Image");
        showImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showImageBtnActionPerformed(evt);
            }
        });

        highestRateBtn.setBackground(new java.awt.Color(28, 28, 28));
        highestRateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        highestRateBtn.setForeground(new java.awt.Color(178, 178, 178));
        highestRateBtn.setText("Highest Rate");
        highestRateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highestRateBtnActionPerformed(evt);
            }
        });

        moviesOfStarBtn.setBackground(new java.awt.Color(28, 28, 28));
        moviesOfStarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        moviesOfStarBtn.setForeground(new java.awt.Color(178, 178, 178));
        moviesOfStarBtn.setText("Movies Of Star");
        moviesOfStarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesOfStarBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 157, 88));
        jLabel1.setText("HIGHEST RATE MOVIE");

        genreBox.setBackground(new java.awt.Color(28, 28, 28));
        genreBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genreBox.setForeground(new java.awt.Color(178, 178, 178));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(178, 178, 178));
        jLabel12.setText("Genre: ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(15, 157, 88));
        jLabel13.setText("WATCH MOVIE");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(178, 178, 178));
        jLabel14.setText("Movie ID:");

        movieIdTextField.setBackground(new java.awt.Color(39, 39, 39));
        movieIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movieIdTextField.setForeground(new java.awt.Color(178, 178, 178));

        movieIDD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movieIDD.setForeground(new java.awt.Color(178, 178, 178));
        movieIDD.setText("Movie ID:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(178, 178, 178));
        jLabel15.setText("Relation:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(178, 178, 178));
        jLabel16.setText("Rate:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(15, 157, 88));
        jLabel17.setText("RATING");

        movieIDRatingText.setBackground(new java.awt.Color(39, 39, 39));
        movieIDRatingText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movieIDRatingText.setForeground(new java.awt.Color(178, 178, 178));

        relationText.setBackground(new java.awt.Color(39, 39, 39));
        relationText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        relationText.setForeground(new java.awt.Color(178, 178, 178));

        rateText.setBackground(new java.awt.Color(39, 39, 39));
        rateText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rateText.setForeground(new java.awt.Color(178, 178, 178));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(178, 178, 178));
        jLabel18.setText("minutes");

        jButton1.setBackground(new java.awt.Color(28, 28, 28));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(178, 178, 178));
        jButton1.setText("Add Movie to Star");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(15, 157, 88));
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 157, 88)));

        resultBox.setBackground(new java.awt.Color(28, 28, 28));
        resultBox.setForeground(new java.awt.Color(178, 178, 178));
        resultBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                resultBoxİtemStateChanged(evt);
            }
        });

        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 157, 88)));

        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 157, 88)));

        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 157, 88)));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(178, 178, 178));
        jLabel23.setText("Result:");

        table2ScrollPane.setBackground(new java.awt.Color(28, 28, 28));
        table2ScrollPane.setForeground(new java.awt.Color(39, 39, 39));

        starTable.setBackground(new java.awt.Color(39, 39, 39));
        starTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        starTable.setForeground(new java.awt.Color(178, 178, 178));
        starTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Star Name", "MovieName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        starTable.setGridColor(new java.awt.Color(178, 178, 178));
        starTable.setRowSelectionAllowed(false);
        starTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        starTable.setShowGrid(true);
        table2ScrollPane.setViewportView(starTable);
        starTable.getAccessibleContext().setAccessibleDescription("");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(178, 178, 178));
        jLabel24.setText("Movie ID:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(178, 178, 178));
        jLabel25.setText("Star Name:");

        idForStarText.setBackground(new java.awt.Color(39, 39, 39));
        idForStarText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idForStarText.setForeground(new java.awt.Color(178, 178, 178));
        idForStarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idForStarTextActionPerformed(evt);
            }
        });

        starNameText.setBackground(new java.awt.Color(39, 39, 39));
        starNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        starNameText.setForeground(new java.awt.Color(178, 178, 178));

        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 157, 88)));

        jLabel27.setBackground(new java.awt.Color(28, 28, 28));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(15, 157, 88));
        jLabel27.setText("ADD MOVIE TO STAR");

        showIdBtn.setBackground(new java.awt.Color(28, 28, 28));
        showIdBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showIdBtn.setForeground(new java.awt.Color(178, 178, 178));
        showIdBtn.setText("Show ID");
        showIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showIdBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(28, 28, 28));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(178, 178, 178));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(28, 28, 28));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(178, 178, 178));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(table2ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genreText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(producerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(avgRateText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(numOfWatchText, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lengthText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(studioNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(movieIDD, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(relationText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ratingBtn)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(movieIDRatingText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rateText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(genreBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(resultBox, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addStarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showImageBtn))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addMovieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showIdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(moviesOfStarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(highestRateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(18, 18, 18)
                                                .addComponent(movieIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(watchMovieBtn)
                                                .addGap(57, 57, 57)))
                                        .addGap(95, 95, 95))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(108, 108, 108))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(starNameText)
                                                .addComponent(idForStarText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(119, 119, 119))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(159, 159, 159))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109))))))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {idLbl, jLabel10, jLabel2, jLabel3, jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(table2ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
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
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(studioNameText)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                        .addComponent(producerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(avgRateText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numOfWatchText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(relationText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(movieIDD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(movieIDRatingText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ratingBtn)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genreBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(highestRateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(resultBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(movieIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(watchMovieBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idForStarText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(starNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addStarBtn)
                                    .addComponent(addMovieBtn)
                                    .addComponent(moviesOfStarBtn))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(showImageBtn)
                                    .addComponent(showIdBtn)
                                    .addComponent(updateBtn)
                                    .addComponent(deleteBtn))))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addMovieBtn, addStarBtn, jButton1, moviesOfStarBtn, showImageBtn});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {idLbl, jLabel10, jLabel2, jLabel3, jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {movieIDRatingText, rateText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieBtnActionPerformed
        new AddMovieScreen(dataService,table,configureComboBox).setVisible(true);
        
    }//GEN-LAST:event_addMovieBtnActionPerformed

    private void addStarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStarBtnActionPerformed
        new AddStarScreen(dataService,starTable).setVisible(true);
   
    }//GEN-LAST:event_addStarBtnActionPerformed

    private void showImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showImageBtnActionPerformed
       new ShowImageScreen(dataService).setVisible(true);
    }//GEN-LAST:event_showImageBtnActionPerformed

    private void moviesOfStarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesOfStarBtnActionPerformed
        new MoviesOfStarScreen(dataService).setVisible(true);
    }//GEN-LAST:event_moviesOfStarBtnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
 
       // dataService.updateMovieTable(table, dataService.getMovies());
        int row = table.getSelectedRow();
        int id = Integer.parseInt(table.getModel().getValueAt(row, 0).toString());
        System.out.println("ID in MOUSE: " + id);
        Movie m = dataService.getMovieByID(id);
        showMovieInformations(m);
   
        
    }//GEN-LAST:event_tableMouseClicked

    private void ratingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingBtnActionPerformed
     try
     {
        String relation = relationText.getText();
        int movieID = Integer.parseInt(movieIDRatingText.getText());
        int rate = Integer.parseInt(rateText.getText());
        
        if (relation.isEmpty() || relation.isBlank())
            throw new InvalidInputException();
        
        Movie movie = dataService.getMovieByID(movieID);
        User user = dataService.getUserByUsername(username);
        
        if (movie == null || user == null)
            throw new InvalidInputException();

        dataService.rate(movie, user, relation, rate);  
        showMovieInformations(movie);
        dataService.updateMovieTable(table,dataService.getMovies());
        
        relationText.setText(null);
        movieIDRatingText.setText(null);
        rateText.setText(null);
     
     }
     catch(InvalidInputException | NumberFormatException e)
     {
         Constant.showMessage("Please fill the all blanks and movieID and Rate are integer!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
        relationText.setText(null);
        movieIDRatingText.setText(null);
        rateText.setText(null);
     }
            
    }//GEN-LAST:event_ratingBtnActionPerformed

    private void highestRateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highestRateBtnActionPerformed
        resultBox.removeAllItems();
        String genre = genreBox.getSelectedItem().toString();
        ArrayList<Movie> list = dataService.getHighestRateMoviesByGenre(genre);
        configureComboBox.getHighestRateComboBox(list, resultBox);
    }//GEN-LAST:event_highestRateBtnActionPerformed

    private void resultBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_resultBoxİtemStateChanged
       
        if (evt != null && evt.getStateChange() == ItemEvent.SELECTED) 
        {
            Movie m = dataService.getMovieByTitle(resultBox.getSelectedItem().toString());
            showMovieInformations(m);    
        }
       
    }//GEN-LAST:event_resultBoxİtemStateChanged

    private void watchMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchMovieBtnActionPerformed
        try
        {
            int id = Integer.parseInt(movieIdTextField.getText());
            
            User user = dataService.getUserByUsername(username);
            Movie movie = dataService.getMovieByID(id);

            dataService.watch(user, movie);
            
            showMovieInformations(movie);
            
            movieIdTextField.setText(null);
        }
        catch(NumberFormatException e)
        {
            Constant.showMessage("Please enter the valid number", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            movieIdTextField.setText(null);
        }
    }//GEN-LAST:event_watchMovieBtnActionPerformed

    private void idForStarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idForStarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idForStarTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try
       {
            int id = Integer.parseInt(idForStarText.getText());
            String starName = starNameText.getText();

            Star star = dataService.getStarByStarName(starName);
            Movie movie = dataService.getMovieByID(id);
            
            if (star == null || movie == null)
                throw new InvalidInputException();

            dataService.setMovieOfStar(star, movie.getMovieID(), movie.getTitle(), movie.getYear());
            dataService.updateStarTable(starTable);
            
            Constant.showMessage("Movie added to star successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
            idForStarText.setText(null);
            starNameText.setText(null);
       }
       catch(NumberFormatException e)
       {
           Constant.showMessage("Please enter the number in id!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            idForStarText.setText(null);
            starNameText.setText(null);
       } 
       catch (InvalidInputException ex) 
       {
           Constant.showMessage("Please enter the correct movieID and Star name", "Invalid Input", JOptionPane.WARNING_MESSAGE);    
            idForStarText.setText(null);
            starNameText.setText(null);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        String key = searchText.getText();
        

        ArrayList<Object> temp = new ArrayList<>();
        ArrayList<Object> movies = dataService.getMovies();
        for(int i = 0; i < movies.size(); ++i)
            if (((Movie)movies.get(i)).getTitle().startsWith(key))
                temp.add(movies.get(i));
        dataService.updateMovieTable(table, temp);
        
    }//GEN-LAST:event_searchTextKeyReleased

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void showIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showIdBtnActionPerformed
        new ShowIdScreen(dataService).setVisible(true);
    }//GEN-LAST:event_showIdBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
       new UpdateScreen(dataService,table,starTable,configureComboBox).setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed
    private void clearMovieInformations()
    {
        idText.setText(null);
        titleText.setText(null);
        yearText.setText(null);
        lengthText.setText(null);
        genreText.setText(null);
        studioNameText.setText(null);
        producerNameText.setText(null);
        avgRateText.setText(null);
        numOfWatchText.setText(null);
        descArea.setText(null);
        imageLbl.setIcon(null);    
    }
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        new DeleteScreen(dataService,table,starTable,configureComboBox).setVisible(true);
        dataService.updateMovieTable(table, dataService.getMovies());
        
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovieBtn;
    private javax.swing.JButton addStarBtn;
    private javax.swing.JTextField avgRateText;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextArea descArea;
    private javax.swing.JComboBox<String> genreBox;
    private javax.swing.JTextField genreText;
    private javax.swing.JButton highestRateBtn;
    private javax.swing.JTextField idForStarText;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lengthText;
    private javax.swing.JLabel movieIDD;
    private javax.swing.JTextField movieIDRatingText;
    private javax.swing.JTextField movieIdTextField;
    private javax.swing.JButton moviesOfStarBtn;
    private javax.swing.JTextField numOfWatchText;
    private javax.swing.JTextField producerNameText;
    private javax.swing.JTextField rateText;
    private javax.swing.JButton ratingBtn;
    private javax.swing.JTextField relationText;
    private javax.swing.JComboBox<String> resultBox;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton showIdBtn;
    private javax.swing.JButton showImageBtn;
    private javax.swing.JTextField starNameText;
    private javax.swing.JTable starTable;
    private javax.swing.JTextField studioNameText;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane table2ScrollPane;
    private javax.swing.JTextField titleText;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton watchMovieBtn;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
