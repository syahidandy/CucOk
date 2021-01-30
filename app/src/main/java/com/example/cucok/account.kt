package com.example.cucok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*

class account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        vchrback3.setOnClickListener({
            onBackPressed()
        })
        signout.setOnClickListener({
            startActivity(Intent(this, login::class.java))
            finish()
        })
    }
    override fun onBackPressed() {
        startActivity(Intent(this, home::class.java))
        finish()
    }
}