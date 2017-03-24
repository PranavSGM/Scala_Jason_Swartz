package com.sapient.scala.practice

/*
Ques2)  Write a High Order function that can take two integers and an functional literal of type  (int,int) => double and returns the result after applying the function on integers.
 */
object ques2 {

  def main(args: Array[String]) {


    val divide = (a: Int, b: Int) => if (b != 0) {
      1.0 * a / b
    } else 0.00

    def hofunc(x: Int, y: Int, f: (Int, Int) => Double): Double = {
      if (x > y) f(x, y)
      else f(y, x)
    }

    val division = hofunc(_: Int, _: Int, divide)

    println("the division of two numbers are as follow :")
    println("25/7 = " + division(25, 7))

  }
}