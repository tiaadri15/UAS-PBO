package com.mycompany.GUI;

import com.mycompany.tugas_uas.DatabaseConnection;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        pxtPass.setEchoChar('*');
        pxtConfirmPass.setEchoChar('*');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pxtConfirmPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        pxtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbRegis = new javax.swing.JLabel();
        cbShowPass = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Reservasi Hotel");
        setBackground(new java.awt.Color(245, 245, 245));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel3.setText("HELLO GUEST");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Please login to continue");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 100, -1));

        txtUsername.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtUsername.setBorder(null);
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 320, 30));

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        pxtConfirmPass.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        pxtConfirmPass.setBorder(null);
        getContentPane().add(pxtConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 320, 30));

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        pxtPass.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        pxtPass.setBorder(null);
        getContentPane().add(pxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 320, 30));

        btnLogin.setBackground(new java.awt.Color(255, 215, 0));
        btnLogin.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(51, 51, 51));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 320, 30));

        jLabel8.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Don't have an account?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, -1, -1));

        lbRegis.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        lbRegis.setForeground(new java.awt.Color(51, 51, 51));
        lbRegis.setText("Register now");
        lbRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRegisMouseClicked(evt);
            }
        });
        getContentPane().add(lbRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, -1));

        cbShowPass.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        cbShowPass.setForeground(new java.awt.Color(51, 51, 51));
        cbShowPass.setText("Show Password");
        cbShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPassActionPerformed(evt);
            }
        });
        getContentPane().add(cbShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        jPanel1.setMaximumSize(new java.awt.Dimension(450, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 600));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gerson-repreza-CepDpEiALqM-unsplash.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 610);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    private void cbShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPassActionPerformed
        if (cbShowPass.isSelected()){
            pxtPass.setEchoChar((char)0);
            pxtConfirmPass.setEchoChar((char)0);
        } else {
            pxtPass.setEchoChar('*');
            pxtConfirmPass.setEchoChar('*');
        }
    }//GEN-LAST:event_cbShowPassActionPerformed

    private void lbRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRegisMouseClicked
        this.setVisible(false);
        Regis regis = new Regis();
        regis.setVisible(true);
    }//GEN-LAST:event_lbRegisMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked

    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsername.getText();
        String pass = pxtPass.getText();
        String confirm_pass = pxtConfirmPass.getText();
        
        if (username.equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan masukkan username");
            txtUsername.requestFocus();
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan masukkan password");
            pxtPass.requestFocus();
        } else if (!pass.equals(confirm_pass)) {
            JOptionPane.showMessageDialog(null, "Confirm Password tidak sesuai, Silahkan masukkan password yang benar");
            pxtConfirmPass.requestFocus();
        } else {
            String query = "SELECT * FROM akun WHERE uname = ? AND pwd = ?";
    
            try (Connection conn = DatabaseConnection.configDB();
                PreparedStatement stmt = conn.prepareStatement(query)) {
                
                stmt.setString(1, username);
                stmt.setString(2, pass);

                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        if (username.equals("admin") && pass.equals("admin123")){
                            JOptionPane.showMessageDialog(null, "Login Berhasil " + username);
                            dispose();
                            AdminMenu AM = new AdminMenu();
                            AM.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Login Berhasil " + username);
                            dispose();
                            int id_akun = rs.getInt("id_akun");
                            UserMenu UM = new UserMenu(id_akun, username);
                            UM.setVisible(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Login Gagal: Nama pengguna atau kata sandi salah.");
                        txtUsername.requestFocus();
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error, Silahkan coba lagi!" + e.getMessage());
                txtUsername.setText("");
                pxtPass.setText("");
                pxtConfirmPass.setText("");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbRegis;
    private javax.swing.JPasswordField pxtConfirmPass;
    private javax.swing.JPasswordField pxtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
