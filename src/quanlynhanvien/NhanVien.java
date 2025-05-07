/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private int id;
    private String nameNV;
    private Date ngaysinh;
    private boolean gioitinh;
    private String CCCD;
    private Date ngayvaolam;
    private Date ngayketthuc;
    private String chucvu;
    private String diachi;
    private int SDT;
    private String ghichu;

    public NhanVien() {
    }

    public NhanVien(int id, String nameNV, Date ngaysinh, boolean gioitinh, String CCCD, Date ngayvaolam, Date ngayketthuc, String chucvu, String diachi, int SDT, String ghichu) {
        this.id = id;
        this.nameNV = nameNV;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.CCCD = CCCD;
        this.ngayvaolam = ngayvaolam;
        this.ngayketthuc = ngayketthuc;
        this.chucvu = chucvu;
        this.diachi = diachi;
        this.SDT = SDT;
        this.ghichu = ghichu;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameNV() {
        return nameNV;
    }

    public void setNameNV(String nameNV) {
        this.nameNV = nameNV;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgayvaolam() {
        return ngayvaolam;
    }

    public void setNgayvaolam(Date ngayvaolam) {
        this.ngayvaolam = ngayvaolam;
    }

    public Date getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(Date ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

}
