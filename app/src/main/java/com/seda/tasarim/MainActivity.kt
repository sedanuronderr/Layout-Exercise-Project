package com.seda.tasarim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.seda.tasarim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    setContentView(R.layout.activity_main)
        binding =DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.button5.setOnClickListener {
            val intent= Intent(this,SignUp::class.java)
            startActivity(intent)
        }
    }
}