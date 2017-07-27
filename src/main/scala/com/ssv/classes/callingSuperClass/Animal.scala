package com.ssv.classes.callingSuperClass

class Animal(val name: String, val specis: String) {

  private var color: String = ""
  def this(dogname: String) {
    this(dogname, "Unknown")
  }

  def setColor(color: String) {
    this.color = color
  }
  def getColor:String = color
  override def toString = {
    s"Animal($name, $specis)"
  }
}