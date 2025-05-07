/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlynhanvien;

import java.awt.Color;
import java.awt.PopupMenu;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class JfHopDong extends javax.swing.JFrame {

    /**
     * Creates new form JfHopDong
     */
    public JfHopDong() {
        initComponents();
        laydulieuhopdong();
    }
    HopDong hd = new HopDong();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtMahd = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        txtTennv = new javax.swing.JTextField();
        DateNgayvl = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DateNgayky = new com.toedter.calendar.JDateChooser();
        txtLanky = new javax.swing.JTextField();
        txtLuongcb = new javax.swing.JTextField();
        txtThoihan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DateNgaykt = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnNhap = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnTimkiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hợp đồng", "Mã nhân viên", "Tên nhân viên", "Ngày vào làm", "Ngày kết  thúc", "Ngày ký", "Lần ký", "Thời hạn", "Lương cơ bản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtMahd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtManv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTennv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DateNgayvl.setDateFormatString("dd/MM/yyyy");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel1.setText("Mã hợp đồng");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Tên nhân viên");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Ngày vào làm");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setText("Ngày kết thúc");

        DateNgayky.setDateFormatString("dd/MM/yyyy");

        txtLanky.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtLuongcb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtThoihan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel6.setText("Ngày ký");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setText("Lần ký");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setText("Lương cơ bản");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel9.setText("Thời hạn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLanky, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateNgayky, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThoihan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLuongcb)
                        .addGap(38, 38, 38))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateNgayky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLanky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtThoihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLuongcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        DateNgaykt.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTennv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txtMahd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtManv))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DateNgaykt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(DateNgayvl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(DateNgayvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(DateNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnAdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnUpd.setText("Sửa");
        btnUpd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDel.setText("Xoá");
        btnDel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnNhap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNhap.setText("Nhập");
        btnNhap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        txtTimkiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel10.setText("Tìm kiếm");

        btnTimkiem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel10)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String MaHopDong = txtMahd.getText();
        String MaNhanVien = txtManv.getText();
        String TenNhanVien = txtTennv.getText();
        boolean kiemtra = KiemTra(0);
        if (!kiemtra) {
            return;
        }

        java.util.Date ngayvlUtil = DateNgayvl.getDate();
        java.sql.Date Ngayvaolam = (ngayvlUtil != null) ? new java.sql.Date(ngayvlUtil.getTime()) : null;

        java.util.Date ngayktUtil = DateNgaykt.getDate();
        java.sql.Date Ngayketthuc = (ngayktUtil != null) ? new java.sql.Date(ngayktUtil.getTime()) : null;

        java.util.Date ngaykyUtil = DateNgayky.getDate();
        java.sql.Date Ngayky = (ngaykyUtil != null) ? new java.sql.Date(ngaykyUtil.getTime()) : null;

        String LanKy = txtLanky.getText();
        String ThoiHan = txtThoihan.getText();
        String LuongCoBan = txtLuongcb.getText();

        int lankyInt = 0;
        int luongcbInt = 0;

        try {
            lankyInt = Integer.parseInt(LanKy);
            luongcbInt = Integer.parseInt(LuongCoBan);
        } catch (NumberFormatException e) {
            ThongBao("Lần ký hoặc lương cơ bản không hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = connection.getConnection()) {

            String checkHopDongSql = "SELECT * FROM Tb_HopDong WHERE MaHD = ?";
            PreparedStatement psCheckHD = conn.prepareStatement(checkHopDongSql);
            psCheckHD.setInt(1, Integer.parseInt(MaHopDong));
            ResultSet rsHD = psCheckHD.executeQuery();

            if (rsHD.next()) {
                ThongBao("Mã hợp đồng đã tồn tại! Vui lòng chọn mã khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String checkNhanVienSql = "SELECT * FROM Tb_NhanVien WHERE MaNhanVien = ?";
            PreparedStatement psCheckNV = conn.prepareStatement(checkNhanVienSql);
            psCheckNV.setInt(1, Integer.parseInt(MaNhanVien));

            ResultSet rsNV = psCheckNV.executeQuery();
            if (!rsNV.next()) {
                ThongBao("Mã nhân viên không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "INSERT INTO Tb_HopDong (MaHD, MaNhanVien, TenNhanVien, NgayVaoLam, NgayKetThuc, NgayKy, LanKy, ThoiHan, LuongCoBan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(MaHopDong));
            ps.setInt(2, Integer.parseInt(MaNhanVien));
            ps.setString(3, TenNhanVien);
            ps.setDate(4, Ngayvaolam);
            ps.setDate(5, Ngayketthuc);
            ps.setDate(6, Ngayky);
            ps.setInt(7, lankyInt);
            ps.setString(8, ThoiHan);
            ps.setInt(9, luongcbInt);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ThongBao("Đã thêm hợp đồng thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                laydulieuhopdong();
            } else {
                ThongBao("Không thể thêm hợp đồng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Có lỗi xảy ra trong quá trình thêm hợp đồng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        laydulieuhopdong();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed

        String MaHopDong = txtMahd.getText();
        String MaNhanVien = txtManv.getText();
        String TenNhanVien = txtTennv.getText();
        boolean kiemtra = KiemTra(0);
        if (!kiemtra) {
            return;
        }

        java.util.Date ngayvlUtil = DateNgayvl.getDate();
        java.sql.Date Ngayvaolam = (ngayvlUtil != null) ? new java.sql.Date(ngayvlUtil.getTime()) : null;

        java.util.Date ngayktUtil = DateNgaykt.getDate();
        java.sql.Date Ngayketthuc = (ngayktUtil != null) ? new java.sql.Date(ngayktUtil.getTime()) : null;

        java.util.Date ngaykyUtil = DateNgayky.getDate();
        java.sql.Date Ngayky = (ngaykyUtil != null) ? new java.sql.Date(ngaykyUtil.getTime()) : null;

        String LanKy = txtLanky.getText();
        String ThoiHan = txtThoihan.getText();
        String LuongCoBan = txtLuongcb.getText();

        int lankyInt = 0;
        int luongcbInt = 0;

        try {
            lankyInt = Integer.parseInt(LanKy);
            luongcbInt = Integer.parseInt(LuongCoBan);
        } catch (NumberFormatException e) {
            ThongBao("Lần ký hoặc lương cơ bản không hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = connection.getConnection()) {

            String checkNhanVienSql = "SELECT * FROM Tb_NhanVien WHERE MaNhanVien = ?";
            PreparedStatement psCheck = conn.prepareStatement(checkNhanVienSql);
            psCheck.setInt(1, Integer.parseInt(MaNhanVien));

            ResultSet rs = psCheck.executeQuery();
            if (!rs.next()) {
                ThongBao("Mã nhân viên không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "UPDATE Tb_HopDong SET TenNhanVien = ?, NgayVaoLam = ?, NgayKetThuc = ?, NgayKy = ?, LanKy = ?, ThoiHan = ?, LuongCoBan = ? WHERE MaHD = ? AND MaNhanVien = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, TenNhanVien);
            ps.setDate(2, Ngayvaolam);
            ps.setDate(3, Ngayketthuc);
            ps.setDate(4, Ngayky);
            ps.setInt(5, lankyInt);
            ps.setString(6, ThoiHan);
            ps.setInt(7, luongcbInt);
            ps.setInt(8, Integer.parseInt(MaHopDong));
            ps.setInt(9, Integer.parseInt(MaNhanVien));

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ThongBao("Đã sửa hợp đồng thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                laydulieuhopdong();
            } else {
                ThongBao("Không thể sửa hợp đồng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Có lỗi xảy ra trong quá trình sửa hợp đồng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        laydulieuhopdong();
    }//GEN-LAST:event_btnUpdActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed

        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            ThongBao("Vui lòng chọn một hợp đồng để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String maHopDong = jTable1.getValueAt(selectedRow, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa hợp đồng này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {

            try (Connection conn = connection.getConnection()) {
                String deleteSql = "DELETE FROM Tb_HopDong WHERE MaHD = ?";
                PreparedStatement psDelete = conn.prepareStatement(deleteSql);
                psDelete.setString(1, maHopDong);

                int rowsAffected = psDelete.executeUpdate();

                if (rowsAffected > 0) {
                    ThongBao("Đã xóa hợp đồng thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    laydulieuhopdong();
                } else {
                    ThongBao("Không tìm thấy hợp đồng với mã đã chọn!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(e.toString());
                ThongBao("Có lỗi xảy ra trong quá trình xóa hợp đồng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {

            ThongBao("Hủy thao tác xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        Nhapdulieu();
    }//GEN-LAST:event_btnNhapActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        String maHopDong = txtTimkiem.getText();

        if (maHopDong.isEmpty()) {

            laydulieuhopdong();
            return;
        }

        try (Connection conn = connection.getConnection()) {
            String checkHopDongSql = "SELECT * FROM Tb_HopDong WHERE MaHD = ?";
            PreparedStatement psCheck = conn.prepareStatement(checkHopDongSql);
            psCheck.setString(1, maHopDong);

            Object[] obj = new Object[]{"Mã hợp đồng", "Mã nhân viên", "Tên nhân viên", "Ngày vào làm", "Ngày kết thúc", "Ngày ký", "Lần ký", "Thời hạn", "Lương cơ bản"};
            DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
            ResultSet rs = psCheck.executeQuery();

            jTable1.setModel(tableModel);
            while (rs.next()) {
                Object[] item = new Object[9];

                item[0] = rs.getInt("MaHD");
                item[1] = rs.getInt("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getDate("NgayVaoLam");
                item[4] = rs.getDate("NgayKetThuc");
                item[5] = rs.getDate("NgayKy");
                item[6] = rs.getInt("LanKy");
                item[7] = rs.getString("ThoiHan");
                item[8] = rs.getInt("LuongCoBan");
                tableModel.addRow(item);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            ThongBao("Có lỗi xảy ra trong quá trình tìm kiếm hợp đồng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMahd.setText("");
        txtManv.setText("");
        txtTennv.setText("");
        txtLanky.setText("");
        txtThoihan.setText("");
        txtLuongcb.setText("");

        DateNgayky.setDate(null); // Xóa ngày sinh
        DateNgayvl.setDate(null); // Xóa ngày vào làm
        DateNgaykt.setDate(null); // Xóa ngày kết thúc
    }//GEN-LAST:event_btnResetActionPerformed

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

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemActionPerformed
    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }

    private boolean KiemTra(int par) {
        String Mahopdong = txtMahd.getText();
        String Manhanvien = txtManv.getText();
        String Tennhanvien = txtTennv.getText();
        String Lanky = txtLanky.getText();
        String Thoihan = txtThoihan.getText();
        String Luongcoban = txtLuongcb.getText();

        java.util.Date ngayKyUtil = DateNgayky.getDate();
        java.util.Date ngayvlUtil = DateNgayvl.getDate();
        java.util.Date ngayktUtil = DateNgaykt.getDate();

        String ThongBao = "";

        if (Mahopdong.equals("")) {
            ThongBao += "Vui lòng nhập mã hợp đồng!\n";
            jLabel1.setForeground(Color.red);
        } else if (Manhanvien.equals("")) {
            ThongBao += "Vui lòng nhập mã nhân viên!\n";
            jLabel2.setForeground(Color.red);
        } else if (Tennhanvien.equals("")) {
            ThongBao += "Vui lòng nhập tên nhân viên!\n";
            jLabel3.setForeground(Color.red);
        } else if (ngayvlUtil == null) {
            ThongBao += "Vui lòng chọn ngày vào làm!\n";
            jLabel4.setForeground(Color.red);
        } else if (ngayktUtil == null) {
            ThongBao += "Vui lòng chọn ngày kết thúc!\n";
            jLabel5.setForeground(Color.red);
        } else if (ngayKyUtil == null) {
            ThongBao += "Vui lòng chọn ngày Ký!\n";
            jLabel6.setForeground(Color.red);
        } else if (Lanky.equals("")) {
            ThongBao += "Vui lòng nhập lần ký!\n";
            jLabel7.setForeground(Color.red);
        } else if (Thoihan.equals("")) {
            ThongBao += "Vui lòng nhập thời hạn!\n";
            jLabel8.setForeground(Color.red);
        } else if (Luongcoban.equals("")) {
            ThongBao += "Vui lòng nhập lương cơ bản!\n";
            jLabel9.setForeground(Color.red);
        }

        if (ThongBao.equals("")) {

            jLabel1.setForeground(Color.black);
            jLabel2.setForeground(Color.black);
            jLabel3.setForeground(Color.black);
            jLabel4.setForeground(Color.black);
            jLabel5.setForeground(Color.black);
            jLabel6.setForeground(Color.black);
            jLabel7.setForeground(Color.black);
            jLabel8.setForeground(Color.black);
            jLabel9.setForeground(Color.black);
            return true;
        } else {

            ThongBao(ThongBao, "Lỗi nhập liệu", 2);
            return false;
        }
    }

    private void Nhapdulieu() {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {

            String MaHopDong = jTable1.getValueAt(selectedRow, 0).toString();
            String MaNhanVien = jTable1.getValueAt(selectedRow, 1).toString();
            String TenNhanVien = jTable1.getValueAt(selectedRow, 2).toString();

            Date NgayVaoLam = (Date) jTable1.getValueAt(selectedRow, 3);
            Date NgayKetThuc = (Date) jTable1.getValueAt(selectedRow, 4);
            Date NgayKy = (Date) jTable1.getValueAt(selectedRow, 5);
            String LanKy = jTable1.getValueAt(selectedRow, 6).toString();
            String ThoiHan = jTable1.getValueAt(selectedRow, 7).toString();
            String LuongCoBan = jTable1.getValueAt(selectedRow, 8).toString();

            txtMahd.setText(MaHopDong);
            txtManv.setText(MaNhanVien);
            txtTennv.setText(TenNhanVien);

            DateNgayvl.setDate(NgayVaoLam);
            DateNgaykt.setDate(NgayKetThuc);
            DateNgayky.setDate(NgayKy);
            txtLanky.setText(LanKy);
            txtThoihan.setText(ThoiHan);
            txtLuongcb.setText(LuongCoBan);

        }
    }

    private void laydulieuhopdong() {
        String sql = "SELECT * FROM Tb_HopDong";
        try (Connection conn = connection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Mã hợp đồng", "Mã nhân viên", "Tên nhân viên", "Ngày vào làm", "Ngày kết thúc", "Ngày ký", "Lần ký", "Thời hạn", "Lương cơ bản"}, 0);
            jTable1.setModel(tableModel);

            while (rs.next()) {
                Object[] item = new Object[9];
                item[0] = rs.getInt("MaHD");
                item[1] = rs.getInt("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getDate("NgayVaoLam");
                item[4] = rs.getDate("NgayKetThuc");
                item[5] = rs.getDate("NgayKy");
                item[6] = rs.getInt("LanKy");
                item[7] = rs.getString("ThoiHan");
                item[8] = rs.getInt("LuongCoBan");

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
            java.util.logging.Logger.getLogger(JfHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfHopDong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateNgaykt;
    private com.toedter.calendar.JDateChooser DateNgayky;
    private com.toedter.calendar.JDateChooser DateNgayvl;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnUpd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtLanky;
    private javax.swing.JTextField txtLuongcb;
    private javax.swing.JTextField txtMahd;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtTennv;
    private javax.swing.JTextField txtThoihan;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
