package com.mentoriaandroid.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mentoriaandroid.myapplication.databinding.ActivityDetalhesProdutoBinding

class DetalhesProdutoActivity : AppCompatActivity() {

    private lateinit var itemOpcionalAdapter: ItemOpcionalAdapter

    private val binding by lazy {
        ActivityDetalhesProdutoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val lista = listOf(
            ItemOpcional("Bacon", "Bacon fatiado","R$ 10,00", R.drawable.img_bacon ),
            ItemOpcional("Katchup", "Molho de katchup","R$ 8,00", R.drawable.img_sauce ),
            ItemOpcional("Cheddar", "Queijo cheddar fatiado extra","R$ 10,00", R.drawable.img_chedar )
        )

        itemOpcionalAdapter = ItemOpcionalAdapter()
        itemOpcionalAdapter.atualizarLista(lista)
        binding.recyclerViewOpcionais.adapter = itemOpcionalAdapter
        binding.recyclerViewOpcionais.layoutManager = LinearLayoutManager(this)

        binding.fabVoltar.setOnClickListener {
            finish()
        }

        binding.btnConfirmar.setOnClickListener {
            val intent = Intent(this, ConfirmacaoPedidoActivity::class.java)
            startActivity(intent)
        }

    }
}