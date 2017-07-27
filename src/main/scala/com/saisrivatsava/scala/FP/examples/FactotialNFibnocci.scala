package com.saisrivatsava.scala.FP.examples

object FactotialNFibnocci {
  def factorial(n: Int) = {
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc else go(n - 1, n * acc)
    }
    go(n, 1)
  }
  def fib(n: Int) = {
    def go(count: Int, a: Int, b: Int): Int = {
      if (count >= n) a else go(count + 1, b, a + b)
    }
    go(1, 0, 1)
  }

  def formatResult(msg: String, n: Int, f:(Int) => Int) {
    println(s"The  $msg of $n is ${f(n)}")
  }

  def main(args: Array[String]): Unit = {
    formatResult("Factorial", 5, factorial)
    formatResult("Fibnocci number", 4, fib)
  }
}