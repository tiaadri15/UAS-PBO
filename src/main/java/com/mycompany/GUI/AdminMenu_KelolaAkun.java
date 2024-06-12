package com.mycompany.GUI;

import com.mycompany.tugas_uas.DatabaseConnection;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminMenu_KelolaAkun extends javax.swing.JFrame {
    private String user;
    public  Integer id_akun;
    public String first_name, last_name, email, room_type, phone, address, city, formattedCheckIn, formattedCheckOut;
    public Integer adult, children, rsv;
    public LocalDate rsv_date;
    
    public AdminMenu_KelolaAkun() {
        initComponents();
        loadDataToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelKamar = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnBeranda = new javax.swing.JButton();
        btnDataAkun = new javax.swing.JButton();
        btnRiwayatRsv = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDataPengguna = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 600));
        setMinimumSize(new java.awt.Dimension(950, 610));
        setPreferredSize(new java.awt.Dimension(950, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelKamar.setBackground(new java.awt.Color(0, 51, 102));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N

        btnBeranda.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        btnBeranda.setForeground(new java.awt.Color(245, 245, 245));
        btnBeranda.setText("Beranda");
        btnBeranda.setBorderPainted(false);
        btnBeranda.setContentAreaFilled(false);
        btnBeranda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBeranda.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBeranda.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnBeranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBerandaMouseClicked(evt);
            }
        });

        btnDataAkun.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        btnDataAkun.setForeground(new java.awt.Color(245, 245, 245));
        btnDataAkun.setText("Data Akun");
        btnDataAkun.setBorderPainted(false);
        btnDataAkun.setContentAreaFilled(false);
        btnDataAkun.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDataAkun.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnDataAkun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDataAkunMouseClicked(evt);
            }
        });

        btnRiwayatRsv.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        btnRiwayatRsv.setForeground(new java.awt.Color(245, 245, 245));
        btnRiwayatRsv.setText("Riwayat Reservasi");
        btnRiwayatRsv.setBorderPainted(false);
        btnRiwayatRsv.setContentAreaFilled(false);
        btnRiwayatRsv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRiwayatRsv.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnRiwayatRsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRiwayatRsvMouseClicked(evt);
            }
        });
        btnRiwayatRsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatRsvActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(245, 245, 245));
        btnKeluar.setText("Keluar");
        btnKeluar.setBorderPainted(false);
        btnKeluar.setContentAreaFilled(false);
        btnKeluar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKeluar.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
        });
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKamarLayout = new javax.swing.GroupLayout(panelKamar);
        panelKamar.setLayout(panelKamarLayout);
        panelKamarLayout.setHorizontalGroup(
            panelKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBeranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDataAkun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRiwayatRsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelKamarLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel25)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        panelKamarLayout.setVerticalGroup(
            panelKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKamarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel25)
                .addGap(53, 53, 53)
                .addComponent(btnBeranda)
                .addGap(18, 18, 18)
                .addComponent(btnDataAkun)
                .addGap(18, 18, 18)
                .addComponent(btnRiwayatRsv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(btnKeluar)
                .addGap(64, 64, 64))
        );

        getContentPane().add(panelKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 620));

        tbDataPengguna.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        tbDataPengguna.setForeground(new java.awt.Color(51, 51, 51));
        tbDataPengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID AKUN", "NAMA DEPAN", "NAMA BELAKANG", "EMAIL", "USERNAME", "PASSWORD"
            }
        ));
        tbDataPengguna.setGridColor(new java.awt.Color(0, 0, 0));
        tbDataPengguna.setSelectionBackground(new java.awt.Color(255, 215, 0));
        tbDataPengguna.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tbDataPengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataPenggunaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDataPengguna);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 590, 360));

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DATA AKUN PENGGUNA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        btnUbah.setBackground(new java.awt.Color(255, 215, 0));
        btnUbah.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(51, 51, 51));
        btnUbah.setText("Ubah");
        btnUbah.setBorder(null);
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahMouseClicked(evt);
            }
        });
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 160, 30));

        btnHapus1.setBackground(new java.awt.Color(255, 215, 0));
        btnHapus1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnHapus1.setForeground(new java.awt.Color(51, 51, 51));
        btnHapus1.setText("Hapus");
        btnHapus1.setBorder(null);
        btnHapus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapus1MouseClicked(evt);
            }
        });
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 160, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseClicked
        dispose();
        AdminMenu AM;
        try {
            AM = new AdminMenu();
            AM.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminMenu_KelolaAkun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBerandaMouseClicked

    private void btnDataAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataAkunMouseClicked
        dispose();
        AdminMenu_KelolaAkun AMKA = new AdminMenu_KelolaAkun();
        AMKA.setVisible(true);
    }//GEN-LAST:event_btnDataAkunMouseClicked

    private void btnRiwayatRsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRiwayatRsvMouseClicked
        dispose();
        AdminMenu_RiwayatReservasi AMRR = new AdminMenu_RiwayatReservasi();
        AMRR.setVisible(true);
    }//GEN-LAST:event_btnRiwayatRsvMouseClicked

    private void btnRiwayatRsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatRsvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRiwayatRsvActionPerformed

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnKeluarMouseClicked

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void tbDataPenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataPenggunaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDataPenggunaMouseClicked

    private void btnUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseClicked
        int selectedIndex = tbDataPengguna.getSelectedRow();
        if (selectedIndex != -1) {
            int akunId = Integer.parseInt(tbDataPengguna.getValueAt(selectedIndex, 0).toString());
            int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data dengan ID Reservasi " + akunId + "?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    dispose();
                    AdminMenu_UbahData AMUD = new AdminMenu_UbahData(akunId);
                    AMUD.setVisible(true);
                }       
        }
        
        
    }//GEN-LAST:event_btnUbahMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapus1MouseClicked
        deleteData();
    }//GEN-LAST:event_btnHapus1MouseClicked

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapus1ActionPerformed
    
    private void loadDataToTable() {
        DefaultTableModel model = (DefaultTableModel) tbDataPengguna.getModel();
        model.setRowCount(0); // Bersihkan tabel sebelum memuat data baru

        String query = "SELECT * FROM akun";

        try (Connection conn = DatabaseConnection.configDB();
             PreparedStatement pst = conn.prepareStatement(query)) {

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Integer id_akun = rs.getInt("id_akun");
                    String first_name = rs.getString("first_name");
                    String last_name = rs.getString("last_name");
                    String email = rs.getString("email");
                    String uname = rs.getString("uname");
                    String pass = rs.getString("pwd");

                    // Tambahkan data ke model tabel
                    model.addRow(new Object[]{id_akun, first_name, last_name, email, uname, pass});
                }
            }

        } catch (SQLException e) {
            // Tampilkan pesan error yang lebih spesifik
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }
    }
    
    
    private void deleteData() {
        int selectedIndex = tbDataPengguna.getSelectedRow();
        if (selectedIndex != -1) {
            int akunId = Integer.parseInt(tbDataPengguna.getValueAt(selectedIndex, 0).toString());
            int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data dengan ID Akun " + akunId + "?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    String query = "DELETE FROM akun WHERE id_akun = ?";
                    try (Connection conn = DatabaseConnection.configDB();
                        PreparedStatement pstmt = conn.prepareStatement(query)) {
                        pstmt.setInt(1, akunId);
                        int rowsAffected = pstmt.executeUpdate();
                            if (rowsAffected > 0) {
                                DefaultTableModel model = (DefaultTableModel) tbDataPengguna.getModel();
                                model.removeRow(selectedIndex);
                                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                JOptionPane.showMessageDialog(this, "Gagal menghapus data dari database", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                    } catch (SQLException ex) {
                        Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }

    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminMenu_KelolaAkun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnDataAkun;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnRiwayatRsv;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelKamar;
    public static javax.swing.JTable tbDataPengguna;
    // End of variables declaration//GEN-END:variables
}
