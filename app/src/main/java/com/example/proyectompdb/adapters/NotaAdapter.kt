package com.example.proyectompdb.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectompdb.R
import com.example.proyectompdb.model.NotaEntity

class NotaAdapter : RecyclerView.Adapter<NotaAdapter.ViewHolder>(){

    private var notas:MutableList<NotaEntity> = ArrayList()
    lateinit var context: Context

    fun NotaAdapter(cursos :MutableList<NotaEntity>, context: Context){
        this.notas = cursos
        this.context = context
    }

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNombreCurso = itemView.findViewById<TextView>(R.id.tvNombreCursoNota)
        val tvPrimerBimestre = itemView.findViewById<TextView>(R.id.tvPrimerBimestre)
        val tvSegundoBimestre = itemView.findViewById<TextView>(R.id.tvSegundoBimestre)
        val tvTercerBimestre = itemView.findViewById<TextView>(R.id.tvTercerBimestre)
        val tvCuartoBimestre = itemView.findViewById<TextView>(R.id.tvCuartoBimestre)
        fun bind(nota: NotaEntity, context: Context){
            tvNombreCurso.text = nota.nombreCurso
            tvPrimerBimestre.text = nota.primerBimestre.toString()
            tvSegundoBimestre.text = nota.segundoBimestre.toString()
            tvTercerBimestre.text = nota.tercerBimestre.toString()
            tvCuartoBimestre.text = nota.cuartoBimestre.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardview_notas,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = notas[position]
        holder.bind(item,this.context)
    }

    override fun getItemCount(): Int {
        return notas.size
    }
}