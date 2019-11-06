package com.example.tubes.ui.hasiltani;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.InformasiBibit.InformasiProduk;
import com.example.tubes.R;

import java.util.List;

public class RecyclerViewHasil extends RecyclerView.Adapter<RecyclerViewHasil.MyViewHolder> {

    private Context mContext;
    private List<Hasil> hasils;

    public RecyclerViewHasil(Context mContext, List<Hasil> hasils) {
        this.mContext = mContext;
        this.hasils = hasils;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_bibit,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.namaHasilFr.setText(hasils.get(position).getNamaHasil());
        holder.hargaHasilFr.setText(hasils.get(position).getHargaHasil());
        holder.imageHasilFr.setImageResource(hasils.get(position).getThumbnailHasil());

        holder.hasilParentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext , InformasiProduk.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return hasils.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namaHasilFr, hargaHasilFr;
        ImageView imageHasilFr;
        LinearLayout hasilParentLayout;

        public MyViewHolder(View itemView) {
            super(itemView);
            namaHasilFr = (TextView) itemView.findViewById(R.id.nama_produk_DS);
            hargaHasilFr = itemView.findViewById(R.id.harga_produk_DS);
            imageHasilFr= itemView.findViewById(R.id.image_produk_DS);
            hasilParentLayout = itemView.findViewById(R.id.parent_bibittani);
        }
    }
}
