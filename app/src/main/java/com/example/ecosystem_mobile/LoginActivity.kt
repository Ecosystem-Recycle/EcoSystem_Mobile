package com.example.ecosystem_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ecosystem_mobile.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}