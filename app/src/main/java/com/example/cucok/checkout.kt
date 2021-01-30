package com.example.cucok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_checkout.*
import kotlinx.android.synthetic.main.activity_ordermenu.*
import kotlinx.android.synthetic.main.activity_voucher.*

class checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        vchrback1.setOnClickListener({
            onBackPressed()
        })
        pwngi1.setOnClickListener({
            pwngi1.setBackgroundResource(R.drawable.ylwbg)
            pwngi2.setBackgroundResource(R.drawable.nonebg)
            pwngi3.setBackgroundResource(R.drawable.nonebg)
            pwngi4.setBackgroundResource(R.drawable.nonebg)
            pwngi5.setBackgroundResource(R.drawable.nonebg)
            pwngi6.setBackgroundResource(R.drawable.nonebg)
            pwngi7.setBackgroundResource(R.drawable.nonebg)
            pwngi8.setBackgroundResource(R.drawable.nonebg)
            pwngi9.setBackgroundResource(R.drawable.nonebg)

        })
        pwngi2.setOnClickListener({
            pwngi1.setBackgroundResource(R.drawable.nonebg)
            pwngi2.setBackgroundResource(R.drawable.ylwbg)
            pwngi3.setBackgroundResource(R.drawable.nonebg)
            pwngi4.setBackgroundResource(R.drawable.nonebg)
            pwngi5.setBackgroundResource(R.drawable.nonebg)
            pwngi6.setBackgroundResource(R.drawable.nonebg)
            pwngi7.setBackgroundResource(R.drawable.nonebg)
            pwngi8.setBackgroundResource(R.drawable.nonebg)
            pwngi9.setBackgroundResource(R.drawable.nonebg)
        })
        pwngi3.setOnClickListener({
            pwngi1.setBackgroundResource(R.drawable.nonebg)
            pwngi2.setBackgroundResource(R.drawable.nonebg)
            pwngi3.setBackgroundResource(R.drawable.ylwbg)
            pwngi4.setBackgroundResource(R.drawable.nonebg)
            pwngi5.setBackgroundResource(R.drawable.nonebg)
            pwngi6.setBackgroundResource(R.drawable.nonebg)
            pwngi7.setBackgroundResource(R.drawable.nonebg)
            pwngi8.setBackgroundResource(R.drawable.nonebg)
            pwngi9.setBackgroundResource(R.drawable.nonebg)
        })
        pwngi4.setOnClickListener({
            pwngi1.setBackgroundResource(R.drawable.nonebg)
            pwngi2.setBackgroundResource(R.drawable.nonebg)
            pwngi3.setBackgroundResource(R.drawable.nonebg)
            pwngi4.setBackgroundResource(R.drawable.ylwbg)
            pwngi5.setBackgroundResource(R.drawable.nonebg)
            pwngi6.setBackgroundResource(R.drawable.nonebg)
            pwngi7.setBackgroundResource(R.drawable.nonebg)
            pwngi8.setBackgroundResource(R.drawable.nonebg)
            pwngi9.setBackgroundResource(R.drawable.nonebg)
        })
        pwngi5.setOnClickListener({
            pwngi1.setBackgroundResource(R.drawable.nonebg)
            pwngi2.setBackgroundResource(R.drawable.nonebg)
            pwngi3.setBackgroundResource(R.drawable.nonebg)
            pwngi4.setBackgroundResource(R.drawable.nonebg)
            pwngi5.setBackgroundResource(R.drawable.ylwbg)
            pwngi6.setBackgroundResource(R.drawable.nonebg)
            pwngi7.setBackgroundResource(R.drawable.nonebg)
            pwngi8.setBackgroundResource(R.drawable.nonebg)
            pwngi9.setBackgroundResource(R.drawable.nonebg)
        })
        pwngi6.setOnClickListener({
            pwngi1.setBackgroundResource(R.drawable.nonebg)
            pwngi2.setBackgroundResource(R.drawable.nonebg)
            pwngi3.setBackgroundResource(R.drawable.nonebg)
            pwngi4.setBackgroundResource(R.drawable.nonebg)
            pwngi5.setBackgroundResource(R.drawable.nonebg)
            pwngi6.setBackgroundResource(R.drawable.ylwbg)
            pwngi7.setBackgroundResource(R.drawable.nonebg)
            pwngi8.setBackgroundResource(R.drawable.nonebg)
            pwngi9.setBackgroundResource(R.drawable.nonebg)
        })
        pwngi7.setOnClickListener({
            pwngi1.setBackgroundResource(R.drawable.nonebg)
            pwngi2.setBackgroundResource(R.drawable.nonebg)
            pwngi3.setBackgroundResource(R.drawable.nonebg)
            pwngi4.setBackgroundResource(R.drawable.nonebg)
            pwngi5.setBackgroundResource(R.drawable.nonebg)
            pwngi6.setBackgroundResource(R.drawable.nonebg)
            pwngi7.setBackgroundResource(R.drawable.ylwbg)
            pwngi8.setBackgroundResource(R.drawable.nonebg)
            pwngi9.setBackgroundResource(R.drawable.nonebg)
        })
        pwngi8.setOnClickListener({
            pwngi1.setBackgroundResource(R.drawable.nonebg)
            pwngi2.setBackgroundResource(R.drawable.nonebg)
            pwngi3.setBackgroundResource(R.drawable.nonebg)
            pwngi4.setBackgroundResource(R.drawable.nonebg)
            pwngi5.setBackgroundResource(R.drawable.nonebg)
            pwngi6.setBackgroundResource(R.drawable.nonebg)
            pwngi7.setBackgroundResource(R.drawable.nonebg)
            pwngi8.setBackgroundResource(R.drawable.ylwbg)
            pwngi9.setBackgroundResource(R.drawable.nonebg)
        })
        pwngi9.setOnClickListener({
            pwngi1.setBackgroundResource(R.drawable.nonebg)
            pwngi2.setBackgroundResource(R.drawable.nonebg)
            pwngi3.setBackgroundResource(R.drawable.nonebg)
            pwngi4.setBackgroundResource(R.drawable.nonebg)
            pwngi5.setBackgroundResource(R.drawable.nonebg)
            pwngi6.setBackgroundResource(R.drawable.nonebg)
            pwngi7.setBackgroundResource(R.drawable.nonebg)
            pwngi8.setBackgroundResource(R.drawable.nonebg)
            pwngi9.setBackgroundResource(R.drawable.ylwbg)
        })

        cucokin.setOnClickListener({
            startActivity(Intent(this, lookingdriver::class.java))
            finish()
        })
    }

    override fun onBackPressed() {
        startActivity(Intent(this, ordermenu::class.java))
        finish()
    }
}