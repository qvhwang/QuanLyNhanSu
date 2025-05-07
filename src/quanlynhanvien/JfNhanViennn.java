/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlynhanvien;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JfNhanViennn extends javax.swing.JFrame {

    /**
     * Creates new form JfNhanViennn
     */
    public JfNhanViennn() {
        initComponents();
        laydulieunhanvien();
    }
    NhanVien nv = new NhanVien();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        RNam = new javax.swing.JRadioButton();
        RNu = new javax.swing.JRadioButton();
        txtManv = new javax.swing.JTextField();
        txtTennv = new javax.swing.JTextField();
        txtcccd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DateNgaysinh = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        txtChucvu = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DateNgaykt = new com.toedter.calendar.JDateChooser();
        DateNgayvl = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtGhichu = new javax.swing.JTextArea();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnNhap = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtTimkiem = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnTimkiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Giới tính", "CCCD", "Ngày vào làm", "Ngày kết thúc", "Chức vụ", "Địa chỉ", "SĐT", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        RNam.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RNam.setText("Nam");

        RNu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RNu.setText("Nữ");

        txtManv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTennv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtcccd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel1.setText("Tên nhân viên");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Giới tính");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Ngày sinh");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setText("CCCD");

        DateNgaysinh.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTennv))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtManv))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(RNam)
                                        .addGap(29, 29, 29)
                                        .addComponent(RNu)
                                        .addGap(28, 28, 28))
                                    .addComponent(txtcccd)
                                    .addComponent(DateNgaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6))
                    .addComponent(DateNgaysinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RNam)
                            .addComponent(RNu))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtcccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtChucvu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDiachi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtsdt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel6.setText("Ngày vào làm");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setText("Ngày kết thúc");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setText("Chức vụ");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel9.setText("Địa chỉ");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel10.setText("Số điện thoại");

        DateNgaykt.setDateFormatString("dd/MM/yyyy");

        DateNgayvl.setDateFormatString("dd/MM/yyyy");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel11.setText("Ghi chú");

        txtGhichu.setColumns(20);
        txtGhichu.setRows(5);
        jScrollPane8.setViewportView(txtGhichu);

        btnThem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnNhap.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnNhap.setText("Nhập");
        btnNhap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(737, 737, 737))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtChucvu, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(txtDiachi)
                                        .addComponent(txtsdt))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(DateNgayvl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DateNgaykt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(226, 226, 226))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(253, 253, 253)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(111, 111, 111))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtChucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateNgayvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(12, 12, 12)
                                .addComponent(DateNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );

        txtTimkiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel12.setText("Tìm kiếm");

        btnTimkiem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String Manhanvien = txtManv.getText();
        String Tennhanvien = txtTennv.getText();

        boolean kiemtra = KiemTra(0);
        if (!kiemtra) {
            return;
        }

        java.util.Date ngaySinhUtil = DateNgaysinh.getDate();
        java.sql.Date Ngaysinh = (ngaySinhUtil != null) ? new java.sql.Date(ngaySinhUtil.getTime()) : null;

        java.util.Date ngayvlUtil = DateNgayvl.getDate();
        java.sql.Date Ngayvaolam = (ngayvlUtil != null) ? new java.sql.Date(ngayvlUtil.getTime()) : null;

        java.util.Date ngayktUtil = DateNgaykt.getDate();
        java.sql.Date Ngayketthuc = (ngayktUtil != null) ? new java.sql.Date(ngayktUtil.getTime()) : null;

        String Gioitinh = RNam.isSelected() ? "1" : "0"; // "1" cho Nam, "0" cho Nữ

        String CCCD = txtcccd.getText();
        String Chucvu = txtChucvu.getText();
        String Diachi = txtDiachi.getText();
        String Ghichu = txtGhichu.getText();

        int SDT = 0;
        try {
            SDT = Integer.parseInt(txtsdt.getText());
        } catch (NumberFormatException e) {
            ThongBao("Số điện thoại không hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "INSERT INTO Tb_NhanVien (MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, CCCD, NgayVaoLam, NgayKetThuc, ChucVu, DiaChi, SDT, GhiChu) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = connection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, Integer.parseInt(Manhanvien));
            ps.setString(2, Tennhanvien);
            ps.setDate(3, Ngaysinh);
            ps.setString(4, Gioitinh);
            ps.setString(5, CCCD);
            ps.setDate(6, Ngayvaolam);
            ps.setDate(7, Ngayketthuc);
            ps.setString(8, Chucvu);
            ps.setString(9, Diachi);
            ps.setInt(10, SDT);
            ps.setString(11, Ghichu);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ThongBao("Đã thêm nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                ThongBao("Không thể thêm nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Có lỗi xảy ra trong quá trình thêm nhân viên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        laydulieunhanvien();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String Manhanvien = txtManv.getText();
        String Tennhanvien = txtTennv.getText();

        boolean kiemtra = KiemTra(0);
        if (!kiemtra) {
            return;
        }

        java.util.Date ngaySinhUtil = DateNgaysinh.getDate();
        java.sql.Date Ngaysinh = (ngaySinhUtil != null) ? new java.sql.Date(ngaySinhUtil.getTime()) : null;

        java.util.Date ngayvlUtil = DateNgayvl.getDate();
        java.sql.Date Ngayvaolam = (ngayvlUtil != null) ? new java.sql.Date(ngayvlUtil.getTime()) : null;

        java.util.Date ngayktUtil = DateNgaykt.getDate();
        java.sql.Date Ngayketthuc = (ngayktUtil != null) ? new java.sql.Date(ngayktUtil.getTime()) : null;

        String Gioitinh = RNam.isSelected() ? "1" : "0"; // "1" cho Nam, "0" cho Nữ

        String CCCD = txtcccd.getText();
        String Chucvu = txtChucvu.getText();
        String Diachi = txtDiachi.getText();
        String Ghichu = txtGhichu.getText();

        int SDT = 0;
        try {
            SDT = Integer.parseInt(txtsdt.getText());
        } catch (NumberFormatException e) {
            ThongBao("Số điện thoại không hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "UPDATE Tb_NhanVien SET TenNhanVien = ?, NgaySinh = ?, GioiTinh = ?, CCCD = ?, NgayVaoLam = ?, NgayKetThuc = ?, ChucVu = ?, DiaChi = ?, SDT = ?, GhiChu = ? WHERE MaNhanVien = ?";
        try (Connection conn = connection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, Tennhanvien);
            ps.setDate(2, Ngaysinh);
            ps.setString(3, Gioitinh);
            ps.setString(4, CCCD);
            ps.setDate(5, Ngayvaolam);
            ps.setDate(6, Ngayketthuc);
            ps.setString(7, Chucvu);
            ps.setString(8, Diachi);
            ps.setInt(9, SDT);
            ps.setString(10, Ghichu);
            ps.setInt(11, Integer.parseInt(Manhanvien));

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ThongBao("Đã sửa thông tin nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                ThongBao("Không thể sửa thông tin nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Có lỗi xảy ra trong quá trình sửa thông tin nhân viên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        laydulieunhanvien();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            ThongBao("Vui lòng chọn một nhân viên để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String maNhanVien = jTable1.getValueAt(selectedRow, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa nhân viên này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {

            try (Connection conn = connection.getConnection()) {
                String checkUserSql = "DELETE FROM Tb_NhanVien WHERE MaNhanVien = ?";
                PreparedStatement psDelete = conn.prepareStatement(checkUserSql);
                psDelete.setString(1, maNhanVien);

                int rowsAffected = psDelete.executeUpdate();

                if (rowsAffected > 0) {
                    ThongBao("Đã xóa nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    laydulieunhanvien();
                } else {
                    ThongBao("Không tìm thấy nhân viên với mã đã chọn!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(e.toString());
                ThongBao("Có lỗi xảy ra trong quá trình xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {

            ThongBao("Hủy thao tác xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtManv.setText("");
        txtTennv.setText("");
        txtChucvu.setText("");
        txtDiachi.setText("");
        txtGhichu.setText("");
        txtcccd.setText("");
        txtsdt.setText("");
        RNam.setSelected(false);
        RNu.setSelected(false);
        DateNgaysinh.setDate(null); // Xóa ngày sinh
        DateNgayvl.setDate(null); // Xóa ngày vào làm
        DateNgaykt.setDate(null); // Xóa ngày kết thúc

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        String maNhanVien = txtTimkiem.getText();

        if (maNhanVien.isEmpty()) {

            laydulieunhanvien();
            return;
        }

        try (Connection conn = connection.getConnection()) {
            String checkUserSql = "SELECT * FROM Tb_NhanVien WHERE MaNhanVien = ?";
            PreparedStatement psCheck = conn.prepareStatement(checkUserSql);
            psCheck.setString(1, maNhanVien);

            Object[] obj = new Object[]{"Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Giới tính", "CCCD", "Ngày vào làm", "Ngày kết thúc", "Chức vụ", "Địa chỉ", "SDT", "Ghi chú"};
            DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
            ResultSet rs = psCheck.executeQuery();

            jTable1.setModel(tableModel);
            while (rs.next()) {
                Object[] item = new Object[11];

                item[0] = rs.getInt("MaNhanVien");
                item[1] = rs.getString("TenNhanVien");
                item[2] = rs.getDate("NgaySinh");
                item[3] = (rs.getInt("GioiTinh") == 1) ? "Nam" : "Nữ";
                item[4] = rs.getString("CCCD");
                item[5] = rs.getDate("NgayVaoLam");
                item[6] = rs.getDate("NgayKetThuc");
                item[7] = rs.getString("ChucVu");
                item[8] = rs.getString("DiaChi");
                item[9] = rs.getString("SDT");
                item[10] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            ThongBao("Có lỗi xảy ra trong quá trình tìm kiếm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        Nhapdulieu();
    }//GEN-LAST:event_btnNhapActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {

            this.dispose();

            Home home = new Home();
            home.setVisible(true);
        } else {

            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed
    private boolean KiemTra(int par) {
        String Manhanvien = txtManv.getText();
        String Tennhanvien = txtTennv.getText();
        String CCCD = txtcccd.getText();
        String Chucvu = txtChucvu.getText();
        String Diachi = txtDiachi.getText();
        String SDT = txtsdt.getText();

        java.util.Date ngaySinhUtil = DateNgaysinh.getDate();
        java.util.Date ngayvlUtil = DateNgayvl.getDate();
        java.util.Date ngayktUtil = DateNgaykt.getDate();

        String ThongBao = "";

        if (Manhanvien.equals("")) {
            ThongBao += "Vui lòng nhập mã nhân viên!\n";
            jLabel2.setForeground(Color.red);
        }
        if (Tennhanvien.equals("")) {
            ThongBao += "Vui lòng nhập tên nhân viên!\n";
            jLabel1.setForeground(Color.red);
        }
        if (CCCD.equals("")) {
            ThongBao += "Vui lòng nhập CCCD!\n";
            jLabel5.setForeground(Color.red);
        }
        if (Chucvu.equals("")) {
            ThongBao += "Vui lòng nhập chức vụ!\n";
            jLabel8.setForeground(Color.red);
        }
        if (Diachi.equals("")) {
            ThongBao += "Vui lòng nhập địa chỉ!\n";
            jLabel9.setForeground(Color.red);
        }
        if (SDT.equals("")) {
            ThongBao += "Vui lòng nhập số điện thoại!\n";
            jLabel10.setForeground(Color.red);
        }

        if (ngaySinhUtil == null) {
            ThongBao += "Vui lòng chọn ngày sinh!\n";
            jLabel4.setForeground(Color.red);
        }
        if (ngayvlUtil == null) {
            ThongBao += "Vui lòng chọn ngày vào làm!\n";
            jLabel6.setForeground(Color.red);
        }
        if (ngayktUtil == null) {
            ThongBao += "Vui lòng chọn ngày kết thúc!\n";
            jLabel7.setForeground(Color.red);
        }

        if (ThongBao.equals("")) {

            jLabel2.setForeground(Color.black);
            jLabel1.setForeground(Color.black);
            jLabel5.setForeground(Color.black);
            jLabel8.setForeground(Color.black);
            jLabel9.setForeground(Color.black);
            jLabel10.setForeground(Color.black);
            jLabel4.setForeground(Color.black);
            jLabel6.setForeground(Color.black);
            jLabel7.setForeground(Color.black);
            return true;
        } else {

            ThongBao(ThongBao, "Lỗi nhập liệu", 2);
            return false;
        }
    }

    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }

    private void Nhapdulieu() {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {

            String maNhanVien = jTable1.getValueAt(selectedRow, 0).toString();
            String tenNhanVien = jTable1.getValueAt(selectedRow, 1).toString();
            Date ngaySinh = (Date) jTable1.getValueAt(selectedRow, 2);
            String gioiTinh = jTable1.getValueAt(selectedRow, 3).toString();
            String cccd = jTable1.getValueAt(selectedRow, 4).toString();
            Date ngayVaoLam = (Date) jTable1.getValueAt(selectedRow, 5);
            Date ngayKetThuc = (Date) jTable1.getValueAt(selectedRow, 6);
            String chucVu = jTable1.getValueAt(selectedRow, 7).toString();
            String diaChi = jTable1.getValueAt(selectedRow, 8).toString();
            String sdt = jTable1.getValueAt(selectedRow, 9).toString();
            String ghiChu = jTable1.getValueAt(selectedRow, 10).toString();

            txtManv.setText(maNhanVien);
            txtTennv.setText(tenNhanVien);
            DateNgaysinh.setDate(ngaySinh);
            RNam.setSelected(gioiTinh.equals("Nam"));
            RNu.setSelected(gioiTinh.equals("Nữ"));
            txtcccd.setText(cccd);
            DateNgayvl.setDate(ngayVaoLam);
            DateNgaykt.setDate(ngayKetThuc);
            txtChucvu.setText(chucVu);
            txtDiachi.setText(diaChi);
            txtsdt.setText(sdt);
            txtGhichu.setText(ghiChu);
        }
    }

    private void laydulieunhanvien() {
        String sql = "SELECT * FROM Tb_NhanVien";
        try (Connection conn = connection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Mã nhân viên", "Tên nhân viên", "Ngày Sinh", "Giới Tính", "CCCD", "Ngày Vào Làm", "Ngày Kết Thúc", "Chức Vụ", "Địa Chỉ", "SDT", "Ghi Chú"}, 0);
            jTable1.setModel(tableModel);

            while (rs.next()) {
                Object[] item = new Object[11];
                item[0] = rs.getInt("MaNhanVien");
                item[1] = rs.getString("TenNhanVien");
                item[2] = rs.getDate("NgaySinh");
                item[3] = (rs.getInt("GioiTinh") == 1) ? "Nam" : "Nữ";
                item[4] = rs.getString("CCCD");
                item[5] = rs.getDate("NgayVaoLam");
                item[6] = rs.getDate("NgayKetThuc");
                item[7] = rs.getString("ChucVu");
                item[8] = rs.getString("DiaChi");
                item[9] = rs.getInt("SDT");
                item[10] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Có lỗi khi tải dữ liệu nhân viên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfNhanViennn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfNhanViennn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfNhanViennn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfNhanViennn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfNhanViennn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateNgaykt;
    private com.toedter.calendar.JDateChooser DateNgaysinh;
    private com.toedter.calendar.JDateChooser DateNgayvl;
    private javax.swing.JRadioButton RNam;
    private javax.swing.JRadioButton RNu;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtChucvu;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextArea txtGhichu;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtTennv;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtcccd;
    private javax.swing.JTextField txtsdt;
    // End of variables declaration//GEN-END:variables
}
