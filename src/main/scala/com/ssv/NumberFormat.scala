package com.ssv

object NumberFormat {

  def format(num: Long): String = {
    var temp = ""
    val s = num.toString().reverse
    for (i <- 1 to s.length()) {
      temp = temp + s(i - 1)
      if (i % 3 == 0) {
        temp = temp + ","
      }
    }
    if (s.length() % 3 == 0)
      temp = temp.substring(0, temp.length() - 1)
    temp.reverse
  }
  def main(args: Array[String]): Unit = {
    println(format(1234567))
  }
}