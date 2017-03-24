package com.sapient.scala.practice

/**
  * Created by Pranav Jain on 3/21/2017.

    Ques) Remove consecutive duplicates from a list
Input List Like : List(1,1,2,2,2,3,3,1,1,4,5,5,6,7,5,5,5,8,7,7)
Output Like should be : List(1,2,3,1,4,5,6,7,5,8,7)

  */
object ques1 {

  def main(args: Array[String]): Unit = {

    val input = List(1,1,2,2,2,3,3,1,1,4,5,5,6,7,5,5,5,8,7,7)

    val y= println("Input =>"+input)
    val x=println("start")
    def compress[T](l1 : List[T]) : List[T] = l1 match {
      case head::nxt::tail if head == nxt => println(s"h:n:t ----- $l1");compress(nxt::tail)
      case head::tail => println(s"h:t   -------- $l1");head::compress(tail)
      case nil => println(s"nil  -------   $l1");List()
    }
    val output = println("the output =>" + compress(input) )
  }
}
