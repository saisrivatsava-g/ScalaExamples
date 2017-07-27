package com.saisrivatsava.scala.FP.examples

object nthFibTailRec {
  def main(args: Array[String]): Unit = {
    println(formatResult(15))
  }
  def formatResult(num: Int) = {
    s"$num th fibnocci number is : ${fib(num)}"
  }
  def fib(n: Int) = {
    def go(count: Int, a: Int, b: Int): Int = {
      if (count >= n) a else go(count + 1, b, a + b)
    }
    go(1, 0, 1)
  }
}