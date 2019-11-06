package com.example.tubes.ui.nota.Pembelian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;

import java.util.List;

public class RecyclerViewNotaAdapter extends RecyclerView.Adapter<RecyclerViewNotaAdapter.MyViewHolder> {
    private Context mContext;
    private List<PembelianNota> pembelianNota;

    public RecyclerViewNotaAdapter(Context mContext, List<PembelianNota> keranjangs) {
        this.mContext = mContext;
        this.pembelianNota = keranjangs;
    }

    @NonNull
    @Override
    public RecyclerViewNotaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_transaksi,parent,false);

        return new RecyclerViewNotaAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewNotaAdapter.MyViewHolder holder, int position) {
        holder.namaNotaPembelianFr.setText(pembelianNota.get(position).getNamaPembeli());
        holder.tanggalNotaPembelianFr.setText(pembelianNota.get(position).getTanggalPembelian());
    }

    @Override
    public int getItemCount() {
        return pembelianNota.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namaNotaPembelianFr, tanggalNotaPembelianFr;

        public MyViewHolder(View itemView) {
            super(itemView);
            namaNotaPembelianFr = (TextView) itemView.findViewById(R.id.nama_pelanggan_transaksi_DS);
            tanggalNotaPembelianFr = itemView.findViewById(R.id.tanggal_pelanggan_transaksi_DS);
        }
    }
}
