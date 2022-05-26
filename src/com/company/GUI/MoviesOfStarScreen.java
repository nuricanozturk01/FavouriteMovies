package com.company.GUI;

import com.company.Constants.Constant;
import com.company.Entities.Movie;
import com.company.Entities.Star;
import com.company.Exceptions.InvalidInputException;
import com.company.Service.IDataService;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class MoviesOfStarScreen extends javax.swing.JFrame 
{
    private IDataService dataService;
  
    public MoviesOfStarScreen(IDataService dataService) 
    {
        this.dataService = dataService;
        initComponents();
        setResizable(false);
        setTitle("Movies Of Star");
    }


    
    private void showList(ArrayList<Movie> movies)
    {
        DefaultListModel<String> model = new DefaultListModel<>();
        if (movies.isEmpty())
            model.addElement("I did not saw any movie in this star!");
        for(int i = 0; i < movies.size(); ++i)
            model.addElement(movies.get(i).getTitle());
        movieList.setModel(model);
    }
    
    
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        starNameText = new javax.swing.JTextField();
        btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        movieList = new javax.swing.JList<>();
        lbl = new javax.swing.JLabel();
        starLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(178, 178, 178));
        jLabel1.setText("Star Name:");

        starNameText.setBackground(new java.awt.Color(39, 39, 39));
        starNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        starNameText.setForeground(new java.awt.Color(178, 178, 178));
        starNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                starNameTextKeyPressed(evt);
            }
        });

        btn.setBackground(new java.awt.Color(28, 28, 28));
        btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn.setForeground(new java.awt.Color(178, 178, 178));
        btn.setText("Enter");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        movieList.setBackground(new java.awt.Color(39, 39, 39));
        movieList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movieList.setForeground(new java.awt.Color(178, 178, 178));
        jScrollPane1.setViewportView(movieList);

        lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl.setForeground(new java.awt.Color(15, 157, 88));
        lbl.setText("MOVIE TITLES");

        starLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        starLbl.setForeground(new java.awt.Color(178, 178, 178));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(starNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(starLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(starLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        try
        {
            String name = starNameText.getText();
            if (name.isBlank() || name.isEmpty())
                throw new InvalidInputException();
            Star star = dataService.getStarByStarName(name);
            if (star == null)
                throw new InvalidInputException();
            ArrayList<Movie> movies = dataService.getMoviesByStar(star);
            starLbl.setText("["+name+"]");
            showList(movies);
            starNameText.setText(null);
        }
        catch(InvalidInputException e)
        {
            Constant.showMessage("Please fill the all blanks and control the star name from Table.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            starNameText.setText(null);
        }
        
    }//GEN-LAST:event_btnActionPerformed

    private void starNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_starNameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            btnActionPerformed(null);
    }//GEN-LAST:event_starNameTextKeyPressed


  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JList<String> movieList;
    private javax.swing.JLabel starLbl;
    private javax.swing.JTextField starNameText;
    // End of variables declaration//GEN-END:variables
}
