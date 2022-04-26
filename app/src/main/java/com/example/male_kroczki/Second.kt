package com.example.male_kroczki

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //references
        val buttonRet: Button=findViewById(R.id.secActRetButton)
        val buttonPass: Button=findViewById(R.id.secActSubmitButton)

        buttonRet.setOnClickListener { returnToMainActivity(); }
        buttonPass.setOnClickListener { goToSecondPassing(); }
    }

    private fun goToSecondPassing() {
        val textPassing: TextView=findViewById(R.id.textPersonName)
        val intent= Intent(this, SecondPassing::class.java).apply {
            putExtra("Data",textPassing.text.toString())
        }
        startActivity(intent)
    }

    private fun returnToMainActivity() {
        val intent= Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    }
