package com.example.proyectompdb.model.entity

data class AsignacionEntity(
    val asignacionId : Int,
    val descripcion : String,
    val fecha : String,
    val estado : Byte,
    val trabajador : TrabajadorEntity,
    val curso : CursoEntity
)
