package com.gusta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gusta.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	}
