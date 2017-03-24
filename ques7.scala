package com.sapient.scala.practice

/**
  * Created by pjai58 on 3/24/2017.

  Ques 7) Pure function for =>
List(3,4,5,6) = List(List(1,2,3) , List(1,2,3,4 ),  List(1,2,3,4,5), List(1,2,3,4,5,6))

  */
object ques7
{

  def main(args: Array[String]): Unit =
  {

    val input =List(3,4,5,6)
    println(s"The Input List => $input")

    def lol (h:Int, b:Int=1):List[Int] = h match
      {
      case h if (h >= b) => b :: lol(h,b+1)
      case h if (h<b) => List()
      }

    def lol2 (l:List[Int],c:Int = 0):List[List[Int]]= l match
      {
      //case head::tail if (l.nonEmpty) => List(lol(head),lol2(tail)).flatten
      case head::tail if (l.nonEmpty) =>println("The output nested list =>" +lol(head)); (lol(head)::lol2(tail))
      case nil => Nil
      }

    val out1 = lol2(input)
    println(s"The Output List of List => $out1")

  }
}
