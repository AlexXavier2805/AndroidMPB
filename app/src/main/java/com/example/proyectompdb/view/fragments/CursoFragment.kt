package com.example.proyectompdb.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectompdb.R
import com.example.proyectompdb.view.adapters.CursoAdapter
import com.example.proyectompdb.model.entity.CursoEntity
import com.example.proyectompdb.model.entity.GradoEntity

class CursoFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    val adapter: CursoAdapter = CursoAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_curso, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.rvCursos) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        adapter.CursoAdapter(getCursos(),view.context)
        recyclerView.adapter=adapter
    }

    private fun getCursos(): MutableList<CursoEntity> {

        return mutableListOf(
            CursoEntity(1, "Matematica I", "Matematica Basica I", 1,
                GradoEntity(1,"Primer Grado",1)
            ),
            CursoEntity(2, "Comunicacion I", "Comunicacion Basica I", 1,
                GradoEntity(1,"Primer Grado",1)
            ),
            CursoEntity(3, "Historia I", "Historia Basica I", 1,
                GradoEntity(1,"Primer Grado",1)
            ),
            CursoEntity(4, "Civica I", "Civica Basica I", 1,
                GradoEntity(1,"Primer Grado",1)
            )
        )
        return mutableListOf()
    }
}