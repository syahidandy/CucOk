package com.example.cucok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_home.*

class home : AppCompatActivity() {
    private lateinit var adapter: ArrayAdapter<*>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        lndrychs.setOnClickListener({
            startActivity(Intent(this, voucher::class.java))
            finish()
        })
        lndrychs1.setOnClickListener({
            startActivity(Intent(this, voucher::class.java))
            finish()
        })
        lndrychs2.setOnClickListener({
            startActivity(Intent(this, voucher::class.java))
            finish()
        })
        lndrychs3.setOnClickListener({
            startActivity(Intent(this, voucher::class.java))
            finish()
        })
        acc.setOnClickListener({
            startActivity(Intent(this, account::class.java))
            finish()
        })
        orders.setOnClickListener({
            startActivity(Intent(this, orderhistory::class.java))
            finish()
        })
    }
}