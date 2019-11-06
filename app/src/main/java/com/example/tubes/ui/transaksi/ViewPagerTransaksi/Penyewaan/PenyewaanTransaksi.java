package com.example.tubes.ui.transaksi.ViewPagerTransaksi.Penyewaan;

public class PenyewaanTransaksi {
    private String namaPenyewa, tanggalPenyewaan;

    public PenyewaanTransaksi(String namaPembeli, String tanggalPembelian) {
        this.namaPenyewa = namaPembeli;
        this.tanggalPenyewaan = tanggalPembelian;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public String getTanggalPenyewaan() {
        return tanggalPenyewaan;
    }
}
