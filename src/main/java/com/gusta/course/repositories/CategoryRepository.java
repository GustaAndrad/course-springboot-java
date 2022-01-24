package com.gusta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gusta.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	}
