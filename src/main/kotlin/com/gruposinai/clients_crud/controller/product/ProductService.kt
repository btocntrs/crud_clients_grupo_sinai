package com.gruposinai.clients_crud.controller.product

import com.gruposinai.clients_crud.model.Product
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProductService (private val repository: ProductRepository) {

    @Transactional
    fun saveProduct(newProduct: Product) = repository.save(newProduct)

    @Transactional
    fun saveProducts(products: List<Product>): MutableList<Product> = repository.saveAll(products)

    @Transactional(readOnly = true)
    fun findProducts(): MutableList<Product> = repository.findAll()

    @Transactional(readOnly = true)
    fun findProductById(id: Long) = repository.findByIdOrNull(id)

    @Transactional
    fun updateProduct(product: Product) = saveProduct(product)

    @Transactional
    fun deleteProduct(product: Product) = repository.delete(product)

    @Transactional
    fun deleteProductById(id: Long) = repository.deleteById(id)

}