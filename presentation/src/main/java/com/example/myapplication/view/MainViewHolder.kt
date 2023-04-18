package com.example.myapplication.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.domain.GitHubContent
import com.example.domain.ItemContent
import com.example.myapplication.databinding.MainRvItemBinding

class MainViewHolder(
    parent: ViewGroup
) : RecyclerView.ViewHolder(
    MainRvItemBinding.inflate(
        LayoutInflater.from(parent.context),
        parent,
        false
    ).root
) {
    private val binding = MainRvItemBinding.bind(itemView)

    fun bind(item: ItemContent){
        with(binding){
            Glide.with(itemView.context)
                .load(item.owner.avatarUrl)
                .into(itemAvatar)
            itemFullName.text = item.fullName
            itemLanguage.text = item.language
        }
    }
}