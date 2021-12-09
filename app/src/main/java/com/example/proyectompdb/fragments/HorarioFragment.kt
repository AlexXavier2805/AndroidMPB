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
import com.example.proyectompdb.model.entity.*

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
            HorarioEntity(1,"8.00","9:00","LUNES",1,
                AsignacionEntity(1,"Ninguna","FECHA",1,
                    TrabajadorEntity(1,"12345678","Jose","Martinez","Oscanoa","ASDF","12345","FECHA","FECHA",1,
                        UsuarioEntity(1,"traba01","12346",1,
                            RolEntity(1,"TRABA",1)
                        ),
                        CargoEntity(1,"ASDF",1),
                        DistritoEntity(1,"AGUSTINO",1)
                    ),
                    CursoEntity(1,"Matematica","NINGUNO",1,
                        GradoEntity(1,"Primer Grado",1)
                    )
                ),
                SeccionEntity(1,"SEC01",1,
                    GradoEntity(1,"Primer Grado",1),
                    AulaEntity(1,"AULA B",1)
                )
            )
        )
    }
}