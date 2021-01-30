package com.example.cucok

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity


class lookingdriver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lookingdriver)
        Handler().postDelayed({
            startActivity(Intent(this, driverfound::class.java))
            finish()
        },2000)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        return
    }
}


