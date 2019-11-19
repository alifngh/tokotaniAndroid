package com.example.tubes.ui.hasiltani;

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
import com.example.tubes.ui.bibit.Bibit;
import com.example.tubes.ui.bibit.RecyclerViewBibit;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class HasiltaniFragment extends Fragment {

    private HasiltaniViewModel hasiltaniViewModel;
    private List<Hasil> hasilku;
    private DatabaseReference mDatabaseReference;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        hasiltaniViewModel =
                ViewModelProviders.of(this).get(HasiltaniViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_hasiltani, container, false);
        hasilku = new ArrayList<>();
        mDatabaseReference = FirebaseDatabase.getInstance().getReference("produk");
        mDatabaseReference.orderByChild("kategori_produk").equalTo("Hasil Tani").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot:dataSnapshot.getChildren()){
                    Hasil ambil = postSnapshot.getValue(Hasil.class);
                    hasilku.add(ambil);

                }
                Log.d("Berhasil Ambil", "onDataChange: "+hasilku.get(0).getNama_produk());
                RecyclerView recyclerHasil= root.findViewById(R.id.recycle_hasiltani);
                RecyclerViewHasil HasilFr = new RecyclerViewHasil(container.getContext(), hasilku);
                recyclerHasil.setLayoutManager(new GridLayoutManager(container.getContext(),2));
                recyclerHasil.setAdapter(HasilFr);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.d("Error Database", "onCancelled: "+databaseError.getMessage());
            }
        });

        return root;
    }
}