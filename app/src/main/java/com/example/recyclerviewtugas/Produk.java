package com.example.recyclerviewtugas;

public class Produk {
    private String nama;
    private String harga;
    private String deskripsi;
    private int gambar;

    public Produk(String nama, String harga, String deskripsi, int gambar) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getGambar() {
        return gambar;
    }
}
