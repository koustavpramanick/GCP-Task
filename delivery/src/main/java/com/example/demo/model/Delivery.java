package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deliveryId;
	private int orderId;
	private String deliveryStatus;
}
