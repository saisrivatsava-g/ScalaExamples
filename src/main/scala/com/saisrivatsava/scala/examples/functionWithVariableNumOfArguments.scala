package com.saisrivatsava.scala.examples

object functionWithVariableNumOfArguments {
  def main(args: Array[String]): Unit = {
    println(sum(1,1,1,1,1,1,2,2,3,234,34,232))
    println(factorial(8))
  }
  def sum(args: Int*): Int = {
    var temp = 0
    args.foreach { x => temp += x }
    temp
  }
   def factorial(n: Int): Int = {
    def go(count: Int, acc: Int):Int = {
      if (count <= 0) acc
      else go(count -1, count * acc)
    }
    go(n, 1)
  }
}