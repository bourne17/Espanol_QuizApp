package com.dianajconcepcion.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.dianajconcepcion.espanolQuiz.R
import com.dianajconcepcion.espanolQuiz.databinding.ActivityMainBinding
import com.dianajconcepcion.espanolQuiz.databinding.FragmentAddUserBinding

class AddUserFragment : AppCompatActivity() {


private lateinit var binding:FragmentAddUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= FragmentAddUserBinding.inflate(layoutInflater)
       setContentView(binding.root)
    }




}