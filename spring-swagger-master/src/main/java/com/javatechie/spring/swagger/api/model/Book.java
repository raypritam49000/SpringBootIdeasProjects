package com.javatechie.spring.swagger.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Book implements Serializable {
	private static final long serialVersionUID = -1670893016517855654L;
	@Id
	@GeneratedValue
	private int bookId;
	private String bookName;
	private double price;
}
