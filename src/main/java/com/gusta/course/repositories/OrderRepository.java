package com.gusta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gusta.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	}
