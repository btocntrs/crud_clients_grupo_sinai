package com.gruposinai.clients_crud.controller.product

import com.gruposinai.clients_crud.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Long>