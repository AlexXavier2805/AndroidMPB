package com.example.proyectompdb.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectompdb.R
import com.example.proyectompdb.adapters.NotaAdapter
import com.example.proyectompdb.model.NotaEntity

class NotaFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    private val adapter: NotaAdapter = NotaAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nota, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.rvNota) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        adapter.NotaAdapter(getNotas(),view.context)
        recyclerView.adapter=adapter
    }

    private fun getNotas():MutableList<NotaEntity>{
        return mutableListOf(
            NotaEntity("MATEMATICA",13.0,20.0,15.0,16.0),
            NotaEntity("COMUNICACION",17.0,18.0,20.0,13.0),
            NotaEntity("HISTORIA",11.0,17.0,19.0,17.0)
        )
    }
}