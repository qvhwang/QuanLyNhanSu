/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;

import java.awt.Font;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;

// Lớp model cho Phòng Ban
class PhongBan {

    private String maPB;
    private String tenPB;
    private String moTa;

    public PhongBan(String maPB, String tenPB, String moTa) {
        this.maPB = maPB;
        this.tenPB = tenPB;
        this.moTa = moTa;
    }

    // Getters and Setters
    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return tenPB + " (" + maPB + ")";
    }
}

// Lớp model cho Nhân Viên
class NhanVien {

    private String maNhanVien;
    private String tenNhanVien;
    private String phongBan;
    private String chucVu;

    public NhanVien(String maNhanVien, String tenNhanVien, String phongBan, String chucVu) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.phongBan = phongBan;
        this.chucVu = chucVu;
    }

    // Getters
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public String getChucVu() {
        return chucVu;
    }

    @Override
    public String toString() {
        return tenNhanVien + " - " + chucVu + " (" + maNhanVien + ")";
    }
}

// Lớp DAO cho Database operations
class PhongBanDAO {

    // Lấy tất cả phòng ban
    public List<PhongBan> getAllPhongBan() {
        List<PhongBan> list = new ArrayList<>();
        Connection conn = null;
        try {
            conn = connection.getConnection();
            String sql = "SELECT * FROM Tb_PhongBan ORDER BY TenPB";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PhongBan pb = new PhongBan(
                        rs.getString("MaPB"),
                        rs.getString("TenPB"),
                        rs.getString("MoTa")
                );
                list.add(pb);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy danh sách phòng ban: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    // Lấy nhân viên theo phòng ban
    public List<NhanVien> getNhanViensByPhongBan(PhongBan pb) {
        List<NhanVien> list = new ArrayList<>();
        Connection conn = null;
        try {
            conn = connection.getConnection();
            String sql = "SELECT * FROM Tb_NhanVien WHERE PhongBan = ?"; // Đây đang dùng PhongBan là tên
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pb.getTenPB()); // Dùng tên phòng ban thay vì mã
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                NhanVien nv = new NhanVien(
                        rs.getString("MaNhanVien"),
                        rs.getString("TenNhanVien"),
                        rs.getString("PhongBan"),
                        rs.getString("ChucVu")
                );
                list.add(nv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    // Thêm phòng ban
    public boolean themPhongBan(PhongBan pb) {
        Connection conn = null;
        try {
            conn = connection.getConnection();
            String sql = "INSERT INTO Tb_PhongBan (MaPB, TenPB, MoTa) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pb.getMaPB());
            ps.setString(2, pb.getTenPB());
            ps.setString(3, pb.getMoTa());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi thêm phòng ban: " + e.getMessage());
            return false;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Sửa phòng ban
    public boolean suaPhongBan(PhongBan pb) {
        Connection conn = null;
        try {
            conn = connection.getConnection();
            String sql = "UPDATE Tb_PhongBan SET TenPB = ?, MoTa = ? WHERE MaPB = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pb.getTenPB());
            ps.setString(2, pb.getMoTa());
            ps.setString(3, pb.getMaPB());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi sửa phòng ban: " + e.getMessage());
            return false;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Xóa phòng ban
    public boolean xoaPhongBan(String maPB) {
        Connection conn = null;
        try {
            conn = connection.getConnection();

            // Kiểm tra xem có nhân viên nào thuộc phòng ban này không
            String checkSql = "SELECT COUNT(*) FROM Tb_NhanVien WHERE PhongBan = ?";
            PreparedStatement checkPs = conn.prepareStatement(checkSql);
            checkPs.setString(1, maPB);
            ResultSet rs = checkPs.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Không thể xóa phòng ban vì còn có " + rs.getInt(1) + " nhân viên thuộc phòng ban này!");
                return false;
            }

            String sql = "DELETE FROM Tb_PhongBan WHERE MaPB = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maPB);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi xóa phòng ban: " + e.getMessage());
            return false;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Kiểm tra mã phòng ban có tồn tại không
    public boolean kiemTraMaPBTonTai(String maPB) {
        Connection conn = null;
        try {
            conn = connection.getConnection();
            String sql = "SELECT COUNT(*) FROM Tb_PhongBan WHERE MaPB = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maPB);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi kiểm tra mã phòng ban: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    // Lấy thông tin phòng ban theo mã
    public PhongBan getPhongBanByMa(String maPB) {
        Connection conn = null;
        try {
            conn = connection.getConnection();
            String sql = "SELECT * FROM Tb_PhongBan WHERE MaPB = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maPB);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new PhongBan(
                        rs.getString("MaPB"),
                        rs.getString("TenPB"),
                        rs.getString("MoTa")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy thông tin phòng ban: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

// Phần code chính cho JFrame của bạn
public class PhongBanManager {

    // Các component UI - bạn sẽ gán từ giao diện NetBeans
    private JTextField txtmapb;
    private JTextField txttenpb;
    private JTextField txtmota;
    private JButton btnThem, btnSua, btnXoa, btnLamMoi;
    private JTree treePhongBan;
    private DefaultTreeModel treeModel;
    private DefaultMutableTreeNode rootNode;

    private PhongBanDAO dao;
    private PhongBan phongBanDangChon;

    // Constructor - truyền vào các component từ JFrame
    public PhongBanManager(JTextField txtmapb, JTextField txttenpb, JTextField txtmota,
            JButton btnThem, JButton btnSua, JButton btnXoa, JButton btnLamMoi) {
        this.txtmapb = txtmapb;
        this.txttenpb = txttenpb;
        this.txtmota = txtmota;
        this.btnThem = btnThem;
        this.btnSua = btnSua;
        this.btnXoa = btnXoa;
        this.btnLamMoi = btnLamMoi;

        dao = new PhongBanDAO();
        initTree();
        setupEventHandlers();
        loadDataToTree();
    }

    // Khởi tạo Tree
    private void initTree() {
        rootNode = new DefaultMutableTreeNode("📁 DANH SÁCH PHÒNG BAN");
        treeModel = new DefaultTreeModel(rootNode);
        treePhongBan = new JTree(treeModel);

        Font treeFont = new Font("Arial", Font.PLAIN, 20);
        treePhongBan.setFont(treeFont);
        treePhongBan.setRowHeight(25); // Tăng chiều cao mỗi dòng
        // Cài đặt Tree
        treePhongBan.setRootVisible(true);
        treePhongBan.setShowsRootHandles(true);

        // Thêm listener cho Tree selection
        treePhongBan.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treePhongBan.getLastSelectedPathComponent();
            if (selectedNode != null && selectedNode.getUserObject() instanceof PhongBan) {
                PhongBan pb = (PhongBan) selectedNode.getUserObject();
                hienThiThongTinPhongBan(pb);
            }
        });
    }

    // Thiết lập event handlers cho các button
    private void setupEventHandlers() {
        btnThem.addActionListener(e -> themPhongBan());
        btnSua.addActionListener(e -> suaPhongBan());
        btnXoa.addActionListener(e -> xoaPhongBan());
        btnLamMoi.addActionListener(e -> lamMoi());
    }

    // Phương thức hiển thị và cập nhật dữ liệu
    public void loadDataToTree() {
        rootNode.removeAllChildren();

        List<PhongBan> listPhongBan = dao.getAllPhongBan();

        for (PhongBan pb : listPhongBan) {
            // Tạo node phòng ban với icon
            DefaultMutableTreeNode phongBanNode = new DefaultMutableTreeNode("🏢 " + pb.toString());
            phongBanNode.setUserObject(pb); // Lưu object để dùng khi click

            // Lấy danh sách nhân viên thuộc phòng ban
           List<NhanVien> listNhanVien = dao.getNhanViensByPhongBan(pb); // Truyền nguyên object Phòng Ban


            if (!listNhanVien.isEmpty()) {
                // Tạo node "Nhân viên" như folder con
                DefaultMutableTreeNode nhanVienFolder = new DefaultMutableTreeNode("👥 Nhân viên (" + listNhanVien.size() + ")");

                for (NhanVien nv : listNhanVien) {
                    DefaultMutableTreeNode nhanVienNode = new DefaultMutableTreeNode("👤 " + nv.toString());
                    nhanVienNode.setUserObject(nv);
                    nhanVienFolder.add(nhanVienNode);
                }

                phongBanNode.add(nhanVienFolder);
            } else {
                // Thêm node "Chưa có nhân viên"
                DefaultMutableTreeNode emptyNode = new DefaultMutableTreeNode("📝 Chưa có nhân viên");
                phongBanNode.add(emptyNode);
            }

            rootNode.add(phongBanNode);
        }

        treeModel.reload();

        // Mở rộng root node
        treePhongBan.expandRow(0);

        // Cập nhật trạng thái button
        capNhatTrangThaiButton();
    }

    // Hiển thị thông tin phòng ban lên form
    private void hienThiThongTinPhongBan(PhongBan pb) {
        phongBanDangChon = pb;
        txtmapb.setText(pb.getMaPB());
        txttenpb.setText(pb.getTenPB());
        txtmota.setText(pb.getMoTa());

        // Disable txtmapb khi sửa
        txtmapb.setEditable(false);
        capNhatTrangThaiButton();
    }

    // Làm sạch form
    public void lamMoi() {
        txtmapb.setText("");
        txttenpb.setText("");
        txtmota.setText("");
        phongBanDangChon = null;
        treePhongBan.clearSelection();

        // Enable txtmapb khi thêm mới
        txtmapb.setEditable(true);
        capNhatTrangThaiButton();
    }

    // Cập nhật trạng thái button
    private void capNhatTrangThaiButton() {
        boolean coChon = (phongBanDangChon != null);
        btnSua.setEnabled(coChon);
        btnXoa.setEnabled(coChon);
    }

    // Thêm phòng ban
    public void themPhongBan() {
        if (validateInput()) {
            String maPB = txtmapb.getText().trim().toUpperCase();
            String tenPB = txttenpb.getText().trim();
            String moTa = txtmota.getText().trim();

            // Kiểm tra mã phòng ban đã tồn tại
            if (dao.kiemTraMaPBTonTai(maPB)) {
                JOptionPane.showMessageDialog(null, "Mã phòng ban '" + maPB + "' đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                txtmapb.requestFocus();
                return;
            }

            PhongBan pb = new PhongBan(maPB, tenPB, moTa);

            if (dao.themPhongBan(pb)) {
                JOptionPane.showMessageDialog(null, "Thêm phòng ban thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                loadDataToTree();
                lamMoi();
            } else {
                JOptionPane.showMessageDialog(null, "Thêm phòng ban thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Sửa phòng ban
    public void suaPhongBan() {
        if (phongBanDangChon == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phòng ban cần sửa từ danh sách!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (validateInput()) {
            String tenPB = txttenpb.getText().trim();
            String moTa = txtmota.getText().trim();

            phongBanDangChon.setTenPB(tenPB);
            phongBanDangChon.setMoTa(moTa);

            if (dao.suaPhongBan(phongBanDangChon)) {
                JOptionPane.showMessageDialog(null, "Cập nhật phòng ban thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                loadDataToTree();
                lamMoi();
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật phòng ban thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Xóa phòng ban
    public void xoaPhongBan() {
        if (phongBanDangChon == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phòng ban cần xóa từ danh sách!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null,
                "Bạn có chắc chắn muốn xóa phòng ban:\n'" + phongBanDangChon.getTenPB() + "' (" + phongBanDangChon.getMaPB() + ")?",
                "⚠️ Xác nhận xóa",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            if (dao.xoaPhongBan(phongBanDangChon.getMaPB())) {
                JOptionPane.showMessageDialog(null, "Xóa phòng ban thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                loadDataToTree();
                lamMoi();
            }
            // Thông báo lỗi đã được xử lý trong DAO
        }
    }

    // Validate input
    private boolean validateInput() {
        String maPB = txtmapb.getText().trim();
        String tenPB = txttenpb.getText().trim();

        if (maPB.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mã phòng ban!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            txtmapb.requestFocus();
            return false;
        }

        if (tenPB.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên phòng ban!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            txttenpb.requestFocus();
            return false;
        }

        // Kiểm tra độ dài
        if (maPB.length() > 50) {
            JOptionPane.showMessageDialog(null, "Mã phòng ban không được vượt quá 50 ký tự!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            txtmapb.requestFocus();
            return false;
        }

        if (tenPB.length() > 50) {
            JOptionPane.showMessageDialog(null, "Tên phòng ban không được vượt quá 50 ký tự!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            txttenpb.requestFocus();
            return false;
        }

        return true;
    }

    // Phương thức public để gọi từ bên ngoài
    public void capNhatDuLieu() {
        loadDataToTree();
    }

    // Phương thức lấy Tree component để add vào giao diện
    public JTree getTreeComponent() {
        return treePhongBan;
    }

    // Phương thức tìm kiếm phòng ban
    public void timKiemPhongBan(String keyword) {
        if (keyword.trim().isEmpty()) {
            loadDataToTree();
            return;
        }

        rootNode.removeAllChildren();
        List<PhongBan> listPhongBan = dao.getAllPhongBan();

        for (PhongBan pb : listPhongBan) {
            // Tìm kiếm theo mã hoặc tên phòng ban
            if (pb.getMaPB().toLowerCase().contains(keyword.toLowerCase())
                    || pb.getTenPB().toLowerCase().contains(keyword.toLowerCase())) {

                DefaultMutableTreeNode phongBanNode = new DefaultMutableTreeNode("🏢 " + pb.toString());
                phongBanNode.setUserObject(pb);

                List<NhanVien> listNhanVien = dao.getNhanViensByPhongBan(pb); // Truyền nguyên object Phòng Ban


                if (!listNhanVien.isEmpty()) {
                    DefaultMutableTreeNode nhanVienFolder = new DefaultMutableTreeNode("👥 Nhân viên (" + listNhanVien.size() + ")");

                    for (NhanVien nv : listNhanVien) {
                        DefaultMutableTreeNode nhanVienNode = new DefaultMutableTreeNode("👤 " + nv.toString());
                        nhanVienNode.setUserObject(nv);
                        nhanVienFolder.add(nhanVienNode);
                    }

                    phongBanNode.add(nhanVienFolder);
                } else {
                    DefaultMutableTreeNode emptyNode = new DefaultMutableTreeNode("📝 Chưa có nhân viên");
                    phongBanNode.add(emptyNode);
                }

                rootNode.add(phongBanNode);
            }
        }

        treeModel.reload();
        treePhongBan.expandRow(0);
    }
}
