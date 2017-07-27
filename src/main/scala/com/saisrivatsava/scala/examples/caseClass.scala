package com.saisrivatsava.scala.examples

case class caseClass(name: String, breed: String) {

}
/**
 * @author sai.guntupalli
 */
object new_name {

  def main(args: Array[String]): Unit = {
    val dog = caseClass("bob", "pug")
    println(dog.toString())
  }
}