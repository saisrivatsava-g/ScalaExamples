package com.saisrivatsava.scala.regex.examples

object workingWithExpressions {
  def main(args: Array[String]): Unit = {
    val webAdddresses = List("http://www.google.com", "https://www._gmail.com", "http://google.org", "https://gmail.net", "www.google.co.uk", "gmail.co.in", "happy._id")
    val addressString = webAdddresses.toString()

    val patternForAll = """((?:https?://)?(?:www.)?[a-zA-Z0-9_]+.(com|org|net|co.uk|co.in))""".r
    val validAddressesList = collection.mutable.ListBuffer("valid web Addresses")

    webAdddresses.foreach { address => if (patternForAll.findAllIn(address).size > 0) validAddressesList += address else None }

    validAddressesList.foreach { println }

    //working with groups
    "www.google.co.uk" match {
      case patternForAll(website, extension) => println(s"""website address \" $website \" is valid and is registered with the extension \"$extension\" """)
      case _ => println("no valid web address found")
      
    }
  }
}