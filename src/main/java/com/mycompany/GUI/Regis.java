package com.mycompany.GUI;

import com.mycompany.tugas_uas.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Regis extends javax.swing.JFrame {

    public Regis() {
        initComponents();
        
        pxtPass.setEchoChar('*');
        pxtConfirmPass.setEchoChar('*');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pxtConfirmPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        pxtPass = new javax.swing.JPasswordField();
        btnRegis = new javax.swing.JButton();
        cbShowPass = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Reservasi Hotel");
        setBackground(new java.awt.Color(245, 245, 245));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 610));
        setPreferredSize(new java.awt.Dimension(900, 610));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(450, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 600));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gerson-repreza-CepDpEiALqM-unsplash.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 610);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel3.setText("REGISTRATION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("First Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        txtFirstName.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtFirstName.setBorder(null);
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 321, 30));

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        pxtConfirmPass.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        pxtConfirmPass.setBorder(null);
        getContentPane().add(pxtConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 321, 29));

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        pxtPass.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        pxtPass.setBorder(null);
        getContentPane().add(pxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 321, 29));

        btnRegis.setBackground(new java.awt.Color(255, 215, 0));
        btnRegis.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnRegis.setForeground(new java.awt.Color(51, 51, 51));
        btnRegis.setText("Register");
        btnRegis.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegis.setMaximumSize(new java.awt.Dimension(35, 17));
        btnRegis.setMinimumSize(new java.awt.Dimension(35, 17));
        btnRegis.setPreferredSize(new java.awt.Dimension(35, 17));
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 321, 30));

        cbShowPass.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        cbShowPass.setForeground(new java.awt.Color(51, 51, 51));
        cbShowPass.setText("Show Password");
        cbShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPassActionPerformed(evt);
            }
        });
        getContentPane().add(cbShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Last Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        txtLastName.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtLastName.setBorder(null);
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 321, 30));

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Username");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        txtUsername.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtUsername.setBorder(null);
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 321, 30));

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        txtEmail.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtEmail.setBorder(null);
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 321, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_back_20px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPassActionPerformed
         if (cbShowPass.isSelected()){
            pxtPass.setEchoChar((char)0);
            pxtConfirmPass.setEchoChar((char)0);
        } else {
            pxtPass.setEchoChar('*');
            pxtConfirmPass.setEchoChar('*');
        }
    }//GEN-LAST:event_cbShowPassActionPerformed

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        String first_name = txtFirstName.getText();
        String last_name = txtLastName.getText();
        String email = txtEmail.getText();
        String username = txtUsername.getText();
        String pass = String.valueOf(pxtPass.getPassword());
        String confirm_pass = String.valueOf(pxtConfirmPass.getPassword());
        
        //Error Handling
        if (first_name.equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan masukkan nama depan");
            txtFirstName.requestFocus();
        } else if (last_name.equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan masukkan nama belakang");
            txtLastName.requestFocus();
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan masukkan email");
            txtEmail.requestFocus();
        } else if (username.equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan masukkan username");
            txtUsername.requestFocus();
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan masukkan password");
            pxtPass.requestFocus();
        } else if (!pass.equals(confirm_pass)) {
            JOptionPane.showMessageDialog(null, "Confirm Password tidak sesuai, Silahkan masukkan password yang benar");
            pxtConfirmPass.requestFocus();
        } else {
        
            PreparedStatement pst;
            String query = "INSERT INTO akun (first_name, last_name, email, uname, pwd) VALUES (?, ?, ?, ?, ?)";
        
            try {
                pst = DatabaseConnection.configDB().prepareStatement(query);
            
                pst.setString(1, first_name);
                pst.setString(2, last_name);
                pst.setString(3, email);
                pst.setString(4, username);
                pst.setString(5, pass);
            
                if (pst.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Registrasi berhasil, Silahkan login untuk melanjutkan");
                    dispose();
                    Login login = new Login();
                    login.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Regis.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRegisActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Regis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegis;
    private javax.swing.JCheckBox cbShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pxtConfirmPass;
    private javax.swing.JPasswordField pxtPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
