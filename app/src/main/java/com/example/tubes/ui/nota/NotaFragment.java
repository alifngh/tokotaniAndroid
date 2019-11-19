package com.example.tubes.ui.nota;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.tubes.R;
import com.example.tubes.ui.transaksi.ViewPagerTransaksi.Pembelian.FragmentTransaskiPembelian;
import com.example.tubes.ui.transaksi.ViewPagerTransaksi.Penyewaan.FragmentTransaskiPenyewaan;
import com.example.tubes.ui.transaksi.ViewPagerTransaksi.ViewPagerTransaksiAdapter;
import com.google.android.material.tabs.TabLayout;

public class NotaFragment extends Fragment {

    private ViewPager pagerNota;
    private TabLayout tableLayoutNota;
    private ViewPagerNotaAdapter adapterPagerNota;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_nota, container, false);

        pagerNota = root.findViewById(R.id.viewpager_nota);
        tableLayoutNota= root.findViewById(R.id.tablayout_nota_DS);
        adapterPagerNota= new ViewPagerNotaAdapter(getFragmentManager());
        adapterPagerNota.addFragments(new FragmentTransaskiPembelian(), "Pembelian");
        adapterPagerNota.addFragments(new FragmentTransaskiPenyewaan(), "Penyewaan");
        pagerNota.setAdapter(adapterPagerNota);
        tableLayoutNota.setupWithViewPager(pagerNota);
        return root;
    }
}