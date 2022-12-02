package com.example.daegucocktail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.daegucocktail.data.Cocktail
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.daegucocktail.databinding.ItemCocktailBinding

class CocktailAdapter : ListAdapter<Cocktail, CocktailAdapter.CockTailViewHolder>(CockTailDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CockTailViewHolder {
        return CockTailViewHolder(
            ItemCocktailBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CockTailViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class CockTailViewHolder(
        private val binding: ItemCocktailBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(cocktail: Cocktail) = with(binding) {
            item = cocktail

            executePendingBindings()
        }
    }
}

private class CockTailDiffCallback : DiffUtil.ItemCallback<Cocktail>() {
    override fun areItemsTheSame(oldItem: Cocktail, newItem: Cocktail): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Cocktail, newItem: Cocktail): Boolean {
        return oldItem == newItem
    }
}