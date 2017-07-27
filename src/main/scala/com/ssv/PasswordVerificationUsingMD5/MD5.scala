package com.ssv.PasswordVerificationUsingMD5

class MD5(password: String) {

  private def hash(password: String) = {
    val m = java.security.MessageDigest.getInstance("MD5")
    val b = password.getBytes("UTF-8")
    m.update(b, 0, b.length)
    new java.math.BigInteger(1, m.digest()).toString(16)
  }

  def getHash() = hash(this.password)

  override def toString(): String = {
    s"The hashed password is ${getHash()} "
  }
}