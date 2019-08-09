package com.example.submisiondicoding;

public class model {
    int img;
    String nama;
    int umur;
    String alamat;
    String meninggal;
    String suami;
    String keterangan;

    public model(int img, String nama, int umur, String alamat, String meninggal, String suami, String keterangan) {
        this.img = img;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.meninggal = meninggal;
        this.suami = suami;
        this.keterangan = keterangan;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(String meninggal) {
        this.meninggal = meninggal;
    }

    public String getSuami() {
        return suami;
    }

    public void setSuami(String suami) {
        this.suami = suami;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
