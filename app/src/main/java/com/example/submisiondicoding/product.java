package com.example.submisiondicoding;

public class product {
    private String nama;
    private String desc;
    private int image;
    private String tanggal_lahir;
    private String wafat;

    public product(String nama, String desc, int image, String tanggal_lahir, String wafat) {
        this.nama = nama;
        this.desc = desc;
        this.image = image;
        this.tanggal_lahir = tanggal_lahir;
        this.wafat = wafat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getWafat() {
        return wafat;
    }

    public void setWafat(String wafat) {
        this.wafat = wafat;
    }
}
