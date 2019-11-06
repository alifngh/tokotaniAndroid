package com.example.tubes.ui.home;

public class Bibit {
    private String namaBibit, hargaBibit;
    private int thumbnail;

    public Bibit(String namaBibit, String hargaBibit, int thumbnail) {
        this.namaBibit = namaBibit;
        this.hargaBibit = hargaBibit;
        this.thumbnail = thumbnail;
    }

    public String getNamaBibit() {
        return namaBibit;
    }

    public String getHargaBibit() {
        return hargaBibit;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}
