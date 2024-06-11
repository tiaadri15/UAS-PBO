package com.mycompany.GUI;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mycompany.tugas_uas.DatabaseConnection;
import java.sql.Connection;

public class AdminMenu_UbahData extends javax.swing.JFrame {
    Integer akunId;
    Connection conn;

    public AdminMenu_UbahData(Integer akunId) {
        initComponents();
        this.akunId = akunId;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 531));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel14.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(245, 245, 245));
        jLabel14.setText("UBAH DATA PENGGUNA");

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("First Name");

        txtFirstName.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtFirstName.setBorder(null);

        btnUbah.setBackground(new java.awt.Color(255, 215, 0));
        btnUbah.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(51, 51, 51));
        btnUbah.setText("Ubah Data");
        btnUbah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUbah.setMaximumSize(new java.awt.Dimension(35, 17));
        btnUbah.setMinimumSize(new java.awt.Dimension(35, 17));
        btnUbah.setPreferredSize(new java.awt.Dimension(35, 17));
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 245, 245));
        jLabel8.setText("Last Name");

        txtLastName.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtLastName.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(245, 245, 245));
        jLabel10.setText("Email");

        txtEmail.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtEmail.setBorder(null);

        btnKembali.setBackground(new java.awt.Color(255, 215, 0));
        btnKembali.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(51, 51, 51));
        btnKembali.setText("Kembali");
        btnKembali.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKembali.setMaximumSize(new java.awt.Dimension(35, 17));
        btnKembali.setMinimumSize(new java.awt.Dimension(35, 17));
        btnKembali.setPreferredSize(new java.awt.Dimension(35, 17));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel14)
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        editData();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        dispose();
        AdminMenu_KelolaAkun AMKA = new AdminMenu_KelolaAkun();
        AMKA.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed
    
    private void editData() {
        try{
            PreparedStatement pst;
            conn = DatabaseConnection.configDB();
            String first_name, last_name, email;
            
            first_name = txtFirstName.getText();
            last_name = txtLastName.getText();
            email = txtEmail.getText();
            
            if (akunId == null) {
            JOptionPane.showMessageDialog(null, "ID akun tidak valid. Tidak dapat mengubah data.");
            return;
            }
            
            String query = "UPDATE akun SET first_name=?, last_name=?, email=? WHERE id_akun= " + akunId;
            pst = conn.prepareStatement(query);            
            pst.setString(1,first_name);
            pst.setString(2,last_name);
            pst.setString(3,email);
            
            pst.executeUpdate();
            
            int rowsAffected = pst.executeUpdate();
        
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Ubah data reservasi berhasil");

                txtFirstName.setText(" ");
                txtLastName.setText(" ");
                txtEmail.setText(" ");
                
                dispose();
                AdminMenu_KelolaAkun AMKA = new AdminMenu_KelolaAkun();
                AMKA.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Tidak ada data yang diubah");
            }
            
            this.dispose();
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, Silahkan coba lagi!" + e.getMessage());
        } 
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new AdminMenu_UbahData(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
