package com.ssv.classes.PrivateConstructor

object ConfidentialDataObj {
  def main(args: Array[String]): Unit = {
    val obj = ConfidentialData.getInstance
    println(obj.verify("secret"))
  }
}