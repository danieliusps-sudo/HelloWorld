package com.example.helloworld

import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val buttonColor = findViewById<Button>(R.id.buttonColor)
        val buttonBackground = findViewById<Button>(R.id.buttonBackground)
        button.setOnClickListener {
            textView.setText(R.string.clicked_text)
        }

        buttonColor.setOnClickListener {
            textView.setTextColor(Color.RED)
        }
        // Revert this change to restore the default background color
        buttonBackground.setOnClickListener {
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(
                R.id.main
            ).setBackgroundColor(Color.YELLOW)
        }
    }
}