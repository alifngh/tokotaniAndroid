package com.example.tubes.InformasiBibit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

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


public class InformasiProduk extends AppCompatActivity {

    String [] bnyk = {"Bnyk","1","2","3","4","5"};
    Spinner bnykProduk;
    Button toKeranjangProduk;
    ImageView gambarBibit;
    TextView namaBibit, hargaBibit, deskripsiBibit, tersediaBibit, kategoriBibit;

    ArrayAdapter<String> adapter;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_produk);
        bnykProduk = findViewById(R.id.inf_bnykproduk_DS);
        toKeranjangProduk = findViewById(R.id.inf_buttonkeranjang_DS);
        adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, bnyk);
        bnykProduk.setAdapter(adapter);

        gambarBibit = findViewById(R.id.inf_gambar_produk);
        namaBibit = findViewById(R.id.inf_namaproduk_DS);
        hargaBibit = findViewById(R.id.inf_hargaproduk_DS);
        deskripsiBibit =  findViewById(R.id.inf_deskripsi_produk_DS);
        tersediaBibit = findViewById(R.id.inf_tersedia_produk_ds);
        kategoriBibit = findViewById(R.id.inf_kategori_produk_ds);

        final String namaBibitDetail = getIntent().getStringExtra("namaProduk");
        final String hargaBibitDetail = getIntent().getStringExtra("hargaProduk");
        final String gambarBibitDetail = getIntent().getStringExtra("urlGambar");
        final String kategoriBibitDetail = getIntent().getStringExtra("kategoriProduk");
        final String idBibitDetail = getIntent().getStringExtra("idProduk");
        final String tersediaBibitDetail = getIntent().getStringExtra("tersedia");
        final String desBibitDetail = getIntent().getStringExtra("deskripsi");

        Picasso.get()
                .load(gambarBibitDetail)
                .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(gambarBibit);
        namaBibit.setText(namaBibitDetail);
        hargaBibit.setText("Rp. "+hargaBibitDetail+",00");
        deskripsiBibit.setText(desBibitDetail);
        tersediaBibit.setText(tersediaBibitDetail);
        kategoriBibit.setText(kategoriBibitDetail);

        toKeranjangProduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Keranjang.class));
            }
        });
    }
}
