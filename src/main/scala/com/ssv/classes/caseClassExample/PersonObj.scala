package com.ssv.classes.caseClassExample

object PersonObj {
  def main(args: Array[String]): Unit = {
    val p = Person()
    println(p)
    val b = Person("bob")
    println(b)
    b.setAge(21)
    println(b)
  }
}