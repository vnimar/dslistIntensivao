package com.vnimar.intensivao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vnimar.intensivao.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
