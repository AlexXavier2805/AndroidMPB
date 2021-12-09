package com.example.proyectompdb.model.entity

data class HorarioEntity(
    val horarioId : Int,
    val horaInicio : String,
    val horaFin : String,
    val dia : String,
    val estado : Byte,
    val asignacion : AsignacionEntity,
    val seccion : SeccionEntity
)
