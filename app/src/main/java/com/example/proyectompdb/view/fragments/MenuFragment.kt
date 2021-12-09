package com.example.proyectompdb.view.fragments

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentActivity
import com.example.proyectompdb.R

class MenuFragment : Fragment() {

    private lateinit var contexto: FragmentActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnHorario = view.findViewById(R.id.btnHorario) as Button
        val btnCurso = view.findViewById(R.id.btnNota) as Button
        val btnlink = view.findViewById(R.id.btnLink) as Button
        val btnNota = view.findViewById(R.id.btnUbicacion) as Button


        btnHorario.setOnClickListener { openFragment(HorarioFragment())}
        btnCurso.setOnClickListener { openFragment(NotaFragment())}
        btnlink.setOnClickListener { openFragment(LinkFragment())}
        btnNota.setOnClickListener { openFragment(UbicacionFragment())}
    }

    override fun onAttach(activity: Activity) {
        contexto = activity as FragmentActivity
        super.onAttach(activity)
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = contexto.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.flContenedor, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}