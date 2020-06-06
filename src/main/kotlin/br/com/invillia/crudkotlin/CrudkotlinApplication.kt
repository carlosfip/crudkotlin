package br.com.invillia.crudkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudkotlinApplication

fun main(args: Array<String>) {
	runApplication<CrudkotlinApplication>(*args)
}
