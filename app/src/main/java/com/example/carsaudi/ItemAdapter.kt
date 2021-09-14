package com.example.carsaudi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val dataSet: List<Car>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val textView1: TextView = view.findViewById(R.id.name)
        val textView2: TextView = view.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        val context = holder.itemView.context
        holder.imageView.setImageResource(item.imageResourceId)
        holder.textView1.text = context.resources.getString(item.nameResourceId)
        holder.textView2.text = context.resources.getString(item.priceResourceId)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}