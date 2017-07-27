package com.ssv.classes

class Address(var city: String, var state: String, var zip: Int) {

  override def toString = {
    s"Address($city, $state, $zip)"
  }
  def sendMail(mail :String) = s"""Sent a mail "$mail" """
}