package com.example.tubes.ui.transaksi.ViewPagerTransaksi.Pembelian;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;
import com.example.tubes.TransaksiPembelian.TransaksiPembelian;

import java.util.List;

public class RecyclerViewTrnsPembelianAdapter extends RecyclerView.Adapter<RecyclerViewTrnsPembelianAdapter.MyViewHolder> {

    private Context mContext;
    private List<PembelianTransaksi> pembelianTransaksis;

    public RecyclerViewTrnsPembelianAdapter(Context mContext, List<PembelianTransaksi> keranjangs) {
        this.mContext = mContext;
        this.pembelianTransaksis = keranjangs;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_transaksi,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.namaTrnsPembelianFr.setText(pembelianTransaksis.get(position).getNamaPembeli());
        holder.tanggalTrnsPembelianFr.setText(pembelianTransaksis.get(position).getTanggalPembelian());
        holder.parentTrnsaksiPmblian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, TransaksiPembelian.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return pembelianTransaksis.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namaTrnsPembelianFr, tanggalTrnsPembelianFr;
        LinearLayout parentTrnsaksiPmblian;
        public MyViewHolder(View itemView) {
            super(itemView);
            namaTrnsPembelianFr = (TextView) itemView.findViewById(R.id.nama_pelanggan_transaksi_DS);
            tanggalTrnsPembelianFr = itemView.findViewById(R.id.tanggal_pelanggan_transaksi_DS);
            parentTrnsaksiPmblian = itemView.findViewById(R.id.parent_transaksi);
        }
    }
}
