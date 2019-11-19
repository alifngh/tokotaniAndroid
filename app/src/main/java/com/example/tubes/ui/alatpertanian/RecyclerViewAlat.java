package com.example.tubes.ui.alatpertanian;

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

import com.example.tubes.InformasiAlat.InformasiAlat;
import com.example.tubes.InformasiBibit.InformasiProduk;
import com.example.tubes.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAlat extends RecyclerView.Adapter<RecyclerViewAlat.MyViewHolder> {

    private Context mContext;
    private List<Alat> alats;

    public List<Alat> getAlats(){
        return alats;
    }
    public RecyclerViewAlat(Context mContext, List<Alat> alats) {
        this.mContext = mContext;
        this.alats = alats;
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
        holder.namaAlatFr.setText(alats.get(position).getNama_produk());
        holder.hargaAlatFr.setText("Rp. "+alats.get(position).getHarga_produk()+",00");
        Picasso.get()
                .load(alats.get(position).getUrl_gambar())
                .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(holder.imageAlatFr);
        holder.alatParentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, InformasiAlat.class);
                intent.putExtra("namaAlat", getAlats().get(position).getNama_produk());
                intent.putExtra("hargaAlat", getAlats().get(position).getHarga_produk());
                intent.putExtra("urlGambar", getAlats().get(position).getUrl_gambar());
                intent.putExtra("kategoriAlat", getAlats().get(position).getKategori_produk());
                intent.putExtra("idAlat", getAlats().get(position).getId_produk());
                intent.putExtra("tersedia", getAlats().get(position).getTersedia());
                intent.putExtra("deskripsi", getAlats().get(position).getDeskripsi());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return alats.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namaAlatFr, hargaAlatFr;
        ImageView imageAlatFr;
        LinearLayout alatParentLayout;

        public MyViewHolder(View itemView) {
            super(itemView);
            namaAlatFr= (TextView) itemView.findViewById(R.id.nama_produk_DS);
            hargaAlatFr = itemView.findViewById(R.id.harga_produk_DS);
            imageAlatFr = itemView.findViewById(R.id.image_produk_DS);

            alatParentLayout = itemView.findViewById(R.id.parent_bibittani);
        }
    }
}
