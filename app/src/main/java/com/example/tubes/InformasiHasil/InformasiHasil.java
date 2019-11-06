package com.example.tubes.InformasiHasil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.tubes.Keranjang.Keranjang;
import com.example.tubes.R;

public class InformasiHasil extends AppCompatActivity {

    String[] banyak = {"Bnyk", "1", "2", "3", "4", "5"};
    Spinner banyakHasil;
    Button toKeranjangHasil;

    ArrayAdapter<String> adapterHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_hasil);

        banyakHasil = findViewById(R.id.inf_bnyk_hasil_DS);
        toKeranjangHasil= findViewById(R.id.inf_buttonkeranjang_hasil_DS);
        adapterHasil = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, banyak);
        banyakHasil.setAdapter(adapterHasil);

        toKeranjangHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Keranjang.class));
            }
        });
    }
}
