package com.dianajconcepcion.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dianajconcepcion.espanolQuiz.PreguntaActivity
import com.dianajconcepcion.espanolQuiz.R
import com.dianajconcepcion.espanolQuiz.databinding.ActivityMainBinding
import com.dianajconcepcion.espanolQuiz.databinding.FragmentLoginBinding


class LoginFragment : AppCompatActivity() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= FragmentLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, PreguntaActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnNewUser.setOnClickListener{
            val intent = Intent(this, AddUserFragment::class.java)
            startActivity(intent)
            finish()
        }
    }




}