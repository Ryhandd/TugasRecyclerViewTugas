package com.example.recyclerviewtugas;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProduk;
    private List<Produk> listProduk = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Toko Elektronik");
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.blue_dark));
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvProduk = findViewById(R.id.rvProduk);
        rvProduk.setHasFixedSize(true);

        isiDataDummy();
        tampilkanRecycler();
    }

    private void isiDataDummy() {
        listProduk.add(new Produk("Laptop ASUS", "Rp 15.000.000", "Laptop gaming spesifikasi tinggi", R.drawable.foto1));
        listProduk.add(new Produk("Samsung S23", "Rp 12.000.000", "Smartphone flagship kamera jernih", R.drawable.foto2));
        listProduk.add(new Produk("iPad Pro", "Rp 18.000.000", "Tablet terbaik untuk desain grafis", R.drawable.foto3));
        listProduk.add(new Produk("Monitor LG", "Rp 3.500.000", "Monitor 4K 27 inch bezel-less", R.drawable.foto4));
        listProduk.add(new Produk("Mouse Logitech", "Rp 800.000", "Mouse wireless ergonomic", R.drawable.foto5));
        listProduk.add(new Produk("Printer Epson", "Rp 2.500.000", "Printer ink tank hemat tinta", R.drawable.foto6));
    }

    private void tampilkanRecycler() {
        rvProduk.setLayoutManager(new GridLayoutManager(this, 2));
        ProdukAdapter adapter = new ProdukAdapter(listProduk);
        rvProduk.setAdapter(adapter);
    }
}
