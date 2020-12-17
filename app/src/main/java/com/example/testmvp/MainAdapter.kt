package com.example.testmvp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val items: ArrayList<String>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_string, viewGroup, false)
        )

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(items[position])
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        //2
        private var view: View = v

        //3
        init {
            v.setOnClickListener(this)
        }

        fun onBind(item: String) {
            view.findViewById<TextView>(R.id.tvTitle).text = item
        }

        //4
        override fun onClick(v: View) {
            // TODO: OnClick
        }
    }
}