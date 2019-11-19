package com.example.tubes.ui.alatpertanian;

public class Alat {
    private String nama_produk, harga_produk, url_gambar,kategori_produk,deskripsi,id_produk,tersedia;

    public Alat() {
    }

    public Alat(String nama_produk, String harga_produk, String url_gambar, String kategori_produk, String deskripsi, String id_produk, String tersedia) {
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
        this.url_gambar = url_gambar;
        this.kategori_produk = kategori_produk;
        this.deskripsi = deskripsi;
        this.id_produk = id_produk;
        this.tersedia = tersedia;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getHarga_produk() {
        return harga_produk;
    }

    public void setHarga_produk(String harga_produk) {
        this.harga_produk = harga_produk;
    }

    public String getUrl_gambar() {
        return url_gambar;
    }

    public void setUrl_gambar(String url_gambar) {
        this.url_gambar = url_gambar;
    }

    public String getKategori_produk() {
        return kategori_produk;
    }

    public void setKategori_produk(String kategori_produk) {
        this.kategori_produk = kategori_produk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getId_produk() {
        return id_produk;
    }

    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }

    public String getTersedia() {
        return tersedia;
    }

    public void setTersedia(String tersedia) {
        this.tersedia = tersedia;
    }
}
