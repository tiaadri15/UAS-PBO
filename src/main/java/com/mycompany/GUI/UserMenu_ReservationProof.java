package com.mycompany.GUI;

import java.time.LocalDate;

public class UserMenu_ReservationProof extends javax.swing.JFrame {
    public Integer id_akun;
    
    public String first_name, last_name, email, room_type, phone, address, city, formattedCheckIn, formattedCheckOut;
    public Integer adult, children;
    public LocalDate rsv_date;
    
    public UserMenu_ReservationProof(Integer id_akun, String first_name, String last_name, String email, String room_type, String phone, 
            String formattedCheckIn, String formattedCheckOut, String address, String city, Integer adult, 
            Integer children, LocalDate rsv_date) {
        
        initComponents();
        this.id_akun = id_akun;
        lbIdAkun.setText(id_akun.toString());
        
        this.id_akun = id_akun;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.room_type = room_type;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.adult = adult;
        this.formattedCheckIn = formattedCheckIn;
        this.formattedCheckOut = formattedCheckOut;
        this.rsv_date = rsv_date;
        
        lbNama.setText(first_name +" " + last_name);
        lbEmail.setText(email);
        lbPhone.setText(phone);
        lbCheckInDate.setText(formattedCheckIn);
        lbCheckOutDate.setText(formattedCheckOut);
        lbGuest.setText(adult.toString() + " Adult, " + children.toString() + " Child");
        lbRoomType.setText(room_type);
        lbRsvDate.setText(rsv_date.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbBooking = new javax.swing.JLabel();
        lbBooking1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbRoomType = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        lbCheckInDate = new javax.swing.JLabel();
        lbCheckOutDate = new javax.swing.JLabel();
        lbGuest = new javax.swing.JLabel();
        lbBooking2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbRsvDate = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbNama = new javax.swing.JLabel();
        lbNama4 = new javax.swing.JLabel();
        lbBooking3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbIdAkun = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bukti Reservasi");
        setBackground(new java.awt.Color(245, 245, 245));
        setMaximumSize(new java.awt.Dimension(600, 650));
        setMinimumSize(new java.awt.Dimension(600, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(245, 245, 245));
        jLabel14.setText("BUKTI RESERVASI");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(200, 90, 230, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 10, 100, 78);

        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("____________________________________________________________________________________________________________________");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 550, 16);

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_website_10px.png"))); // NOI18N
        jLabel4.setText("www.kinghotel.com");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 150, 120, 10);

        jLabel7.setFont(new java.awt.Font("Garamond", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_location_10px.png"))); // NOI18N
        jLabel7.setText("Jakarta Selatan, Indonesia");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 130, 120, 10);

        jLabel8.setFont(new java.awt.Font("Garamond", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 245, 245));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Phone_10px.png"))); // NOI18N
        jLabel8.setText("+6281234567891");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(270, 130, 90, 10);

        jLabel5.setFont(new java.awt.Font("Garamond", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_secured_letter_10px.png"))); // NOI18N
        jLabel5.setText("kinghotel@gmail.com");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 130, 120, 10);

        lbBooking.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        lbBooking.setForeground(new java.awt.Color(245, 245, 245));
        lbBooking.setText("Informasi Tambahan");
        jPanel1.add(lbBooking);
        lbBooking.setBounds(40, 470, 160, 19);

        lbBooking1.setFont(new java.awt.Font("Garamond", 1, 20)); // NOI18N
        lbBooking1.setForeground(new java.awt.Color(245, 245, 245));
        lbBooking1.setText("BOOKING");
        jPanel1.add(lbBooking1);
        lbBooking1.setBounds(460, 200, 100, 19);

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Room Type");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 290, 70, 16);

        lbRoomType.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lbRoomType.setForeground(new java.awt.Color(245, 245, 245));
        lbRoomType.setText("Room Type");
        jPanel1.add(lbRoomType);
        lbRoomType.setBounds(150, 290, 90, 17);

        jLabel9.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(245, 245, 245));
        jLabel9.setText("Check Out");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 250, 60, 16);

        jLabel10.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(245, 245, 245));
        jLabel10.setText("Guest");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 270, 37, 16);

        lbPhone.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lbPhone.setForeground(new java.awt.Color(245, 245, 245));
        lbPhone.setText("Phone");
        jPanel1.add(lbPhone);
        lbPhone.setBounds(40, 420, 220, 17);

        lbCheckInDate.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        lbCheckInDate.setForeground(new java.awt.Color(245, 245, 245));
        lbCheckInDate.setText("Check In Date");
        jPanel1.add(lbCheckInDate);
        lbCheckInDate.setBounds(150, 230, 100, 17);

        lbCheckOutDate.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        lbCheckOutDate.setForeground(new java.awt.Color(245, 245, 245));
        lbCheckOutDate.setText("Check Out Date");
        jPanel1.add(lbCheckOutDate);
        lbCheckOutDate.setBounds(150, 250, 100, 17);

        lbGuest.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lbGuest.setForeground(new java.awt.Color(245, 245, 245));
        lbGuest.setText("Adult, Children");
        jPanel1.add(lbGuest);
        lbGuest.setBounds(150, 270, 100, 17);

        lbBooking2.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        lbBooking2.setForeground(new java.awt.Color(245, 245, 245));
        lbBooking2.setText("Detail Reservasi");
        jPanel1.add(lbBooking2);
        lbBooking2.setBounds(40, 200, 120, 19);

        jLabel12.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(245, 245, 245));
        jLabel12.setText("Check-out sampai pukul 23.00 WITA");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 520, 210, 17);

        lbRsvDate.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lbRsvDate.setForeground(new java.awt.Color(245, 245, 245));
        lbRsvDate.setText("Date");
        jPanel1.add(lbRsvDate);
        lbRsvDate.setBounds(480, 380, 70, 17);

        lbEmail.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(245, 245, 245));
        lbEmail.setText("Email");
        jPanel1.add(lbEmail);
        lbEmail.setBounds(40, 400, 260, 17);

        lbNama.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lbNama.setForeground(new java.awt.Color(245, 245, 245));
        lbNama.setText("Nama Lengkap");
        jPanel1.add(lbNama);
        lbNama.setBounds(40, 380, 250, 17);

        lbNama4.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lbNama4.setForeground(new java.awt.Color(245, 245, 245));
        lbNama4.setText("Booking Date");
        jPanel1.add(lbNama4);
        lbNama4.setBounds(370, 380, 80, 17);

        lbBooking3.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        lbBooking3.setForeground(new java.awt.Color(245, 245, 245));
        lbBooking3.setText("Informasi Pelanggan");
        jPanel1.add(lbBooking3);
        lbBooking3.setBounds(40, 350, 150, 19);

        jLabel13.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(245, 245, 245));
        jLabel13.setText("Check In");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 230, 50, 17);

        jLabel15.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(245, 245, 245));
        jLabel15.setText("Check-in dibuka pukul 13.00 WITA");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 500, 210, 17);

        lbIdAkun.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lbIdAkun.setForeground(new java.awt.Color(245, 245, 245));
        lbIdAkun.setText("id_akun");
        jPanel1.add(lbIdAkun);
        lbIdAkun.setBounds(470, 240, 70, 17);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserMenu_ReservationProof(null, "", "", "", "", "", "", "", "", "", null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBooking;
    private javax.swing.JLabel lbBooking1;
    private javax.swing.JLabel lbBooking2;
    private javax.swing.JLabel lbBooking3;
    private javax.swing.JLabel lbCheckInDate;
    private javax.swing.JLabel lbCheckOutDate;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGuest;
    private javax.swing.JLabel lbIdAkun;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbNama4;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbRoomType;
    private javax.swing.JLabel lbRsvDate;
    // End of variables declaration//GEN-END:variables
}
