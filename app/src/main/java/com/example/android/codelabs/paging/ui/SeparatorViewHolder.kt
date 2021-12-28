package com.example.android.codelabs.paging.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.codelabs.paging.R
import com.example.android.codelabs.paging.databinding.SeparatorViewItemBinding

class SeparatorViewHolder(
    private val binding: SeparatorViewItemBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(separatorText: String) {
        binding.separatorDescription.text = separatorText
    }

    companion object {
        fun create(parent: ViewGroup): SeparatorViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.separator_view_item, parent, false)
            val binding = SeparatorViewItemBinding.bind(view)
            return SeparatorViewHolder(binding)
        }
    }
}