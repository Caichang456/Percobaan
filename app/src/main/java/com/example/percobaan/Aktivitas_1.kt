package com.example.percobaan

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Aktivitas_1 : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aktivitas_1)

        val preferences=getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        var User=preferences.getString("Teks1","")
        var Judul:TextView=findViewById(R.id.TV_Judul)
        Judul.text=User
    }
}