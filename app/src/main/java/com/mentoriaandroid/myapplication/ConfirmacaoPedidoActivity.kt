package com.mentoriaandroid.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mentoriaandroid.myapplication.databinding.ActivityConfirmacaoPedidoBinding
import com.mentoriaandroid.myapplication.databinding.ActivityPerfilUsuarioBinding

class ConfirmacaoPedidoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityConfirmacaoPedidoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        /*setContentView(R.layout.activity_confirmacao_pedido)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        binding.btnConfirmarPedido.setOnClickListener {
            startActivity(
                Intent(this, InicialRestaurantesActivity::class.java)
            )
        }

        binding.fabVoltarProdutos.setOnClickListener {
            startActivity(
                Intent(this, DetalhesProdutoActivity::class.java)
            )
        }
    }
}