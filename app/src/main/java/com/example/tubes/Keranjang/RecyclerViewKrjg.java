package com.example.tubes.Keranjang;

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

import com.example.tubes.R;
import com.example.tubes.TransaksiPembelian.TransaksiPembelian;

import java.util.List;

public class RecyclerViewKrjg extends RecyclerView.Adapter<RecyclerViewKrjg.MyViewHolder> {

    private Context mContext;
    private List<KeranjangModel> keranjangs;

    public RecyclerViewKrjg(Context mContext, List<KeranjangModel> keranjangs) {
        this.mContext = mContext;
        this.keranjangs = keranjangs;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_krjg,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        holder.namaKrjgFr.setText(keranjangs.get(position).getNamaProdukKrjg());
        holder.hargaKrjgFr.setText("Harga : \n " +keranjangs.get(position).getHargaProdukKrjg());
        holder.banyakKrjg.setText("Bnyk : \n " +keranjangs.get(position).getBanyakBarang());
        holder.imageKrjgFr.setImageResource(keranjangs.get(position).getThumbnailKrjg());

    }

    @Override
    public int getItemCount() {
        return keranjangs.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namaKrjgFr, hargaKrjgFr,banyakKrjg;
        ImageView imageKrjgFr;

        public MyViewHolder(View itemView) {
            super(itemView);
            namaKrjgFr = (TextView) itemView.findViewById(R.id.nama_produk_transaksi_DS);
            hargaKrjgFr = itemView.findViewById(R.id.harga_produk_transaksi_DS);
            imageKrjgFr = itemView.findViewById(R.id.image_produk_transaksi_DS);
            banyakKrjg = itemView.findViewById(R.id.banyak_produk_transaksi_DS);
        }
    }
}
