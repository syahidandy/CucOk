package com.example.cucok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_voucher.*

class voucher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voucher)
        vchrback.setOnClickListener({
            onBackPressed()
        })
        pakai.setOnClickListener({
            startActivity(Intent(this, ordermenu::class.java))
            finish()
        })
        pakai1.setOnClickListener({
            startActivity(Intent(this, ordermenu::class.java))
            finish()
        })
        pakai2.setOnClickListener({
            startActivity(Intent(this, ordermenu::class.java))
            finish()
        })
        pakai3.setOnClickListener({
            startActivity(Intent(this, ordermenu::class.java))
            finish()
        })
    }

    override fun onBackPressed() {
        startActivity(Intent(this, home::class.java))
        finish()
    }
}