package com.javaspring.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.dslist.entity.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long>{
    
}
