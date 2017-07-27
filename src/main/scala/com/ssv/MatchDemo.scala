package com.ssv

object MatchDemo {
  def matchWeek(day: String) = {
    day match {
      case "sun" => "sunday"
      case "mon" => "Monday"
      case "tue" => "tuesday"
      case "wed" => "wednesday"
      case "thu" => "thursday"
      case "fri" => "friday"
      case "sat" => "saturday"
      case other => s"Dont you know weekdays...? You asked for : ${other.toUpperCase()}"
    }
  }
  def matchHoliday(day: String) = {
    val matchFound = day match {
      case "monday" | "tuesday" | "wednesday" | "thursday" | "friday" => "WORKING DAY"
      case "sunday" | "saturday" => "HOLIDAY"
      case other => "there is no day like that"
    }
    matchFound
  }

  def matchExamples(input: Any) = {
    val result = input match {
      //constant patterns
      case true => """You entered "true"..!!"""
      case false => """You entered "false"..!!"""
      case 0 => """You entered "0"..!!"""
      case "hi" => """You wished "Hi"..!!"""
      case Nil => "you entewred a null List"
      //sequence patterns
      case List(0, _, _) => """a List of 3 elements, starting with 0 """
      case List(1, _*) => """A list with more than one element and starting with 1"""
      //tuple
      case (a, b) => s"""Got a Tuple with elements "$a" and "$b" """
      //Constructor patterns
      case Person(first, "g") => s"""found a Person with first name $first and with last name g"""
      //typed patterns
      case i: Int => s"""you gave me an Integer with value $i"""
      case s: String => s"""you gave me a String with value $s"""
      case a: Array[String] => s"""you gave me an Array of Strings with value ${a.mkString(",")}"""
      case p: Person => s"""you gave me a Person with First name "${p.first}" and Last name "${p.last}""""

      case _ => "Unknown Input..!!!"
    }
    result
  }

  def main(args: Array[String]): Unit = {
    //println(matchWeek("holiday"))
    // println(matchHoliday("saturay"))
    val p = Person("bob", "bell")
    println(matchExamples(Array("sai", "sri")))
  }
  case class Person(first: String, last: String)
}