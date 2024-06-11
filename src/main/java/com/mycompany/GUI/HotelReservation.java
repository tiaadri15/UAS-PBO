package com.mycompany.GUI;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.mycompany.tugas_uas.DatabaseConnection;


public class HotelReservation extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    String user;
    Integer id_akun;
    
    public String first_name, last_name, email, room_type, phone, address, city, formattedCheckIn, formattedCheckOut;
    public Integer adult, children;
    public LocalDate rsv_date;
    
    public HotelReservation(Integer id_akun, String user, String first_name, String last_name, String email, String room_type, String phone,
        String formattedCheckIn, String formattedCheckOut,String address, String city, Integer adult, Integer children,
        LocalDate rsv_date) throws SQLException {
        
        DatabaseConnection.configDB();
        initComponents();
        this.setVisible(true);
        
        this.id_akun = id_akun;
        this.user = user;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.room_type = room_type;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.adult = adult;
        this.children = children;
        this.rsv_date = rsv_date;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelKamar = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnBeranda = new javax.swing.JButton();
        btnKamar = new javax.swing.JButton();
        btnRiwayatRsv = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnReservasi1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbAdult = new javax.swing.JComboBox<>();
        txtPhone = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        cbCity = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbChildren = new javax.swing.JComboBox<>();
        dcCheckIn = new com.toedter.calendar.JDateChooser();
        dcCheckOut = new com.toedter.calendar.JDateChooser();
        btnReservasi = new javax.swing.JButton();
        rbSingleRoom = new javax.swing.JRadioButton();
        rbDeluxeRoom = new javax.swing.JRadioButton();
        rbSuiteRoom = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Reservasi Hotel");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(950, 610));
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

        btnReservasi1.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        btnReservasi1.setForeground(new java.awt.Color(245, 245, 245));
        btnReservasi1.setText("Reservasi Kamar");
        btnReservasi1.setBorderPainted(false);
        btnReservasi1.setContentAreaFilled(false);
        btnReservasi1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReservasi1.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnReservasi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservasi1MouseClicked(evt);
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
            .addComponent(btnReservasi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnReservasi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRiwayatRsv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(btnKeluar)
                .addGap(64, 64, 64))
        );

        getContentPane().add(panelKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 610));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Check-out Date");

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Room Type");

        jLabel11.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Adult");

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("City");

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Phone");

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Check-in Date");

        cbAdult.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        cbAdult.setForeground(new java.awt.Color(51, 51, 51));
        cbAdult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbAdult.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbAdult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbAdultMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbAdultMouseExited(evt);
            }
        });
        cbAdult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdultActionPerformed(evt);
            }
        });

        txtPhone.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(51, 51, 51));
        txtPhone.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPhoneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPhoneMouseExited(evt);
            }
        });
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtLastName.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(51, 51, 51));
        txtLastName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtLastNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLastNameMouseExited(evt);
            }
        });
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(51, 51, 51));
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEmailMouseExited(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(51, 51, 51));
        txtAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAddressMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAddressMouseExited(evt);
            }
        });
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtFirstName.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(51, 51, 51));
        txtFirstName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFirstNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFirstNameMouseExited(evt);
            }
        });
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyPressed(evt);
            }
        });

        cbCity.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        cbCity.setForeground(new java.awt.Color(51, 51, 51));
        cbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jakarta", "Surabaya", "Kediri", "Sumbawa ", "Samarinda ", "Balikpapan" }));
        cbCity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbCityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbCityMouseExited(evt);
            }
        });
        cbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCityActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel12.setText("Children");

        cbChildren.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        cbChildren.setForeground(new java.awt.Color(51, 51, 51));
        cbChildren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        cbChildren.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbChildren.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbChildrenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbChildrenMouseExited(evt);
            }
        });
        cbChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChildrenActionPerformed(evt);
            }
        });

        dcCheckIn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dcCheckIn.setForeground(new java.awt.Color(51, 51, 51));
        dcCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dcCheckInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dcCheckInMouseExited(evt);
            }
        });

        dcCheckOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dcCheckOut.setForeground(new java.awt.Color(51, 51, 51));
        dcCheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dcCheckOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dcCheckOutMouseExited(evt);
            }
        });

        btnReservasi.setBackground(new java.awt.Color(255, 215, 0));
        btnReservasi.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnReservasi.setForeground(new java.awt.Color(51, 51, 51));
        btnReservasi.setText("Reservasi");
        btnReservasi.setBorder(null);
        btnReservasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSingleRoom);
        rbSingleRoom.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        rbSingleRoom.setForeground(new java.awt.Color(51, 51, 51));
        rbSingleRoom.setText("Single Room");
        rbSingleRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbSingleRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbSingleRoomMouseEntered(evt);
            }
        });

        buttonGroup1.add(rbDeluxeRoom);
        rbDeluxeRoom.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        rbDeluxeRoom.setForeground(new java.awt.Color(51, 51, 51));
        rbDeluxeRoom.setText("Deluxe Room");
        rbDeluxeRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(rbSuiteRoom);
        rbSuiteRoom.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        rbSuiteRoom.setForeground(new java.awt.Color(51, 51, 51));
        rbSuiteRoom.setText("Suite Room");
        rbSuiteRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("HOTEL RESERVATION SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbSingleRoom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbDeluxeRoom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbSuiteRoom))
                            .addComponent(dcCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addComponent(txtPhone)
                            .addComponent(txtEmail)
                            .addComponent(txtLastName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbAdult, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(cbChildren, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel14))
                    .addComponent(btnReservasi, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dcCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbSingleRoom)
                        .addComponent(rbDeluxeRoom)
                        .addComponent(rbSuiteRoom)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAdult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(cbChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnReservasi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 660, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChildrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChildrenActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void cbAdultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdultActionPerformed

    private void cbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCityActionPerformed
   
    // Metode untuk tambah reservasi kedalam tabel dan basis data
    private void btnReservasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasiActionPerformed
        // TODO add your handling code here:
        try {
            try {
            conn = DatabaseConnection.configDB();
            // gunakan conn di sini
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal membuat reservasi: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }   
            rsv_date = LocalDate.now();
            
            first_name = txtFirstName.getText();
            last_name = txtLastName.getText();
            email = txtEmail.getText();
            phone = txtPhone.getText();
            if (phone.length() > 15) {  
                throw new IllegalArgumentException("Nomor telepon terlalu panjang");
            }
            address = txtAddress.getText();
            city = cbCity.getSelectedItem().toString();
            room_type = getSelectedRoomType();
            adult = Integer.valueOf(cbAdult.getSelectedItem().toString());
            children = Integer.valueOf(cbChildren.getSelectedItem().toString());
            
            final String formattanggal = "yyyy-MM-dd";
            SimpleDateFormat sdf = new SimpleDateFormat(formattanggal);
            formattedCheckIn = sdf.format(dcCheckIn.getDate());
            formattedCheckOut = sdf.format(dcCheckOut.getDate());

            pst = conn.prepareStatement("insert into reservation (id_akun, first_name, last_name, email, "
                    + "phone, address, city, rsv_date, check_in, check_out, room_type, adult,"
                    + " children) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            pst.setInt(1,id_akun);
            pst.setString(2,first_name);
            pst.setString(3,last_name);
            pst.setString(4,email);
            pst.setString(5,phone);
            pst.setString(6,address);
            pst.setString(7,city);
            pst.setObject(8, rsv_date);
            pst.setObject(9, formattedCheckIn);
            pst.setObject(10, formattedCheckOut);
            pst.setString(11, room_type);
            pst.setInt(12,adult);
            pst.setInt(13,children);
            
            pst.executeUpdate();
            
            int result = JOptionPane.showConfirmDialog(this, "Reservasi berhasil", "Pemberitahuan", JOptionPane.YES_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                dispose();
                UserMenu_ReservationProof UMRP = new UserMenu_ReservationProof(id_akun, first_name, last_name, email, room_type, phone,
                formattedCheckIn, formattedCheckOut, address, city, adult, children, rsv_date);
                UMRP.setVisible(true);
            }

            txtFirstName.setText(" ");
            txtLastName.setText(" ");
            txtEmail.setText(" ");
            txtPhone.setText(" ");
            txtAddress.setText(" ");
            cbCity.setSelectedIndex(0);
            clearRadioButtons();
            dcCheckIn.setDate(null);
            dcCheckOut.setDate(null);
            cbAdult.setSelectedIndex(0);
            cbChildren.setSelectedIndex(0);
            
            txtFirstName.requestFocus();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, Silahkan coba lagi! " + e.getMessage());
        } 
    }//GEN-LAST:event_btnReservasiActionPerformed
    
    //Metode untuk warna inputan
    private void txtFirstNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameMouseEntered

    private void txtFirstNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstNameMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtFirstNameMouseExited

    private void txtLastNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameMouseEntered

    private void txtLastNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastNameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameMouseExited

    private void txtEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailMouseEntered

    private void txtEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailMouseExited

    private void txtPhoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneMouseEntered

    private void txtPhoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneMouseExited

    }//GEN-LAST:event_txtPhoneMouseExited

    private void txtAddressMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressMouseEntered

    private void txtAddressMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressMouseExited

    private void cbCityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCityMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCityMouseEntered

    private void cbCityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCityMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCityMouseExited

    private void dcCheckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcCheckInMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dcCheckInMouseEntered

    private void dcCheckInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcCheckInMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dcCheckInMouseExited

    private void dcCheckOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcCheckOutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dcCheckOutMouseEntered

    private void dcCheckOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcCheckOutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dcCheckOutMouseExited

    private void rbSingleRoomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbSingleRoomMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSingleRoomMouseEntered

    private void cbAdultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAdultMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdultMouseEntered

    private void cbAdultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAdultMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdultMouseExited

    private void cbChildrenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChildrenMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChildrenMouseEntered
    
    //END WARNA
    private void cbChildrenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChildrenMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChildrenMouseExited
    
   
    
    // Metode untuk mengubah data dari tabel dan basis data
//    private void editData() {
//        int selectedIndex = tbRsvHistory.getSelectedRow();
//        if (selectedIndex == -1) {
//            return;
//        }
//        
//        try{
//            conn = DatabaseConnection.configDB();
//            DefaultTableModel model = (DefaultTableModel) tbRsvHistory.getModel();
//            
//            
//            String first_name, last_name, email, address, city, room_type, phone;
//            int adult, children;
//            LocalDate rsv_date;
//            
//            rsv_date = LocalDate.now();
//            
//            first_name = txtFirstName.getText();
//            last_name = txtLastName.getText();
//            email = txtEmail.getText();
//            phone = txtPhone.getText();
//            if (phone.length() > 15) {  
//                throw new IllegalArgumentException("Nomor telepon terlalu panjang");
//            }
//            address = txtAddress.getText();
//            city = cbCity.getSelectedItem().toString();
//            room_type = getSelectedRoomType();
//            adult = Integer.parseInt(cbAdult.getSelectedItem().toString());
//            children = Integer.parseInt(cbChildren.getSelectedItem().toString());
//            
//            final String formattanggal = "yyyy-MM-dd";
//            SimpleDateFormat sdf = new SimpleDateFormat(formattanggal);
//            String formattedCheckIn = sdf.format(dcCheckIn.getDate());
//            String formattedCheckOut = sdf.format(dcCheckOut.getDate());
//            int reservationId = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
//            
//            int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda ingin megubah data dengan ID Reservasi " + reservationId +"?", "Pemberitahuan ", JOptionPane.YES_NO_OPTION);
//            
//            if (confirm == JOptionPane.YES_OPTION){
//            pst = conn.prepareStatement("UPDATE reservation SET first_name=?, last_name=?, email=?, phone=?, address=?, city=?, rsv_date=?, check_in=?, check_out=?, room_type=?, adult=?, children=? WHERE id_reservation=" + reservationId);
//            pst.setString(1,first_name);
//            pst.setString(2,last_name);
//            pst.setString(3,email);
//            pst.setString(4,phone);
//            pst.setString(5,address);
//            pst.setString(6,city);
//            pst.setObject(7, rsv_date);
//            pst.setObject(8, formattedCheckIn);
//            pst.setObject(9, formattedCheckOut);
//            pst.setString(10, room_type);
//            pst.setInt(11,adult);
//            pst.setInt(12,children);
//            
//            pst.executeUpdate();
//            
//            int result = JOptionPane.showConfirmDialog(this, "Ubah data reservasi berhasil", "Pemberitahuan", JOptionPane.YES_OPTION);
//            if (result == JOptionPane.YES_OPTION) {
//                loadDataToTable();
//                addTableSelectionListener();
//            }
//
//            txtFirstName.setText(" ");
//            txtLastName.setText(" ");
//            txtEmail.setText(" ");
//            txtPhone.setText(" ");
//            txtAddress.setText(" ");
//            cbCity.setSelectedIndex(0);
//            clearRadioButtons();
//            dcCheckIn.setDate(null);
//            dcCheckOut.setDate(null);
//            cbAdult.setSelectedIndex(0);
//            cbChildren.setSelectedIndex(0);
//            
//            txtFirstName.requestFocus();
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//    }
//
//    
//    // Metode untuk menghapus data dari tabel dan basis data
//    private void deleteData() {
//        int selectedIndex = tbRsvHistory.getSelectedRow();
//        if (selectedIndex != -1) {
//            int reservationId = Integer.parseInt(tbRsvHistory.getValueAt(selectedIndex, 0).toString());
//            int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data dengan ID Reservasi " + reservationId + "?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
//
//                if (confirm == JOptionPane.YES_OPTION) {
//                    String query = "DELETE FROM reservation WHERE id_reservation = ?";
//                    try (Connection conn = DatabaseConnection.configDB();
//                        PreparedStatement pstmt = conn.prepareStatement(query)) {
//                        pstmt.setInt(1, reservationId);
//                        int rowsAffected = pstmt.executeUpdate();
//                            if (rowsAffected > 0) {
//                                DefaultTableModel model = (DefaultTableModel) tbRsvHistory.getModel();
//                                model.removeRow(selectedIndex);
//                                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
//                                txtFirstName.setText(" ");
//                                txtLastName.setText(" ");
//                                txtEmail.setText(" ");
//                                txtPhone.setText(" ");
//                                txtAddress.setText(" ");
//                                cbCity.setSelectedIndex(0);
//                                clearRadioButtons();
//                                dcCheckIn.setDate(null);
//                                dcCheckOut.setDate(null);
//                                cbAdult.setSelectedIndex(0);
//                                cbChildren.setSelectedIndex(0);
//            
//                                txtFirstName.requestFocus();
//                            } else {
//                                JOptionPane.showMessageDialog(this, "Gagal menghapus data dari database", "Error", JOptionPane.ERROR_MESSAGE);
//                            }
//                    } catch (SQLException ex) {
//                        Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//        }
//
//    }
    
    private void txtFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtFirstNameKeyPressed

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

    private void btnReservasi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasi1MouseClicked
        try {
            dispose();
            HotelReservation HR = new HotelReservation(id_akun, user, first_name, last_name, email, room_type, phone,
            address, city, formattedCheckIn,formattedCheckOut, adult, children, rsv_date);
            HR.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(UserMenu_RiwayatReservasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReservasi1MouseClicked
     
    // Metode untuk mengambil tipe data yang dimasukkan
    private String getSelectedRoomType() {
        if (rbSingleRoom.isSelected()) {
            return "Single";
        } else if (rbDeluxeRoom.isSelected()) {
            return "Double";
        } else if (rbSuiteRoom.isSelected()) {
            return "Suite";
        }
        return null;
    }
    
    // Metode untuk menghapus pilihan radio button
    public void clearRadioButtons() {
        rbSingleRoom.setSelected(false);
        rbDeluxeRoom.setSelected(false);
        rbSuiteRoom.setSelected(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new HotelReservation(null, "", "", "", "", "", "", "", "", "", "", null, null, null).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnKamar;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReservasi;
    private javax.swing.JButton btnReservasi1;
    private javax.swing.JButton btnRiwayatRsv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAdult;
    private javax.swing.JComboBox<String> cbChildren;
    private javax.swing.JComboBox<String> cbCity;
    private com.toedter.calendar.JDateChooser dcCheckIn;
    private com.toedter.calendar.JDateChooser dcCheckOut;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelKamar;
    private javax.swing.JRadioButton rbDeluxeRoom;
    private javax.swing.JRadioButton rbSingleRoom;
    private javax.swing.JRadioButton rbSuiteRoom;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables


    
    
}
