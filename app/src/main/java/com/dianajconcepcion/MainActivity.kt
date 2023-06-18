package com.dianajconcepcion.espanolQuiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.dianajconcepcion.espanolQuiz.databinding.ActivityMainBinding
import com.dianajconcepcion.Fragments.LoginFragment
import com.dianajconcepcion.ViewModel.UserViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setContentView(R.layout.activity_main)

        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val vm=ViewModelProvider(this)[UserViewModel::class.java]

        /*binding.btnStart.setOnClickListener {
            val intent = Intent(this, PreguntaActivity::class.java)
            startActivity(intent)
            finish()
        }*/



        binding.btnStart.setOnClickListener {
            val intent = Intent(this, LoginFragment::class.java)
            startActivity(intent)
            finish()
        }
    }
}