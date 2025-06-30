/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlynhanvien;

import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.PopupMenu;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        txtTimkiem.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                timkiemhopdong(txtTimkiem.getText().trim());
            }
        });
        cboTennld.addActionListener(e -> hienThiThongTinNhanVien());
        DateNgayhl.addPropertyChangeListener("date", e -> tinhNgayHetHan());

        loadTenNhanVien();
        hienThiThongTinNhanVien();
        laydulieuhopdong();
    }
    HopDong hd = new HopDong();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtmahd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbmanv = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DateNgayky = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblcb = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DateNgayhl = new com.toedter.calendar.JDateChooser();
        lbpb = new javax.swing.JLabel();
        lbchucvu = new javax.swing.JLabel();
        lbngayhh = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboTennld = new javax.swing.JComboBox<>();
        lbtennv = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnNhap = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnTimkiem = new javax.swing.JButton();
        btnXuat = new javax.swing.JButton();
        lbthan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbngayvl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 745));
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtmahd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtmahd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmahdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Mã hợp đồng");

        lbmanv.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbmanv.setText("Mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Tên nhân viên");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Thời hạn");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Tên NLĐ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        DateNgayky.setBorder(new javax.swing.border.MatteBorder(null));
        DateNgayky.setDateFormatString("dd/MM/yyyy");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Ngày ký");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Ngày có hiệu lực");

        lblcb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcb.setText("Lương cơ bản");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Ngày hết hạn");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Phòng ban");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Chức vụ");

        DateNgayhl.setBorder(new javax.swing.border.MatteBorder(null));
        DateNgayhl.setDateFormatString("dd/MM/yyyy");

        lbpb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbpb.setText("Phòng ban");

        lbchucvu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbchucvu.setText("Chức vụ");

        lbngayhh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbngayhh.setText("Ngày hết hạn");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("Lương cơ bản");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel18)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateNgayky, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbngayhh)
                    .addComponent(lblcb)
                    .addComponent(lbchucvu)
                    .addComponent(lbpb)
                    .addComponent(DateNgayhl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateNgayky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(DateNgayhl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbngayhh))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbpb))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lbchucvu))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblcb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Mã nhân viên");

        cboTennld.setBorder(new javax.swing.border.MatteBorder(null));

        lbtennv.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbtennv.setText("Tên nhân viên");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setBorder(new javax.swing.border.MatteBorder(null));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnUpd.setText("Sửa");
        btnUpd.setBorder(new javax.swing.border.MatteBorder(null));
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDel.setText("Xoá");
        btnDel.setBorder(new javax.swing.border.MatteBorder(null));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(new javax.swing.border.MatteBorder(null));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnNhap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNhap.setText("Nhập");
        btnNhap.setBorder(new javax.swing.border.MatteBorder(null));
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        txtTimkiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Tìm kiếm");

        btnTimkiem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.setBorder(new javax.swing.border.MatteBorder(null));
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        btnXuat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnXuat.setText("Xuất");
        btnXuat.setBorder(new javax.swing.border.MatteBorder(null));
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(166, 166, 166))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80))))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbthan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbthan.setText("Thời hạn");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Ngày vào làm");

        lbngayvl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbngayvl.setText("Ngày vào làm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(cboTennld, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbtennv)
                                .addGap(197, 197, 197))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbmanv)
                                    .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbthan)
                                    .addComponent(lbngayvl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboTennld, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbtennv))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbmanv))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbthan))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbngayvl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        luuHopDong();
        laydulieuhopdong();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        suaHopDong();
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
                String deleteSql = "DELETE FROM Tb_HopDong WHERE TenNLD = ?";
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
        timkiemhopdong(txtTimkiem.getText().trim());
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetForm();
    }//GEN-LAST:event_btnResetActionPerformed

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

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemActionPerformed

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

    private void txtmahdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmahdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmahdActionPerformed
    private void xuatPDF() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Lưu file PDF");
        fileChooser.setSelectedFile(new File("hopdong.pdf"));
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
        fileChooser.setSelectedFile(new File("hopdong.xlsx"));
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try (Workbook workbook = new XSSFWorkbook()) {
                Sheet sheet = workbook.createSheet("DanhSachHopDong");

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

    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
// 1. Phương thức load tên nhân viên vào JComboBox

   // 1. Load danh sách nhân viên vào ComboBox
private void loadTenNhanVien() {
    try {
        String sql = "SELECT MaNhanVien, TenNhanVien FROM Tb_NhanVien ORDER BY TenNhanVien";
        Connection conn = connection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        cboTennld.removeAllItems();
        cboTennld.addItem("-- Chọn nhân viên --");

        while (rs.next()) {
            String ma = rs.getString("MaNhanVien");
            String ten = rs.getString("TenNhanVien");
            cboTennld.addItem(ma + " - " + ten);  // Định dạng: "NV01 - Nguyễn Văn A"
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi load danh sách nhân viên: " + e.getMessage());
    }
}


// 2. Phương thức hiển thị thông tin nhân viên khi chọn từ ComboBox
   // 2. Hiển thị thông tin nhân viên khi chọn từ ComboBox
private void hienThiThongTinNhanVien() {
    String selectedItem = (String) cboTennld.getSelectedItem();

    if (selectedItem == null || selectedItem.equals("-- Chọn nhân viên --")) {
        // Reset tất cả label về mặc định
        lbtennv.setText("...");
        lbmanv.setText("...");
        lbthan.setText("...");
        lbpb.setText("...");
        lbchucvu.setText("...");
        lblcb.setText("...");
        lbngayhh.setText("...");
        lbngayvl.setText("...");
        return;
    }

    // Tách MaNhanVien từ chuỗi "NV01 - Nguyễn Văn A"
    String[] parts = selectedItem.split(" - ");
    if (parts.length < 1) return;
    String maNV = parts[0];

    String sql = "SELECT TenNhanVien, MaNhanVien, LoaiHD, PhongBan, ChucVu, LuongCoBan, NgayVaoLam "
               + "FROM Tb_NhanVien WHERE MaNhanVien = ?";

    try (Connection conn = connection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, maNV);

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                lbtennv.setText(rs.getString("TenNhanVien"));
                lbmanv.setText(rs.getString("MaNhanVien"));
                lbthan.setText(rs.getString("LoaiHD"));
                lbpb.setText(rs.getString("PhongBan"));  // hoặc bạn có thể truy vấn để lấy tên phòng ban nếu cần
                lbchucvu.setText(rs.getString("ChucVu"));
                lblcb.setText(String.valueOf(rs.getInt("LuongCoBan")));

                // Hiển thị ngày vào làm
                java.sql.Date ngayVaoLam = rs.getDate("NgayVaoLam");
                if (ngayVaoLam != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    lbngayvl.setText(sdf.format(ngayVaoLam));
                } else {
                    lbngayvl.setText("...");
                }

                // Gọi hàm tính ngày hết hạn hợp đồng
                tinhNgayHetHan(); // Giả định hàm này đã dùng đúng lbngayvl
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi lấy thông tin nhân viên: " + e.getMessage());
    }
}

    // 3. Phương thức tính ngày hết hạn dựa trên loại hợp đồng
    private void tinhNgayHetHan() {
        if (DateNgayhl.getDate() == null || lbthan.getText().equals("...")) {
            lbngayhh.setText("...");
            return;
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(DateNgayhl.getDate());

        String loaiHD = lbthan.getText().trim();

        // Tính ngày hết hạn dựa trên loại hợp đồng
        switch (loaiHD) {
            case "None":
                lbngayhh.setText("Chưa xác định");
                return;
            case "Hợp đồng không xác định thời hạn":
                lbngayhh.setText("Không có thời hạn");
                return;
            case "3 tháng":
                cal.add(Calendar.MONTH, 3);
                break;
            case "5 tháng":
                cal.add(Calendar.MONTH, 5);
                break;
            case "6 tháng":
                cal.add(Calendar.MONTH, 6);
                break;
            case "1 năm":
                cal.add(Calendar.YEAR, 1);
                break;
            case "2 năm":
                cal.add(Calendar.YEAR, 2);
                break;
            case "3 năm":
                cal.add(Calendar.YEAR, 3);
                break;
            case "4 năm":
                cal.add(Calendar.YEAR, 4);
                break;
            case "5 năm":
                cal.add(Calendar.YEAR, 5);
                break;
            case "Hợp đồng làm việc bán thời gian":
                cal.add(Calendar.YEAR, 1); // Mặc định 1 năm cho bán thời gian
                break;
            case "Hợp đồng cộng tác viên":
                cal.add(Calendar.MONTH, 6); // Mặc định 6 tháng cho cộng tác viên
                break;
            case "Hợp đồng thử việc":
                cal.add(Calendar.MONTH, 2); // 2 tháng cho thử việc
                break;
            default:
                lbngayhh.setText("Loại hợp đồng không xác định");
                return;
        }

        // Hiển thị ngày hết hạn
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayHetHan = LocalDate.of(
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DAY_OF_MONTH)
        );
        lbngayhh.setText(ngayHetHan.format(formatter));
    }
    // 4. Phương thức kiểm tra ngày có hiệu lực <= ngày vào làm

    private boolean kiemTraNgayCoHieuLuc() {
    if (DateNgayhl.getDate() == null || DateNgayky.getDate() == null || lbmanv.getText().equals("...")) {
        return true; // Không kiểm tra nếu chưa chọn đủ thông tin
    }

    try {
        String sql = "SELECT NgayVaoLam FROM Tb_NhanVien WHERE MaNhanVien = ?";
        Connection conn = connection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, lbmanv.getText());
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            // Lấy ngày từ CSDL và JDateChooser
            Date ngayVaoLam = rs.getDate("NgayVaoLam");
            Date ngayKy = new Date(DateNgayky.getDate().getTime());
            Date ngayHL = new Date(DateNgayhl.getDate().getTime());

            // Kiểm tra ngày ký <= ngày có hiệu lực
            if (ngayKy.after(ngayHL)) {
                JOptionPane.showMessageDialog(this,
                        "Ngày ký không được lớn hơn ngày có hiệu lực!",
                        "Lỗi",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Kiểm tra ngày ký <= ngày vào làm
            if (ngayKy.after(ngayVaoLam)) {
                JOptionPane.showMessageDialog(this,
                        "Ngày ký không được lớn hơn ngày vào làm!",
                        "Lỗi",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // ✅ Kiểm tra ngày có hiệu lực < ngày vào làm
            if (!ngayHL.before(ngayVaoLam)) {
                JOptionPane.showMessageDialog(this,
                        "Ngày có hiệu lực phải nhỏ hơn ngày vào làm!",
                        "Lỗi",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        rs.close();
        ps.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi kiểm tra ngày: " + e.getMessage());
        return false;
    }

    return true;
}


    // 5. Phương thức lưu hợp đồng
    private boolean kiemTraMaHopDongTonTai(String maHD) {
        try {
            String sql = "SELECT COUNT(*) as count FROM Tb_HopDong WHERE MaHD = ?";
            Connection conn = connection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maHD);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("count") > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi kiểm tra mã hợp đồng: " + e.getMessage());
        }
        return false;
    }

    private void luuHopDong() {
        // Kiểm tra dữ liệu đầu vào
        if (!kiemTraDuLieu()) {
            return;
        }

        try {
            // Kiểm tra xem mã hợp đồng đã tồn tại chưa
            if (kiemTraMaHopDongTonTai(txtmahd.getText())) {
                JOptionPane.showMessageDialog(this, "Mã hợp đồng đã tồn tại!");
                return;
            }
            String sql = "INSERT INTO Tb_HopDong (TenNLD, MaHD, MaNhanVien, TenNhanVien, "
                    + "ThoiHan, NgayKy, NgayCoHL, NgayHetHan, PhongBan, ChucVu, LuongCoBan) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Connection conn = connection.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, lbtennv.getText());
            ps.setString(2, txtmahd.getText());
            ps.setString(3, lbmanv.getText());
            ps.setString(4, lbtennv.getText());
            ps.setString(5, lbthan.getText());
            ps.setDate(6, new Date(DateNgayky.getDate().getTime()));
            ps.setDate(7, new Date(DateNgayhl.getDate().getTime()));

            // Xử lý ngày hết hạn
            if (lbngayhh.getText().equals("Không có thời hạn")) {
                ps.setDate(8, null);
            } else {
                // Chuyển đổi từ string sang Date
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate ngayHH = LocalDate.parse(lbngayhh.getText(), formatter);
                ps.setDate(8, Date.valueOf(ngayHH));
            }

            ps.setString(9, lbpb.getText());
            ps.setString(10, lbchucvu.getText());
            ps.setInt(11, Integer.parseInt(lblcb.getText()));

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Lưu hợp đồng thành công!");
                resetForm();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu hợp đồng: " + e.getMessage());
        }
    }
    // 5a. Phương thức sửa hợp đồng

    private void suaHopDong() {
        // Kiểm tra dữ liệu đầu vào
        if (!kiemTraDuLieu()) {
            return;
        }

        // Kiểm tra xem mã hợp đồng có tồn tại không
        if (!kiemTraMaHopDongTonTai(txtmahd.getText())) {
            JOptionPane.showMessageDialog(this, "Mã hợp đồng không tồn tại!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Bạn có chắc chắn muốn sửa hợp đồng này?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            String sql = "UPDATE Tb_HopDong SET TenNLD=?, MaNhanVien=?, TenNhanVien=?, "
                    + "ThoiHan=?, NgayKy=?, NgayCoHL=?, NgayHetHan=?, PhongBan=?, ChucVu=?, LuongCoBan=? "
                    + "WHERE MaHD=?";
            Connection conn = connection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, lbtennv.getText());
            ps.setString(2, lbmanv.getText());
            ps.setString(3, lbtennv.getText());
            ps.setString(4, lbthan.getText());
            ps.setDate(5, new Date(DateNgayky.getDate().getTime()));
            ps.setDate(6, new Date(DateNgayhl.getDate().getTime()));

            // Xử lý ngày hết hạn
            if (lbngayhh.getText().equals("Không có thời hạn") || lbngayhh.getText().equals("Chưa xác định")) {
                ps.setDate(7, null);
            } else {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate ngayHH = LocalDate.parse(lbngayhh.getText(), formatter);
                ps.setDate(7, Date.valueOf(ngayHH));
            }

            ps.setString(8, lbpb.getText());
            ps.setString(9, lbchucvu.getText());
            ps.setInt(10, Integer.parseInt(lblcb.getText()));
            ps.setString(11, txtmahd.getText());

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Sửa hợp đồng thành công!");
                resetForm();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi sửa hợp đồng: " + e.getMessage());
        }
    }

    private boolean kiemTraDuLieu() {
        String maHD = txtmahd.getText().trim();
        String tenNV = (String) cboTennld.getSelectedItem();

        // Kiểm tra mã hợp đồng rỗng
        if (maHD.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hợp đồng!");
            txtmahd.requestFocus();
            return false;
        }

        // Kiểm tra nhân viên được chọn
        if (cboTennld.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên!");
            cboTennld.requestFocus();
            return false;
        }

        // Kiểm tra ngày ký
        if (DateNgayky.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày ký!");
            DateNgayky.requestFocus();
            return false;
        }

        // Kiểm tra ngày có hiệu lực
        if (DateNgayhl.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày có hiệu lực!");
            DateNgayhl.requestFocus();
            return false;
        }

        // Kiểm tra ngày có hiệu lực hợp lệ
        if (!kiemTraNgayCoHieuLuc()) {
            return false;
        }

        // Kiểm tra mã hợp đồng đã tồn tại hoặc nhân viên đã có hợp đồng
        try (Connection conn = connection.getConnection()) {
            String sql = "SELECT COUNT(*) FROM Tb_HopDong WHERE MaHD = ? OR TenNhanVien = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maHD);
            ps.setString(2, tenNV);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    JOptionPane.showMessageDialog(this, "Mã hợp đồng đã tồn tại hoặc nhân viên này đã có hợp đồng!");
                    return false;
                }
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi kiểm tra dữ liệu: " + e.getMessage());
            return false;
        }

        return true;
    }

// 8. Phương thức thiết lập các sự kiệ
    private void setupEventHandlers() {
        // Sự kiện khi chọn nhân viên từ ComboBox
        cboTennld.addActionListener(e -> hienThiThongTinNhanVien());

        // Sự kiện khi thay đổi ngày có hiệu lực
        DateNgayhl.addPropertyChangeListener("date", e -> {
            if (e.getNewValue() != null) {
                tinhNgayHetHan();
            }
        });

        // Sự kiện cho các button (giả sử bạn có các button này)
        // btnLuu.addActionListener(e -> luuHopDong());
        // btnThem.addActionListener(e -> resetForm());
    }

    private void resetForm() {
        txtmahd.setText("");
        cboTennld.setSelectedIndex(0);
        DateNgayky.setDate(null);
        DateNgayhl.setDate(null);
        lbtennv.setText("...");
        lbmanv.setText("...");
        lbthan.setText("...");
        lbpb.setText("...");
        lbchucvu.setText("...");
        lblcb.setText("...");
        lbngayhh.setText("...");
    }

    private void timkiemhopdong(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            laydulieuhopdong();
            return;
        }

        String sql = "SELECT TenNLD, MaHD, MaNhanVien, TenNhanVien, ThoiHan, "
                + "NgayKy, NgayCoHL, NgayHetHan, PhongBan, "
                + "ChucVu, LuongCoBan "
                + "FROM Tb_HopDong "
                + "WHERE TenNLD LIKE ? OR TenNhanVien LIKE ? OR MaNhanVien LIKE ? OR MaHD LIKE ?";

        try (Connection conn = connection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            String searchPattern = "%" + keyword + "%";
            for (int i = 1; i <= 4; i++) {
                ps.setString(i, searchPattern);
            }

            ResultSet rs = ps.executeQuery();

            DefaultTableModel tableModel = new DefaultTableModel(
                    new Object[]{"Tên NLĐ", "Mã hợp đồng", "Mã nhân viên", "Tên nhân viên",
                        "Thời hạn", "Ngày ký", "Ngày có hiệu lực", "Ngày hết hạn",
                        "Phòng ban", "Chức vụ", "Lương cơ bản"}, 0);
            jTable1.setModel(tableModel);

            while (rs.next()) {
                Object[] item = new Object[11];
                item[0] = rs.getString("TenNLD");
                item[1] = rs.getString("MaHD");
                item[2] = rs.getString("MaNhanVien");
                item[3] = rs.getString("TenNhanVien");
                item[4] = rs.getString("ThoiHan");
                item[5] = rs.getDate("NgayKy");
                item[6] = rs.getDate("NgayCoHL");
                item[7] = rs.getDate("NgayHetHan");
                item[8] = rs.getString("PhongBan"); // Lấy trực tiếp từ Tb_HopDong
                item[9] = rs.getString("ChucVu");
                item[10] = rs.getInt("LuongCoBan");
                tableModel.addRow(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Có lỗi khi tìm kiếm dữ liệu hợp đồng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Nhapdulieu() {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {

            String TenNLD = jTable1.getValueAt(selectedRow, 0).toString();
            String MaHD = jTable1.getValueAt(selectedRow, 1).toString();
            String MaNhanVien = jTable1.getValueAt(selectedRow, 2).toString();
            String TenNhanVien = jTable1.getValueAt(selectedRow, 3).toString();

            String ThoiHan = jTable1.getValueAt(selectedRow, 4).toString();

            Date NgayKy = (Date) jTable1.getValueAt(selectedRow, 5);
            Date NgayHL = (Date) jTable1.getValueAt(selectedRow, 6);
            String NgayHH = jTable1.getValueAt(selectedRow, 7).toString();
            String PhongBan = jTable1.getValueAt(selectedRow, 8).toString();
            String ChucVu = jTable1.getValueAt(selectedRow, 9).toString();
            String LuongCoBan = jTable1.getValueAt(selectedRow, 10).toString();

            cboTennld.setSelectedItem(TenNLD);
            lbtennv.setText(TenNhanVien);
            lbmanv.setText(MaNhanVien);
            txtmahd.setText(MaHD);
            lbthan.setText(ThoiHan);

            DateNgayky.setDate(NgayKy);
            DateNgayhl.setDate(NgayHL);
            lbngayhh.setText(NgayHH);

            lbpb.setText(PhongBan);
            lbchucvu.setText(ChucVu);
            lblcb.setText(LuongCoBan);

        }
    }

    private void laydulieuhopdong() {
        String sql = "SELECT TenNLD, MaHD, MaNhanVien, TenNhanVien, ThoiHan, "
                + "NgayKy, NgayCoHL, NgayHetHan, PhongBan, "
                + "ChucVu, LuongCoBan "
                + "FROM Tb_HopDong";

        try (Connection conn = connection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            DefaultTableModel tableModel = new DefaultTableModel(
                    new Object[]{"Tên NLĐ", "Mã hợp đồng", "Mã nhân viên", "Tên nhân viên",
                        "Thời hạn", "Ngày ký", "Ngày có hiệu lực", "Ngày hết hạn",
                        "Phòng ban", "Chức vụ", "Lương cơ bản"}, 0);
            jTable1.setModel(tableModel);

            while (rs.next()) {
                Object[] item = new Object[11];
                item[0] = rs.getString("TenNLD");
                item[1] = rs.getString("MaHD");
                item[2] = rs.getString("MaNhanVien");
                item[3] = rs.getString("TenNhanVien");
                item[4] = rs.getString("ThoiHan");
                item[5] = rs.getDate("NgayKy");
                item[6] = rs.getDate("NgayCoHL");
                item[7] = rs.getDate("NgayHetHan");
                item[8] = rs.getString("PhongBan"); // Dùng tên phòng ban thay vì mã
                item[9] = rs.getString("ChucVu");
                item[10] = rs.getInt("LuongCoBan");
                tableModel.addRow(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ThongBao("Có lỗi khi tải dữ liệu hợp đồng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
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
    private com.toedter.calendar.JDateChooser DateNgayhl;
    private com.toedter.calendar.JDateChooser DateNgayky;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnUpd;
    private javax.swing.JButton btnXuat;
    private javax.swing.JComboBox<String> cboTennld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel lbchucvu;
    private javax.swing.JLabel lblcb;
    private javax.swing.JLabel lbmanv;
    private javax.swing.JLabel lbngayhh;
    private javax.swing.JLabel lbngayvl;
    private javax.swing.JLabel lbpb;
    private javax.swing.JLabel lbtennv;
    private javax.swing.JLabel lbthan;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtmahd;
    // End of variables declaration//GEN-END:variables
}
