package com.example.cucok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.UnderlineSpan
import kotlinx.android.synthetic.main.activity_ordermenu.*

class ordermenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordermenu)

        val underline = UnderlineSpan()
        orderback.setOnClickListener({
            onBackPressed()
        })

        kilo.setOnClickListener({
            kilo.setTextAppearance(applicationContext, R.style.boldText)
            satu.setTextAppearance(applicationContext, R.style.normalText)
        })
        satu.setOnClickListener({
            satu.setTextAppearance(applicationContext, R.style.boldText)
            kilo.setTextAppearance(applicationContext, R.style.normalText)
        })
        cekvchr.setOnClickListener({
            startActivity(Intent(this, voucher::class.java))
            finish()
        })

        ordernext.setOnClickListener({
            startActivity(Intent(this, checkout::class.java))
            finish()
        })
    }

    override fun onBackPressed() {
        startActivity(Intent(this, voucher::class.java))
        finish()
    }
}