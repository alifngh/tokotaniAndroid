package com.example.tubes.ui.nota.Pembelian;

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
import com.example.tubes.ui.transaksi.ViewPagerTransaksi.Pembelian.PembelianTransaksi;
import com.example.tubes.ui.transaksi.ViewPagerTransaksi.Pembelian.RecyclerViewTrnsPembelianAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentNotaPembelian extends Fragment {
    List<PembelianNota> pembelianNotaku;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.viewpager_nota_pembelian,container,false);
        pembelianNotaku = new ArrayList<>();
        pembelianNotaku.add(new PembelianNota("Wisanggeni", "12/12/2019"));
        pembelianNotaku.add(new PembelianNota("Gatotkaca", "11/11/2018"));
        pembelianNotaku.add(new PembelianNota("Antasena", "10/10/2017"));
        RecyclerView recyclerKrjg = rootView.findViewById(R.id.viewpager_transaksi_pembelian);
        RecyclerViewNotaAdapter krjgFr = new RecyclerViewNotaAdapter(rootView.getContext(), pembelianNotaku);
        recyclerKrjg.setLayoutManager(new GridLayoutManager(rootView.getContext(),1));
        recyclerKrjg.setAdapter(krjgFr);
        return rootView;
    }
}
