package com.example.male_kroczki

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondPassing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_passing)

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        val buttonRet: Button = findViewById(R.id.secPassReturnButton)
        buttonRet.setOnClickListener { returnToSecondActivity(); }

        val intentValue = intent.getStringExtra("Data")
        findViewById<TextView>(R.id.secActTextPassed).apply {
            text = intentValue.toString()
        }
    }
    private fun returnToSecondActivity() {
        val intent= Intent(this, Second::class.java)
        startActivity(intent)
    }
}