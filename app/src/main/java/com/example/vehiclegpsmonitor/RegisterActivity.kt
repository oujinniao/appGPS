package com.example.vehiclegpsmonitor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vehiclegpsmonitor.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el botón de registro
        binding.registerButton.setOnClickListener {
            performRegistration()
        }

        // Configurar el enlace para iniciar sesión
        binding.loginLink.setOnClickListener {
            // Navegar a la pantalla de inicio de sesión
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun performRegistration() {
        val email = binding.email.text.toString()
        val password = binding.password.text.toString()
        // Lógica de registro aquí
    }
}
