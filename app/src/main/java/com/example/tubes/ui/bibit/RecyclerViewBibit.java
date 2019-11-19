package com.example.tubes.ui.bibit;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
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
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewBibit extends RecyclerView.Adapter<RecyclerViewBibit.MyViewHolder> {

    private Context mContext;
    private List<Bibit> bibits;

    public List<Bibit> getBibit(){
        return bibits;
    }
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
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.namaBibitFr.setText(bibits.get(position).getNama_produk());
        holder.hargaBibitFr.setText("Rp. "+bibits.get(position).getHarga_produk()+",00");
        Picasso.get()
                .load(bibits.get(position).getUrl_gambar())
                .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(holder.imageBibitFr);
        Log.d("adapter", "nama: "+bibits.get(position).getNama_produk());

        holder.bibitParentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, InformasiProduk.class);
                intent.putExtra("namaProduk", getBibit().get(position).getNama_produk());
                intent.putExtra("hargaProduk", getBibit().get(position).getHarga_produk());
                intent.putExtra("urlGambar", getBibit().get(position).getUrl_gambar());
                intent.putExtra("kategoriProduk", getBibit().get(position).getKategori_produk());
                intent.putExtra("idProduk", getBibit().get(position).getId_produk());
                intent.putExtra("tersedia", getBibit().get(position).getTersedia());
                intent.putExtra("deskripsi", getBibit().get(position).getDeskripsi());
                mContext.startActivity(intent);

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
