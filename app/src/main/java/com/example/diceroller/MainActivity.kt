package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Activity that allows to roll a dice
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll a dice and update the result on app screen
     */
    private fun rollDice() {
        // Create new dice object
//        val dice = Dice(6)
//        val diceRoll = dice.roll()
//
        // Update the result on sceen
        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()
        val myFirstDice = Dice(6)
        val rollResult = myFirstDice.roll()
        val luckyNumber = 4

        when (rollResult) {
            luckyNumber -> resultTextView.text = "Winner"
            1 -> resultTextView.text = "Looser = 1"
            2 -> resultTextView.text = "Looser = 2"
            3 -> resultTextView.text = "Looser = 3"
            5 -> resultTextView.text = "Looser = 5"
            6 -> resultTextView.text = "Looser = 6"
        }


    }

    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}