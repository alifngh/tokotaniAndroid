package com.example.tubes.TransaksiPembelian;

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

import com.example.tubes.Home;
import com.example.tubes.Keranjang.KeranjangModel;
import com.example.tubes.Keranjang.RecyclerViewKrjg;
import com.example.tubes.R;

import java.util.List;

public class RecylViewTrnsPembelian extends RecyclerView.Adapter<RecylViewTrnsPembelian.MyViewHolder> {
    private Context mContext;
    private List<TransaksiPembelianModel> keranjangs;

    public RecylViewTrnsPembelian(Context mContext, List<TransaksiPembelianModel> keranjangs) {
        this.mContext = mContext;
        this.keranjangs = keranjangs;
    }

    @NonNull
    @Override
    public RecylViewTrnsPembelian.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_krjg,parent,false);

        return new RecylViewTrnsPembelian.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecylViewTrnsPembelian.MyViewHolder holder, int position) {
        holder.namaTrPembelianFr.setText(keranjangs.get(position).getNamaProdukKrjg());
        holder.hargaTrPembelianFr.setText("Harga : \n " +keranjangs.get(position).getHargaProdukKrjg());
        holder.banyakTrPembelian.setText("Bnyk : \n " +keranjangs.get(position).getBanyakBarang());
        holder.imageTrPembelianFr.setImageResource(keranjangs.get(position).getThumbnailKrjg());

    }

    @Override
    public int getItemCount() {
        return keranjangs.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namaTrPembelianFr, hargaTrPembelianFr,banyakTrPembelian;
        ImageView imageTrPembelianFr;

        public MyViewHolder(View itemView) {
            super(itemView);
            namaTrPembelianFr= (TextView) itemView.findViewById(R.id.nama_produk_transaksi_DS);
            hargaTrPembelianFr= itemView.findViewById(R.id.harga_produk_transaksi_DS);
            imageTrPembelianFr= itemView.findViewById(R.id.image_produk_transaksi_DS);
            banyakTrPembelian= itemView.findViewById(R.id.banyak_produk_transaksi_DS);


        }
    }
}
