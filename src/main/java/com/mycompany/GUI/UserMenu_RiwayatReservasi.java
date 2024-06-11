package com.mycompany.GUI;

import com.mycompany.tugas_uas.DatabaseConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserMenu_RiwayatReservasi extends javax.swing.JFrame {
    private String user;
    public  Integer id_akun;
    
    public String first_name, last_name, email, room_type, phone, address, city, formattedCheckIn, formattedCheckOut;
    public Integer adult, children;
    public LocalDate rsv_date;
    
    public UserMenu_RiwayatReservasi(Integer id_akunLoad, String user) {
        this.user = user;
        initComponents();
        loadDataToTable(id_akunLoad);
        this.id_akun = id_akunLoad;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRsvHistory = new javax.swing.JTable();
        panelKamar = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnBeranda = new javax.swing.JButton();
        btnKamar = new javax.swing.JButton();
        btnRiwayatRsv = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnReservasi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Reservasi Hotel");
        setBackground(new java.awt.Color(245, 245, 245));
        setMaximumSize(new java.awt.Dimension(950, 610));
        setMinimumSize(new java.awt.Dimension(950, 610));
        setPreferredSize(new java.awt.Dimension(950, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("RIWAYAT RESERVASI");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        tbRsvHistory.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        tbRsvHistory.setForeground(new java.awt.Color(51, 51, 51));
        tbRsvHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "EMAIL", "PHONE", "DATE", "ROOM TYPE", "CHECK IN", "CHECK OUT"
            }
        ));
        tbRsvHistory.setGridColor(new java.awt.Color(0, 0, 0));
        tbRsvHistory.setSelectionBackground(new java.awt.Color(255, 215, 0));
        tbRsvHistory.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tbRsvHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRsvHistoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbRsvHistory);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 580, 470));

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

        btnKamar.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        btnKamar.setForeground(new java.awt.Color(245, 245, 245));
        btnKamar.setText("Kamar");
        btnKamar.setBorderPainted(false);
        btnKamar.setContentAreaFilled(false);
        btnKamar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKamar.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKamarMouseClicked(evt);
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

        btnReservasi.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        btnReservasi.setForeground(new java.awt.Color(245, 245, 245));
        btnReservasi.setText("Reservasi Kamar");
        btnReservasi.setBorderPainted(false);
        btnReservasi.setContentAreaFilled(false);
        btnReservasi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReservasi.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnReservasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservasiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelKamarLayout = new javax.swing.GroupLayout(panelKamar);
        panelKamar.setLayout(panelKamarLayout);
        panelKamarLayout.setHorizontalGroup(
            panelKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBeranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKamar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRiwayatRsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelKamarLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel25)
                .addContainerGap(93, Short.MAX_VALUE))
            .addComponent(btnReservasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelKamarLayout.setVerticalGroup(
            panelKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKamarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel25)
                .addGap(53, 53, 53)
                .addComponent(btnBeranda)
                .addGap(18, 18, 18)
                .addComponent(btnKamar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReservasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRiwayatRsv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(btnKeluar)
                .addGap(64, 64, 64))
        );

        getContentPane().add(panelKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbRsvHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRsvHistoryMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tbRsvHistoryMouseClicked

    private void btnBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseClicked
        dispose();
        
        UserMenu UM = new UserMenu(id_akun, user);
        UM.setVisible(true);
    }//GEN-LAST:event_btnBerandaMouseClicked

    private void btnKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKamarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKamarMouseClicked

    private void btnRiwayatRsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRiwayatRsvMouseClicked
        dispose();
        UserMenu_RiwayatReservasi UMRR = new UserMenu_RiwayatReservasi(id_akun, user);
        UMRR.setVisible(true);
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

    private void btnReservasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasiMouseClicked

    }//GEN-LAST:event_btnReservasiMouseClicked
    
    // Metode untuk mengambil data dari basis data dan menampilkannya ada tabel
    private void loadDataToTable(Integer id_akunLoad) {
        DefaultTableModel model = (DefaultTableModel) tbRsvHistory.getModel();
        model.setRowCount(0); // Bersihkan tabel sebelum memuat data baru

        String query = "SELECT CONCAT(first_name, ' ', last_name) AS full_name, email, phone, rsv_date, check_in, check_out, room_type FROM reservation WHERE id_akun = ?";

        try (Connection conn = DatabaseConnection.configDB();
             PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setInt(1, id_akunLoad);
            
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String fullName = rs.getString("full_name");
                    String email = rs.getString("email");
                    String phone = rs.getString("phone");
                    Date rsvDate = rs.getDate("rsv_date");
                    Date checkInDate = rs.getDate("check_in");
                    Date checkOutDate = rs.getDate("check_out");
                    String roomType = rs.getString("room_type");

                    // Tambahkan data ke model tabel
                    model.addRow(new Object[]{fullName, email, phone, rsvDate, roomType, checkInDate, checkOutDate});
                }
            }

        } catch (SQLException e) {
            // Tampilkan pesan error yang lebih spesifik
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserMenu_RiwayatReservasi(null, "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnKamar;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReservasi;
    private javax.swing.JButton btnRiwayatRsv;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelKamar;
    private javax.swing.JTable tbRsvHistory;
    // End of variables declaration//GEN-END:variables
}
