package com.saisrivatsava.scala.FP.examples

object BinarySearchTailed {
  def main(args: Array[String]): Unit = {
    println(binarySearch(Array(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20), 20))
  }
  def binarySearch(numbersList: Array[Double], key: Double): Int = {
    def go(low: Int, high: Int): Int = {
      if (low > high) -999
      else {
        val mid = (low + high) / 2
        val d = numbersList(mid)
        if (d == key) mid
        else if (d > key) go(low, mid - 1)
        else go(mid + 1, high)
      }
    }
    go(0, numbersList.length - 1)
  }
}