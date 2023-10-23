package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.RatingBar
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
    }
}

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_masuk = findViewById<Button>(R.id.tombol_login) //ini tombol login yang pengen di pencet
        btn_masuk.setOnClickListener {
            val Intent = Intent(this, ProfilePage::class.java)
            startActivity(Intent)
        }

        val btn_regis = findViewById<Button>(R.id.tombol_regis) //ini tombol login yang pengen di pencet
        btn_regis.setOnClickListener {
            val Intent = Intent(this, SignupPage::class.java)
            startActivity(Intent)
        }

        val rBar = findViewById<RatingBar>(R.id.rBar)
        val button = findViewById<Button>(R.id.button)
        button?.setOnClickListener {
            val msg = rBar.rating.toString()
            Toast.makeText(
                this@MainActivity,
                "Rating is: " + msg, Toast.LENGTH_SHORT
            ).show()
        }

    }
}