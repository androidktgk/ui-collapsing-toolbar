package com.example.uidesigns.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uidesigns.R
import org.w3c.dom.Text

class ListAdapter(private val list: ArrayList<String>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>(){
    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvItem: TextView =itemView.findViewById(R.id.tvItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ListViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val currItem= list[position]
        holder.tvItem.text = currItem
    }
}