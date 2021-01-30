package com.example.cucok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class driverfound : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driverfound)
        Handler().postDelayed({
            startActivity(Intent(this, home::class.java))
            finish()
        },2000)
    }
}