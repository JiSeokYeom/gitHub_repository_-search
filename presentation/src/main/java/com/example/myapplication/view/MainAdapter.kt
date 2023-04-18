package com.example.myapplication.view

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.example.domain.ItemContent

class MainAdapter : ListAdapter<ItemContent, MainViewHolder>(MainDiffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(parent)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

    object MainDiffUtil : DiffUtil.ItemCallback<ItemContent>() {

        override fun areItemsTheSame(oldItem: ItemContent, newItem: ItemContent): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ItemContent, newItem: ItemContent): Boolean {
            return oldItem.fullName == newItem.fullName
        }

}