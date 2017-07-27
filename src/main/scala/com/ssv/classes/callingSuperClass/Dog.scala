package com.ssv.classes.callingSuperClass

class Dog(name: String, specis: String, var age: Int, val sound: String) extends Animal(name,specis){
  override def toString = "Dog obj"

}

/**
 * @author sai.guntupalli
 */
object Man {
  def main(args: Array[String]): Unit = {

    val puppy = new Dog("puppy", "Dog", 9, "bow")

    println(puppy)
    println(puppy.name)
    puppy.setColor("black")
    println(puppy.getColor)
    println(puppy.specis)
  }
}