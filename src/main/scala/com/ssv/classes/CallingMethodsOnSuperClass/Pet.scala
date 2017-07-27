package com.ssv.classes.CallingMethodsOnSuperClass

class Pet extends Dog with Animal with Cat {

  override def about = "Im a pet"
  def Aabout = super[Animal].about
  def Dabout = super[Dog].about
  def Cabout = super[Cat].about
  def Sabout = super.about
}
/**
 * @author sai.guntupalli
 */
object Pet {
  def main(args: Array[String]): Unit = {

    val p = new Pet
    println(p.about)
    println(p.Aabout)
    println(p.Dabout)
    println(p.Cabout)
    println(p.Sabout)

  }
}