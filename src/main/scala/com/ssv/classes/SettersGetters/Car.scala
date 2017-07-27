package com.ssv.classes.SettersGetters

class Car(val name: String, private var _milage: Int=20) {
  def milage = _milage
  def milage_=(nmilage: Int) = { _milage = nmilage }
  private val idNum:Int =484
}

