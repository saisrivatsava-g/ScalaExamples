package com.saisrivatsava.scala.FP.examples

object FunctionsASObjects {
  def main(args: Array[String]): Unit = {
    val max = (x: Int, y: Int) => if (x > y) x else y
    println(max(2, 21))

    val lessThan = (x: Int, y: Int) => x < y
    println(lessThan(2, 32))

    val greaterThan = new Function2[Int, Int, Boolean] {
      def apply(a: Int, b: Int) = a > b
    }
    
    val tup = greaterThan.tupled
    println(tup((1,2)))
   // println(greaterThan(2,43))
    
    
  }
}