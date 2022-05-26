package com.company.GUI;

import com.company.Constants.Constant;
import com.company.Exceptions.InvalidInputException;
import com.company.Service.IDataService;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SignUpPanel extends javax.swing.JPanel 
{

    private JPanel loginPanel;
    private IDataService dataService;
        
    public SignUpPanel(JPanel loginPanel, IDataService dataService) 
    {
        this.dataService = dataService;
        this.loginPanel = loginPanel;
    
        initComponents();
        setBounds(0, 0, 637, 568);
    }
    

    private void clearTexts()
    {
        fullNameText.setText(null);
        usernameText.setText(null);
    }
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fullNameText = new javax.swing.JTextField();
        enterBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(28, 28, 28));
        setPreferredSize(new java.awt.Dimension(637, 568));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(178, 178, 178));
        jLabel1.setText("Username:");

        usernameText.setBackground(new java.awt.Color(39, 39, 39));
        usernameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernameText.setForeground(new java.awt.Color(178, 178, 178));
        usernameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(178, 178, 178));
        jLabel2.setText("Full Name:");

        fullNameText.setBackground(new java.awt.Color(39, 39, 39));
        fullNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fullNameText.setForeground(new java.awt.Color(178, 178, 178));

        enterBtn.setBackground(new java.awt.Color(28, 28, 28));
        enterBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        enterBtn.setForeground(new java.awt.Color(178, 178, 178));
        enterBtn.setText("Enter");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(28, 28, 28));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(178, 178, 178));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameText, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(fullNameText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterBtn)
                        .addGap(258, 258, 258))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backBtn, enterBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fullNameText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameText)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enterBtn)
                .addGap(181, 181, 181)
                .addComponent(backBtn)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backBtn, enterBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        loginPanel.setVisible(true);
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
       try
       {
           String fullName = fullNameText.getText();
           String username = usernameText.getText();
           
           if (fullName.isBlank() || username.isBlank() || fullName.isEmpty() || username.isEmpty())
               throw new InvalidInputException();
           dataService.addUser(fullName,username);
           clearTexts();
       }
       catch(InvalidInputException e)
       {
           Constant.showMessage(e.getMessage(), "Invalid Informations", JOptionPane.ERROR_MESSAGE);
           clearTexts();
       }
       
    }//GEN-LAST:event_enterBtnActionPerformed

    private void usernameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            enterBtnActionPerformed(null);
    }//GEN-LAST:event_usernameTextKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton enterBtn;
    private javax.swing.JTextField fullNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
