package com.ssv.PasswordVerificationUsingMD5

class verify(userPass: String, currentPassword: String) {

 private def getHash():String = {
    val obj = new MD5(currentPassword)
    obj.getHash()
  }
  private def chechPassMatch(): Boolean = {
    if (userPass.equals(getHash())) true
    else false
  }

  def verificationStatus = {
    if (chechPassMatch()) s"PASSWORD CORRECT"
    else s"Invalid Password"
  }
}