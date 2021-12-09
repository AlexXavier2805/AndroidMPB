package com.example.proyectompdb.model.entity

data class ApoderadoEntity(
    val apoderadoId : Int,
    val dni : String,
    val nombre : String,
    val apellidoPaterno : String,
    val apellidoMaterno : String,
    val direccion : String,
    val telefono : String,
    val fechaNacimiento : String,
    val estado : Byte,
    val distrito : DistritoEntity,
    val usuario : UsuarioEntity
)
