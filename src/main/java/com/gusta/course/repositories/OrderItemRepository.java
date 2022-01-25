package com.gusta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gusta.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	}
