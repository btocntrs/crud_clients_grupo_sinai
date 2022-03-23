package com.gruposinai.clients_crud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
class ClientsCrudApplication

fun main(args: Array<String>) {
	runApplication<ClientsCrudApplication>(*args)
}
