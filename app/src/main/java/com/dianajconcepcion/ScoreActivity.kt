package com.dianajconcepcion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dianajconcepcion.espanolQuiz.databinding.ActivityScoreBinding
import com.dianajconcepcion.espanolQuiz.databinding.FragmentLoginBinding

class ScoreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.progressBar.progress=50
        binding.progressText.text="50"
    //setContentView(R.layout.activity_score)
    }
}