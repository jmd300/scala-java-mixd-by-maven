package com.jmd.module

// import jmd.module.JavaPerson
object App {
  private def foo(x: Array[String]) = {
    x.foldLeft("")((a, b) => a + b)
  }

  def main(args: Array[String]): Unit = {
    println("Hello World!")
    println("concat arguments = " + foo(args))
//    val javaPerson = new JavaPerson()
//    javaPerson.setAge(30)
//    javaPerson.setName("xiaoming")
//    println(javaPerson.getName)
//    println(javaPerson)
  }
}




