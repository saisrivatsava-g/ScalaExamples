package com.ssv.classes.fluentMethods

class Pizza {
  var size: Int = 0
  var crustType: String = ""
  import scala.collection.mutable.ArrayBuffer
  val toppings = ArrayBuffer[String]()
  def setSize(orderSize: Int) = {
    size = orderSize
    this
  }
  def setCrust(crust: String) = {
    crustType = crust
    this
  }
  def addTopping(newToppings: String*) = {
    newToppings.foreach(x => toppings += x)
    this
  }
  override def toString() = {
    s"Pizza($crustType, $size, [${toppings.mkString(",")}])"
  }

}

/**
 * @author sai.guntupalli
 */
object PizzaShop {

  def main(args: Array[String]): Unit = {
    val order1 = new Pizza
    order1.setSize(10)
      .setCrust("thin")
      .addTopping("cheese", "chicken", "prawns", "sause")

    println(order1)
  }
}