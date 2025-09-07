package com.mentoriaandroid.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class ProdutosAdapter(private val lista: List<Produtos>) : RecyclerView.Adapter<ProdutosAdapter.ProdutosViewHolder>(){

    // ViewHolder: guarda as referências das views de cada item
    class ProdutosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textoNomeProduto: TextView = itemView.findViewById(R.id.textNomeProduto)
        val textoDescricaoProduto: TextView = itemView.findViewById(R.id.textDescricaoProduto)
        val textoPrecoProduto: TextView = itemView.findViewById(R.id.textPrecoProduto)
        val imagem: ShapeableImageView = itemView.findViewById(R.id.imageProduto)
    }

    // Inflar o layout do item (recycler_view_item.xml)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ProdutosViewHolder(view)
    }

    // Preencher os dados na view
    override fun onBindViewHolder(holder: ProdutosViewHolder, position: Int) {
        val item = lista[position]
        holder.textoNomeProduto.text = item.nome
        holder.textoDescricaoProduto.text = item.descricao
        holder.textoPrecoProduto.text = item.preco
        holder.imagem.setImageResource(item.imagem)

        // Clique no item
        holder.itemView.setOnClickListener {
            // Exibe o Toast
            Toast.makeText(holder.itemView.context, "Você clicou em ${item.nome}", Toast.LENGTH_SHORT).show()

            // Abre a nova tela
            val context = holder.itemView.context
            //val intent = Intent(context, DetalhesProdutosActivity::class.java)
            val intent = Intent(context, MainActivity::class.java).apply {
                putExtra("nome", item.nome)
                putExtra("descricao", item.descricao)
                putExtra("preco", item.preco)
                putExtra("imagem", item.imagem)
            }
            context.startActivity(intent)
        }
    }

    // Quantos itens a lista tem
    override fun getItemCount() = lista.size
}