package com.saisrivatsava.scala.FP.examples

object anonymousFunctions {
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

  def formatResult(msg: String, n: Int, f: (Int) => Int) {
    println(s"The  $msg of $n is ${f(n)}")
  }

  def main(args: Array[String]): Unit = {
    formatResult("factorial", 5, factorial)
    formatResult("Fibnocci", 5, fib)
    //anonymous Function that adds 2 to 5
    formatResult("Addition of 2 to", 5, (x) => x + 2)
    formatResult("Multiplication of 3 to ", 6, (x: Int) => x * 3)
    
    val square = (x:Int) => println(x*x)
    square(4)
  }
}