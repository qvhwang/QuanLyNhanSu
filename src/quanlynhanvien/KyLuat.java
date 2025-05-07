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
public class KyLuat {
    private int idkl;
    private int id;
    private String nameNV;
    private Date ngaykl;
    private String kyluat;
    private String lydokl;

    public KyLuat() {
    }

    public KyLuat(int idkl, int id, String nameNV, Date ngaykl, String kyluat, String lydokl) {
        this.idkl = idkl;
        this.id = id;
        this.nameNV = nameNV;
        this.ngaykl = ngaykl;
        this.kyluat = kyluat;
        this.lydokl = lydokl;
    }

    public int getIdkl() {
        return idkl;
    }

    public void setIdkl(int idkl) {
        this.idkl = idkl;
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

    public Date getNgaykl() {
        return ngaykl;
    }

    public void setNgaykl(Date ngaykl) {
        this.ngaykl = ngaykl;
    }

    public String getKyluat() {
        return kyluat;
    }

    public void setKyluat(String kyluat) {
        this.kyluat = kyluat;
    }

    public String getLydokl() {
        return lydokl;
    }

    public void setLydokl(String lydokl) {
        this.lydokl = lydokl;
    }
    
}
