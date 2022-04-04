package com.gruposinai.clients_crud.controller.client

import com.gruposinai.clients_crud.model.Client
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ClientService(private val repository: ClientRepository) {

    @Transactional
    fun saveClient(newClient: Client) = repository.save(newClient)

    @Transactional(readOnly = true)
    fun findClients(): MutableList<Client> = repository.findAll()

    @Transactional(readOnly = true)
    fun findClientById(id: Long) = repository.findByIdOrNull(id)

    @Transactional
    fun updateClient(client: Client) = saveClient(client)

    @Transactional
    fun deleteClient(client: Client) = repository.delete(client)

    @Transactional
    fun deleteClientById(id: Long) = repository.deleteById(id)

}