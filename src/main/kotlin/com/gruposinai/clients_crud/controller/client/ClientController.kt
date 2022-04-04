package com.gruposinai.clients_crud.controller.client

import com.gruposinai.clients_crud.exception.client.ClientNotFoundException
import com.gruposinai.clients_crud.model.Client
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/clients")
class ClientController(private val service: ClientService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveClient(@RequestBody client: Client) = service.saveClient(client)

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getClients() = service.findClients()

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getClientById(@PathVariable id: Long): Client {
        val client = service.findClientById(id)
        return client ?: throw ClientNotFoundException()
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    fun updateClient(@RequestBody client: Client) = service.updateClient(client)

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    fun deleteClient(@RequestBody client: Client){
        val foundClient = getClientById(client.id!!)
        service.deleteClient(foundClient)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteClientById(@PathVariable id: Long){
        val foundClient = getClientById(id)
        service.deleteClient(foundClient)
    }


}