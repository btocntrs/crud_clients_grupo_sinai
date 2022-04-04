package com.gruposinai.clients_crud.controller.client

import com.gruposinai.clients_crud.model.Client
import org.springframework.data.jpa.repository.JpaRepository

import org.springframework.stereotype.Repository

@Repository
interface ClientRepository: JpaRepository<Client,Long>