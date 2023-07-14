package com.example.rickandmortyapi.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rickandmortyapi.databinding.CharacterListItemBinding
import com.example.rickandmortyapi.model.model.ResultResponse

class CharacterListAdapter(private val characters: List<ResultResponse>) :
    RecyclerView.Adapter<CharacterListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ViewHolder {
        val binding =
            CharacterListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = characters[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return characters.size
    }

    class ViewHolder(private val binding: CharacterListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ResultResponse) {
            binding.tvCharacterName.text = item.name
            Glide.with(itemView).load(item.image).into(binding.ivCharacter)
        }
    }

}