package com.melihekinci.project3

import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.melihekinci.project3.databinding.ActivityMain2Binding
import com.melihekinci.project3.databinding.ActivityMain3Binding
import kotlin.math.min

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMain3Binding.inflate(layoutInflater)
        val view3 = binding.root
        setContentView(view3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
       // var newMin = PageThree


        val sayac = object :CountDownTimer(3000,1000){
            override fun onTick(kalan: Long) {

            }

            override fun onFinish() {

            }
        }
    }
}