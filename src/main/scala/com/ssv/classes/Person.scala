package com.ssv.classes

class Person1(val name: String, var age: Int) {
  def this(onlyname: String) {
    this(onlyname, 0)
  }
  def this() {
    this("No Name", 0)
  }
  override def toString() = {
    s"$name of age $age"
  }
}

/**
 * @author sai.guntupalli
 */
object PersonObj {
  def main(args: Array[String]): Unit = {
    val ben = new Person1("ben")
    println(ben.name)
    val a = println(ben.age)
    val peter = new Person1("peter parker", 25)
    println(peter)
  }
}