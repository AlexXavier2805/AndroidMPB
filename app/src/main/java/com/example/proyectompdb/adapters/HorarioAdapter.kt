package com.example.proyectompdb.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectompdb.R
import com.example.proyectompdb.model.entity.HorarioEntity

class HorarioAdapter : RecyclerView.Adapter<HorarioAdapter.ViewHolder>(){

    private var horarios:MutableList<HorarioEntity> = ArrayList()
    lateinit var context: Context

    fun HorarioAdapter(horarios: MutableList<HorarioEntity>, context: Context){
        this.horarios = horarios
        this.context = context
    }

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvDia = itemView.findViewById<TextView>(R.id.tvDiaHorario)
        val tvCurso = itemView.findViewById<TextView>(R.id.tvIdCursoHorario)
        val tvDocente = itemView.findViewById<TextView>(R.id.tvDocenteHorario)
        val tvHoraInicio = itemView.findViewById<TextView>(R.id.tvHoraInicio)
        val tvHoraFin = itemView.findViewById<TextView>(R.id.tvHoraFin)
        val tvAula = itemView.findViewById<TextView>(R.id.tvAula)

        fun bind(horarios: HorarioEntity, context: Context){
            tvDia.text = horarios.dia.substring(0,3)
            tvCurso.text = horarios.asignacion.curso.nombre
            tvDocente.text = horarios.asignacion.trabajador.nombre
            tvHoraInicio.text = horarios.horaInicio
            tvHoraFin.text = horarios.horaFin
            tvAula.text = horarios.seccion.aula.descripcion
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardview_horario,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = horarios[position]
        holder.bind(item,this.context)
    }

    override fun getItemCount(): Int {
        return horarios.size
    }
}