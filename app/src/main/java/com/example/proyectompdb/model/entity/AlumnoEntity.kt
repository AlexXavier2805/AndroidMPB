package com.example.proyectompdb.model.entity

data class AlumnoEntity(
    val alumnoId : Int,
    val dni : String,
    val nombre : String,
    val apellidoPaterno : String,
    val apellidoMaterno : String,
    val direccion : String,
    val telefono : String,
    val fechaNacimiento : String,
    val estado : Byte,
    val distrito : DistritoEntity,
    val apoderado : ApoderadoEntity,
    val usuario : UsuarioEntity
)
