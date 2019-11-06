package com.example.tubes.Keranjang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tubes.Home;
import com.example.tubes.R;

import java.util.ArrayList;
import java.util.List;

public class Keranjang extends AppCompatActivity {

    private List<KeranjangModel> keranjangku;
    Button toTransaksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang);
        toTransaksi = findViewById(R.id.transaksi);
        keranjangku = new ArrayList<>();
        keranjangku.add(new KeranjangModel("Padi Raja Lele", "Rp. 50000",R.drawable.ic_padidummy, 4));
        keranjangku.add(new KeranjangModel("Mesin Potong Rumput", "Rp. 50000",R.drawable.ic_cangkul,2));
        keranjangku.add(new KeranjangModel("Ketela", "Rp. 30000",R.drawable.ic_jeruk,3));
        RecyclerView recyclerKrjg = findViewById(R.id.recycler_krjg);
        RecyclerViewKrjg krjgFr = new RecyclerViewKrjg(getApplicationContext(), keranjangku);
        recyclerKrjg.setLayoutManager(new GridLayoutManager(getApplicationContext(),1));
        recyclerKrjg.setAdapter(krjgFr);
        toTransaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Home.class));
            }
        });
    }
}
