package com.saisrivatsava.scala.examples

class Dog(name: String, breed: String, sound: String) extends Animal {

  this.setName(name)

  def this(name: String) {
    this(name, "No breed:Alien", "no Sound")
  }
  def this(name: String, breed: String) {
    this(name, breed, "this Dog never bark.!!")
  }
  def this() {
    this("no name", "no breed", "no sound")
  }

  val animalid = Animal.newAnimalID
  override def toString() = {
    s"this is a Dog with Name : $name and of breed $breed and sounds like $sound and Id $animalid"
  }

}

/**
 * @author sai.guntupalli
 */
object DogObj {
  def main(args: Array[String]): Unit = {
   val puppy = new Dog("puppy", "lab", "uff")
   println(puppy)
   val tommy = new Dog("tommy")
   println(tommy.getBreed, tommy.id)
  
  }
}