package com.gusta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gusta.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	}
