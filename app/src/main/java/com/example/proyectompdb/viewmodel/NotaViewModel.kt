package com.example.proyectompdb.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectompdb.model.entity.NotaEntity
import com.example.proyectompdb.model.provider.NotaProvider

class NotaViewModel : ViewModel() {

    val listaNotaEntity = MutableLiveData<MutableList<NotaEntity>>()

    fun getListaCurso(){
        val provider = NotaProvider()
        val listaNota = provider.getNotasModel()
        listaNotaEntity.postValue(listaNota)
    }
}