package com.example.tubes.Keranjang;

public class KeranjangModel {
    private String namaProdukKrjg, hargaProdukKrjg;
    private int thumbnailKrjg;
    private int banyakBarang;

    public KeranjangModel(String namaBibit, String hargaBibit, int thumbnail, int banyakBarang) {
        this.namaProdukKrjg = namaBibit;
        this.hargaProdukKrjg = hargaBibit;
        this.thumbnailKrjg = thumbnail;
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
