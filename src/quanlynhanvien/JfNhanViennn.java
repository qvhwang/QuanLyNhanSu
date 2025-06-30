    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlynhanvien;

import java.awt.Color;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import quanlynhanvien.PhongBan;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.Phrase;

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
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setupDateListener();
        loadDanhSachPhongBan();
        laydulieunhanvien();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtManv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnNhap = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        txtTennv = new javax.swing.JTextField();
        datengaysinh = new com.toedter.calendar.JDateChooser();
        jComboGT = new javax.swing.JComboBox<>();
        txtQueQuan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dateNgayvl = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboCV = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cboPB = new javax.swing.JComboBox<>();
        txtLCB = new javax.swing.JTextField();
        cboLHD = new javax.swing.JComboBox<>();
        txtGC = new javax.swing.JTextField();
        txtTimkiem = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 760));
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 418));

        txtManv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Tên nhân viên");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Giới tính");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Ngày sinh");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("CCCD");

        btnThem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(new javax.swing.border.MatteBorder(null));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setBorder(new javax.swing.border.MatteBorder(null));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(new javax.swing.border.MatteBorder(null));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorder(new javax.swing.border.MatteBorder(null));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnNhap.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnNhap.setText("Nhập");
        btnNhap.setBorder(new javax.swing.border.MatteBorder(null));
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        btnTimkiem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.setBorder(new javax.swing.border.MatteBorder(null));
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        txtTennv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        datengaysinh.setBorder(new javax.swing.border.MatteBorder(null));

        jComboGT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Nam", "Nữ", "Khác", " " }));
        jComboGT.setBorder(new javax.swing.border.MatteBorder(null));

        txtQueQuan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Quê quán");

        txtSDT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCCCD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Số điện thoại");

        dateNgayvl.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Ngày vào làm");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Thâm niên");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("jLabel10");

        cboCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Giám đốc điều hành", "Giám đốc tài chính", "Giám đốc marketing", "Quản lý nhân sự", "Quản lý dự án", "Phó phòng", "Trưởng phòng ", "Giám đốc", "Nhân viên kinh doanh ", "Nhân viên marketing", "Kỹ sư phần mềm", "Nhân viên hỗ trợ khách hàng ", "Nhân viên kế toán", "Nhân viên thiết kế ", "Nhân viên hành chính", "Thư ký ", "Trợ lý " }));
        cboCV.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Phòng ban");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Chức vụ");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Lương cơ bản");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Loại hợp đồng");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Ghi chú");

        cboPB.setBorder(new javax.swing.border.MatteBorder(null));

        txtLCB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cboLHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Hợp đồng không xác định thời hạn", "6 tháng", "3 tháng", "5 tháng", "1 năm", "2 năm", "3 năm", "4 năm", "5 năm", "Hợp đồng làm việc bán thời gian", "Hợp đồng cộng tác viên", "Hợp đồng thử việc" }));
        cboLHD.setBorder(new javax.swing.border.MatteBorder(null));

        txtGC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTimkiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Tìm kiếm nhân viên");

        btnXuat.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnXuat.setText("Xuất");
        btnXuat.setBorder(new javax.swing.border.MatteBorder(null));
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(datengaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboGT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateNgayvl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLCB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboCV, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboPB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(135, 135, 135))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addComponent(dateNgayvl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtGC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(datengaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboGT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cboCV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtLCB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // Lấy dữ liệu từ các trường
        boolean kiemtra = KiemTra();
        if (!kiemtra) {
            return; // Dừng nếu kiểm tra không hợp lệ
        }
        // Lấy dữ liệu từ các trường input
        String maNhanVien = txtManv.getText().trim();
        String tenNhanVien = txtTennv.getText().trim();
        String cccd = txtCCCD.getText().trim();
        String queQuan = txtQueQuan.getText().trim();
        String ghiChu = txtGC.getText().trim();

        // Kiểm tra các trường bắt buộc không được để trống
        if (maNhanVien.isEmpty() || tenNhanVien.isEmpty()) {
            ThongBao("Mã nhân viên và tên nhân viên không được để trống!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra và lấy dữ liệu từ JDateChooser
        java.util.Date ngaySinhUtil = datengaysinh.getDate();
        if (ngaySinhUtil == null) {
            ThongBao("Vui lòng chọn ngày sinh!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        java.sql.Date ngaySinh = new java.sql.Date(ngaySinhUtil.getTime());

        java.util.Date ngayVlUtil = dateNgayvl.getDate();
        if (ngayVlUtil == null) {
            ThongBao("Vui lòng chọn ngày vào làm!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        java.sql.Date ngayVaoLam = new java.sql.Date(ngayVlUtil.getTime());

        // Tính thâm niên và cập nhật jLabel10
        String thamNien = tinhThamNien(ngayVlUtil);
        jLabel10.setText("Thâm niên: " + thamNien);

        // Kiểm tra và lấy dữ liệu từ ComboBox Giới tính
        if (jComboGT.getSelectedItem() == null || jComboGT.getSelectedItem().toString().equals("None")) {
            ThongBao("Vui lòng chọn giới tính!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String gioiTinh = jComboGT.getSelectedItem().toString();

        // Kiểm tra và lấy dữ liệu từ ComboBox Phòng ban
        if (cboPB.getSelectedItem() == null || cboPB.getSelectedIndex() == 0) {
            ThongBao("Vui lòng chọn phòng ban!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String tenPhongBan = cboPB.getSelectedItem().toString();
        // Không cần map, vì bạn sẽ lưu trực tiếp tên phòng ban
        if (tenPhongBan == null || tenPhongBan.equals("-- Chọn phòng ban --")) {
            ThongBao("Phòng ban được chọn không hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra và lấy dữ liệu từ ComboBox Chức vụ
        if (cboCV.getSelectedItem() == null || cboCV.getSelectedItem().toString().equals("None")) {
            ThongBao("Vui lòng chọn chức vụ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String chucVu = cboCV.getSelectedItem().toString();

        // Lấy và kiểm tra số điện thoại
        int sdt = 0;
        try {
            String sdtText = txtSDT.getText().trim();
            if (!sdtText.isEmpty()) {
                sdt = Integer.parseInt(sdtText);
            }
        } catch (NumberFormatException e) {
            ThongBao("Số điện thoại không hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy và kiểm tra lương cơ bản
        int luongCoBan = 0;
        try {
            String lcbText = txtLCB.getText().trim();
            if (!lcbText.isEmpty()) {
                luongCoBan = Integer.parseInt(lcbText);
            }
        } catch (NumberFormatException e) {
            ThongBao("Lương cơ bản không hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy loại hợp đồng
        String loaiHD = "";
        if (cboLHD.getSelectedItem() != null) {
            loaiHD = cboLHD.getSelectedItem().toString();
        }

        // Gọi phương thức kiểm tra (nếu có)
        // Câu SQL INSERT theo cấu trúc database mới
        // Kiểm tra mã nhân viên đã tồn tại chưa
        String checkSql = "SELECT COUNT(*) FROM Tb_NhanVien WHERE MaNhanVien = ?";
        try (Connection conn = connection.getConnection(); PreparedStatement checkPs = conn.prepareStatement(checkSql)) {
            checkPs.setString(1, maNhanVien);
            ResultSet rsCheck = checkPs.executeQuery();
            if (rsCheck.next() && rsCheck.getInt(1) > 0) {
                ThongBao("Nhân viên với mã '" + maNhanVien + "' đã tồn tại!", "Lỗi dữ liệu", JOptionPane.ERROR_MESSAGE);
                return; // Ngừng nếu đã tồn tại
            }
            rsCheck.close();
        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Lỗi khi kiểm tra mã nhân viên: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "INSERT INTO Tb_NhanVien (MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, QueQuan, CCCD, SDT, NgayVaoLam, ThamNien, PhongBan, ChucVu, LuongCoBan, LoaiHD, GhiChu) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = connection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, maNhanVien);
            ps.setString(2, tenNhanVien);
            ps.setDate(3, ngaySinh);
            ps.setString(4, gioiTinh);
            ps.setString(5, queQuan);
            ps.setString(6, cccd);
            ps.setInt(7, sdt);
            ps.setDate(8, ngayVaoLam);
            ps.setString(9, thamNien);
            ps.setString(10, tenPhongBan); // Lưu tên phòng ban vào cột "PhongBan"

            ps.setString(11, chucVu);
            ps.setInt(12, luongCoBan);
            ps.setString(13, loaiHD);
            ps.setString(14, ghiChu);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                ThongBao("Đã thêm nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                // Reset form sau khi thêm thành công
                resetForm();
            } else {
                ThongBao("Không thể thêm nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Có lỗi xảy ra trong quá trình thêm nhân viên: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        // Refresh lại dữ liệu
        laydulieunhanvien();


    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        boolean kiemtra = KiemTra();
        if (!kiemtra) {
            return;
        }

        String maNhanVien = txtManv.getText().trim();
        String tenNhanVien = txtTennv.getText().trim();
        String cccd = txtCCCD.getText().trim();
        String queQuan = txtQueQuan.getText().trim();
        String ghiChu = txtGC.getText().trim();

        if (maNhanVien.isEmpty() || tenNhanVien.isEmpty()) {
            ThongBao("Mã nhân viên và tên nhân viên không được để trống!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        java.util.Date ngaySinhUtil = datengaysinh.getDate();
        if (ngaySinhUtil == null) {
            ThongBao("Vui lòng chọn ngày sinh!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        java.sql.Date ngaySinh = new java.sql.Date(ngaySinhUtil.getTime());

        java.util.Date ngayVlUtil = dateNgayvl.getDate();
        if (ngayVlUtil == null) {
            ThongBao("Vui lòng chọn ngày vào làm!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        java.sql.Date ngayVaoLam = new java.sql.Date(ngayVlUtil.getTime());

        String thamNien = tinhThamNien(ngayVlUtil);
        jLabel10.setText("Thâm niên: " + thamNien);

        if (jComboGT.getSelectedItem() == null || jComboGT.getSelectedItem().toString().equals("None")) {
            ThongBao("Vui lòng chọn giới tính!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String gioiTinh = jComboGT.getSelectedItem().toString();

        if (cboPB.getSelectedItem() == null || cboPB.getSelectedIndex() == 0) {
            ThongBao("Vui lòng chọn phòng ban!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String tenPhongBan = cboPB.getSelectedItem().toString();
        if (tenPhongBan == null || tenPhongBan.equals("-- Chọn phòng ban --")) {
            ThongBao("Phòng ban được chọn không hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cboCV.getSelectedItem() == null || cboCV.getSelectedItem().toString().equals("None")) {
            ThongBao("Vui lòng chọn chức vụ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String chucVu = cboCV.getSelectedItem().toString();

        int sdt = 0;
        try {
            String sdtText = txtSDT.getText().trim();
            if (!sdtText.isEmpty()) {
                sdt = Integer.parseInt(sdtText);
            }
        } catch (NumberFormatException e) {
            ThongBao("Số điện thoại không hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int luongCoBan = 0;
        try {
            String lcbText = txtLCB.getText().trim();
            if (!lcbText.isEmpty()) {
                luongCoBan = Integer.parseInt(lcbText);
            }
        } catch (NumberFormatException e) {
            ThongBao("Lương cơ bản không hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String loaiHD = "";
        if (cboLHD.getSelectedItem() != null) {
            loaiHD = cboLHD.getSelectedItem().toString();
        }

        // Câu lệnh SQL UPDATE
        String sql = "UPDATE Tb_NhanVien SET TenNhanVien = ?, NgaySinh = ?, GioiTinh = ?, QueQuan = ?, CCCD = ?, SDT = ?, "
                + "NgayVaoLam = ?, ThamNien = ?, PhongBan = ?, ChucVu = ?, LuongCoBan = ?, LoaiHD = ?, GhiChu = ? "
                + "WHERE MaNhanVien = ?";

        try (Connection conn = connection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, tenNhanVien);
            ps.setDate(2, ngaySinh);
            ps.setString(3, gioiTinh);
            ps.setString(4, queQuan);
            ps.setString(5, cccd);
            ps.setInt(6, sdt);
            ps.setDate(7, ngayVaoLam);
            ps.setString(8, thamNien);
            ps.setString(9, tenPhongBan); // Lưu tên phòng ban vào cột "PhongBan"

            ps.setString(10, chucVu);
            ps.setInt(11, luongCoBan);
            ps.setString(12, loaiHD);
            ps.setString(13, ghiChu);
            ps.setString(14, maNhanVien); // WHERE điều kiện

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                ThongBao("Đã cập nhật nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                resetForm();
            } else {
                ThongBao("Không tìm thấy nhân viên để cập nhật!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Có lỗi xảy ra khi cập nhật nhân viên: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        laydulieunhanvien(); // Load lại danh sách sau khi sửa
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
        txtCCCD.setText("");
        txtQueQuan.setText("");
        txtSDT.setText("");
        txtLCB.setText("");
        txtGC.setText("");
        datengaysinh.setDate(null);
        dateNgayvl.setDate(null);
        jComboGT.setSelectedIndex(0);
        cboPB.setSelectedIndex(0);
        cboCV.setSelectedIndex(0);
        cboLHD.setSelectedIndex(0);
        jLabel10.setText("Thâm niên: ");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed

        String tuKhoa = txtTimkiem.getText().trim();

        // Nếu ô tìm kiếm rỗng, hiển thị tất cả dữ liệu
        if (tuKhoa.isEmpty()) {
            laydulieunhanvien();
            return;
        }

        try (Connection conn = connection.getConnection()) {
            // Tìm kiếm theo nhiều tiêu chí: Mã NV, Tên NV, CCCD, SĐT, Phòng ban (mã), Chức vụ, Quê quán
            String searchSql = "SELECT MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, QueQuan, "
                    + "CCCD, SDT, NgayVaoLam, ThamNien, PhongBan, "
                    + "ChucVu, LuongCoBan, LoaiHD, GhiChu "
                    + "FROM Tb_NhanVien "
                    + "WHERE MaNhanVien LIKE ? OR "
                    + "TenNhanVien LIKE ? OR "
                    + "CCCD LIKE ? OR "
                    + "CAST(SDT AS NVARCHAR) LIKE ? OR "
                    + "PhongBan LIKE ? OR "
                    + "ChucVu LIKE ? OR "
                    + "QueQuan LIKE ?";

            PreparedStatement ps = conn.prepareStatement(searchSql);

            String searchPattern = "%" + tuKhoa + "%";
            for (int i = 1; i <= 7; i++) {
                ps.setString(i, searchPattern);
            }

            // Tạo model cho bảng
            Object[] columnNames = {
                "Mã NV", "Tên NV", "Ngày Sinh", "Giới Tính", "Quê Quán",
                "CCCD", "SĐT", "Ngày Vào Làm", "Thâm Niên", "Phòng Ban",
                "Chức Vụ", "Lương CB", "Loại HĐ", "Ghi Chú"
            };
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            ResultSet rs = ps.executeQuery();
            int soKetQua = 0;

            while (rs.next()) {
                Object[] item = new Object[14];
                item[0] = rs.getString("MaNhanVien");
                item[1] = rs.getString("TenNhanVien");
                item[2] = rs.getDate("NgaySinh");
                item[3] = rs.getString("GioiTinh");
                item[4] = rs.getString("QueQuan");
                item[5] = rs.getString("CCCD");

                // Nên dùng String để hiển thị SDT (nếu có đầu 0)
                item[6] = String.valueOf(rs.getInt("SDT"));

                item[7] = rs.getDate("NgayVaoLam");
                item[8] = rs.getString("ThamNien");
                item[9] = rs.getString("PhongBan"); // Lấy mã phòng ban
                item[10] = rs.getString("ChucVu");
                item[11] = rs.getInt("LuongCoBan");
                item[12] = rs.getString("LoaiHD");
                item[13] = rs.getString("GhiChu");

                tableModel.addRow(item);
                soKetQua++;
            }

            jTable1.setModel(tableModel);

            if (soKetQua == 0) {
                ThongBao("Không tìm thấy nhân viên nào với từ khóa: " + tuKhoa,
                        "Kết quả tìm kiếm", JOptionPane.INFORMATION_MESSAGE);
            } else {
                ThongBao("Tìm thấy " + soKetQua + " nhân viên với từ khóa: " + tuKhoa,
                        "Kết quả tìm kiếm", JOptionPane.INFORMATION_MESSAGE);
            }

            rs.close();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Có lỗi xảy ra trong quá trình tìm kiếm: " + e.getMessage(),
                    "Lỗi", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        Nhapdulieu();
    }//GEN-LAST:event_btnNhapActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       int choice = JOptionPane.showConfirmDialog(
            this,
            "Bạn có chắc chắn muốn thoát?",
            "Xác nhận thoát",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
    );

    if (choice == JOptionPane.YES_OPTION) {
        new Home().setVisible(true); // Mở lại JFrame1 (Home)
        this.dispose(); // Đóng cửa sổ hiện tại
    }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void btnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatActionPerformed
        String[] options = {"Xuất PDF", "Xuất Excel", "Hủy"};
        int choice = JOptionPane.showOptionDialog(this,
                "Chọn định dạng bạn muốn xuất:",
                "Xuất dữ liệu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == 0) {
            xuatPDF();
        } else if (choice == 1) {
            xuatExcel();
        }
    }//GEN-LAST:event_btnXuatActionPerformed
    private void xuatPDF() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Lưu file PDF");
        fileChooser.setSelectedFile(new File("nhanvien.pdf"));
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try {
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(fileToSave));
                document.open();

                PdfPTable pdfTable = new PdfPTable(jTable1.getColumnCount());
                // Thêm tiêu đề
                for (int i = 0; i < jTable1.getColumnCount(); i++) {
                    pdfTable.addCell(new PdfPCell(new Phrase(jTable1.getColumnName(i))));
                }
                // Thêm dữ liệu
                for (int row = 0; row < jTable1.getRowCount(); row++) {
                    for (int col = 0; col < jTable1.getColumnCount(); col++) {
                        Object value = jTable1.getValueAt(row, col);
                        pdfTable.addCell(value != null ? value.toString() : "");
                    }
                }

                document.add(pdfTable);
                document.close();
                ThongBao("Xuất PDF thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
                ThongBao("Lỗi khi xuất PDF: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void xuatExcel() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Lưu file Excel");
        fileChooser.setSelectedFile(new File("nhanvien.xlsx"));
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try (Workbook workbook = new XSSFWorkbook()) {
                Sheet sheet = workbook.createSheet("DanhSachNhanVien");

                // Tạo hàng tiêu đề
                Row headerRow = sheet.createRow(0);
                for (int i = 0; i < jTable1.getColumnCount(); i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(jTable1.getColumnName(i));
                }

                // Thêm dữ liệu
                for (int row = 0; row < jTable1.getRowCount(); row++) {
                    Row excelRow = sheet.createRow(row + 1);
                    for (int col = 0; col < jTable1.getColumnCount(); col++) {
                        Object value = jTable1.getValueAt(row, col);
                        Cell cell = excelRow.createCell(col);
                        cell.setCellValue(value != null ? value.toString() : "");
                    }
                }

                FileOutputStream fileOut = new FileOutputStream(fileToSave);
                workbook.write(fileOut);
                fileOut.close();
                ThongBao("Xuất Excel thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
                ThongBao("Lỗi khi xuất Excel: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void resetForm() {
        txtManv.setText("");
        txtTennv.setText("");
        txtCCCD.setText("");
        txtQueQuan.setText("");
        txtSDT.setText("");
        txtLCB.setText("");
        txtGC.setText("");
        datengaysinh.setDate(null);
        dateNgayvl.setDate(null);
        jComboGT.setSelectedIndex(0);
        cboPB.setSelectedIndex(0);
        cboCV.setSelectedIndex(0);
        cboLHD.setSelectedIndex(0);
        jLabel10.setText("Thâm niên: ");
    }

    private void setupDateListener() {
        dateNgayvl.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (dateNgayvl.getDate() != null) {
                    String thamNien = tinhThamNien(dateNgayvl.getDate());
                    jLabel10.setText("Thâm niên: " + thamNien);
                } else {
                    jLabel10.setText("Thâm niên: ");
                }
            }
        });
    }

    private boolean KiemTra() {
        String manv = txtManv.getText().trim();
        String tennv = txtTennv.getText().trim();
        java.util.Date ngaysinh = datengaysinh.getDate();
        String gioitinh = (String) jComboGT.getSelectedItem();
        String cccd = txtCCCD.getText().trim();
        String quequan = txtQueQuan.getText().trim();
        String sdt = txtSDT.getText().trim();
        java.util.Date ngayvaolam = dateNgayvl.getDate();
        String phongban = (String) cboPB.getSelectedItem();
        String chucvu = (String) cboCV.getSelectedItem();
        String lcb = txtLCB.getText().trim();
        String loaihd = (String) cboLHD.getSelectedItem();

        String thongBao = "";

        // Kiểm tra các trường không được để trống
        if (manv.isEmpty()) {
            thongBao += "Vui lòng nhập Mã nhân viên!\n";
        }
        if (tennv.isEmpty()) {
            thongBao += "Vui lòng nhập Tên nhân viên!\n";
        }
        if (ngaysinh == null) {
            thongBao += "Vui lòng chọn Ngày sinh!\n";
        }
        if (gioitinh == null || gioitinh.isEmpty()) {
            thongBao += "Vui lòng chọn Giới tính!\n";
        }
        if (cccd.isEmpty()) {
            thongBao += "Vui lòng nhập CCCD!\n";
        }
        if (quequan.isEmpty()) {
            thongBao += "Vui lòng nhập Quê quán!\n";
        }
        if (sdt.isEmpty()) {
            thongBao += "Vui lòng nhập Số điện thoại!\n";
        }
        if (ngayvaolam == null) {
        thongBao += "Vui lòng chọn Ngày vào làm!\n";
    } else {
        java.util.Date ngayHienTai = new java.util.Date();
        if (ngayvaolam.after(ngayHienTai)) {
            thongBao += "Ngày vào làm không được lớn hơn ngày hiện tại!\n";
        }
    }
        if (phongban == null || phongban.isEmpty()) {
            thongBao += "Vui lòng chọn Phòng ban!\n";
        }
        if (chucvu == null || chucvu.isEmpty()) {
            thongBao += "Vui lòng chọn Chức vụ!\n";
        }
        if (lcb.isEmpty()) {
            thongBao += "Vui lòng nhập Lương cơ bản!\n";
        }
          if (loaihd == null || loaihd.isEmpty() || loaihd.equalsIgnoreCase("None")) {
        thongBao += "Vui lòng chọn Loại hợp đồng hợp lệ!\n";
    }

        // Kiểm tra CCCD là số và không âm
        if (!cccd.isEmpty()) {
            try {
                long soCCCD = Long.parseLong(cccd);
                if (soCCCD < 0) {
                    thongBao += "CCCD không được là số âm!\n";
                }
            } catch (NumberFormatException e) {
                thongBao += "CCCD phải là số!\n";
            }
        }

        // Kiểm tra SDT là số và đủ 10 chữ số
        if (!sdt.isEmpty()) {
            if (!sdt.matches("\\d{10}")) {
                thongBao += "Số điện thoại phải đúng 10 chữ số và không âm!\n";
            }
        }

        // Kiểm tra LCB là số và không âm
        if (!lcb.isEmpty()) {
            try {
                double soLCB = Double.parseDouble(lcb);
                if (soLCB < 0) {
                    thongBao += "Lương cơ bản không được là số âm!\n";
                }
            } catch (NumberFormatException e) {
                thongBao += "Lương cơ bản phải là số!\n";
            }
        }

        // Hiển thị kết quả
        if (thongBao.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, thongBao, "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private String tinhThamNien(java.util.Date ngayVaoLam) {
        if (ngayVaoLam == null) {
            return "0 ngày";
        }

        java.util.Date ngayHienTai = new java.util.Date();
        long khoangCach = ngayHienTai.getTime() - ngayVaoLam.getTime();

        // Tính số ngày
        long soNgay = khoangCach / (24 * 60 * 60 * 1000);

        if (soNgay < 30) {
            return soNgay + " ngày";
        } else if (soNgay < 365) {
            long soThang = soNgay / 30;
            return soThang + " tháng";
        } else {
            long soNam = soNgay / 365;
            long soThangConLai = (soNgay % 365) / 30;
            if (soThangConLai > 0) {
                return soNam + " năm " + soThangConLai + " tháng";
            } else {
                return soNam + " năm";
            }
        }
    }

    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
    private HashMap<String, String> mapPhongBan = new HashMap<>();

    private void loadDanhSachPhongBan() {
        try {
            System.out.println("Bắt đầu load danh sách phòng ban...");

            // Xóa dữ liệu cũ
            cboPB.removeAllItems();
            mapPhongBan.clear();

            // Kết nối database
            String url = "jdbc:sqlserver://localhost:1433;databaseName=nhansucongty;encrypt=true;trustServerCertificate=true";
            String username = "sa"; // Thay đổi theo thông tin của bạn
            String password = "123"; // Thay đổi theo thông tin của bạn

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "SELECT MaPB, TenPB FROM Tb_PhongBan ORDER BY TenPB";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            // Thêm item mặc định
            cboPB.addItem("-- Chọn phòng ban --");
            mapPhongBan.put("-- Chọn phòng ban --", "");

            // Load dữ liệu từ database
            while (rs.next()) {
                String maPB = rs.getString("MaPB");
                String tenPB = rs.getString("TenPB");

                System.out.println("Load: " + maPB + " - " + tenPB);

                cboPB.addItem(tenPB); // Thêm TÊN phòng ban vào ComboBox
                mapPhongBan.put(tenPB, maPB); // Lưu mapping: Tên -> Mã
            }

            // Đóng kết nối
            rs.close();
            pstmt.close();
            conn.close();

            // Chọn item đầu tiên
            cboPB.setSelectedIndex(0);

            System.out.println("Load danh sách phòng ban thành công! Tổng: " + (cboPB.getItemCount() - 1) + " phòng ban");

        } catch (SQLException e) {
            System.err.println("Lỗi SQL: " + e.getMessage());
            e.printStackTrace();

            // Thêm item báo lỗi
            cboPB.removeAllItems();
            cboPB.addItem("-- Lỗi kết nối database --");

            JOptionPane.showMessageDialog(this,
                    "Không thể tải danh sách phòng ban!\nLỗi: " + e.getMessage(),
                    "Lỗi kết nối",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.err.println("Lỗi khác: " + e.getMessage());
            e.printStackTrace();

            cboPB.removeAllItems();
            cboPB.addItem("-- Có lỗi xảy ra --");

            JOptionPane.showMessageDialog(this,
                    "Có lỗi xảy ra khi tải danh sách phòng ban: " + e.getMessage(),
                    "Lỗi",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Nhapdulieu() {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            // Lấy dữ liệu từ bảng (dòng được chọn)
            String maNV = jTable1.getValueAt(selectedRow, 0).toString();
            String tenNV = jTable1.getValueAt(selectedRow, 1).toString();
            Date ngaySinh = (Date) jTable1.getValueAt(selectedRow, 2);
            String gioiTinh = jTable1.getValueAt(selectedRow, 3).toString();
            String queQuan = jTable1.getValueAt(selectedRow, 4).toString();
            String cccd = jTable1.getValueAt(selectedRow, 5).toString();
            String sdt = jTable1.getValueAt(selectedRow, 6).toString();
            Date ngayVaoLam = (Date) jTable1.getValueAt(selectedRow, 7);
            String thamNien = jTable1.getValueAt(selectedRow, 8).toString();
            String tenPhongBan = jTable1.getValueAt(selectedRow, 9).toString();
            String chucVu = jTable1.getValueAt(selectedRow, 10).toString();
            String luongCB = jTable1.getValueAt(selectedRow, 11).toString();
            String loaiHD = jTable1.getValueAt(selectedRow, 12).toString();
            String ghiChu = jTable1.getValueAt(selectedRow, 13).toString();

            // Set dữ liệu lên các trường
            txtManv.setText(maNV);
            txtTennv.setText(tenNV);
            datengaysinh.setDate(ngaySinh);
            jComboGT.setSelectedItem(gioiTinh);
            txtQueQuan.setText(queQuan);
            txtCCCD.setText(cccd);
            txtSDT.setText(sdt);
            dateNgayvl.setDate(ngayVaoLam);
            jLabel10.setText(thamNien);
            cboPB.setSelectedItem(tenPhongBan); // Giả sử combobox chứa tên phòng ban
            cboCV.setSelectedItem(chucVu);
            txtLCB.setText(luongCB);
            cboLHD.setSelectedItem(loaiHD);
            txtGC.setText(ghiChu);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng trong bảng để nhập dữ liệu.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void laydulieunhanvien() {
        String sql = "SELECT MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, QueQuan, "
                + "CCCD, SDT, NgayVaoLam, ThamNien, PhongBan, "
                + "ChucVu, LuongCoBan, LoaiHD, GhiChu "
                + "FROM Tb_NhanVien";

        try (Connection conn = connection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            DefaultTableModel tableModel = new DefaultTableModel(new Object[]{
                "Mã NV", "Tên NV", "Ngày Sinh", "Giới Tính", "Quê Quán", "CCCD", "SĐT",
                "Ngày Vào Làm", "Thâm Niên", "Phòng Ban", "Chức Vụ", "Lương CB", "Loại HĐ", "Ghi Chú"
            }, 0);
            jTable1.setModel(tableModel);

            while (rs.next()) {
                Object[] row = new Object[14];
                row[0] = rs.getString("MaNhanVien");
                row[1] = rs.getString("TenNhanVien");
                row[2] = rs.getDate("NgaySinh");
                row[3] = rs.getString("GioiTinh");
                row[4] = rs.getString("QueQuan");
                row[5] = rs.getString("CCCD");

                // SDT nên dùng getString để giữ số 0 đầu tiên (nếu có)
                row[6] = rs.getString("SDT");

                row[7] = rs.getDate("NgayVaoLam");
                row[8] = rs.getString("ThamNien");

                // Phòng ban: hiện mã phòng ban trực tiếp
                row[9] = rs.getString("PhongBan");

                row[10] = rs.getString("ChucVu");
                row[11] = rs.getInt("LuongCoBan");
                row[12] = rs.getString("LoaiHD");
                row[13] = rs.getString("GhiChu");

                tableModel.addRow(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu nhân viên", "Lỗi", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuat;
    private javax.swing.JComboBox<String> cboCV;
    private javax.swing.JComboBox<String> cboLHD;
    private javax.swing.JComboBox<String> cboPB;
    private com.toedter.calendar.JDateChooser dateNgayvl;
    private com.toedter.calendar.JDateChooser datengaysinh;
    private javax.swing.JComboBox<String> jComboGT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtGC;
    private javax.swing.JTextField txtLCB;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTennv;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
