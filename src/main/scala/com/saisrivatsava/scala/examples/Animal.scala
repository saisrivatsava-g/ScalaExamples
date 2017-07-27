package com.saisrivatsava.scala.examples

class Animal(private var name: String= "Dog", private val breed: String ="lab") {
  this.setName(name)
  val id = Animal.newAnimalID
  def this(name: String) {
    this(name, "Alien")
  }

  def this() {
    this("animal", "Alien")
  }

  def setName(newName: String) {
    if (!(newName.matches(".*\\d+.*"))) name = newName
    else name = "No Name"
  }
  def getName = this.name
  def getBreed = this.breed
  def getId = this.id
  override def toString() = {
    s"the Dog name is $name and is of breed $breed with ID $id"
  }
}

/**
 * @author sai.guntupalli
 */
object Animal {
  private var id = 0
  def newAnimalID = { id += 1 ; id}

  def main(args: Array[String]): Unit = {
    val tommy = new Animal("tommy", "lab")
    println(tommy)
    val kitty = new Animal("kitt1y")
    println(kitty)
    val animal = new Animal
    println(animal.name)
  }
  
}