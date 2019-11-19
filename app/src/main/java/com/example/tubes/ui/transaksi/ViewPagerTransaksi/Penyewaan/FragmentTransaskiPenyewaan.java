package com.example.tubes.ui.transaksi.ViewPagerTransaksi.Penyewaan;

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

public class FragmentTransaskiPenyewaan extends Fragment {
    private ViewGroup rootView;
    private List<PenyewaanTransaksi> penyewaanTransaksiku;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.viewpager_transaksi_penyewaan,container,false);
        penyewaanTransaksiku = new ArrayList<>();
        penyewaanTransaksiku.add(new PenyewaanTransaksi("Wisanggeni", "1/12/2019"));
        penyewaanTransaksiku.add(new PenyewaanTransaksi("Gatotkaca", "1/11/2018"));
        penyewaanTransaksiku.add(new PenyewaanTransaksi("Antasena", "1/10/2017"));
        RecyclerView recyclerKrjg = rootView.findViewById(R.id.viewpager_transaksi_penyewaan);
        RecyclerViewTrnsPenyewaanAdapter krjgFr = new RecyclerViewTrnsPenyewaanAdapter(rootView.getContext(), penyewaanTransaksiku);
        recyclerKrjg.setLayoutManager(new GridLayoutManager(rootView.getContext(),1));
        recyclerKrjg.setAdapter(krjgFr);
        return rootView;
    }
}
