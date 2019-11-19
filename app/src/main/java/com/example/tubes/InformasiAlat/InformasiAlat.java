package com.example.tubes.InformasiAlat;

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

public class InformasiAlat extends AppCompatActivity {

    String[] lama = {"/Hari", "1", "2", "3", "4", "5"};
    Spinner lamaAlat;
    Button toKeranjangAlat;
    ImageView gambarAlat;
    TextView namaAlat, hargaAlat, deskripsiAlat, tersediaAlat, kategoriAlat;

    ArrayAdapter<String> adapterAlat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_alat);
        lamaAlat = findViewById(R.id.inf_bnyk_alat_DS);
        toKeranjangAlat= findViewById(R.id.inf_buttonkeranjang_alat_DS);
        adapterAlat = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, lama);
        lamaAlat.setAdapter(adapterAlat);

        gambarAlat = findViewById(R.id.inf_image_alat_DS);
        namaAlat = findViewById(R.id.inf_nama_alat_DS);
        hargaAlat = findViewById(R.id.inf_harga_alat_DS);
        deskripsiAlat =  findViewById(R.id.inf_deskripsi_alat_DS);
        tersediaAlat = findViewById(R.id.inf_tersedia_alat_ds);
        kategoriAlat = findViewById(R.id.inf_kategori_alat_ds);

        final String namaAlatDetail = getIntent().getStringExtra("namaAlat");
        final String hargaAlatDetail = getIntent().getStringExtra("hargaAlat");
        final String gambarAlatDetail = getIntent().getStringExtra("urlGambar");
        final String kategoriAlatDetail = getIntent().getStringExtra("kategoriAlat");
        final String idBibitDetail = getIntent().getStringExtra("idProduk");
        final String tersediaAlatDetail = getIntent().getStringExtra("tersedia");
        final String desAlatDetail = getIntent().getStringExtra("deskripsi");

        Picasso.get()
                .load(gambarAlatDetail)
                .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(gambarAlat);
        namaAlat.setText(namaAlatDetail);
        hargaAlat.setText("Rp. "+hargaAlatDetail+",00");
        deskripsiAlat.setText(desAlatDetail);
        tersediaAlat.setText(tersediaAlatDetail);
        kategoriAlat.setText(kategoriAlatDetail);

        toKeranjangAlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Keranjang.class));
            }
        });
    }
}
