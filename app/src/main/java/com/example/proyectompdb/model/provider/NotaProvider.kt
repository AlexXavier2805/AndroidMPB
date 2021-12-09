package com.example.proyectompdb.model.provider

import com.example.proyectompdb.model.entity.*

class NotaProvider {

    private val listaNotas = mutableListOf(
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

    fun getNotasModel(): MutableList<NotaEntity> = listaNotas

}