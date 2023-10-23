package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        val btn_struktur = findViewById<Button>(R.id.tombol_struktur) //ini tombol login yang pengen di pencet
        btn_struktur.setOnClickListener {
            val Intent = Intent(this, SrukturPage::class.java)
            startActivity(Intent)
        }

        val btn_prestasi = findViewById<Button>(R.id.tombol_prestasi) //ini tombol login yang pengen di pencet
        btn_prestasi.setOnClickListener {
            val Intent = Intent(this, PrestasiPage::class.java)
            startActivity(Intent)
        }

        val btn_sosmed = findViewById<Button>(R.id.tombol_sosmed) //ini tombol login yang pengen di pencet
        btn_sosmed.setOnClickListener {
            val Intent = Intent(this, SocialmediaPage::class.java)
            startActivity(Intent)
        }

        val btn_sejarah = findViewById<Button>(R.id.tombol_history) //ini tombol login yang pengen di pencet
        btn_sejarah.setOnClickListener {
            val Intent = Intent(this, HistoryPage::class.java)
            startActivity(Intent)
        }

        val btn_devinfo = findViewById<Button>(R.id.tombol_devinfo) //ini tombol login yang pengen di pencet
        btn_devinfo.setOnClickListener {
            val Intent = Intent(this, DevInfo::class.java)
            startActivity(Intent)
        }
    }
}