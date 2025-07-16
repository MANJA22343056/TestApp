package com.example.testapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var button: Button
    private lateinit var buttonTextView: TextView

    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        button = findViewById(R.id.button)
        buttonTextView = findViewById(R.id.buttonTextView)
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        initComponents()

        buttonTextView.text = resources.getString(R.string.app_name)

        button.setOnClickListener {
            Toast.makeText(this, "Anda berhasil mengklik saya", Toast.LENGTH_SHORT).show()

            val name = nameEditText.text.toString()

            buttonTextView.text = resources.getString(R.string.buttonTextView, name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("PZN",it)
            }
        }
    }
}
