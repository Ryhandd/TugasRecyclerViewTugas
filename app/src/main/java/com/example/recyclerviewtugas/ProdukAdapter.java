package com.example.recyclerviewtugas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProdukAdapter extends RecyclerView.Adapter<ProdukAdapter.ViewHolder> {
    private List<Produk> listProduk;

    public ProdukAdapter(List<Produk> listProduk) {
        this.listProduk = listProduk;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_produk, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Produk produk = listProduk.get(position);
        holder.ivGambar.setImageResource(produk.getGambar());
        holder.tvNama.setText(produk.getNama());
        holder.tvHarga.setText(produk.getHarga());
        holder.tvDeskripsi.setText(produk.getDeskripsi());

        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), produk.getNama(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return listProduk.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivGambar;
        TextView tvNama, tvHarga, tvDeskripsi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivGambar = itemView.findViewById(R.id.ivGambar);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvHarga = itemView.findViewById(R.id.tvHarga);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
        }
    }
}
