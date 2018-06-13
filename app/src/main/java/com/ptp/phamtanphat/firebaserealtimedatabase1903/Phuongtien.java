package com.ptp.phamtanphat.firebaserealtimedatabase1903;

public class Phuongtien {
    private String ten;
    private String sobanh;

    public Phuongtien(String ten, String sobanh) {
        this.ten = ten;
        this.sobanh = sobanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSobanh() {
        return sobanh;
    }

    public void setSobanh(String sobanh) {
        this.sobanh = sobanh;
    }
}
