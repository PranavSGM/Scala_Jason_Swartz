package com.sapient.scala.practice

/*
Ques 3)  Write a pure function that takes Any and returns its datatype.
 */

object ques3 {

  def main(args: Array[String]): Unit = {

    def dtype (x:Any)= x.getClass

    val result = dtype(22)

    println(s"the data Type of the input value is = $result")

  }
}
