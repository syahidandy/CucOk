package com.example.cucok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar.*

class daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        signup.setOnClickListener({
            startActivity(Intent(this, home::class.java))
            finish()
        })

        loginwdw.setOnClickListener({
            //startActivity(Intent(this, login::class.java))
            onBackPressed()
            finish()
        })
    }
}