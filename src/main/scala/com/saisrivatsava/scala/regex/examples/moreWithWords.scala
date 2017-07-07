package com.saisrivatsava.scala.regex.examples

import scala.io.Source

object moreWithWords {
  def main(args: Array[String]): Unit = {
    val words = Source.fromFile("resources/words-small-set.txt").getLines().toList
    val patternForWordsContainingP = """p\w+""".r
    val patternForWordsStartWithP = """^p\w+$""".r
    val patternForWordsStartWithAandOfSize5 = """^a\w{4}$""".r
    val wordsStartingWithP = collection.mutable.ListBuffer("words that start with P")

    words.foreach { word => if (patternForWordsStartWithP.findAllIn(word).size > 0) wordsStartingWithP += word else None }
  //  wordsStartingWithP.foreach { println }

    val wordsContainingP = collection.mutable.ListBuffer("words containing P")

    words.foreach { word => if (patternForWordsContainingP.findAllIn(word).size > 0) wordsContainingP += word else None }
  //  wordsContainingP.foreach { println }

    
    val wordsStartWithAandWithSize5 = collection.mutable.ListBuffer("words Start With A and With Size 5 ")

    words.foreach { word => if (patternForWordsStartWithAandOfSize5.findAllIn(word).size > 0) wordsStartWithAandWithSize5 += word else None }
    wordsStartWithAandWithSize5.foreach { println }
    
    
  }
}