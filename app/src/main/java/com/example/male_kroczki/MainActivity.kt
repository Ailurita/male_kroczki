package com.example.male_kroczki

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import com.example.stoper_counter.TimerActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //references
        val button2: Button= findViewById(R.id.goSecActButton)
        val buttonTimer: Button=findViewById(R.id.buttonTimer)
        //lambdas go to another activities
        button2.setOnClickListener { goToSecondActivity(); }
        buttonTimer.setOnClickListener { goToTimerActivity(); }
    }

    private fun goToTimerActivity() {
        val intent= Intent(this, Timer::class.java)
        startActivity(intent)
    }

    private fun goToSecondActivity() {

        val intent= Intent(this, Second::class.java)
        startActivity(intent)
        }
    }

