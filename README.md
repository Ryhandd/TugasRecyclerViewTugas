# Tugas Pemrograman Mobile: Implementasi RecyclerView (Daftar Produk)

Proyek ini mendemonstrasikan penggunaan **RecyclerView** di Android Studio untuk menampilkan daftar produk jualan secara dinamis. Setiap item dalam daftar memiliki tata letak yang rapi dengan foto di sisi kiri dan informasi detail di sisi kanan.

## 📋 Deskripsi Tugas
Aplikasi ini menampilkan daftar produk (e-commerce style) yang mencakup:
1. **Foto Produk:** Ditampilkan di sisi kiri menggunakan `ImageView`.
2. **Nama Produk:** Judul utama item.
3. **Harga Produk:** Informasi harga yang jelas.
4. **Deskripsi:** Penjelasan singkat mengenai produk tersebut.

## ⚙️ Cara Kerja
* **Model Data:** Menggunakan kelas Java (`Product.java`) untuk menampung data nama, harga, deskripsi, dan resource foto.
* **Adapter & ViewHolder:** Menghubungkan data list dari Java ke layout XML `item_row`.
* **Layout Manager:** Menggunakan `LinearLayoutManager` untuk menampilkan daftar secara vertikal.
* **Customizable:** Data produk dapat diubah, ditambah, atau dikurangi secara langsung melalui *ArrayList* di dalam file Java utama.

## 🛠️ Tech Stack
* **IDE:** Android Studio
* **Bahasa:** Java
* **Komponen UI:** RecyclerView, CardView, ImageView, TextView.

## 📂 Struktur File Penting
* `MainActivity.java` -> Inisialisasi RecyclerView dan sumber data.
* `ProductAdapter.java` -> Logika untuk menghubungkan data ke tampilan.
* `Product.java` -> Kelas model data produk.
* `activity_main.xml` -> Layout utama yang berisi widget RecyclerView.
* `item_row_product.xml` -> Layout kustom untuk tiap baris produk (Foto di kiri, teks di kanan).

---

## 👤 Identitas Mahasiswa
* **Nama:** Rayhand N. U. Wumu
* **NIM:** 24024010
* **Kelas:** 4TI1
* **Program Studi:** Teknik Informatika

---
*Dokumentasi ini dibuat untuk keperluan akademik - 2026*