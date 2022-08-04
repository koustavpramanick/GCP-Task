package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Delivery;

public interface DeliveryRepo extends JpaRepository<Delivery, Integer> {

	Delivery findByOrderId(int id);
}
