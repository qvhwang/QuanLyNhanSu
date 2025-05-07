/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;

/**
 *
 * @author Admin
 */
public class taikhoan {
    private String TenDangNhap;
    private String Email;
    private String Password;
    private String Nhaplai;

    public taikhoan() {
    }

    public taikhoan(String TenDangNhap, String Email, String Password, String Nhaplai) {
        this.TenDangNhap = TenDangNhap;
        this.Email = Email;
        this.Password = Password;
        this.Nhaplai = Nhaplai;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNhaplai() {
        return Nhaplai;
    }

    public void setNhaplai(String Nhaplai) {
        this.Nhaplai = Nhaplai;
    }
    
}
