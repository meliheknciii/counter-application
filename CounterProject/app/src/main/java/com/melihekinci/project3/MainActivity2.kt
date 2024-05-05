package com.melihekinci.project3

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.DatePicker
import android.widget.NumberPicker
import android.widget.TimePicker
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.melihekinci.project3.databinding.ActivityMain2Binding
import com.melihekinci.project3.databinding.ActivityMainBinding
import java.util.Calendar

// TİME SET - DATE SET KULLANIMI
class MainActivity2 : AppCompatActivity(){



    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view2 = binding.root
        setContentView(view2)
        enableEdgeToEdge()


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        binding.counterMinPicker.minValue = 0
        binding.counterMinPicker.maxValue = 59

        binding.counterHourPicker.minValue = 0
        binding.counterHourPicker.maxValue = 99

        binding.counterSecPicker.minValue = 0
        binding.counterSecPicker.maxValue = 59

        var min = 0
        var hour = 0
        var sec= 0

        binding.counterSecPicker.setOnValueChangedListener { secPicker, oldVal, newVal ->
            sec = secPicker.value
        }
        binding.counterMinPicker.setOnValueChangedListener{minPicker , i2 , i3 ->
            min = minPicker.value
        }
        binding.counterHourPicker.setOnValueChangedListener { hourPicker, oldVal, newVal ->
            hour = hourPicker.value
        }

        binding.button4.setOnClickListener {
            binding.textView.text = "${min}"
        }







        binding.button2.setOnClickListener(){
            val sayfabir = Intent(applicationContext,MainActivity::class.java)
            startActivity(sayfabir)
        }
        binding.btBaslat.setOnClickListener {
            val pageThree = Intent(applicationContext,MainActivity3::class.java)
            pageThree.putExtra("min",min)
            pageThree.putExtra("hour",hour)
            pageThree.putExtra("sec",sec)
            startActivity(pageThree)
        }












        }
    }


