package com.javatechie.spring.kotlin.crud.api.model

import javax.persistence.*

@Entity
@Table
data class Company(
		@Id
		@GeneratedValue
		var id: Int = 0,
		var name: String = "",
		var address: String = ""

)