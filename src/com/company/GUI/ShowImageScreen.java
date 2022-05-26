package com.company.GUI;

import com.company.Constants.Constant;
import com.company.Entities.Movie;
import com.company.Exceptions.InvalidInputException;
import com.company.Service.IDataService;
import java.awt.event.KeyEvent;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class ShowImageScreen extends javax.swing.JFrame 
{
    
    private IDataService service;

    public ShowImageScreen(IDataService service)
    {
        this.service = service;
        initComponents();
        setResizable(false);
        setTitle("Show Image Screen");
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        movieID = new javax.swing.JTextField();
        enterBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(178, 178, 178));
        jLabel1.setText("Movie ID:");

        movieID.setBackground(new java.awt.Color(39, 39, 39));
        movieID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movieID.setForeground(new java.awt.Color(178, 178, 178));
        movieID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                movieIDKeyPressed(evt);
            }
        });

        enterBtn.setBackground(new java.awt.Color(28, 28, 28));
        enterBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        enterBtn.setForeground(new java.awt.Color(178, 178, 178));
        enterBtn.setText("Enter");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(movieID, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(enterBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enterBtn)
                .addContainerGap(122, Short.MAX_VALUE))
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

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        try
        {
            int id = Integer.parseInt(movieID.getText());
            Movie movie = service.getMovieByID(id);
            if (movie == null)
                throw new InvalidInputException();
            image.setIcon(new ImageIcon(Constant.DESTINATION_PATH+"Poster_"+id+".jpg"));
            movieID.setText(null);
        }
        catch (InvalidInputException ex) 
        {
            Constant.showMessage("Please Enter the exists movie ıd!", "Movie does not exists", JOptionPane.WARNING_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            Constant.showMessage("Please Enter the number", "Number format exception", JOptionPane.WARNING_MESSAGE);
        } 
        
    }//GEN-LAST:event_enterBtnActionPerformed

    private void movieIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_movieIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            enterBtnActionPerformed(null);
    }//GEN-LAST:event_movieIDKeyPressed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterBtn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField movieID;
    // End of variables declaration//GEN-END:variables
}
