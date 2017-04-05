package com.example.emotional.tubes;

/**
 * Created by Emotional on 3/16/2017.
 */

public class Order {
    private String nama,jumlah,alamat;

    public Order() {
        this.nama = nama;
        this.jumlah = jumlah;
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getJumlah() {
        return jumlah;
    }

    public String getAlamat() {
        return alamat;
    }
}
