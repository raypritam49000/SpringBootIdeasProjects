package com.javatechie.spring.kotlin.crud.api.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.javatechie.spring.kotlin.crud.api.model.Company
import org.springframework.stereotype.Repository

@Repository
interface CompanyRepository : JpaRepository<Company, Int> {
	fun findByName(name :String):Company
}