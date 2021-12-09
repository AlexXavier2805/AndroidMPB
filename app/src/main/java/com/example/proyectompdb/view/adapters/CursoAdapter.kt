package com.example.proyectompdb.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectompdb.R
import com.example.proyectompdb.model.entity.CursoEntity

class CursoAdapter : RecyclerView.Adapter<CursoAdapter.ViewHolder>(){

    private var cursos:MutableList<CursoEntity> = ArrayList()
    lateinit var context: Context

    fun CursoAdapter(cursos: MutableList<CursoEntity>, context: Context){
        this.cursos = cursos
        this.context = context
    }

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvIdCurso = itemView.findViewById<TextView>(R.id.tvIdCurso)
        val tvNombre = itemView.findViewById<TextView>(R.id.tvNombreCurso)
        val tvDescripcion = itemView.findViewById<TextView>(R.id.tvDescripcionCurso)
        val tvGrado = itemView.findViewById<TextView>(R.id.tvGrado)

        fun bind(cursos: CursoEntity, context: Context){
            tvIdCurso.text = cursos.cursoId.toString()
            tvNombre.text = cursos.nombre
            tvDescripcion.text = cursos.descripcion
            tvGrado.text = cursos.grado.nombre
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardview_cursos,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = cursos[position]
        holder.bind(item,this.context)
    }

    override fun getItemCount(): Int {
        return cursos.size
    }

}