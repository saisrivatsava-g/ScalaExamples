package com.ssv.classes.SettersGetters

object CarObj {
  def main(args: Array[String]): Unit = {
    var c = new Car("bmw")
    println(c.milage)
    c.milage = 200
    println(c.milage)
  }
}