package com.javatechie.spring.scheduler.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.scheduler.api.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
