package com.javaspring.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaspring.dslist.entity.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
    
}
