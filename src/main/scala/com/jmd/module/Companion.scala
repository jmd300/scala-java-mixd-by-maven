package com.jmd.module

import org.slf4j.Logger
import org.slf4j.LoggerFactory


class Companion(var constructorArg: String = "defaultVal") {

  private val LOG: Logger = LoggerFactory.getLogger(Companion.getClass)

  private var privateVal = constructorArg
  private var sum = 0

  def showPrivateVal(): Unit = {
    LOG.trace(privateVal)
    LOG.debug(privateVal)
    LOG.info(privateVal)
    LOG.warn(privateVal)
    LOG.error(privateVal)
  }

  def whatisUint(b: Unit): Unit = {
    b
  }
}

object Companion {
  private val LOG: Logger = LoggerFactory.getLogger(Companion.getClass)

  def method1(methodArg: String): Unit = {
    LOG.trace(methodArg)
    LOG.debug(methodArg)
    LOG.info(methodArg)
    LOG.warn(methodArg)
    LOG.error(methodArg)
  }
}