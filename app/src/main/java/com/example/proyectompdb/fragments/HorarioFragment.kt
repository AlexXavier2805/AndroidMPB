package com.example.proyectompdb.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectompdb.R
import com.example.proyectompdb.adapters.HorarioAdapter
import com.example.proyectompdb.model.HorarioEntity

class HorarioFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    private val adapter: HorarioAdapter = HorarioAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_horario, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.rvHorario) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        adapter.HorarioAdapter(getHorario(),view.context)
        recyclerView.adapter=adapter
    }

    private fun getHorario(): MutableList<HorarioEntity> {
        return mutableListOf(
            HorarioEntity("LUN","Matematica I","Jose Luis","8:00","9:00","AULA B1"),
            HorarioEntity("LUN","Comunicacion I","Enersto Luis","8:00","9:00","AULA B1"),
            HorarioEntity("MAR","Historia I","Jose Luis","8:00","9:00","AULA B1"),
            HorarioEntity("MAR","Civica I","Jose Luis","8:00","9:00","AULA B1"),
            HorarioEntity("MIE","Arte I","Jose Luis","8:00","9:00","AULA B1")
        )
    }
}