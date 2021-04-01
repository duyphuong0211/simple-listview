package com.example.listviewvip;

public class TraiCay {
    private String Ten;
    private  String Mota;
    private int hinh;

    public TraiCay(String ten, String mota, int hinh) {
        Ten = ten;
        Mota = mota;
        this.hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
