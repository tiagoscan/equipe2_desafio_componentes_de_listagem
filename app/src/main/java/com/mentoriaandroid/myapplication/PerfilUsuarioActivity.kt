package com.mentoriaandroid.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mentoriaandroid.myapplication.databinding.ActivityPerfilUsuarioBinding

class PerfilUsuarioActivity : AppCompatActivity() {

private val binding by lazy {
    ActivityPerfilUsuarioBinding.inflate(layoutInflater)
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        /*setContentView(R.layout.activity_perfil_usuario)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        binding.cardViewConversas.setOnClickListener {
            startActivity(
                Intent(this, InicialRestaurantesActivity::class.java)
            )
        }

    }
}