package com.example.proyectompdb.model.provider

import com.example.proyectompdb.model.entity.CursoEntity
import com.example.proyectompdb.model.entity.GradoEntity

class CursoProvider {

    private val listaCursos = mutableListOf(
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

    fun getCursosModel() : MutableList<CursoEntity> = listaCursos

}