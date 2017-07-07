package com.saisrivatsava.scala.regex.examples

object moreWithDtaes {
  def main(args: Array[String]): Unit = {
    val date = "(\\d\\d)-(\\d\\d)-(\\d\\d\\d\\d)".r
    val embeddedDate = date.unanchored

    val datesInAString = "Bob was born in 15-08-1992, and his sister jane was born in 09-08-1995 "
   
    //using "unanchored" Regex
    datesInAString match {
      case embeddedDate(date, month, year) => println(s"bob was born in $month month of the year $year")
      case _ => println("no proper date found")
    }
    
    //without using unanchored Regex and first Occurence
    
    val firstDate = date.findFirstIn(datesInAString).getOrElse("no proper date was found")
    println("first occered date in the string : "+firstDate)
    
    //findingall occurences of dates
    val allDates = for (m <- date.findAllMatchIn(datesInAString)) yield m
    allDates.foreach { println }
    
    //extracting only days
    val allDays = for (m <- date.findAllMatchIn(datesInAString)) yield m.group(1)
    allDays.foreach { println }
 
    //replacing years with another string
    val redacted    = date.replaceAllIn(datesInAString, "XXXX-XX-XX")
    println(redacted)
    
    
  }
}