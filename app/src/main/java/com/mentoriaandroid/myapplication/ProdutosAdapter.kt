package com.mentoriaandroid.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
    }

    // Quantos itens a lista tem
    override fun getItemCount() = lista.size
}