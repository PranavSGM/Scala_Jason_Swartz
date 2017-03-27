package com.sapient.scala.practice

/**
  * Created by pjai58 on 3/27/2017.
  Ques-6.1:  List(1,2,3,4,5,6,4,5,6,4).secondGreatest  = 5
  */
object ques_61
{
  class Listmax2(val l:List[Int])
  {
    def secondGreatest =
    {
      val order = l.sorted
      val d_order = order.distinct
      d_order(d_order.size-2)
    }
  }

  implicit def Listreduction(l:List[Int])= new Listmax2(l)

  def main(args: Array[String]): Unit =
  {
   val inputa= List(1,2,3,4,5,6,4,5,6,4)
   val outa =  inputa.secondGreatest
   println("ordered List =>"+inputa.sorted)
    println(s"Second largest element of List => $outa")
  }
}
