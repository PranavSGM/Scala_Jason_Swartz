package com.sapient.scala.practice

/**
  * Created by Pranav Jain on 3/21/2017.

  Ques4)  Write a High order function that takes an List[Any] and func literal (int) => Boolean and returns List with elements that satisfy functional lit.
  */

object ques4 {

  def main(args: Array[String]): Unit = {
    // Function Literal
    val fl = (a:Int) => if( a <0) false
    else true
    //Input List
    val x = List(1,2,-5,3,0,-5,4,0,-3,4,-5) //filter ( _>=0)
    println(s"the input List => $x")

    //Higher-Order Function
    def hofunc(l:List[Int], fl:Int => Boolean):List[Int]=
    {
      l match
      {
        case head::tail if fl(head) => head::hofunc(tail,fl)
        case head::tail if !fl(head) =>hofunc(tail,fl)
        case nil => List()
      }
    }
    //Function Invocation
    val result:List[Int] = hofunc (x, fl)
    println("the output List => " + result)

  }

}
