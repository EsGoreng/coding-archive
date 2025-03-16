package com.dicoding.logintraining

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dicoding.logintraining.databinding.ActivitySignupBinding

class signupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        databaseHelper = DatabaseHelper(this)

        binding.signupButton.setOnClickListener {
            val username = binding.signupUsername.text.toString()
            val password = binding.signupPassword.text.toString()
            signupDatabase(username, password)
        }

        binding.loginRedirect.setOnClickListener {
            val intent = Intent(this, signupActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun signupDatabase(usernmae: String, password: String) {
        val id = databaseHelper.insertUser(usernmae, password)
        if (id != -1L) {
            Toast.makeText(this, "Signup successful", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, "Signup failed", Toast.LENGTH_SHORT).show()
        }

    }

}