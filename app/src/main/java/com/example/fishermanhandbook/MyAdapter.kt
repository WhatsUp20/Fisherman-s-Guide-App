package com.example.fishermanhandbook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MyAdapter(arrayList: ArrayList<ListItem>, context: Context): RecyclerView.Adapter<MyAdapter.ViewHolder> () {

    var arrayListR = arrayList
    var contextR = context

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val tvTitle = view.findViewById<TextView>(R.id.tvTitle)
        val tvContent = view.findViewById<TextView>(R.id.tvContent)
        val image = view.findViewById<ImageView>(R.id.imageView)

        fun bind(listItem: ListItem, context: Context) {
            tvTitle.text = listItem.titleText
            tvContent.text = listItem.contentText
            image.setImageResource(listItem.image_id)
            itemView.setOnClickListener(View.OnClickListener {
                Toast.makeText(context,"Pressed ${tvTitle.text}",Toast.LENGTH_SHORT).show()
            })
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextR)
        return ViewHolder(inflater.inflate(R.layout.item_layout, parent, false))
    }

    override fun getItemCount(): Int {
       return arrayListR.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = arrayListR.get(position)
        holder.bind(listItem, contextR)
    }

}