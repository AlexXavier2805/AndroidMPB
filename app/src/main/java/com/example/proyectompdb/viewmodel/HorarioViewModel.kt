package com.example.proyectompdb.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectompdb.model.entity.HorarioEntity
import com.example.proyectompdb.model.provider.HorarioProvider

class HorarioViewModel : ViewModel() {

    val listaHorarioEntity = MutableLiveData<MutableList<HorarioEntity>>()

    fun getListaHorario(){
        val provider =HorarioProvider()
        val listaHorario = provider.getHorariosModel()
        listaHorarioEntity.postValue(listaHorario)
    }
}