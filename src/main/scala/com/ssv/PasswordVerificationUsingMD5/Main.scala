package com.ssv.PasswordVerificationUsingMD5

object Main {
  def main(args: Array[String]): Unit = {
    val user1 = new User("user1", "pass123")

    val password = scala.io.StdIn.readLine("enter tha password: ")
    val verify = new verify(user1.userPass, password)
    
    println(verify.verificationStatus)
  }
}