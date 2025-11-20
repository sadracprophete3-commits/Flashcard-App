package com.example.flashcardapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.view.MotionEvent
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
        val flashcardAnswer1 = findViewById<TextView>(R.id.flashcard_answer1)
        val flashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val flashcardAnswer3 = findViewById<TextView>(R.id.flashcard_answer3)

//        flashcardQuestion.setOnClickListener {
//            flashcardQuestion.visibility = View.INVISIBLE
//            flashcardAnswer1.visibility = View.VISIBLE
//            flashcardAnswer2.visibility = View.VISIBLE
//            flashcardAnswer3.visibility = View.VISIBLE
//        }

        flashcardAnswer1.setOnClickListener {
            flashcardQuestion.visibility = View.VISIBLE
            flashcardAnswer1.visibility = View.INVISIBLE
            flashcardAnswer2.visibility = View.INVISIBLE
            flashcardAnswer3.visibility = View.INVISIBLE
        }

        flashcardAnswer2.setOnClickListener {
            flashcardQuestion.visibility = View.VISIBLE
            flashcardAnswer1.visibility = View.INVISIBLE
            flashcardAnswer2.visibility = View.INVISIBLE
            flashcardAnswer3.visibility = View.INVISIBLE
        }

        flashcardAnswer3.setOnClickListener {
            flashcardQuestion.visibility = View.VISIBLE
            flashcardAnswer1.visibility = View.INVISIBLE
            flashcardAnswer2.visibility = View.INVISIBLE
            flashcardAnswer3.visibility = View.INVISIBLE
        }

        flashcardAnswer1.setOnClickListener {
            flashcardAnswer1.setBackgroundColor(resources.getColor(R.color.rouge, null))
            flashcardAnswer2.setBackgroundColor(resources.getColor(R.color.jaune, null))
            flashcardAnswer3.setBackgroundColor(resources.getColor(R.color.jaune, null))
        }

        flashcardAnswer2.setOnClickListener {
            flashcardAnswer1.setBackgroundColor(resources.getColor(R.color.jaune, null))
            flashcardAnswer2.setBackgroundColor(resources.getColor(R.color.rouge, null))
            flashcardAnswer3.setBackgroundColor(resources.getColor(R.color.jaune, null))
        }
        flashcardAnswer3.setOnClickListener {
            flashcardAnswer1.setBackgroundColor(resources.getColor(R.color.jaune, null))
            flashcardAnswer2.setBackgroundColor(resources.getColor(R.color.jaune, null))
            flashcardAnswer3.setBackgroundColor(resources.getColor(R.color.vert, null))
        }

    }
}