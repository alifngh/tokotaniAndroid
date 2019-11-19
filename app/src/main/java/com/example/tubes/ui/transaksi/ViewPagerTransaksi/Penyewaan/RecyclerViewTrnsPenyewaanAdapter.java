package com.example.tubes.ui.transaksi.ViewPagerTransaksi.Penyewaan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;

import java.util.List;

public class RecyclerViewTrnsPenyewaanAdapter extends RecyclerView.Adapter<RecyclerViewTrnsPenyewaanAdapter.MyViewHolder> {

    private Context mContext;
    private List<PenyewaanTransaksi> penyewaanTransaksis;

    public RecyclerViewTrnsPenyewaanAdapter(Context mContext, List<PenyewaanTransaksi> keranjangs) {
        this.mContext = mContext;
        this.penyewaanTransaksis = keranjangs;
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
        holder.namaTrnsPembelianFr.setText(penyewaanTransaksis.get(position).getNamaPenyewa());
        holder.tanggalTrnsPembelianFr.setText(penyewaanTransaksis.get(position).getTanggalPenyewaan());
    }

    @Override
    public int getItemCount() {
        return penyewaanTransaksis.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namaTrnsPembelianFr, tanggalTrnsPembelianFr;

        public MyViewHolder(View itemView) {
            super(itemView);
            namaTrnsPembelianFr = (TextView) itemView.findViewById(R.id.nama_pelanggan_transaksi_DS);
            tanggalTrnsPembelianFr = itemView.findViewById(R.id.tanggal_pelanggan_transaksi_DS);
        }
    }
}
