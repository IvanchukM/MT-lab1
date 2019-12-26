package com.example.mt_lab1

interface TicTacToe {
    fun changeTopLeftField()
    fun changeTopMiddleField()
    fun changeTopRightField()
    fun changeMiddleLeftField()
    fun changeMiddleField()
    fun changeMiddleRightField()
    fun changeBottomLeftField()
    fun changeBottomMiddleField()
    fun changeBottomRightField()
    fun checkWin(): Boolean
    fun checkTie():Boolean
}