package com.example.percobaan

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences=getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        var Login:Button=findViewById(R.id.btnLogin)
        var User:EditText=findViewById(R.id.etUserName)
        var Pass:EditText=findViewById(R.id.etPassWord)

        if(sharedPreferences.getBoolean("isLogin",true)){
            val intent=Intent(this,Aktivitas_1::class.java)
            startActivity(intent)
            finish()
        }
        else{
            Login.setOnClickListener {
                if(User.text.toString()=="admin"&&Pass.text.toString()=="12345"){
                    val editor:SharedPreferences.Editor=sharedPreferences.edit()
                    editor.putBoolean("isLogin",true)
                    editor.apply()

                    val intent=Intent(this,Aktivitas_1::class.java)
                    startActivity(intent)
                    finish()
                }
                else{
                    val toast=Toast.makeText(applicationContext,"User atau Password salah",Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }

    }
}