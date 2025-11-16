package com.example.flashcardapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var onclickListener: () -> Unit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.GONE
            flashcardAnswer.visibility = View.VISIBLE
        }
        val btnClick = findViewById<Button>(R.id.btnClick)
        val tvName = findViewById<TextView>(R.id.tvName)

        val names = listOf(
            "Barack Obama",
            "Bill Clinton",
            "George H. W. Bush"
        )

        var index = 0

        btnClick.setOnClickListener {
            tvName.text = names[index]
            index++

            if (index == names.size) {
                index = 0   // recommence quand on arrive à la fin
            }
        }
    }
}