package org.gary.springboot.javakotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringbootJavaKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringbootJavaKotlinApplication>(*args)
}

