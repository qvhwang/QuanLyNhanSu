/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;

/**
 *
 * @author Admin
 */
// Cách 1: Tạo file PhongBan.java riêng trong package quanlynhanvien
// File: PhongBan.java


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
    public String getMaPB() { return maPB; }
    public void setMaPB(String maPB) { this.maPB = maPB; }
    
    public String getTenPB() { return tenPB; }
    public void setTenPB(String tenPB) { this.tenPB = tenPB; }
    
    public String getMoTa() { return moTa; }
    public void setMoTa(String moTa) { this.moTa = moTa; }
    
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
    public String getMaNhanVien() { return maNhanVien; }
    public String getTenNhanVien() { return tenNhanVien; }
    public String getPhongBan() { return phongBan; }
    public String getChucVu() { return chucVu; }
    
    @Override
    public String toString() {
        return tenNhanVien + " - " + chucVu + " (" + maNhanVien + ")";
    }
}
