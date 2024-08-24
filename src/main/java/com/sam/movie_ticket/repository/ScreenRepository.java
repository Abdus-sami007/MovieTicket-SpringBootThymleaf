package com.sam.movie_ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.movie_ticket.dto.Screen;

public interface ScreenRepository extends JpaRepository<Screen, Integer> {
	
	boolean existsByName(String name);

}
