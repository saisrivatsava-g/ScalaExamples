package com.saisrivatsava.scala.examples

case class Counter(seed: Int) {
  def apply(n: Int) = Counter(seed + n)
}

/**
 * @author sai.guntupalli
 */
object Counter {
  def main(args: Array[String]): Unit = {
    var counter = Counter(0)
    println(counter.seed)
    counter = counter(10)
    println(counter.seed)
  }
}