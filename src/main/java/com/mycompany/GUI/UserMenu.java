package com.mycompany.GUI;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserMenu extends javax.swing.JFrame {
    private String user;
    public  Integer id_akun;
    public String first_name, last_name, email, room_type, phone, address, city, formattedCheckIn, formattedCheckOut;
    public Integer adult, children, rsv;
    public LocalDate rsv_date;
    
    public UserMenu(Integer id_akun, String user) {
        initComponents();
        lbUsername.setText(user);
        this.id_akun = id_akun;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBeranda = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel26.setText("SELAMAT DATANG");

        lbUsername.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        lbUsername.setText("USERNAME");

        jLabel28.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel28.setText("Selamat datang di Hotel King!");

        jLabel29.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel29.setText("Kami senang Anda memilih untuk menginap bersama kami.");

        jLabel30.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel30.setText("Silakan gunakan sistem reservasi kami untuk memesan kamar Anda");

        jLabel31.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel31.setText("dan nikmati pengalaman menginap yang tak terlupakan bersama kami.");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lobby.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBerandaLayout = new javax.swing.GroupLayout(panelBeranda);
        panelBeranda.setLayout(panelBerandaLayout);
        panelBerandaLayout.setHorizontalGroup(
            panelBerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBerandaLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panelBerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addGroup(panelBerandaLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbUsername))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelBerandaLayout.setVerticalGroup(
            panelBerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBerandaLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panelBerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lbUsername))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addGap(101, 101, 101))
        );

        getContentPane().add(panelBeranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 660, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(250, 195));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 195));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 195));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/single room.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 250, 195);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(-20, -20, 610, 580);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jPanel2.setMaximumSize(new java.awt.Dimension(250, 195));
        jPanel2.setMinimumSize(new java.awt.Dimension(250, 195));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 195));
        jPanel2.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/deluxe room.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 250, 195);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/presidential room.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        jPanel3.setMaximumSize(new java.awt.Dimension(250, 195));
        jPanel3.setMinimumSize(new java.awt.Dimension(250, 195));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 250, 195));

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel4.setText("14-23 m².");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_expand_20px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_bedroom_20px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel7.setText("Single Bed");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_wi-fi_20px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel9.setText("Free Wifi");

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel10.setText("SINGLE ROOM");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 240, -1));

        jLabel11.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel11.setText("14-23 m².");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_expand_20px.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_bedroom_20px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel14.setText("Single Bed");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_wi-fi_20px.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel16.setText("Free Wifi");

        jLabel17.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel17.setText("DELUXE ROOM");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel17)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel18.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel18.setText("14-23 m².");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_expand_20px.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_bedroom_20px.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel21.setText("Single Bed");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_wi-fi_20px.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel23.setText("Free Wifi");

        jLabel24.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel24.setText("PRESIDENTIAL ROOM");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel24)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 300, -1));

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

    private void btnBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBerandaMouseClicked

    private void btnKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKamarMouseClicked
        dispose();
        UserMenu_Kamar UMK = new UserMenu_Kamar(id_akun, user);
        UMK.setVisible(true);
    }//GEN-LAST:event_btnKamarMouseClicked

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnKeluarMouseClicked

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnReservasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasiMouseClicked
        try {
            this.setVisible(false);
            HotelReservation HR = new HotelReservation(id_akun, user, first_name, last_name, email, room_type, phone,
            address, city, formattedCheckIn,formattedCheckOut, adult, children, rsv_date);
            HR.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(UserMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReservasiMouseClicked

    private void btnRiwayatRsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatRsvActionPerformed
        dispose();
        UserMenu_RiwayatReservasi UMRR = new UserMenu_RiwayatReservasi(id_akun, user);
        UMRR.setVisible(true);
    }//GEN-LAST:event_btnRiwayatRsvActionPerformed

    private void btnRiwayatRsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRiwayatRsvMouseClicked
        dispose();
        UserMenu_RiwayatReservasi UMRR = new UserMenu_RiwayatReservasi(id_akun, user);
        UMRR.setVisible(true);
    }//GEN-LAST:event_btnRiwayatRsvMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserMenu(null, "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnKamar;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReservasi;
    private javax.swing.JButton btnRiwayatRsv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel panelBeranda;
    private javax.swing.JPanel panelKamar;
    // End of variables declaration//GEN-END:variables
}
