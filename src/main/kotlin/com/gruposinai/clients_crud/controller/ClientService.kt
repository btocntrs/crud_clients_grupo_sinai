package com.gruposinai.clients_crud.controller

import com.gruposinai.clients_crud.model.Client
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ClientService(private val db: ClientRepository) {

    fun saveClient(newClient: Client) = db.save(newClient)

    fun findClients(): List<Client> = db.findAll()

    fun findClientById(id: Long) = db.findByIdOrNull(id)

    fun updateClient(client: Client) = saveClient(client)

    fun deleteClient(client: Client) = db.delete(client)

    fun deleteClientById(id: Long) = db.deleteById(id)

}