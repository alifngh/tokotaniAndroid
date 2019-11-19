package com.example.tubes.ui.bibit;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    List<Bibit> bibitku;
    private DatabaseReference mDatabaseReference;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_home, container, false);

        bibitku = new ArrayList<>();
        mDatabaseReference = FirebaseDatabase.getInstance().getReference("produk");
        mDatabaseReference.orderByChild("kategori_produk").equalTo("Bibit").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot:dataSnapshot.getChildren()){
                    Bibit ambil = postSnapshot.getValue(Bibit.class);
                    bibitku.add(ambil);

                }
                    Log.d("Berhasil Ambil", "onDataChange: "+bibitku.get(0).getNama_produk());
                RecyclerView recyclerBibit = root.findViewById(R.id.recycle_bibit);
                RecyclerViewBibit bibitFr = new RecyclerViewBibit(container.getContext(), bibitku);
                recyclerBibit.setLayoutManager(new GridLayoutManager(container.getContext(),2));
                recyclerBibit.setAdapter(bibitFr);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.d("Error Database", "onCancelled: "+databaseError.getMessage());
            }
        });
        mDatabaseReference.orderByChild("kategori_produk").equalTo("Pupuk dan Obat").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot:dataSnapshot.getChildren()){
                    Bibit ambil = postSnapshot.getValue(Bibit.class);
                    bibitku.add(ambil);

                }
//                Log.d("Berhasil Ambil", "onDataChange: "+bibitku.get(0).getNama_produk());
                RecyclerView recyclerBibit = root.findViewById(R.id.recycle_bibit);
                RecyclerViewBibit bibitFr = new RecyclerViewBibit(container.getContext(), bibitku);
                recyclerBibit.setLayoutManager(new GridLayoutManager(container.getContext(),2));
                recyclerBibit.setAdapter(bibitFr);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.d("Error Database", "onCancelled: "+databaseError.getMessage());
            }
        });

        return root;
    }
}