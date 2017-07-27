package com.ssv

import scala.util.Random

object implicitClassesDemo {
  implicit class StringExtras(s: String) {
    def encode = {
      val random = new Random
      val r = random.nextInt(10)
      (s.map(c => (c + r).toChar), r)
    }
    def decode(key: Int) = {
      s.map { x => (x - key).toChar }
    }
  }

  def main(args: Array[String]): Unit = {
    val mainString = "vatsava"
    val (encodedString, key) = mainString.encode
    println(encodedString)
    val decodedString = encodedString.decode(key)
    println(decodedString)
  }
}
