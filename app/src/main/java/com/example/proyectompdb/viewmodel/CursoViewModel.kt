package com.example.proyectompdb.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectompdb.model.entity.CursoEntity
import com.example.proyectompdb.model.provider.CursoProvider

class CursoViewModel : ViewModel() {

    val listaCursoEntity = MutableLiveData<MutableList<CursoEntity>>()

    fun getListaCurso(){
        val provider = CursoProvider()
        val listaCurso = provider.getCursosModel()
        listaCursoEntity.postValue(listaCurso)
    }
}