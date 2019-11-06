package com.example.tubes.ui.alatpertanian;

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
import com.example.tubes.ui.home.Bibit;
import com.example.tubes.ui.home.RecyclerViewBibit;

import java.util.ArrayList;
import java.util.List;

public class AlatpertanianFragment extends Fragment {

    private AlatpertanianViewModel alatpertanianViewModel;
    List<Alat> alatku;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        alatpertanianViewModel =
                ViewModelProviders.of(this).get(AlatpertanianViewModel.class);
        View root = inflater.inflate(R.layout.fragment_alatpertanian, container, false);
        alatku = new ArrayList<>();
        alatku.add(new Alat("Semprot Rumput", "Rp. 50000",R.drawable.ic_cangkul));
        alatku.add(new Alat("Traktor", "Rp. 60000",R.drawable.ic_cangkul));
        alatku.add(new Alat("Mesin Potong Rumput", "Rp. 30000",R.drawable.ic_cangkul));

        RecyclerView recyclerAlat = root.findViewById(R.id.recycle_alat);
        RecyclerViewAlat bibitFr = new RecyclerViewAlat(container.getContext(), alatku);
        recyclerAlat.setLayoutManager(new GridLayoutManager(container.getContext(),2));
        recyclerAlat.setAdapter(bibitFr);
        return root;
    }
}