package com.example.tubes.ui.home;

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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    List<Bibit> bibitku;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        bibitku = new ArrayList<>();
        bibitku.add(new Bibit("Padi Raja Lele", "Rp. 50000",R.drawable.ic_padidummy));
        bibitku.add(new Bibit("Padi Menthik Wangi", "Rp. 60000",R.drawable.ic_padidummy));
        bibitku.add(new Bibit("Padi 64", "Rp. 30000",R.drawable.ic_padidummy));
        bibitku.add(new Bibit("Padi Gogo", "Rp. 20000",R.drawable.ic_padidummy));
        bibitku.add(new Bibit("Padi Gogo", "Rp. 20000",R.drawable.ic_padidummy));
        bibitku.add(new Bibit("Padi Gogo", "Rp. 20000",R.drawable.ic_padidummy));
        RecyclerView recyclerBibit = root.findViewById(R.id.recycle_bibit);
        RecyclerViewBibit bibitFr = new RecyclerViewBibit(container.getContext(), bibitku);
        recyclerBibit.setLayoutManager(new GridLayoutManager(container.getContext(),2));
        recyclerBibit.setAdapter(bibitFr);

        return root;
    }
}