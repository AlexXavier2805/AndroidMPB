package com.example.proyectompdb.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectompdb.view.adapters.HorarioAdapter
import com.example.proyectompdb.databinding.FragmentHorarioBinding
import com.example.proyectompdb.viewmodel.HorarioViewModel

class HorarioFragment : Fragment() {

    //Variable bindind del framentoHorarioBinding
    private lateinit var binding:FragmentHorarioBinding

    //Instancia de la clase HorarioViewModel
    private val listaHorarioViewModel:HorarioViewModel by viewModels()
    //Adaptador de RecyclerView
    private val adapter: HorarioAdapter = HorarioAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHorarioBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listaHorarioViewModel.getListaHorario()

        listaHorarioViewModel.listaHorarioEntity.observe(this, {
            binding.rvHorario.setHasFixedSize(true)
            binding.rvHorario.layoutManager = LinearLayoutManager(view.context)
            adapter.HorarioAdapter(it,view.context)
            binding.rvHorario.adapter = adapter
        })
    }
}