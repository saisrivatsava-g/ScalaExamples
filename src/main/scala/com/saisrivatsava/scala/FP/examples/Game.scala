package com.saisrivatsava.scala.FP.examples

object Game {

  def findTheWinner(player1: Player, player2: Player): Player = {
    if (player1.score > player2.score) player1 else player2
  }

  def printWinner(player: Player): Unit = {
    println(player.name + " with score " + player.score + " is the winner...!!")
  }

  def main(args: Array[String]): Unit = {
    val players = List(Player("bob", 10),
      Player("rion", 12),
      Player("sam", 16),
      Player("ben", 2),
      Player("anna", 6),
      Player("michale", 9))

    val winner = players.reduceLeft(findTheWinner)
    printWinner(winner)
  }

}