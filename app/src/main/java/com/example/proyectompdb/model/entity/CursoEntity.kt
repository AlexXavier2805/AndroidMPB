package com.example.proyectompdb.model.entity

data class CursoEntity(
    val cursoId: Int,
    val nombre: String,
    val descripcion: String,
    val estado: Byte,
    val grado: GradoEntity,
)
