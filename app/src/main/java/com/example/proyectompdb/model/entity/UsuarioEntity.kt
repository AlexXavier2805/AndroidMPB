package com.example.proyectompdb.model.entity

data class UsuarioEntity(
    val usuarioId : Int,
    val nombreUsuario : String,
    val contrasenia : String,
    val estado : Byte,
    val rol : RolEntity
)
