package com.jmd.module

/**
 * @author ${user.name}
 */
object ScalaApp {

  def foo(x: Array[String]) = x.foldLeft(" ")((a, b) => a + b)

  def main(args: Array[String]) {
    println("Scala Hello World!")
    println("Scala concat arguments by scala =" + foo(args))
    println("Scala concat arguments by java =" + JavaApp.foo(args))
    new Companion().showPrivateVal()
    Companion.method1("Companion Object method1 call")
  }
}
