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
public class HopDong {
    private int idhd;
    private int id;
    private String nameNV;
    private Date ngayvaolam;
    private Date ngayketthuc;
    private Date ngayky;
    private int lanky;
    private String thoihan;
    private int luongcoban;

    public HopDong() {
    }

    public HopDong(int idhd, int id, String nameNV, Date ngayvaolam, Date ngayketthuc, Date ngayky, int lanky, String thoihan, int luongcoban) {
        this.idhd = idhd;
        this.id = id;
        this.nameNV = nameNV;
        this.ngayvaolam = ngayvaolam;
        this.ngayketthuc = ngayketthuc;
        this.ngayky = ngayky;
        this.lanky = lanky;
        this.thoihan = thoihan;
        this.luongcoban = luongcoban;
    }

    public int getIdhd() {
        return idhd;
    }

    public void setIdhd(int idhd) {
        this.idhd = idhd;
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

    public Date getNgayky() {
        return ngayky;
    }

    public void setNgayky(Date ngayky) {
        this.ngayky = ngayky;
    }

    public int getLanky() {
        return lanky;
    }

    public void setLanky(int lanky) {
        this.lanky = lanky;
    }

    public String getThoihan() {
        return thoihan;
    }

    public void setThoihan(String thoihan) {
        this.thoihan = thoihan;
    }

    public int getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(int luongcoban) {
        this.luongcoban = luongcoban;
    }
    
}
