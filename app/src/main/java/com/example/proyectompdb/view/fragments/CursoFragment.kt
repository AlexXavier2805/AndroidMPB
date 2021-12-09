package com.example.proyectompdb.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectompdb.databinding.FragmentCursoBinding
import com.example.proyectompdb.view.adapters.CursoAdapter
import com.example.proyectompdb.viewmodel.CursoViewModel

class CursoFragment : Fragment() {

    private lateinit var binding:FragmentCursoBinding

    private val listaCursoViewModel: CursoViewModel by viewModels()

    private val adapter: CursoAdapter = CursoAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCursoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listaCursoViewModel.getListaCurso()

        listaCursoViewModel.listaCursoEntity.observe(this,{
            binding.rvCursos.setHasFixedSize(true)
            binding.rvCursos.layoutManager = LinearLayoutManager(view.context)
            adapter.CursoAdapter(it,view.context)
            binding.rvCursos.adapter = adapter
        })
    }
}