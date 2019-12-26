package com.example.mt_lab1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logic = TicTacToeMainLogic()
        logic.fillArray()

        topLeftButton.setOnClickListener {
            logic.changeTopLeftField()
            topLeftButton.text = logic.changeSymbol()
            topLeftButton.isClickable = false
            if (logic.checkWin()) endGame(winnerTextView,logic)
            if (logic.checkTie()) isTie()

        }

        topMiddleButton.setOnClickListener {
            logic.changeTopMiddleField()
            topMiddleButton.text = logic.changeSymbol()
            topMiddleButton.isClickable = false
            if (logic.checkWin()) endGame(winnerTextView,logic)
            if (logic.checkTie()) isTie()
        }

        topRightButton.setOnClickListener {
            logic.changeTopRightField()
            topRightButton.text = logic.changeSymbol()
            topRightButton.isClickable = false
            if (logic.checkWin()) endGame(winnerTextView,logic)
            if (logic.checkTie()) isTie()
        }

        midLeftButton.setOnClickListener {
            logic.changeMiddleLeftField()
            midLeftButton.text = logic.changeSymbol()
            midLeftButton.isClickable = false
            if (logic.checkWin()) endGame(winnerTextView,logic)
            if (logic.checkTie()) isTie()
        }

        middleButton.setOnClickListener {
            logic.changeMiddleField()
            middleButton.text = logic.changeSymbol()
            middleButton.isClickable = false
            if (logic.checkWin()) endGame(winnerTextView,logic)
            if (logic.checkTie()) isTie()
        }

        midRightButton.setOnClickListener {
            logic.changeMiddleRightField()
            midRightButton.text = logic.changeSymbol()
            midRightButton.isClickable = false
            if (logic.checkWin()) endGame(winnerTextView,logic)
            if (logic.checkTie()) isTie()
        }

        botLeftButton.setOnClickListener {
            logic.changeBottomLeftField()
            botLeftButton.text = logic.changeSymbol()
            botLeftButton.isClickable = false
            if (logic.checkWin()) endGame(winnerTextView,logic)
            if (logic.checkTie()) isTie()
        }
        botMiddleButton.setOnClickListener {
            logic.changeBottomMiddleField()
            botMiddleButton.text = logic.changeSymbol()
            botMiddleButton.isClickable = false
            if (logic.checkWin()) endGame(winnerTextView,logic)
            if (logic.checkTie()) isTie()
        }
        botRightButton.setOnClickListener {
            logic.changeBottomRightField()
            botRightButton.text = logic.changeSymbol()
            botRightButton.isClickable = false
            if (logic.checkWin()) endGame(winnerTextView,logic)
            if (logic.checkTie()) isTie()
        }

        restartGameButton.setOnClickListener {
            logic.restartGame()
            setButtonsClickable()
            setButtonTextEmpty()
            winnerTextView.visibility = View.GONE
            restartGameButton.visibility = View.GONE
        }

    }

    private fun isTie(){
        restartGameButton.visibility = View.VISIBLE
        winnerTextView.text = "Tie"
        winnerTextView.visibility = View.VISIBLE
    }
    private fun setButtonsClickable(){
        topLeftButton.isClickable = true
        topMiddleButton.isClickable = true
        topRightButton.isClickable = true
        midLeftButton.isClickable = true
        middleButton.isClickable = true
        midRightButton.isClickable = true
        botLeftButton.isClickable = true
        botMiddleButton.isClickable = true
        botRightButton.isClickable = true
    }
    private fun setButtonTextEmpty(){
        topLeftButton.text = ""
        topMiddleButton.text = ""
        topRightButton.text = ""
        midLeftButton.text = ""
        middleButton.text = ""
        midRightButton.text = ""
        botLeftButton.text = ""
        botMiddleButton.text = ""
        botRightButton.text = ""
    }

    private fun endGame(textView: TextView, logic: TicTacToeMainLogic) {
        topLeftButton.isClickable = false
        topMiddleButton.isClickable = false
        topRightButton.isClickable = false
        midLeftButton.isClickable = false
        middleButton.isClickable = false
        midRightButton.isClickable = false
        botLeftButton.isClickable = false
        botMiddleButton.isClickable = false
        botRightButton.isClickable = false
        winnerTextView.visibility = View.VISIBLE
        restartGameButton.visibility = View.VISIBLE
        textView.text = logic.currentPlayerName(logic.currentPlayer())
    }

}


