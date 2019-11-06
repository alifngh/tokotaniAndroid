package com.example.tubes.InformasiAlat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.tubes.Keranjang.Keranjang;
import com.example.tubes.R;

public class InformasiAlat extends AppCompatActivity {

    String[] lama = {"Bnyk", "1", "2", "3", "4", "5"};
    Spinner lamaAlat;
    Button toKeranjangAlat;

    ArrayAdapter<String> adapterAlat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_alat);
        lamaAlat = findViewById(R.id.inf_bnyk_alat_DS);
        toKeranjangAlat= findViewById(R.id.inf_buttonkeranjang_alat_DS);
        adapterAlat = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, lama);
        lamaAlat.setAdapter(adapterAlat);

        toKeranjangAlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Keranjang.class));
            }
        });
    }
}
