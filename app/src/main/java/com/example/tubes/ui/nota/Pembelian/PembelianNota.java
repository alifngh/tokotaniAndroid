package com.example.tubes.ui.nota.Pembelian;

public class PembelianNota {
    private String namaPembeli, tanggalPembelian;

    public PembelianNota(String namaPembeli, String tanggalPembelian) {
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public String getTanggalPembelian() {
        return tanggalPembelian;
    }
}
