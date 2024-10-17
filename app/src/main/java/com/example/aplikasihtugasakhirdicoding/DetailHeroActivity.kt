package com.example.aplikasihtugasakhirdicoding

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailHeroActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)

        // Menghubungkan views dengan ID yang sesuai
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDescription: TextView = findViewById(R.id.tv_hero_description)
        val imgPhoto: ImageView = findViewById(R.id.img_hero_photo)

        // Menerima data dari Intent
        val name = intent.getStringExtra("EXTRA_NAME")
        val description = intent.getStringExtra("EXTRA_DESCRIPTION")
        val photo = intent.getIntExtra("EXTRA_PHOTO", 0)

        // Cek apakah data dari intent null
        if (name != null && description != null && photo != 0) {
            // Set data ke View
            tvName.text = name
            tvDescription.text = description
            imgPhoto.setImageResource(photo)
        } else {
            // Jika data tidak ada, beri tahu user
            tvName.text = "Data tidak tersedia"
            tvDescription.text = "Deskripsi tidak tersedia"
            imgPhoto.setImageResource(R.drawable.placeholder) // Tambahkan gambar default
        }
    }
}
