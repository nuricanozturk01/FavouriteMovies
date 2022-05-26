package com.company.GUI;

import com.company.Constants.Constant;
import com.company.Entities.Star;
import com.company.Exceptions.InvalidInputException;
import com.company.Service.IDataService;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class AddStarScreen extends javax.swing.JFrame 
{

    private JTable starTable;
    private IDataService service;
    
    public AddStarScreen(IDataService service,JTable starTable) 
    {
        this.starTable  =starTable;
        this.service = service;
        initComponents();
        setResizable(false);
        setTitle("Add Star Screen");
    }

 
    private void clearTexts()
    {
        fullNameText.setText(null);
    }
    
    
   

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        fullNameText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 157, 88));
        jLabel1.setText("Full Name");

        addBtn.setBackground(new java.awt.Color(28, 28, 28));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(178, 178, 178));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        fullNameText.setBackground(new java.awt.Color(39, 39, 39));
        fullNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fullNameText.setForeground(new java.awt.Color(178, 178, 178));
        fullNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fullNameTextKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBtn)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try
        {
            String fullname = fullNameText.getText();
            
            if (fullname.isBlank() || fullname.isEmpty())
                throw new InvalidInputException();

            Star star = new Star(fullname);
            service.addStar(star);
            service.updateStarTable(starTable);
            Constant.showMessage(fullname+" inserted successfully! Now, you can insert movies to star in \"Add Movie to Star\" section in Main Screen",
                    "Success",JOptionPane.INFORMATION_MESSAGE);
            fullNameText.setText(null);
        }
        catch (InvalidInputException ex) 
        {
            Constant.showMessage("Please fill the blanks!","Error",JOptionPane.WARNING_MESSAGE);
            fullNameText.setText(null);
        }
        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void fullNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullNameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            addBtnActionPerformed(null);
    }//GEN-LAST:event_fullNameTextKeyPressed

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField fullNameText;
    private javax.swing.ButtonGroup group;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
