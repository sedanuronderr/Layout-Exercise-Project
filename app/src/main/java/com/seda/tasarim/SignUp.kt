package com.seda.tasarim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.seda.tasarim.databinding.ActivityMainBinding
import com.seda.tasarim.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var  binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   setContentView(R.layout.activity_sign_up)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up)

        binding.button4.setOnClickListener {
            val intent= Intent(this,LimitedAccess::class.java)
            startActivity(intent)
        }
    }
}