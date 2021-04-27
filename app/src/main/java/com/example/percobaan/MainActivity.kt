package com.example.percobaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Login:Button=findViewById(R.id.BTN_Login)
        val User:EditText=findViewById(R.id.ET_User_Name)
        val Pass:EditText=findViewById(R.id.ET_Password)

        Login.setOnClickListener {
            if(User.text.toString()=="admim"&&Pass.text.toString()=="12345"){
                intent=Intent(this,Aktivitas_1::class.java)
                startActivity(intent)
            }
            else{
                val toast=Toast.makeText(applicationContext,"User atau Password Salah",Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}