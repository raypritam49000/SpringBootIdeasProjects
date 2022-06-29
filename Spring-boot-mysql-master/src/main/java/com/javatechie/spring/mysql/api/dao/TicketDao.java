package com.javatechie.spring.mysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatechie.spring.mysql.api.model.Ticket;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
