package com.gruposinai.clients_crud.exception.product

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.lang.Exception
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class ProductErrorHandler {

    @ExceptionHandler(ProductNotFoundException::class)
    fun handleProductNotFoundExcption(
        httpServletRequest: HttpServletRequest,
        exception: Exception
    ): ResponseEntity<String>{
        return ResponseEntity("Product not found or not exist", HttpStatus.NOT_FOUND)
    }

}