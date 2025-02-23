package com.rockthejvm

object Basics extends App {

  // defining values
  val valName: Int = 32 // cons int valName = 32

  // Int, Boolean, Char, Double, Float, String
  val aBollean = false // type mentioning is optional

  // string and string operation
  val aString = " I love scala"
  val aComposedString = "I" + " " + "Love scala"
  val anInterpolatedSting = s"Some value at he end: $valName"

  //espression = structures that can be reduced to a value
  val anExpression = 2+3

  // if-expression
  val ifExpression = if (valName > 20) 43 else 99 // in other lang: valName > 20 ? 43 : 99
  val chainedIfExp =
    if (valName < 35) 44
    else if (valName > 43) -5
    else if (valName < 40) 78
    else 0

  // code blocks
  val aCodeBlock = {
    //definitions
    val aLocalVal = 45

    // value of lock is the last expression
    aLocalVal + 9
  }

  // define functions
  def myFunc (x: Int, y: String) :String = y + " " + x
  def myFunc2 (x: Int, y: String) :String = { // the same but with cone block
    y + " " + x
  }

  // recustiv functions
  def myFactorial(n: Int): Int ={
    if (n <= 1) 1
    else n * myFactorial(n - 1)
  }

  // In Scala we don't use loops or iteration, we use RECURSION.

  // the Unit type = no meaningful value === "void" in other langueges
  // type of SIDE EFFECTS
  println("just something to print") // in other languages: System.out.println, printf, console.log

  // same can be done with functions returning Unit
  def myUnitFunc(): Unit = {
    println("I dont like returning Unit")
  }

  val theUnit = () // this is how to define a variable with Unit type


}
