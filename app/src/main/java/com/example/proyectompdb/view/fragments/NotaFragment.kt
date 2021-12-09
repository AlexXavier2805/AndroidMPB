package com.example.proyectompdb.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectompdb.databinding.FragmentNotaBinding
import com.example.proyectompdb.view.adapters.NotaAdapter
import com.example.proyectompdb.viewmodel.NotaViewModel

class NotaFragment : Fragment() {

    private lateinit var binding:FragmentNotaBinding

    private val listaNotaViewModel: NotaViewModel by viewModels()

    private val adapter: NotaAdapter = NotaAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listaNotaViewModel.getListaCurso()

        listaNotaViewModel.listaNotaEntity.observe(this,{
            binding.rvNota.setHasFixedSize(true)
            binding.rvNota.layoutManager = LinearLayoutManager(view.context)
            adapter.NotaAdapter(it,view.context)
            binding.rvNota.adapter = adapter
        })
    }
}