package com.gruposinai.clients_crud

import com.gruposinai.clients_crud.controller.client.ClientService
import com.gruposinai.clients_crud.controller.product.ProductService
import com.gruposinai.clients_crud.model.Client
import com.gruposinai.clients_crud.model.Product
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configuration {

    @Bean
    fun initDB(
        productService: ProductService, clientService: ClientService) = ApplicationRunner{

        /*val clients = mutableListOf<Client>()
        val products = mutableListOf<Product>()

        val product1 = Product(name = "Bolsa de Hielo en Cubo de 5 kg", price = 15.50f, clients = clients)
        val product2 = Product(name = "Agua enbotellada en garrafon de 19L", price = 12.00f, clients = clients)

        val client = Client(name = "Abarrotes Ojeda", alias = "Ojeda", email = "ojeda@gmail.com",
            customerType = "Particular", products = products,
        address = "Av. Concordia", suburb = "Flores Magon", postalCode = 24350, city = "Escárcega", state = "Campeche")

        client.products += product1
        client.products += product2

        product1.clients += client
        product2.clients += client

        clientService.saveClient(client)

        productService.saveProduct(product1)
        productService.saveProduct(product2)*/

        /*val client = clientService.findClients()[0]
        val product = productService.findProducts()[0]
        println("Products: ${client?.products?.size}")
        println("Clients: ${product?.clients?.size}")*/


        println("OK")

    }

}