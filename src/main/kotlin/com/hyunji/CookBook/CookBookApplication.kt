package com.hyunji.CookBook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CookBookApplication

fun main(args: Array<String>) {
	runApplication<CookBookApplication>(*args)
}
