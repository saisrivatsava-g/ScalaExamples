package com.ssv.classes.PrivateConstructor

class ConfidentialData private {
  def verify(password: String) = {
    if (password == "secret") true else false
  }
  override def toString = {
    "This is a Confidential Data Obj"
  }
}
/**
 * @author sai.guntupalli
 */
object ConfidentialData {
  private var flag = 0
  def getInstance() = new ConfidentialData
}
