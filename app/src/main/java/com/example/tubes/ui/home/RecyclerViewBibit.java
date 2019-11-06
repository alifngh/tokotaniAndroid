package com.example.tubes.ui.home;

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

public class RecyclerViewBibit extends RecyclerView.Adapter<RecyclerViewBibit.MyViewHolder> {

    private Context mContext;
    private List<Bibit> bibits;

    public RecyclerViewBibit(Context mContext, List<Bibit> bibits) {
        this.mContext = mContext;
        this.bibits = bibits;
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
        holder.namaBibitFr.setText(bibits.get(position).getNamaBibit());
        holder.hargaBibitFr.setText(bibits.get(position).getHargaBibit());
        holder.imageBibitFr.setImageResource(bibits.get(position).getThumbnail());

        holder.bibitParentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext , InformasiProduk.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return bibits.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namaBibitFr, hargaBibitFr;
        ImageView imageBibitFr;
        LinearLayout bibitParentLayout;
        public MyViewHolder(View itemView) {
            super(itemView);
            namaBibitFr = (TextView) itemView.findViewById(R.id.nama_produk_DS);
            hargaBibitFr = itemView.findViewById(R.id.harga_produk_DS);
            imageBibitFr = itemView.findViewById(R.id.image_produk_DS);

            bibitParentLayout = itemView.findViewById(R.id.parent_bibittani);
        }
    }
}
