package com.example.tubes.ui.transaksi.ViewPagerTransaksi.Pembelian;

public class PembelianTransaksi {
    private String namaPembeli, tanggalPembelian;

    public PembelianTransaksi(String namaPembeli, String tanggalPembelian) {
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
