package com.example.actividades

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.actividades.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnSend.setOnClickListener {

            val bundle = Bundle().apply{
                putString("USER_NAME", binding.txtName.text.toString())
                putInt("EDAD", 50)
                putBoolean("ES_ESTUDIANTE", true)
            }

            val intent = Intent(this, SecondaryActivity::class.java).apply{
                putExtra("USER_NAME", binding.txtName.text.toString())

            }
            startActivity(intent)
        }
    }
}