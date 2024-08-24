package com.sam.movie_ticket.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.movie_ticket.dto.Movie;
import com.sam.movie_ticket.dto.Screen;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
  List<Movie>findByReleaseDate(LocalDate movieDate);

	
}
