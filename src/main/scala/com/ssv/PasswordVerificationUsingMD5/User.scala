package com.ssv.PasswordVerificationUsingMD5

class User(userName: String, password: String) {
  this.generateHash(password)

  def this(username: String) = {
    this(username, "noPassword")
  }

  def getUserName = this.userName

  override def toString(): String = {
    s"A user with username $userName is created"
  }

  private def generateHash(pass: String) = {
    val obj = new MD5(pass)
    obj.getHash()
  }
  
  def userPass = generateHash(password)

}