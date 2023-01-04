package com.example.testaar

import org.slf4j.LoggerFactory
import org.slf4j.impl.StaticLoggerBinder
import java.io.File

fun main() {
    File("application.log").writeText("Hello, Logging")

    val logger = LoggerFactory.getLogger("MYTESTLOGGER")
    logger.info("Hello")

    StaticLoggerBinder.getSingleton().loggerFactory

}


