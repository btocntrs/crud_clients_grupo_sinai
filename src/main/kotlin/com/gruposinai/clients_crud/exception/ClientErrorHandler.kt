package com.gruposinai.clients_crud.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.lang.Exception
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class ClientErrorHandler {

    @ExceptionHandler(ClientNotFoundException::class)
    fun handleClientNotFoundException(
        servletRequest: HttpServletRequest,
        exception: Exception
    ): ResponseEntity<String>{
        return ResponseEntity("Client not found or not exist", HttpStatus.NOT_FOUND)
    }

}