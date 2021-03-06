package com.saisrivatsava.scala.FP.examples

object absValue {
  def abs(n: Int): Int = { if (n < 0) -n else n }
  private def formatAbs(x: Int) = {
    s"The absolute value of $x is ${abs(x)} ."
  }
  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
  }
}