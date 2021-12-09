package com.example.proyectompdb.model.entity

data class NotaEntity(
    val calificacionId : Int,
    val primerBimestre : Double,
    val segundoBimestre : Double,
    val tercerBimestre : Double,
    val cuartoBimestre : Double,
    val fecha : String,
    val estado : Byte,
    val matricula : MatriculaEntity,
    val curso : CursoEntity
)
