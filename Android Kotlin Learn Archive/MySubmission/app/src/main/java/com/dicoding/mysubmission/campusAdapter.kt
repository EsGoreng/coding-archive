package com.dicoding.mysubmission

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.mysubmission.databinding.ItemRowBinding

class ListCampusAdapter(private val listCampus: ArrayList<Campus>) : RecyclerView.Adapter<ListCampusAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallBack: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallBack = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, description, photo) = listCampus[position]
        holder.binding.imgItemPhoto.setImageResource(photo)
        holder.binding.tvItemName.text = name
        holder.binding.tvItemDescription.text = description
        holder.itemView.setOnClickListener {
            onItemClickCallBack.onItemClicked(listCampus[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = listCampus.size

    class ListViewHolder(var binding : ItemRowBinding) : RecyclerView.ViewHolder(binding.root)
}