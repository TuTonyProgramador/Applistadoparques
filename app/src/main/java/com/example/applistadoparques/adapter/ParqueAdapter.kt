package com.example.applistadoparques.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applistadoparques.Parque
import com.example.applistadoparques.R

class ParqueAdapter(val listaparque:List<Parque>): RecyclerView.Adapter<ParqueViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParqueViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.listaparques, parent, false)
        return ParqueViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: ParqueViewHolder, position: Int) {
        val item = listaparque[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return listaparque.size
    }
}