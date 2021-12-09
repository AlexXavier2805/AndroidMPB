package com.example.proyectompdb.model.entity

data class TrabajadorEntity(
    val trabajadorId : Int,
    val dni : String,
    val nombre : String,
    val apellidoPaterno : String,
    val apellidoMaterno : String,
    val direccion : String,
    val telefono : String,
    val fechaNacimiento : String,
    val fechaIngreso : String,
    val estado : Byte,
    val usuario : UsuarioEntity,
    val cargo : CargoEntity,
    val distrito : DistritoEntity
)
