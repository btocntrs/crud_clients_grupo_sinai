package com.gruposinai.clients_crud.model

import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import javax.validation.constraints.NotEmpty

@Entity
@Table(name = "products")
class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    @NotEmpty(message = "name column cannot be empty or null")
    @Column(name = "name", nullable = false, unique = true)
    var name: String,

    @NotEmpty(message = "price column cannot be empty or null")
    @Column(name = "price", nullable = false)
    var price: Float,

    @ManyToMany(targetEntity = Client::class)
    @JsonIgnoreProperties("products")
    var clients: List<Client>
)