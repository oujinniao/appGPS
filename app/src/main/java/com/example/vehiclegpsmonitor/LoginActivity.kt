package com.example.vehiclegpsmonitor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vehiclegpsmonitor.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el botón de inicio de sesión
        binding.loginButton.setOnClickListener {
            performLogin()
        }

        // Configurar el enlace para el registro
        binding.registerLink.setOnClickListener {
            // Navegar a la pantalla de registro
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun performLogin() {
        val email = binding.email.text.toString()
        val password = binding.password.text.toString()
        // Lógica de inicio de sesión aquí
    }
}
