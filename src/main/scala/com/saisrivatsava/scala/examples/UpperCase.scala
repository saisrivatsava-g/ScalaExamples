package com.saisrivatsava.scala.examples

class UpperCase {
  def toUpper(strings :String*) ={
    strings.map { x => x.toUpperCase() }
  }
}

/**
 * @author sai.guntupalli
 */
object main {
  def main(args: Array[String]): Unit = {
    val obj = new UpperCase
    println(obj.toUpper("hai", "how are u"))
  }
}