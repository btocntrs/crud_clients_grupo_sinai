package com.gruposinai.clients_crud.model

import javax.persistence.*
import javax.validation.constraints.NotEmpty


@Entity
@Table(name = "clients")
class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @NotEmpty(message = "email column cannot be empty or null")
    @Column(name = "email", nullable = false, unique = true)
    var email: String,

    @NotEmpty(message = "name column cannot be empty or null")
    @Column(name = "name", nullable = false, unique = true)
    var name: String,

    @NotEmpty(message = "alias column cannot be empty or null")
    @Column(name = "alias", nullable = false, unique = true)
    var alias: String,

    @Column(name = "ice_buyer")
    var iceBuyer: Boolean = false,

    @Column(name = "water_buyer")
    var waterBuyer: Boolean = false,

    @NotEmpty(message = "customer_type column cannot be empty or null")
    @Column(name = "customer_type", nullable = false)
    var customerType: String,

    @NotEmpty(message = "address column cannot be empty or null")
    @Column(name = "address", nullable = false)
    var address: String,

    @NotEmpty(message = "suburb column cannot be empty or null")
    @Column(name = "suburb", nullable = false)
    var suburb: String,

    @NotEmpty(message = "postal_code column cannot be empty or null")
    @Column(name = "postal_code", nullable = false)
    var postalCode: Int = 0,

    @NotEmpty(message = "city column cannot be empty or null")
    @Column(name = "city", nullable = false)
    var city: String,

    @NotEmpty(message = "state column cannot be empty or null")
    @Column(name = "state", nullable = false)
    var state: String
)
