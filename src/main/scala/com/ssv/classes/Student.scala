package com.ssv.classes

class Student(val name: String, val id: Int, var age: Int = 21, var branch: String = "None") {

  var address = None: Option[Address]
  override def toString() = {
    s"Student($name, $id, $age, $branch, $address)"
  }

}
/**
 * @author sai.guntupalli
 */
object ClassTeacher {
  def main(args: Array[String]): Unit = {
    val bob = new Student("Bob", 1)
    println(bob)
    println(bob.name)
    val bobAddress = new Address("guntur", "Ap", 522019)
    bob.address = Some(bobAddress)
    println(bob)
    val ben = new Student("Ben", 2, branch = "cse")
    println(ben)
    val ad = bob.address.getOrElse("No address")
    println(ad)
    
  }
}