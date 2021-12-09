package com.example.proyectompdb.model.entity

data class SeccionEntity(
    val seccionId : Int,
    val nombre : String,
    val estado : Byte,
    val grado : GradoEntity,
    val aula : AulaEntity
)
