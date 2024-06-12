package com.mycompany.GUI;

import com.mycompany.tugas_uas.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminMenu extends javax.swing.JFrame {
    private String user;
    public  Integer id_akun;
    public String first_name, last_name, email, room_type, phone, address, city, formattedCheckIn, formattedCheckOut;
    public Integer adult, children, rsv;
    public LocalDate rsv_date;
    
    LocalDate tanggal = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy");
    String formattedDate = tanggal.format(formatter);
    
    PreparedStatement pst;
    Connection conn  = DatabaseConnection.configDB();
    
    public AdminMenu() throws SQLException {
        initComponents();
        this.tanggal = tanggal;
        lbTanggal.setText(formattedDate);
        getJumlahPengguna();
        getJumlahReservasi();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbJmlAkun = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbJmlRsv = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbTanggal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
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

        jPanel1.setBackground(new java.awt.Color(255, 215, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(216, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(216, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_people_50px.png"))); // NOI18N

        lbJmlAkun.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        lbJmlAkun.setForeground(new java.awt.Color(51, 51, 51));
        lbJmlAkun.setText("999");

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel4.setText("JUMLAH AKUN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbJmlAkun)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbJmlAkun)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 210, 100));

        jPanel2.setBackground(new java.awt.Color(255, 215, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_event_accepted_50px.png"))); // NOI18N

        lbJmlRsv.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        lbJmlRsv.setForeground(new java.awt.Color(51, 51, 51));
        lbJmlRsv.setText("999");

        jLabel3.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel3.setText("JUMLAH RESERVASI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbJmlRsv))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbJmlRsv)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, 100));

        jLabel5.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Admin");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, 30));

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("SELAMAT DATANG ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("_______________________________________________________________________");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 560, -1));

        lbTanggal.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        lbTanggal.setForeground(new java.awt.Color(51, 51, 51));
        lbTanggal.setText("Tanggal Hari Ini");
        lbTanggal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 150, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseClicked
        dispose();
        UserMenu UM = new UserMenu(id_akun, user);
        UM.setVisible(true);
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
    
    private void getJumlahPengguna() throws SQLException{
        try {
            pst = conn.prepareStatement("SELECT COUNT(*) AS jumlah_pengguna FROM akun");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                int jumlah = rs.getInt("jumlah_pengguna");
                lbJmlAkun.setText(String.valueOf(jumlah));
        
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }
    }
    
    private void getJumlahReservasi(){
        try {
            pst = conn.prepareStatement("SELECT COUNT(*) AS jumlah_reservasi FROM reservation");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                int jumlah = rs.getInt("jumlah_reservasi");
                lbJmlRsv.setText(String.valueOf(jumlah));
        
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new AdminMenu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnDataAkun;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnRiwayatRsv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbJmlAkun;
    private javax.swing.JLabel lbJmlRsv;
    private javax.swing.JLabel lbTanggal;
    private javax.swing.JPanel panelKamar;
    // End of variables declaration//GEN-END:variables
}
