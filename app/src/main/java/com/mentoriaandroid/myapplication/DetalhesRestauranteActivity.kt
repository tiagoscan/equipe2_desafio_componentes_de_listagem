package com.mentoriaandroid.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetalhesRestauranteActivity : AppCompatActivity() {

    lateinit var imagemVoltar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes_restaurante)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imagemVoltar = findViewById(R.id.imageVoltar)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewProdutos)

        imagemVoltar.setOnClickListener {
            val intent = Intent (this, InicialRestaurantesActivity::class.java)
            startActivity(intent)
        }

        val produtos = listOf(
            Produtos("Big Five", "Os cinco aperitivos mais pedidos da casa em um único prato.", "R$89,90", R.drawable.big_five),
            Produtos("Kookaburra Wings", "Este prato é composto por sobreasas de frango empanadas e temperadas com um blend de sabores exclusivos, e é servido com molho Blue Cheese e aipo crocante.", "R$69,90", R.drawable.wings),
            Produtos("Aussie Cheese Fries", "Batatas fritas cobertas com um mix de queijos e bacon, servidas com molho Ranch.", "R$49,90", R.drawable.fries)
        )

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = ProdutosAdapter(produtos)
    }
}