package com.gruposinai.clients_crud.controller.product

import com.gruposinai.clients_crud.exception.product.ProductNotFoundException
import com.gruposinai.clients_crud.model.Product
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("products")
class ProductController(private val service: ProductService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveProduct(@RequestBody newProduct: Product) = service.saveProduct(newProduct)

    @PostMapping("/many")
    @ResponseStatus(HttpStatus.CREATED)
    fun saveProducts(@RequestBody products: List<Product>) = service.saveProducts(products)

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getProducts() = service.findProducts()

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getProductById(@PathVariable id: Long): Product{
        val product = service.findProductById(id)
        return product ?: throw ProductNotFoundException()
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    fun updateProduct(@RequestBody product: Product) = service.updateProduct(product)

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    fun deleteProduct(@RequestBody product: Product){
        val foundProduct = getProductById(product.id!!)
        service.deleteProduct(foundProduct)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteProductById(@PathVariable id: Long){
        val foundProduct = getProductById(id)
        service.deleteProduct(foundProduct)
    }

}