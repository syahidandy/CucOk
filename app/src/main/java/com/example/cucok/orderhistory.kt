package com.example.cucok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_orderhistory.*

class orderhistory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orderhistory)

        vchrback4.setOnClickListener({
            onBackPressed()
        })
    }

    override fun onBackPressed() {
        startActivity(Intent(this, home::class.java))
        finish()
    }
}