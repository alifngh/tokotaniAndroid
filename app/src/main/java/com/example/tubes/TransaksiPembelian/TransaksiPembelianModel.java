package com.example.tubes.TransaksiPembelian;

public class TransaksiPembelianModel {
    private String namaProdukKrjg, hargaProdukKrjg;
    private int thumbnailKrjg;
    private int banyakBarang;

    public TransaksiPembelianModel(String namaProdukKrjg, String hargaProdukKrjg, int thumbnailKrjg, int banyakBarang) {
        this.namaProdukKrjg = namaProdukKrjg;
        this.hargaProdukKrjg = hargaProdukKrjg;
        this.thumbnailKrjg = thumbnailKrjg;
        this.banyakBarang = banyakBarang;
    }

    public String getNamaProdukKrjg() {
        return namaProdukKrjg;
    }

    public String getHargaProdukKrjg() {
        return hargaProdukKrjg;
    }

    public int getThumbnailKrjg() {
        return thumbnailKrjg;
    }

    public int getBanyakBarang() {
        return banyakBarang;
    }
}
