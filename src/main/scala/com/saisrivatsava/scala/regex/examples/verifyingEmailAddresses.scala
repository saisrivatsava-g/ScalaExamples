package com.saisrivatsava.scala.regex.examples

import scala.util.matching.Regex

object verifyingEmailAddresses {
  def main(args: Array[String]): Unit = {

    val pattern = new Regex("[a-zA-Z0-9_]+@[a-zA-Z0-9]+.(com|org|net)")
    val inputMailsList = List("sai@gmail.com", "bob@outlook.net", "happy.com", "foo@gmail.xyz", "jane_doe@hotmail.com")
    val acceptedMails = collection.mutable.HashSet("accepted mails")
    val rejectedMails = collection.mutable.HashSet("rejected mails")

    inputMailsList.foreach { mail => if (pattern.findAllIn(mail).size > 0) acceptedMails += mail else rejectedMails += mail }

    acceptedMails.foreach(println)
    println()
    rejectedMails.foreach(println)
  }
}