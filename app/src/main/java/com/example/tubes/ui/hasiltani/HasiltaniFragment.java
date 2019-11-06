package com.example.tubes.ui.hasiltani;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;
import com.example.tubes.ui.home.Bibit;
import com.example.tubes.ui.home.RecyclerViewBibit;

import java.util.ArrayList;
import java.util.List;

public class HasiltaniFragment extends Fragment {

    private HasiltaniViewModel hasiltaniViewModel;
    private List<Hasil> hasilku;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        hasiltaniViewModel =
                ViewModelProviders.of(this).get(HasiltaniViewModel.class);
        View root = inflater.inflate(R.layout.fragment_hasiltani, container, false);
        hasilku = new ArrayList<>();
        hasilku.add(new Hasil("Beras Raja Lele", "Rp. 50000",R.drawable.ic_jeruk));
        hasilku.add(new Hasil("Singkong", "Rp. 60000",R.drawable.ic_jeruk));
        hasilku.add(new Hasil("Ketela", "Rp. 30000",R.drawable.ic_jeruk));
        RecyclerView recyclerHasil= root.findViewById(R.id.recycle_hasiltani);
        RecyclerViewHasil HasilFr = new RecyclerViewHasil(container.getContext(), hasilku);
        recyclerHasil.setLayoutManager(new GridLayoutManager(container.getContext(),2));
        recyclerHasil.setAdapter(HasilFr);
        return root;
    }
}