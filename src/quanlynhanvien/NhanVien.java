/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;



/**
 *
 * @author Admin
 */
class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String phongBan;
    private String chucVu;
    private String hoTen;


    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public NhanVien(String hoTen) {
        this.hoTen = hoTen;
    }
    
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


    String getHoTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}