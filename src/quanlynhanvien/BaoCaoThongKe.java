package quanlynhanvien;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

/**
 * Form báo cáo thống kê với JTabbedPane và tích hợp ExcelExporter
 */
public class BaoCaoThongKe extends JFrame {
    
    private JTabbedPane tabbedPane;
    private JPanel panelTongQuat, panelHopDong, panelPhongBan;
    
    // Components cho tab Thống kê tổng quát
    private JLabel lblTongNV, lblTongPB, lblTongHD, lblTongBL;
    private JLabel lblValueTongNV, lblValueTongPB, lblValueTongHD, lblValueTongBL;
    private JTable tableTongQuat;
    private DefaultTableModel modelTongQuat;
    
    // Components cho tab Hợp đồng
    private JTable tableHopDong;
    private DefaultTableModel modelHopDong;
    private JComboBox<String> cmbLoaiHD;
    private JButton btnLocHD, btnRefreshHD;
    
    // Components cho tab Phòng ban
    private JTable tablePhongBan;
    private DefaultTableModel modelPhongBan;
    private JComboBox<String> cmbPhongBan;
    private JButton btnLocPB, btnRefreshPB;
    
    public BaoCaoThongKe() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Thêm WindowListener
this.addWindowListener(new java.awt.event.WindowAdapter() {
    public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
    }
});
        setupLayout();
        loadData();
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                            
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
}
    private void initComponents() {
        setTitle("Báo Cáo Thống Kê Nhân Sự");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        
        // Khởi tạo JTabbedPane
        tabbedPane = new JTabbedPane();
        
        // Khởi tạo các panel
        initTongQuatPanel();
        initHopDongPanel();
        initPhongBanPanel();
        
        // Thêm các tab
        tabbedPane.addTab("Thống Kê Tổng Quát", panelTongQuat);
        tabbedPane.addTab("Báo Cáo Hợp Đồng", panelHopDong);
        tabbedPane.addTab("Báo Cáo Phòng Ban", panelPhongBan);
    }
    
    private void initTongQuatPanel() {
        panelTongQuat = new JPanel(new BorderLayout());
        
        // Panel hiển thị số liệu tổng quan
        JPanel panelSoLieu = new JPanel(new GridLayout(2, 4, 10, 10));
        panelSoLieu.setBorder(BorderFactory.createTitledBorder("Thống Kê Tổng Quan"));
        
        // Labels hiển thị số liệu
        lblTongNV = new JLabel("Tổng Nhân Viên:", JLabel.CENTER);
        lblValueTongNV = new JLabel("0", JLabel.CENTER);
        lblValueTongNV.setFont(new Font("Arial", Font.BOLD, 16));
        lblValueTongNV.setForeground(Color.BLUE);
        
        lblTongPB = new JLabel("Tổng Phòng Ban:", JLabel.CENTER);
        lblValueTongPB = new JLabel("0", JLabel.CENTER);
        lblValueTongPB.setFont(new Font("Arial", Font.BOLD, 16));
        lblValueTongPB.setForeground(Color.GREEN);
        
        lblTongHD = new JLabel("Tổng Hợp Đồng:", JLabel.CENTER);
        lblValueTongHD = new JLabel("0", JLabel.CENTER);
        lblValueTongHD.setFont(new Font("Arial", Font.BOLD, 16));
        lblValueTongHD.setForeground(Color.RED);
        
        lblTongBL = new JLabel("Tổng Bảng Lương:", JLabel.CENTER);
        lblValueTongBL = new JLabel("0", JLabel.CENTER);
        lblValueTongBL.setFont(new Font("Arial", Font.BOLD, 16));
        lblValueTongBL.setForeground(Color.ORANGE);
        
        panelSoLieu.add(lblTongNV);
        panelSoLieu.add(lblTongPB);
        panelSoLieu.add(lblTongHD);
        panelSoLieu.add(lblTongBL);
        panelSoLieu.add(lblValueTongNV);
        panelSoLieu.add(lblValueTongPB);
        panelSoLieu.add(lblValueTongHD);
        panelSoLieu.add(lblValueTongBL);
        
        // Panel nút xuất Excel cho tab tổng quát
        JPanel panelButtonTQ = new JPanel(new FlowLayout());
        JButton btnXuatTongQuat = new JButton("Xuất Excel - Thống Kê Tổng Quát");
        JButton btnBaoCaoTongHop = new JButton("Tạo Báo Cáo Tổng Hợp");
        
        btnXuatTongQuat.addActionListener(e -> xuatExcelTongQuat());
        btnBaoCaoTongHop.addActionListener(e -> taoBaoCaoTongHop());
        
        panelButtonTQ.add(btnXuatTongQuat);
        panelButtonTQ.add(btnBaoCaoTongHop);
        
        // Bảng thống kê chi tiết theo phòng ban
        String[] columnsTongQuat = {"Phòng Ban", "Số NV", "Số Hợp Đồng", "Lương TB", "Khen Thưởng", "Kỷ Luật"};
        modelTongQuat = new DefaultTableModel(columnsTongQuat, 0);
        tableTongQuat = new JTable(modelTongQuat);
        JScrollPane scrollTongQuat = new JScrollPane(tableTongQuat);
        scrollTongQuat.setBorder(BorderFactory.createTitledBorder("Chi Tiết Theo Phòng Ban"));
        
        // Panel chứa button và bảng
        JPanel panelContent = new JPanel(new BorderLayout());
        panelContent.add(panelButtonTQ, BorderLayout.NORTH);
        panelContent.add(scrollTongQuat, BorderLayout.CENTER);
        
        panelTongQuat.add(panelSoLieu, BorderLayout.NORTH);
        panelTongQuat.add(panelContent, BorderLayout.CENTER);
    }
    
    private void initHopDongPanel() {
        panelHopDong = new JPanel(new BorderLayout());
        
        // Panel điều khiển
        JPanel panelControl = new JPanel(new FlowLayout());
        cmbLoaiHD = new JComboBox<>(new String[]{
            "Tất cả", 
            "Hợp đồng không xác định thời hạn",
            "6 tháng",
            "3 tháng", 
            "5 tháng",
            "1 năm",
            "2 năm",
            "3 năm",
            "4 năm", 
            "5 năm",
            "Hợp đồng làm việc bán thời gian",
            "Hợp đồng cộng tác viên",
            "Hợp đồng thử việc"
        });
        btnLocHD = new JButton("Lọc");
        btnRefreshHD = new JButton("Làm mới");
        JButton btnXuatHopDong = new JButton("Xuất Excel - Hợp Đồng");
        
        panelControl.add(new JLabel("Loại hợp đồng:"));
        panelControl.add(cmbLoaiHD);
        panelControl.add(btnLocHD);
        panelControl.add(btnRefreshHD);
        panelControl.add(btnXuatHopDong);
        
        // Bảng hợp đồng
        String[] columnsHD = {"Mã HD", "Tên NV", "Loại HD", "Ngày ký", "Ngày hết hạn", "Phòng ban", "Lương"};
        modelHopDong = new DefaultTableModel(columnsHD, 0);
        tableHopDong = new JTable(modelHopDong);
        JScrollPane scrollHD = new JScrollPane(tableHopDong);
        
        // Sự kiện
        btnLocHD.addActionListener(e -> loadHopDongData());
        btnRefreshHD.addActionListener(e -> {
            cmbLoaiHD.setSelectedIndex(0);
            loadHopDongData();
        });
        btnXuatHopDong.addActionListener(e -> xuatExcelHopDong());
        
        panelHopDong.add(panelControl, BorderLayout.NORTH);
        panelHopDong.add(scrollHD, BorderLayout.CENTER);
    }
    
    private void initPhongBanPanel() {
        panelPhongBan = new JPanel(new BorderLayout());
        
        // Panel điều khiển
        JPanel panelControl = new JPanel(new FlowLayout());
        cmbPhongBan = new JComboBox<>();
        btnLocPB = new JButton("Lọc");
        btnRefreshPB = new JButton("Làm mới");
        JButton btnXuatPhongBan = new JButton("Xuất Excel - Phòng Ban");
        
        panelControl.add(new JLabel("Phòng ban:"));
        panelControl.add(cmbPhongBan);
        panelControl.add(btnLocPB);
        panelControl.add(btnRefreshPB);
        panelControl.add(btnXuatPhongBan);
        
        // Bảng nhân viên theo phòng ban
        String[] columnsPB = {"Mã NV", "Tên NV", "Chức vụ", "Ngày vào làm", "Lương CB", "Loại HD"};
        modelPhongBan = new DefaultTableModel(columnsPB, 0);
        tablePhongBan = new JTable(modelPhongBan);
        JScrollPane scrollPB = new JScrollPane(tablePhongBan);
        
        // Sự kiện
        btnLocPB.addActionListener(e -> loadPhongBanData());
        btnRefreshPB.addActionListener(e -> {
            loadPhongBanData();
        });
        btnXuatPhongBan.addActionListener(e -> xuatExcelPhongBan());
        
        panelPhongBan.add(panelControl, BorderLayout.NORTH);
        panelPhongBan.add(scrollPB, BorderLayout.CENTER);
    }
    
    private void setupLayout() {
        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.CENTER);
        
        // Thêm menu bar với chức năng xuất Excel
        JMenuBar menuBar = new JMenuBar();
        JMenu menuBaoCao = new JMenu("Báo cáo");
        
        JMenuItem itemXuatTatCa = new JMenuItem("Xuất Tất Cả Ra Excel");
        JMenuItem itemBaoCaoTongHop = new JMenuItem("Tạo Báo Cáo Tổng Hợp");
        JMenuItem itemIn = new JMenuItem("In báo cáo");
        
        // Sự kiện cho menu items
        itemXuatTatCa.addActionListener(e -> xuatTatCaExcel());
        itemBaoCaoTongHop.addActionListener(e -> taoBaoCaoTongHop());
        itemIn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Chức năng in đang được phát triển"));
        
        menuBaoCao.add(itemXuatTatCa);
        menuBaoCao.add(itemBaoCaoTongHop);
        menuBaoCao.addSeparator();
        menuBaoCao.add(itemIn);
        menuBar.add(menuBaoCao);
        
        setJMenuBar(menuBar);
    }
    
    // Các phương thức xuất Excel
    private void xuatExcelTongQuat() {
        String fileName = "ThongKeTongQuat_" + System.currentTimeMillis();
        ExcelExporter.exportTableToCSV(tableTongQuat, fileName);
    }
    
    private void xuatExcelHopDong() {
        String fileName = "BaoCaoHopDong_" + System.currentTimeMillis();
        ExcelExporter.exportTableToCSV(tableHopDong, fileName);
    }
    
    private void xuatExcelPhongBan() {
        String fileName = "BaoCaoPhongBan_" + System.currentTimeMillis();
        ExcelExporter.exportTableToCSV(tablePhongBan, fileName);
    }
    
    private void xuatTatCaExcel() {
        // Xuất tất cả các bảng vào một file
        JTable[] tables = {tableTongQuat, tableHopDong, tablePhongBan};
        String[] sheetNames = {"Thống Kê Tổng Quát", "Báo Cáo Hợp Đồng", "Báo Cáo Phòng Ban"};
        String fileName = "BaoCaoToanBo_" + System.currentTimeMillis();
        
        ExcelExporter.exportMultipleTablesToCSV(tables, sheetNames, fileName);
    }
    
    private void taoBaoCaoTongHop() {
        ExcelExporter.createSummaryReport(
            lblValueTongNV.getText(),
            lblValueTongPB.getText(),
            lblValueTongHD.getText(),
            lblValueTongBL.getText()
        );
    }
    
    private void loadData() {
        loadTongQuatData();
        loadHopDongData();
        loadPhongBanComboBox();
        loadPhongBanData();
    }
    
    private void loadTongQuatData() {
        try (Connection conn = connection.getConnection()) {
            // Đếm tổng nhân viên
            String sqlNV = "SELECT COUNT(*) FROM Tb_NhanVien";
            PreparedStatement pstNV = conn.prepareStatement(sqlNV);
            ResultSet rsNV = pstNV.executeQuery();
            if (rsNV.next()) {
                lblValueTongNV.setText(String.valueOf(rsNV.getInt(1)));
            }
            
            // Đếm tổng phòng ban
            String sqlPB = "SELECT COUNT(*) FROM Tb_PhongBan";
            PreparedStatement pstPB = conn.prepareStatement(sqlPB);
            ResultSet rsPB = pstPB.executeQuery();
            if (rsPB.next()) {
                lblValueTongPB.setText(String.valueOf(rsPB.getInt(1)));
            }
            
            // Đếm tổng hợp đồng
            String sqlHD = "SELECT COUNT(*) FROM Tb_HopDong";
            PreparedStatement pstHD = conn.prepareStatement(sqlHD);
            ResultSet rsHD = pstHD.executeQuery();
            if (rsHD.next()) {
                lblValueTongHD.setText(String.valueOf(rsHD.getInt(1)));
            }
            
            // Đếm tổng bảng lương
            String sqlBL = "SELECT COUNT(*) FROM Tb_BangLuong";
            PreparedStatement pstBL = conn.prepareStatement(sqlBL);
            ResultSet rsBL = pstBL.executeQuery();
            if (rsBL.next()) {
                lblValueTongBL.setText(String.valueOf(rsBL.getInt(1)));
            }
            
            // Load chi tiết theo phòng ban
            loadChiTietPhongBan();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu: " + e.getMessage());
        }
    }
    
    private void loadChiTietPhongBan() {
        try (Connection conn = connection.getConnection()) {
            modelTongQuat.setRowCount(0);
            
            String sql = """
                SELECT 
                    pb.TenPB,
                    COUNT(DISTINCT nv.MaNhanVien) as SoNV,
                    COUNT(DISTINCT hd.MaHD) as SoHD,
                    AVG(CAST(nv.LuongCoBan as FLOAT)) as LuongTB,
                    COUNT(DISTINCT kt.MaKT) as SoKT,
                    COUNT(DISTINCT kl.MaKL) as SoKL
                FROM Tb_PhongBan pb
                LEFT JOIN Tb_NhanVien nv ON pb.TenPB = nv.PhongBan
                LEFT JOIN Tb_HopDong hd ON nv.MaNhanVien = hd.MaNhanVien
                LEFT JOIN Tb_KhenThuong kt ON nv.MaNhanVien = kt.MaNhanVien
                LEFT JOIN Tb_KyLuat kl ON nv.MaNhanVien = kl.MaNhanVien
                GROUP BY pb.TenPB
                """;
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getString("TenPB"));
                row.add(rs.getInt("SoNV"));
                row.add(rs.getInt("SoHD"));
                row.add(String.format("%.0f", rs.getDouble("LuongTB")));
                row.add(rs.getInt("SoKT"));
                row.add(rs.getInt("SoKL"));
                modelTongQuat.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải chi tiết phòng ban: " + e.getMessage());
        }
    }
    
    private void loadHopDongData() {
        try (Connection conn = connection.getConnection()) {
            modelHopDong.setRowCount(0);
            
            String sql = "SELECT MaHD, TenNhanVien, ThoiHan, NgayKy, NgayHetHan, PhongBan, LuongCoBan FROM Tb_HopDong";
            String loaiHD = (String) cmbLoaiHD.getSelectedItem();
            
            if (!"Tất cả".equals(loaiHD)) {
                sql += " WHERE ThoiHan = ?";
            }
            
            PreparedStatement pst = conn.prepareStatement(sql);
            if (!"Tất cả".equals(loaiHD)) {
                pst.setString(1, loaiHD);
            }
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getString("MaHD"));
                row.add(rs.getString("TenNhanVien"));
                row.add(rs.getString("ThoiHan"));
                row.add(rs.getDate("NgayKy"));
                row.add(rs.getDate("NgayHetHan"));
                row.add(rs.getString("PhongBan"));
                row.add(rs.getInt("LuongCoBan"));
                modelHopDong.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu hợp đồng: " + e.getMessage());
        }
    }
    
    private void loadPhongBanComboBox() {
        try (Connection conn = connection.getConnection()) {
            cmbPhongBan.removeAllItems();
            cmbPhongBan.addItem("Tất cả");
            
            String sql = "SELECT DISTINCT TenPB FROM Tb_PhongBan";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                cmbPhongBan.addItem(rs.getString("TenPB"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách phòng ban: " + e.getMessage());
        }
    }
    
    private void loadPhongBanData() {
        try (Connection conn = connection.getConnection()) {
            modelPhongBan.setRowCount(0);
            
            String sql = "SELECT MaNhanVien, TenNhanVien, ChucVu, NgayVaoLam, LuongCoBan, LoaiHD FROM Tb_NhanVien";
            String phongBan = (String) cmbPhongBan.getSelectedItem();
            
            if (!"Tất cả".equals(phongBan)) {
                sql += " WHERE PhongBan = ?";
            }
            
            PreparedStatement pst = conn.prepareStatement(sql);
            if (!"Tất cả".equals(phongBan)) {
                pst.setString(1, phongBan);
            }
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getString("MaNhanVien"));
                row.add(rs.getString("TenNhanVien"));
                row.add(rs.getString("ChucVu"));
                row.add(rs.getDate("NgayVaoLam"));
                row.add(rs.getInt("LuongCoBan"));
                row.add(rs.getString("LoaiHD"));
                modelPhongBan.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu nhân viên: " + e.getMessage());
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoCaoThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new BaoCaoThongKe().setVisible(true));
    }
}