package com.example.percobaan

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Aktivitas_1 : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aktivitas_1)

        sharedPreferences=getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        val Logout: Button =findViewById(R.id.btnLogout)

        Logout.setOnClickListener {
            val editor:SharedPreferences.Editor=sharedPreferences.edit()
            editor.putBoolean("isLogin",false)
            editor.apply()
        }

    }
}