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
import com.example.proyectompdb.model.entity.*

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
            NotaEntity(1,14.0,15.0,17.0,15.0,"FECHA",1,
                MatriculaEntity(1,"NINGUNO",1,"FECHA",1,
                    AlumnoEntity(1,"1234567","Alez","Martinez","Oscanoa","ASD","123435","FECHA",1,
                        DistritoEntity(1,"AGUSTINO",1),
                        ApoderadoEntity(1,"1234567","Rodolfo","Martine","Loapez","bvebe","1235415","FECHA",1,
                            DistritoEntity(1,"AGUSTINO",1),
                            UsuarioEntity(1,"APO","1235",1,
                                RolEntity(1,"APO",1)
                            )
                        ),
                        UsuarioEntity(1,"ALUMNO","1234125",1,
                            RolEntity(1,"ASDF",1)
                        )
                    ),
                    SeccionEntity(1,"SEC01",1,
                        GradoEntity(1,"PRIMER GRADO",1),
                        AulaEntity(1,"ASDF",1)
                    )
                ),
                CursoEntity(1,"MATE","ASDF",1,
                    GradoEntity(1,"PRImer grado",1)
                )
            ),
        )
    }
}