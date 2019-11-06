package com.example.tubes.ui.alatpertanian;

public class Alat {
    private String namaAlat, hargaAlat;
    private int thumbnailAlat;

    public Alat(String namaBibit, String hargaBibit, int thumbnail) {
        this.namaAlat = namaBibit;
        this.hargaAlat= hargaBibit;
        this.thumbnailAlat = thumbnail;
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public String getHargaAlat() {
        return hargaAlat;
    }

    public int getThumbnailAlat() {
        return thumbnailAlat;
    }
}
