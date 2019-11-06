package com.example.tubes.ui.hasiltani;

public class Hasil {
    private String namaHasil, hargaHasil;
    private int thumbnailHasil;

    public Hasil(String namaHasil, String hargaHasil, int thumbnailHasil) {
        this.namaHasil = namaHasil;
        this.hargaHasil = hargaHasil;
        this.thumbnailHasil = thumbnailHasil;
    }

    public String getNamaHasil() {
        return namaHasil;
    }

    public String getHargaHasil() {
        return hargaHasil;
    }

    public int getThumbnailHasil() {
        return thumbnailHasil;
    }
}
