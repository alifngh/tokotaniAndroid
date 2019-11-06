package com.example.tubes.ui.transaksi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.tubes.R;
import com.example.tubes.ui.transaksi.ViewPagerTransaksi.Pembelian.FragmentTransaskiPembelian;
import com.example.tubes.ui.transaksi.ViewPagerTransaksi.Penyewaan.FragmentTransaskiPenyewaan;
import com.example.tubes.ui.transaksi.ViewPagerTransaksi.ViewPagerTransaksiAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TransaksiFragment extends Fragment {

    private ViewPager pagerTransaksi;
    private TabLayout tableLayoutTransaksi;
    private ViewPagerTransaksiAdapter adapterPagerTransaksi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_transaksi, container, false);

        pagerTransaksi = root.findViewById(R.id.viewpager_transaksi);
        tableLayoutTransaksi = root.findViewById(R.id.tablayout_transaksi_DS);
        adapterPagerTransaksi = new ViewPagerTransaksiAdapter(getFragmentManager());
        adapterPagerTransaksi.addFragments(new FragmentTransaskiPembelian(), "Pembelian");
        adapterPagerTransaksi.addFragments(new FragmentTransaskiPenyewaan(), "Penyewaan");
        pagerTransaksi.setAdapter(adapterPagerTransaksi);
        tableLayoutTransaksi.setupWithViewPager(pagerTransaksi);
        return root;
    }
}