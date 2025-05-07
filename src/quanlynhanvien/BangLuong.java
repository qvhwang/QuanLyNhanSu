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
public class BangLuong {
    private int id;
    private String nameNV;
    private String chucvu;
    private Date thoigian;
    private int luongcoban;
    private int phucap;
    private int luongthuong;
    private int cackhoantru;
    private int thuclanh;

    public BangLuong() {
    }

    public BangLuong(int id, String nameNV, String chucvu, Date thoigian, int luongcoban, int phucap, int luongthuong, int cackhoantru, int thuclanh) {
        this.id = id;
        this.nameNV = nameNV;
        this.chucvu = chucvu;
        this.thoigian = thoigian;
        this.luongcoban = luongcoban;
        this.phucap = phucap;
        this.luongthuong = luongthuong;
        this.cackhoantru = cackhoantru;
        this.thuclanh = thuclanh;
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

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public Date getThoigian() {
        return thoigian;
    }

    public void setThoigian(Date thoigian) {
        this.thoigian = thoigian;
    }

    public int getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(int luongcoban) {
        this.luongcoban = luongcoban;
    }

    public int getPhucap() {
        return phucap;
    }

    public void setPhucap(int phucap) {
        this.phucap = phucap;
    }

    public int getLuongthuong() {
        return luongthuong;
    }

    public void setLuongthuong(int luongthuong) {
        this.luongthuong = luongthuong;
    }

    public int getCackhoantru() {
        return cackhoantru;
    }

    public void setCackhoantru(int cackhoantru) {
        this.cackhoantru = cackhoantru;
    }

    public int getThuclanh() {
        return thuclanh;
    }

    public void setThuclanh(int thuclanh) {
        this.thuclanh = thuclanh;
    }
    
}

