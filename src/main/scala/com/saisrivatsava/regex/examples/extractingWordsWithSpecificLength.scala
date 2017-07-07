package com.saisrivatsava.regex.examples
import scala.io.Source
import scala.util.matching.Regex

object extractingWordsWithSpecificLength {
  def main(args: Array[String]): Unit = {

    val words = Source.fromFile("resources/words-small-set.txt").getLines.toList
    val patternForWordsOfSize3 = new Regex("^\\w{3}\\b")
    val wordsOfSize3 = collection.mutable.ListBuffer("words of size 3")
    words.foreach { word => if (patternForWordsOfSize3.findAllIn(word).size > 0) wordsOfSize3 += word else None }
    wordsOfSize3.foreach(println)
  }
}