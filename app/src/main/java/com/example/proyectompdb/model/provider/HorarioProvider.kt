package com.example.proyectompdb.model.provider

import com.example.proyectompdb.model.entity.*

class HorarioProvider {

    private val listaHorario = mutableListOf(
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

    fun getHorariosModel() : MutableList<HorarioEntity> = listaHorario

}