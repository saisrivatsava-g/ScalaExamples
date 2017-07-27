package com.ssv.classes.caseClassExample

case class Person(fname: String, lname: String) {
  private var age = 0
  def setAge(nage: Int) { age = nage }
  def getAge = age
  override def toString() = {
    s"Person($fname, $lname, $age)"
  }

}

/**
 * @author sai.guntupalli
 */
object Person {
  def apply() = new Person("<no first name>", "<no last name>")
  def apply(fname: String) = new Person(fname, "no last name")
}
