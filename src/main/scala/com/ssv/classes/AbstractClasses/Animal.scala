package com.ssv.classes.AbstractClasses

abstract class Animal(val name: String, val specis: String) {

  val age: Int
  var mood: String
  val year: Int = 2017 ///variable with implementation

  def greet(msg: String): String //method without implementation

  def this(name: String) {
    this(name, "Unknown")
  }

  def eat(food: String): String = s"eating $food" //method with implementation
  override def toString() = s"Animal($name, $specis, $age)"
}