package com.ssv.classes.AbstractClasses {

  class Dog(name: String, specis: String, val breed: String) extends Animal(name, specis) {
    var color: String = ""
    def greet(msg: String) = msg
    val age = 21
    var mood = "happy"

  }
  /**
   * @author sai.guntupalli
   */
  object Human {

    def main(args: Array[String]): Unit = {

      val tom = new Dog("tom", "dog", "lab")
      println(tom.eat("meat"))

      println(tom.specis)
      println(tom)
    }
  }
}