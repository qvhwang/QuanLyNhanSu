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
public class KhenThuong {
    private int idkt;
    private int id;
    private String nameNV;
    private Date ngaykt;
    private String khenthuong;
    private String lydokt;

    public KhenThuong() {
    }

    public KhenThuong(int idkt, int id, String nameNV, Date ngaykt, String khenthuong, String lydokt) {
        this.idkt = idkt;
        this.id = id;
        this.nameNV = nameNV;
        this.ngaykt = ngaykt;
        this.khenthuong = khenthuong;
        this.lydokt = lydokt;
    }

    public int getIdkt() {
        return idkt;
    }

    public void setIdkt(int idkt) {
        this.idkt = idkt;
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

    public Date getNgaykt() {
        return ngaykt;
    }

    public void setNgaykt(Date ngaykt) {
        this.ngaykt = ngaykt;
    }

    public String getKhenthuong() {
        return khenthuong;
    }

    public void setKhenthuong(String khenthuong) {
        this.khenthuong = khenthuong;
    }

    public String getLydokt() {
        return lydokt;
    }

    public void setLydokt(String lydokt) {
        this.lydokt = lydokt;
    }
    
    
}
