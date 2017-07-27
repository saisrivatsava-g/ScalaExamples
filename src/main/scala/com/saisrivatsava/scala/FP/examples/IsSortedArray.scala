package com.saisrivatsava.scala.FP.examples

object IsSortedArray {
  def isSorted(arr: Array[Int], f: (Int, Int) => Boolean): Boolean = {
    def go(n: Int): Boolean = {
      if (n >= arr.length - 1) true
      else if (f(arr(n), arr(n + 1))) false
      else go(n + 1)
    }
    go(0)
  }

  def check(x: Int, y: Int) = {
    if (x > y) true else false
  }

  def main(args: Array[String]): Unit = {
    val res = isSorted(Array(1, 2, 3, 4, 5, 6, 100,1), check)
    println(res)
  }
}