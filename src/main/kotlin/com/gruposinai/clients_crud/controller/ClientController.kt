package com.gruposinai.clients_crud.controller

import com.gruposinai.clients_crud.exception.ClientNotFoundException
import com.gruposinai.clients_crud.model.Client
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("clients")
class ClientController(private val service: ClientService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveClient(@RequestBody client: Client) = service.saveClient(client)

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    fun getClients() = service.findClients()

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
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
        val foundClient = service.findClientById(client.id!!)
        if(foundClient != null){
            service.deleteClient(client)
        } else {
            throw ClientNotFoundException()
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteClientById(@PathVariable id: Long){
        val foundClient = service.findClientById(id)
        if(foundClient != null){
            service.deleteClientById(id)
        } else {
            throw ClientNotFoundException()
        }
    }

}