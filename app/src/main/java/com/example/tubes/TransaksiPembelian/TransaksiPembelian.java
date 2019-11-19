package com.example.tubes.TransaksiPembelian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tubes.Home;
import com.example.tubes.Keranjang.KeranjangModel;
import com.example.tubes.Keranjang.RecyclerViewKrjg;
import com.example.tubes.R;

import java.util.ArrayList;
import java.util.List;

public class TransaksiPembelian extends AppCompatActivity {

    private List<TransaksiPembelianModel> keranjangku;
    Button toNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi_pembelian);
        toNota = findViewById(R.id.selesai_pmblian);
        keranjangku = new ArrayList<>();
        keranjangku.add(new TransaksiPembelianModel("Padi Raja Lele", "Rp. 50000",R.drawable.ic_padidummy, 4));
        keranjangku.add(new TransaksiPembelianModel("Mesin Potong Rumput", "Rp. 50000",R.drawable.ic_cangkul,2));
        keranjangku.add(new TransaksiPembelianModel("Ketela", "Rp. 30000",R.drawable.ic_jeruk,3));
        RecyclerView recyclerKrjg = findViewById(R.id.recycler_transaksi_pmblian);
        RecylViewTrnsPembelian krjgFr = new RecylViewTrnsPembelian(getApplicationContext(), keranjangku);
        recyclerKrjg.setLayoutManager(new GridLayoutManager(getApplicationContext(),1));
        recyclerKrjg.setAdapter(krjgFr);
        toNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Home.class));
            }
        });
    }
}
