package com.example.tubes.InformasiHasil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.tubes.Keranjang.Keranjang;
import com.example.tubes.R;
import com.squareup.picasso.Picasso;

public class InformasiHasil extends AppCompatActivity {

    String[] banyak = {"Bnyk", "1", "2", "3", "4", "5"};
    Spinner banyakHasil;
    Button toKeranjangHasil;
    ImageView gambarHasil;
    TextView namaHasil, hargaHasil, deskripsiHasil, tersediaHasil, kategoriHasil;

    ArrayAdapter<String> adapterHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_hasil);

        banyakHasil = findViewById(R.id.inf_bnyk_hasil_DS);
        toKeranjangHasil= findViewById(R.id.inf_buttonkeranjang_hasil_DS);
        adapterHasil = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, banyak);
        banyakHasil.setAdapter(adapterHasil);

        gambarHasil= findViewById(R.id.inf_image_hasil_DS);
        namaHasil = findViewById(R.id.inf_nama_hasil_DS);
        hargaHasil = findViewById(R.id.inf_harga_hasil_DS);
        deskripsiHasil =  findViewById(R.id.inf_deskripsi_hasil_DS);
        tersediaHasil = findViewById(R.id.inf_tersedia_hasil_ds);
        kategoriHasil = findViewById(R.id.inf_kategori_hasil_ds);

        final String namaHasilDetail = getIntent().getStringExtra("namaHasil");
        final String hargaHasilDetail = getIntent().getStringExtra("hargaHasil");
        final String gambarHasilDetail = getIntent().getStringExtra("urlGambar");
        final String kategoriHasilDetail = getIntent().getStringExtra("kategoriHasil");
        final String idBibitDetail = getIntent().getStringExtra("idHasil");
        final String tersediaHasilDetail = getIntent().getStringExtra("tersedia");
        final String desHasilDetail = getIntent().getStringExtra("deskripsi");

        Picasso.get()
                .load(gambarHasilDetail)
                .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(gambarHasil);
        namaHasil.setText(namaHasilDetail);
        hargaHasil.setText("Rp. "+hargaHasilDetail+",00");
        deskripsiHasil.setText(desHasilDetail);
        tersediaHasil.setText(tersediaHasilDetail);
        kategoriHasil.setText(kategoriHasilDetail);

        toKeranjangHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Keranjang.class));
            }
        });
    }
}
