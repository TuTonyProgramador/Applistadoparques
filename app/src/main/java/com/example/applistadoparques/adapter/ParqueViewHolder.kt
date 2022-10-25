package com.example.applistadoparques.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.applistadoparques.Parque
import com.example.applistadoparques.databinding.ListaparquesBinding


class ParqueViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ListaparquesBinding.bind(view)
    fun render(parqueModel: Parque){
        binding.nombreparque.text = parqueModel.nombreparque
        binding.descripcion.text = parqueModel.descripcion

        // Acceder a la imagen
        Glide.with(binding.imagen.context).load(parqueModel.foto).into(binding.imagen)

        // Evento de hacer click en la foto
        binding.imagen.setOnClickListener {
            Toast.makeText(binding.imagen.context,parqueModel.nombreparque, Toast.LENGTH_LONG).show()
        }
        // Evento de hacer click en la celda
        itemView.setOnClickListener {
            Toast.makeText(binding.imagen.context,parqueModel.nombreparque, Toast.LENGTH_LONG).show()
        }
    }

}