package com.example.tubes.ui.transaksi.ViewPagerTransaksi.Pembelian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentTransaskiPembelian extends Fragment {

    List<PembelianTransaksi> pembelianTransaksiku;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.viewpager_transaksi_pembelian,container,false);
        pembelianTransaksiku = new ArrayList<>();
        pembelianTransaksiku.add(new PembelianTransaksi("Wisanggeni", "12/12/2019"));
        pembelianTransaksiku.add(new PembelianTransaksi("Gatotkaca", "11/11/2018"));
        pembelianTransaksiku.add(new PembelianTransaksi("Antasena", "10/10/2017"));
        RecyclerView recyclerKrjg = rootView.findViewById(R.id.viewpager_transaksi_pembelian);
        RecyclerViewTrnsPembelianAdapter krjgFr = new RecyclerViewTrnsPembelianAdapter(rootView.getContext(), pembelianTransaksiku);
        recyclerKrjg.setLayoutManager(new GridLayoutManager(rootView.getContext(),1));
        recyclerKrjg.setAdapter(krjgFr);
        return rootView;
    }
}
