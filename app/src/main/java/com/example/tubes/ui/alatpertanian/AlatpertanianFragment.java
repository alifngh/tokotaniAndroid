package com.example.tubes.ui.alatpertanian;

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

public class AlatpertanianFragment extends Fragment {

    private AlatpertanianViewModel alatpertanianViewModel;
    List<Alat> alatku;
    private DatabaseReference mDatabaseReference;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        alatpertanianViewModel =
                ViewModelProviders.of(this).get(AlatpertanianViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_alatpertanian, container, false);
        alatku = new ArrayList<>();
        mDatabaseReference = FirebaseDatabase.getInstance().getReference("produk");
        mDatabaseReference.orderByChild("kategori_produk").equalTo("Alat").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot:dataSnapshot.getChildren()){
                    Alat ambil = postSnapshot.getValue(Alat.class);
                    alatku.add(ambil);

                }
//                Log.d("Berhasil Ambil", "onDataChange: "+bibitku.get(0).getNama_produk());
                RecyclerView recyclerAlat = root.findViewById(R.id.recycle_alat);
                RecyclerViewAlat bibitFr = new RecyclerViewAlat(container.getContext(), alatku);
                recyclerAlat.setLayoutManager(new GridLayoutManager(container.getContext(),2));
                recyclerAlat.setAdapter(bibitFr);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.d("Error Database", "onCancelled: "+databaseError.getMessage());
            }
        });

        RecyclerView recyclerAlat = root.findViewById(R.id.recycle_alat);
        RecyclerViewAlat bibitFr = new RecyclerViewAlat(container.getContext(), alatku);
        recyclerAlat.setLayoutManager(new GridLayoutManager(container.getContext(),2));
        recyclerAlat.setAdapter(bibitFr);
        return root;
    }
}