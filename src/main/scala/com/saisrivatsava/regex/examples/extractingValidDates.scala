package com.saisrivatsava.regex.examples

import scala.util.matching.Regex

object extractingValidDates {
  def main(args: Array[String]): Unit = {

    val datePattern = """(\d\d)-(\d\d)-(\d\d\d\d)""".r
    val datePattern2 = new Regex("(\\d\\d)-(\\d\\d)-(\\d\\d\\d\\d)")

    // can use either datePattern or datePattern2

    val dates = List("09-08-1995", "1-02-1995", "15-8-1947", "15-08-1947")

    val validDates = collection.mutable.ListBuffer("valid dates")
    dates.foreach { date => if (datePattern.findAllIn(date).size > 0) validDates += date else None }

    validDates.foreach { println }
  }
}