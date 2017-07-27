package com.ssv

object sumToMAx {
  def sumToMax(arr: Array[Int], limit: Int): Int = {
    var sum = 0
    arr.foreach { num =>
      {
        sum += num
        if (sum > limit) return limit
      }
    }
    sum
  }

  def main(args: Array[String]): Unit = {
    println(sumToMax(Array(1, 2, 3, 1, 32, 4), 100))
  }
}