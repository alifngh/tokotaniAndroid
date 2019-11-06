package com.example.tubes.InformasiBibit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.tubes.Keranjang.Keranjang;
import com.example.tubes.R;


public class InformasiProduk extends AppCompatActivity {

    String [] bnyk = {"Bnyk","1","2","3","4","5"};
    Spinner bnykProduk;
    Button toKeranjangProduk;

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

        toKeranjangProduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Keranjang.class));
            }
        });
    }
}
