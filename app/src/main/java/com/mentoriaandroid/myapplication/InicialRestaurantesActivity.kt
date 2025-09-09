package com.mentoriaandroid.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.mentoriaandroid.myapplication.databinding.ActivityInicialRestaurantesBinding

class InicialRestaurantesActivity : AppCompatActivity() {

    private val binding by lazy { ActivityInicialRestaurantesBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initListeners()
    }

    private fun initListeners() {
        with(binding) {
            linearLayoutMc.setOnClickListener {
            }
            linearLayoutOutback.setOnClickListener {
                val intent = Intent(this@InicialRestaurantesActivity, DetalhesRestauranteActivity::class.java)
                startActivity(intent)
            }
        }
    }
}