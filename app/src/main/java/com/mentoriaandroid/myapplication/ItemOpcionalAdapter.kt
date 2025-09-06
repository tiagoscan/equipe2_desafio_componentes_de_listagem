package com.mentoriaandroid.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mentoriaandroid.myapplication.databinding.ItemOpcionalBinding

class ItemOpcionalAdapter : Adapter<ItemOpcionalAdapter.ItemOpcionalViewHolder>() {

    private var listaItemOpcional = listOf<ItemOpcional>()

    fun atualizarLista(lista: List<ItemOpcional>){
        listaItemOpcional = lista
        notifyDataSetChanged()
    }

    inner class ItemOpcionalViewHolder(val binding: ItemOpcionalBinding) : ViewHolder(binding.root) {

        fun bind(itemOpcional: ItemOpcional){

            binding.textNome.text = itemOpcional.nome
            binding.textDescricao.text = itemOpcional.descricao
            binding.textValor.text = itemOpcional.valor
            binding.imgOpcional.setImageResource(itemOpcional.imgOpcional)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemOpcionalViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

        val itemView = ItemOpcionalBinding.inflate(layoutInflater, parent, false)

        return ItemOpcionalViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return listaItemOpcional.size
    }

    override fun onBindViewHolder(holder: ItemOpcionalViewHolder, position: Int) {
        val itemOpcional = listaItemOpcional[position]
        holder.bind(itemOpcional)
    }
}