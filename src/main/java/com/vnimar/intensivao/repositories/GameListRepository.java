package com.vnimar.intensivao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vnimar.intensivao.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
