package com.example.proyectompdb.model

data class HorarioEntity(
    val dia: String,
    val nombreCurso: String,
    val docente: String,
    val horaInicio: String,
    val horaFin: String,
    val aula: String
)
