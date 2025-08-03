package com.jmd.module

import org.junit.Assert._
import org.junit._

@Test
class ScalaJUnitTest {

  val s: String = "abc"

  @Test
  def testOK() = assertFalse(false)

  @Test
  def testOK1() = println("Scala TestOK1"); assertTrue(true)

  @Test
  def testOK2() = {
    println("Scala TestOK2")
    ScalaApp.main(Array[String]("1", "2"))
    JavaApp.main(Array[String]("1", "2"))
  }

  @Test
  def testOK3 = {

    println("Scala TestOK3")
    assertSame("abc", s)
  }

}


