package com.saisrivatsava.scala.FP.examples

object FactorialTailRec {
  def factorial(n: Int) = {
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc else go(n - 1, n * acc)
    }
    go(n, 1)
  }
 
  def main(args: Array[String]): Unit = {
    println(factorial(5))
  }
}