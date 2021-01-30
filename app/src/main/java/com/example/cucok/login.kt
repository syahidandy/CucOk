package com.example.cucok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signin.setOnClickListener({
            startActivity(Intent(this, home::class.java))
            finish()
        })

        signupwdw.setOnClickListener({
            startActivity(Intent(this, daftar::class.java))
        })


    }
}