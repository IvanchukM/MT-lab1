package com.example.mt_lab1

class TicTacToeMainLogic : TicTacToe {

    private var counter = -1
    var gameField = Array(3){IntArray(3)}

    private var filler = 3
    fun fillArray(){
        for(i in 0..2){
            for(j in 0..2){
                gameField[i][j] = filler
                filler++
            }
        }
    }

    override fun changeTopLeftField(){
        gameField[0][0] = currentPlayer()
    }

    override fun changeTopMiddleField() {
        gameField[0][1] = currentPlayer()
    }

    override fun changeTopRightField() {
        gameField[0][2] = currentPlayer()
    }

    override fun changeMiddleLeftField() {
        gameField[1][0] = currentPlayer()

    }

    override fun changeMiddleField() {
        gameField[1][1] = currentPlayer()
    }

    override fun changeMiddleRightField() {
        gameField[1][2] = currentPlayer()
    }

    override fun changeBottomLeftField() {
        gameField[2][0] = currentPlayer()
    }

    override fun changeBottomMiddleField() {
        gameField[2][1] = currentPlayer()
    }

    override fun changeBottomRightField() {
        gameField[2][2] = currentPlayer()
    }

    fun currentPlayer(): Int {
        counter ++
        return if ( counter % 2 == 0) 1
        else return  2
    }

    fun changeSymbol(): CharSequence?{
        return if (counter % 2 == 0) "X"
        else "O"
    }

    fun currentPlayerName(currentPlayer: Int): String{
        val firstName = "First Player Win"
        val secondName = "Second Player Win"
        return if(currentPlayer == 1) secondName
        else return firstName
    }

    override fun checkWin(): Boolean {
        var result  = false
        when {
                    (gameField[0][2] == gameField[1][1]) and (gameField[1][1] == gameField[2][0])
            -> result = true
                    (gameField[0][0] == gameField[1][1]) and (gameField[1][1] == gameField[2][2])
            -> result = true
                    (gameField[0][0] == gameField[1][0]) and (gameField[1][0] == gameField[2][0])
            -> result = true
                    (gameField[0][1] == gameField[1][1]) and (gameField[1][1] == gameField[2][1])
            -> result = true
                    (gameField[0][2] == gameField[1][2]) and (gameField[1][2] == gameField[2][2])
            -> result = true
                    (gameField[0][0] == gameField[0][1]) and (gameField[0][1] == gameField[0][2])
            -> result = true
                    (gameField[1][0] == gameField[1][1]) and (gameField[1][1] == gameField[1][2])
            -> result = true
                    (gameField[2][0] == gameField[2][1]) and (gameField[2][1] == gameField[2][2])
            -> result = true
        }
        return result
    }

    override fun checkTie(): Boolean {
        var result = false
        if( !checkWin() and checkField()) result = true
        return result
    }

    private fun checkField():Boolean {
        var result = false
        var counter = 0
        for(i in 0..2){
            for(j in 0..2){
                if(gameField[i][j] < 3){
                    counter++
                }
            }
        }
        if (counter == 9) result = true
        return result
    }

    fun restartGame(){
        filler = 3
        fillArray()
        counter = -1
    }

//[0/0] [0/1] [0/2]
//[1/0] [1/1] [1/2]
//[2/0] [2/1] [2/2]

}